package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "CompositionEngine")
@js.native
class CompositionEngine protected () extends js.Object {
  /**
      * Creates an instance of the CompositionEngine.
      * @param viewEngine The ViewEngine used during composition.
      */
  def this(viewEngine: ViewEngine, viewLocator: ViewLocator) = this()
  /**
      * Dynamically composes a component.
      * @param context The CompositionContext providing information on how the composition should occur.
      * @return A Promise for the View or the Controller that results from the dynamic composition.
      */
  def compose(context: CompositionContext): js.Promise[View | Controller] = js.native
  /**
      * Creates a controller instance for the component described in the context.
      * @param context The CompositionContext that describes the component.
      * @return A Promise for the Controller.
      */
  def createController(context: CompositionContext): js.Promise[Controller] = js.native
  /**
      * Ensures that the view model and its resource are loaded for this context.
      * @param context The CompositionContext to load the view model and its resource for.
      * @return A Promise for the context.
      */
  def ensureViewModel(context: CompositionContext): js.Promise[CompositionContext] = js.native
}

