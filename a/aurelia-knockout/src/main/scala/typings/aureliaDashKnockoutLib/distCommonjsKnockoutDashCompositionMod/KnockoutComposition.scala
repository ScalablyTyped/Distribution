package typings
package aureliaDashKnockoutLib.distCommonjsKnockoutDashCompositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/knockout-composition", "KnockoutComposition")
@js.native
class KnockoutComposition protected () extends js.Object {
  def this(compositionEngine: aureliaDashTemplatingLib.aureliaDashTemplatingMod.CompositionEngine, container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, loader: aureliaDashLoaderLib.aureliaDashLoaderMod.Loader) = this()
  var compositionEngine: aureliaDashTemplatingLib.aureliaDashTemplatingMod.CompositionEngine = js.native
  var container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container = js.native
  var loader: aureliaDashLoaderLib.aureliaDashLoaderMod.Loader = js.native
  /** internal: do not use */
  def buildCompositionSettings(value: js.Any, bindingContext: js.Any): js.Promise[_] = js.native
  /** internal: do not use */
  def getViewModelInstance(moduleId: java.lang.String): js.Promise[_] = js.native
  /**
    * Registers the `compose` Knockout Binding to use Compositions in your Views.
    */
  def register(): scala.Unit = js.native
}

