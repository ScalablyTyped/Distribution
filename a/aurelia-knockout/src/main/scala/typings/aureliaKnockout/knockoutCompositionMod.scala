package typings.aureliaKnockout

import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaLoader.mod.Loader
import typings.aureliaTemplating.mod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/knockout-composition", JSImport.Namespace)
@js.native
object knockoutCompositionMod extends js.Object {
  @js.native
  class KnockoutComposition protected () extends js.Object {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
    var compositionEngine: CompositionEngine = js.native
    var container: Container = js.native
    var loader: Loader = js.native
    /** internal: do not use */
    def buildCompositionSettings(value: js.Any, bindingContext: js.Any): js.Promise[_] = js.native
    /** internal: do not use */
    def getViewModelInstance(moduleId: String): js.Promise[_] = js.native
    /**
      * Registers the `compose` Knockout Binding to use Compositions in your Views.
      */
    def register(): Unit = js.native
  }
  
}

