package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootData extends js.Object {
  var errorHandler: atAngularCoreLib.srcErrorUnderscoreHandlerMod.ErrorHandler
  var injector: atAngularCoreLib.srcDiMod.Injector
  var ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  var projectableNodes: js.Array[js.Array[_]]
  var renderer: atAngularCoreLib.srcRenderApiMod.Renderer2
  var rendererFactory: atAngularCoreLib.srcRenderApiMod.RendererFactory2
  var sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  var selectorOrNode: js.Any
}

object RootData {
  @scala.inline
  def apply(
    errorHandler: atAngularCoreLib.srcErrorUnderscoreHandlerMod.ErrorHandler,
    injector: atAngularCoreLib.srcDiMod.Injector,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_],
    projectableNodes: js.Array[js.Array[_]],
    renderer: atAngularCoreLib.srcRenderApiMod.Renderer2,
    rendererFactory: atAngularCoreLib.srcRenderApiMod.RendererFactory2,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer,
    selectorOrNode: js.Any
  ): RootData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorHandler")(errorHandler)
    __obj.updateDynamic("injector")(injector)
    __obj.updateDynamic("ngModule")(ngModule)
    __obj.updateDynamic("projectableNodes")(projectableNodes)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("rendererFactory")(rendererFactory)
    __obj.updateDynamic("sanitizer")(sanitizer)
    __obj.updateDynamic("selectorOrNode")(selectorOrNode)
    __obj.asInstanceOf[RootData]
  }
}

