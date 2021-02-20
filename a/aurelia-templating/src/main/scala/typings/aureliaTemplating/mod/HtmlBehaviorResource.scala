package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Binding
import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "HtmlBehaviorResource")
@js.native
/**
  * Creates an instance of HtmlBehaviorResource.
  */
class HtmlBehaviorResource () extends StObject {
  
  /**
    * Adds a binding expression to the component created by this resource.
    * @param behavior The binding expression.
    */
  def addChildBinding(behavior: js.Object): Unit = js.native
  
  /**
    * Plugs into the compiler and enables custom processing of the node on which this behavior is located.
    * @param compiler The compiler that is currently compiling the view that this behavior exists within.
    * @param resources The resources for the view that this behavior exists within.
    * @param node The node on which this behavior exists.
    * @param instruction The behavior instruction created for this behavior.
    * @param parentNode The parent node of the current node.
    * @return The current node.
    */
  def compile(compiler: ViewCompiler, resources: ViewResources_, node: Node, instruction: BehaviorInstruction): Node = js.native
  def compile(
    compiler: ViewCompiler,
    resources: ViewResources_,
    node: Node,
    instruction: BehaviorInstruction,
    parentNode: Node
  ): Node = js.native
  
  /**
    * Creates an instance of this behavior.
    * @param container The DI container to create the instance in.
    * @param instruction The instruction for this behavior that was constructed during compilation.
    * @param element The element on which this behavior exists.
    * @param bindings The bindings that are associated with the view in which this behavior exists.
    * @return The Controller of this behavior.
    */
  def create(container: Container): Controller = js.native
  def create(
    container: Container,
    instruction: js.UndefOr[scala.Nothing],
    element: js.UndefOr[scala.Nothing],
    bindings: js.Array[Binding]
  ): Controller = js.native
  def create(container: Container, instruction: js.UndefOr[scala.Nothing], element: Element): Controller = js.native
  def create(
    container: Container,
    instruction: js.UndefOr[scala.Nothing],
    element: Element,
    bindings: js.Array[Binding]
  ): Controller = js.native
  def create(container: Container, instruction: BehaviorInstruction): Controller = js.native
  def create(
    container: Container,
    instruction: BehaviorInstruction,
    element: js.UndefOr[scala.Nothing],
    bindings: js.Array[Binding]
  ): Controller = js.native
  def create(container: Container, instruction: BehaviorInstruction, element: Element): Controller = js.native
  def create(
    container: Container,
    instruction: BehaviorInstruction,
    element: Element,
    bindings: js.Array[Binding]
  ): Controller = js.native
  
  /**
    * Provides an opportunity for the resource to initialize iteself.
    * @param container The dependency injection container from which the resource
    * can aquire needed services.
    * @param target The class to which this resource metadata is attached.
    */
  def initialize(container: Container, target: js.Function): Unit = js.native
  
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
  def load(container: Container, target: js.Function): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: js.UndefOr[scala.Nothing],
    viewStrategy: js.UndefOr[scala.Nothing],
    transientView: Boolean
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: js.UndefOr[scala.Nothing],
    viewStrategy: ViewStrategy_
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: js.UndefOr[scala.Nothing],
    viewStrategy: ViewStrategy_,
    transientView: Boolean
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(container: Container, target: js.Function, loadContext: ResourceLoadContext): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: ResourceLoadContext,
    viewStrategy: js.UndefOr[scala.Nothing],
    transientView: Boolean
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: ResourceLoadContext,
    viewStrategy: ViewStrategy_
  ): js.Promise[HtmlBehaviorResource] = js.native
  def load(
    container: Container,
    target: js.Function,
    loadContext: ResourceLoadContext,
    viewStrategy: ViewStrategy_,
    transientView: Boolean
  ): js.Promise[HtmlBehaviorResource] = js.native
  
  /**
    * Allows the resource to be registered in the view resources for the particular
    * view into which it was required.
    * @param registry The view resource registry for the view that required this resource.
    * @param name The name provided by the end user for this resource, within the
    * particular view it's being used.
    */
  def register(registry: ViewResources_): Unit = js.native
  def register(registry: ViewResources_, name: String): Unit = js.native
}
/* static members */
object HtmlBehaviorResource {
  
  /**
    * Checks whether the provided name matches any naming conventions for HtmlBehaviorResource.
    * @param name The name of the potential resource.
    * @param existing An already existing resource that may need a convention name applied.
    */
  @JSImport("aurelia-templating", "HtmlBehaviorResource.convention")
  @js.native
  def convention(name: String): HtmlBehaviorResource = js.native
  @JSImport("aurelia-templating", "HtmlBehaviorResource.convention")
  @js.native
  def convention(name: String, existing: HtmlBehaviorResource): HtmlBehaviorResource = js.native
}
