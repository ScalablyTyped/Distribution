package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiHierarchyMod {
  
  trait HierarchyApi extends StObject {
    
    def getAllEdges(): js.Array[Any]
    
    def getAllLinks(): js.Array[Any]
    
    def getAllNodes(): js.Array[Any]
    
    var root: js.UndefOr[Any] = js.undefined
  }
  object HierarchyApi {
    
    inline def apply(
      getAllEdges: () => js.Array[Any],
      getAllLinks: () => js.Array[Any],
      getAllNodes: () => js.Array[Any]
    ): HierarchyApi = {
      val __obj = js.Dynamic.literal(getAllEdges = js.Any.fromFunction0(getAllEdges), getAllLinks = js.Any.fromFunction0(getAllLinks), getAllNodes = js.Any.fromFunction0(getAllNodes))
      __obj.asInstanceOf[HierarchyApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HierarchyApi] (val x: Self) extends AnyVal {
      
      inline def setGetAllEdges(value: () => js.Array[Any]): Self = StObject.set(x, "getAllEdges", js.Any.fromFunction0(value))
      
      inline def setGetAllLinks(value: () => js.Array[Any]): Self = StObject.set(x, "getAllLinks", js.Any.fromFunction0(value))
      
      inline def setGetAllNodes(value: () => js.Array[Any]): Self = StObject.set(x, "getAllNodes", js.Any.fromFunction0(value))
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
