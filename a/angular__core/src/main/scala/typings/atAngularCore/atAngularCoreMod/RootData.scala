package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootData extends js.Object {
  var errorHandler: ErrorHandler
  var injector: Injector
  var ngModule: NgModuleRef[_]
  var projectableNodes: js.Array[js.Array[_]]
  var renderer: Renderer2
  var rendererFactory: RendererFactory2
  var sanitizer: Sanitizer
  var selectorOrNode: js.Any
}

object RootData {
  @scala.inline
  def apply(
    errorHandler: ErrorHandler,
    injector: Injector,
    ngModule: NgModuleRef[_],
    projectableNodes: js.Array[js.Array[_]],
    renderer: Renderer2,
    rendererFactory: RendererFactory2,
    sanitizer: Sanitizer,
    selectorOrNode: js.Any
  ): RootData = {
    val __obj = js.Dynamic.literal(errorHandler = errorHandler.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], projectableNodes = projectableNodes.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], selectorOrNode = selectorOrNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RootData]
  }
}

