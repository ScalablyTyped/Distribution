package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "HtmlBehaviorResource")
@js.native
/**
  * Creates an instance of HtmlBehaviorResource.
  */
class HtmlBehaviorResource () extends js.Object {
  /**
    * Adds a binding expression to the component created by this resource.
    * @param behavior The binding expression.
    */
  def addChildBinding(behavior: js.Object): scala.Unit = js.native
  /**
    * Plugs into the compiler and enables custom processing of the node on which this behavior is located.
    * @param compiler The compiler that is currently compiling the view that this behavior exists within.
    * @param resources The resources for the view that this behavior exists within.
    * @param node The node on which this behavior exists.
    * @param instruction The behavior instruction created for this behavior.
    * @param parentNode The parent node of the current node.
    * @return The current node.
    */
  def compile(
    compiler: ViewCompiler,
    resources: ViewResources,
    node: stdLib.Node,
    instruction: BehaviorInstruction
  ): stdLib.Node = js.native
  def compile(
    compiler: ViewCompiler,
    resources: ViewResources,
    node: stdLib.Node,
    instruction: BehaviorInstruction,
    parentNode: stdLib.Node
  ): stdLib.Node = js.native
  /**
    * Creates an instance of this behavior.
    * @param container The DI container to create the instance in.
    * @param instruction The instruction for this behavior that was constructed during compilation.
    * @param element The element on which this behavior exists.
    * @param bindings The bindings that are associated with the view in which this behavior exists.
    * @return The Controller of this behavior.
    */
  def create(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): Controller = js.native
  def create(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    instruction: BehaviorInstruction
  ): Controller = js.native
  def create(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    instruction: BehaviorInstruction,
    element: stdLib.Element
  ): Controller = js.native
  def create(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    instruction: BehaviorInstruction,
    element: stdLib.Element,
    bindings: js.Array[aureliaDashBindingLib.aureliaDashBindingMod.Binding]
  ): Controller = js.native
  /**
    * Provides an opportunity for the resource to initialize iteself.
    * @param container The dependency injection container from which the resource
    * can aquire needed services.
    * @param target The class to which this resource metadata is attached.
    */
  def initialize(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    target: js.Function
  ): scala.Unit = js.native
  /**
    * Enables the resource to asynchronously load additional resources.
    * @param container The dependency injection container from which the resource
    * can aquire needed services.
    * @param target The class to which this resource metadata is attached.
    * @param loadContext The loading context object provided by the view engine.
    * @param viewStrategy A view strategy to overload the default strategy defined by the resource.
    * @param transientView Indicated whether the view strategy is transient or
    * permanently tied to this component.
    */
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    target: js.Function
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    target: js.Function,
    loadContext: ResourceLoadContext
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    target: js.Function,
    loadContext: ResourceLoadContext,
    viewStrategy: ViewStrategy
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    target: js.Function,
    loadContext: ResourceLoadContext,
    viewStrategy: ViewStrategy,
    transientView: scala.Boolean
  ): js.Promise[HtmlBehaviorResource] = js.native
  /**
    * Allows the resource to be registered in the view resources for the particular
    * view into which it was required.
    * @param registry The view resource registry for the view that required this resource.
    * @param name The name provided by the end user for this resource, within the
    * particular view it's being used.
    */
  def register(registry: ViewResources): scala.Unit = js.native
  def register(registry: ViewResources, name: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("aurelia-templating", "HtmlBehaviorResource")
@js.native
object HtmlBehaviorResource extends js.Object {
  /**
    * Checks whether the provided name matches any naming conventions for HtmlBehaviorResource.
    * @param name The name of the potential resource.
    * @param existing An already existing resource that may need a convention name applied.
    */
  def convention(name: java.lang.String): aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource = js.native
  def convention(
    name: java.lang.String,
    existing: aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource = js.native
}

