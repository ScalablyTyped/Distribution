package typings.aureliaDashKnockout.distCommonjsKnockoutDashCompositionMod

import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typings.aureliaDashLoader.aureliaDashLoaderMod.Loader
import typings.aureliaDashTemplating.aureliaDashTemplatingMod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/knockout-composition", "KnockoutComposition")
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

