package typings.angularCore.anon

import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModuleRef
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentInjector extends StObject {
  
  var environmentInjector: js.UndefOr[typings.angularCore.mod.EnvironmentInjector | NgModuleRef[Any]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var injector: js.UndefOr[Injector] = js.undefined
  
  var ngModuleRef: js.UndefOr[NgModuleRef[Any]] = js.undefined
  
  var projectableNodes: js.UndefOr[js.Array[js.Array[Node]]] = js.undefined
}
object EnvironmentInjector {
  
  inline def apply(): EnvironmentInjector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInjector]
  }
  
  extension [Self <: EnvironmentInjector](x: Self) {
    
    inline def setEnvironmentInjector(value: typings.angularCore.mod.EnvironmentInjector | NgModuleRef[Any]): Self = StObject.set(x, "environmentInjector", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentInjectorUndefined: Self = StObject.set(x, "environmentInjector", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    
    inline def setNgModuleRef(value: NgModuleRef[Any]): Self = StObject.set(x, "ngModuleRef", value.asInstanceOf[js.Any])
    
    inline def setNgModuleRefUndefined: Self = StObject.set(x, "ngModuleRef", js.undefined)
    
    inline def setProjectableNodes(value: js.Array[js.Array[Node]]): Self = StObject.set(x, "projectableNodes", value.asInstanceOf[js.Any])
    
    inline def setProjectableNodesUndefined: Self = StObject.set(x, "projectableNodes", js.undefined)
    
    inline def setProjectableNodesVarargs(value: js.Array[Node]*): Self = StObject.set(x, "projectableNodes", js.Array(value*))
  }
}
