package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A router outlet is a placeholder that Angular dynamically fills based on the application's route.
  *
  * ## Use
  *
  * ```
  * <router-outlet></router-outlet>
  * ```
  */
trait RouterOutlet extends js.Object {
  var name: String
  /**
    * Called by the Router to instantiate a new component during the commit phase of a navigation.
    * This method in turn is responsible for calling the `routerOnActivate` hook of its child.
    */
  def activate(nextInstruction: ComponentInstruction): js.Any
  /**
    * Called by the {@link Router} when an outlet disposes of a component's contents.
    * This method in turn is responsible for calling the `routerOnDeactivate` hook of its child.
    */
  def deactivate(nextInstruction: ComponentInstruction): js.Any
  /**
    * Called by the {@link Router} during the commit phase of a navigation when an outlet
    * reuses a component between different routes.
    * This method in turn is responsible for calling the `routerOnReuse` hook of its child.
    */
  def reuse(nextInstruction: ComponentInstruction): js.Any
  /**
    * Called by the {@link Router} during recognition phase of a navigation.
    *
    * If this resolves to `false`, the given navigation is cancelled.
    *
    * This method delegates to the child component's `routerCanDeactivate` hook if it exists,
    * and otherwise resolves to true.
    */
  def routerCanDeactivate(nextInstruction: ComponentInstruction): js.Any
  /**
    * Called by the {@link Router} during recognition phase of a navigation.
    *
    * If the new child component has a different Type than the existing child component,
    * this will resolve to `false`. You can't reuse an old component when the new component
    * is of a different Type.
    *
    * Otherwise, this method delegates to the child component's `routerCanReuse` hook if it exists,
    * or resolves to true if the hook is not present.
    */
  def routerCanReuse(nextInstruction: ComponentInstruction): js.Any
}

object RouterOutlet {
  @scala.inline
  def apply(
    activate: ComponentInstruction => js.Any,
    deactivate: ComponentInstruction => js.Any,
    name: String,
    reuse: ComponentInstruction => js.Any,
    routerCanDeactivate: ComponentInstruction => js.Any,
    routerCanReuse: ComponentInstruction => js.Any
  ): RouterOutlet = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), name = name.asInstanceOf[js.Any], reuse = js.Any.fromFunction1(reuse), routerCanDeactivate = js.Any.fromFunction1(routerCanDeactivate), routerCanReuse = js.Any.fromFunction1(routerCanReuse))
    __obj.asInstanceOf[RouterOutlet]
  }
}

