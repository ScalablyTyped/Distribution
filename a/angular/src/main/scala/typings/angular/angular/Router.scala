package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Router` is responsible for mapping URLs to components.
  *
  * You can see the state of the router by inspecting the read-only field `router.navigating`.
  * This may be useful for showing a spinner, for instance.
  *
  * ## Concepts
  *
  * Routers and component instances have a 1:1 correspondence.
  *
  * The router holds reference to a number of {@link RouterOutlet}.
  * An outlet is a placeholder that the router dynamically fills in depending on the current URL.
  *
  * When the router navigates from a URL, it must first recognize it and serialize it into an
  * `Instruction`.
  * The router uses the `RouteRegistry` to get an `Instruction`.
  */
@js.native
trait Router extends js.Object {
  var currentInstruction: Instruction = js.native
  var hostComponent: js.Any = js.native
  var lastNavigationAttempt: String = js.native
  var navigating: Boolean = js.native
  var parent: Router = js.native
  var registry: RouteRegistry = js.native
  /**
    * Constructs a child router. You probably don't need to use this unless you're writing a reusable
    * component.
    */
  def auxRouter(hostComponent: js.Any): Router = js.native
  /**
    * Constructs a child router. You probably don't need to use this unless you're writing a reusable
    * component.
    */
  def childRouter(hostComponent: js.Any): Router = js.native
  /**
    * Updates this router and all descendant routers according to the given instruction
    */
  def commit(instruction: Instruction): js.Any = js.native
  def commit(instruction: Instruction, _skipLocationChange: Boolean): js.Any = js.native
  /**
    * Dynamically update the routing configuration and trigger a navigation.
    *
    * ### Usage
    *
    * ```
    * router.config([
    *   { 'path': '/', 'component': IndexComp },
    *   { 'path': '/user/:id', 'component': UserComp },
    * ]);
    * ```
    */
  def config(definitions: js.Array[RouteDefinition]): js.Any = js.native
  /**
    * Removes the contents of this router's outlet and all descendant outlets
    */
  def deactivate(instruction: Instruction): js.Any = js.native
  /**
    * Generate an `Instruction` based on the provided Route Link DSL.
    */
  def generate(linkParams: js.Array[_]): Instruction = js.native
  /**
    * Given an instruction, returns `true` if the instruction is currently active,
    * otherwise `false`.
    */
  def isRouteActive(instruction: Instruction): Boolean = js.native
  /**
    * Navigate based on the provided Route Link DSL. It's preferred to navigate with this method
    * over `navigateByUrl`.
    *
    * ### Usage
    *
    * This method takes an array representing the Route Link DSL:
    * ```
    * ['./MyCmp', {param: 3}]
    * ```
    * See the {@link RouterLink} directive for more.
    */
  def navigate(linkParams: js.Array[_]): js.Any = js.native
  /**
    * Navigate via the provided instruction. Returns a promise that resolves when navigation is
    * complete.
    */
  def navigateByInstruction(instruction: Instruction): js.Any = js.native
  def navigateByInstruction(instruction: Instruction, _skipLocationChange: Boolean): js.Any = js.native
  /**
    * Navigate to a URL. Returns a promise that resolves when navigation is complete.
    * It's preferred to navigate with `navigate` instead of this method, since URLs are more brittle.
    *
    * If the given URL begins with a `/`, router will navigate absolutely.
    * If the given URL does not begin with `/`, the router will navigate relative to this component.
    */
  def navigateByUrl(url: String): js.Any = js.native
  def navigateByUrl(url: String, _skipLocationChange: Boolean): js.Any = js.native
  /**
    * Given a URL, returns an instruction representing the component graph
    */
  def recognize(url: String): js.Any = js.native
  /**
    * Register an outlet to notified of auxiliary route changes.
    *
    * You probably don't need to use this unless you're writing a reusable component.
    */
  def registerAuxOutlet(outlet: RouterOutlet): js.Any = js.native
  /**
    * Register an outlet to be notified of primary route changes.
    *
    * You probably don't need to use this unless you're writing a reusable component.
    */
  def registerPrimaryOutlet(outlet: RouterOutlet): js.Any = js.native
  /**
    * Navigates to either the last URL successfully navigated to, or the last URL requested if the
    * router has yet to successfully navigate.
    */
  def renavigate(): js.Any = js.native
  /**
    * Subscribe to URL updates from the router
    */
  def subscribe(onNext: js.Function1[/* value */ js.Any, Unit]): js.Object = js.native
}

