package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootData extends StObject {
  
  var errorHandler: ErrorHandler
  
  var injector: Injector
  
  var ngModule: NgModuleRef[js.Any]
  
  var projectableNodes: js.Array[js.Array[js.Any]]
  
  var renderer: Renderer2
  
  var rendererFactory: RendererFactory2
  
  var sanitizer: Sanitizer
  
  var selectorOrNode: js.Any
}
object RootData {
  
  inline def apply(
    errorHandler: ErrorHandler,
    injector: Injector,
    ngModule: NgModuleRef[js.Any],
    projectableNodes: js.Array[js.Array[js.Any]],
    renderer: Renderer2,
    rendererFactory: RendererFactory2,
    sanitizer: Sanitizer,
    selectorOrNode: js.Any
  ): RootData = {
    val __obj = js.Dynamic.literal(errorHandler = errorHandler.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], projectableNodes = projectableNodes.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], selectorOrNode = selectorOrNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootData]
  }
  
  extension [Self <: RootData](x: Self) {
    
    inline def setErrorHandler(value: ErrorHandler): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setNgModule(value: NgModuleRef[js.Any]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    inline def setProjectableNodes(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "projectableNodes", value.asInstanceOf[js.Any])
    
    inline def setProjectableNodesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "projectableNodes", js.Array(value :_*))
    
    inline def setRenderer(value: Renderer2): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererFactory(value: RendererFactory2): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
    
    inline def setSanitizer(value: Sanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
    
    inline def setSelectorOrNode(value: js.Any): Self = StObject.set(x, "selectorOrNode", value.asInstanceOf[js.Any])
  }
}
