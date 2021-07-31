package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hierarchyMod {
  
  trait HierarchyApi extends StObject {
    
    def getAllEdges(): js.Array[js.Any]
    
    def getAllLinks(): js.Array[js.Any]
    
    def getAllNodes(): js.Array[js.Any]
    
    var root: js.UndefOr[js.Any] = js.undefined
  }
  object HierarchyApi {
    
    @scala.inline
    def apply(
      getAllEdges: () => js.Array[js.Any],
      getAllLinks: () => js.Array[js.Any],
      getAllNodes: () => js.Array[js.Any]
    ): HierarchyApi = {
      val __obj = js.Dynamic.literal(getAllEdges = js.Any.fromFunction0(getAllEdges), getAllLinks = js.Any.fromFunction0(getAllLinks), getAllNodes = js.Any.fromFunction0(getAllNodes))
      __obj.asInstanceOf[HierarchyApi]
    }
    
    @scala.inline
    implicit class HierarchyApiMutableBuilder[Self <: HierarchyApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllEdges(value: () => js.Array[js.Any]): Self = StObject.set(x, "getAllEdges", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllLinks(value: () => js.Array[js.Any]): Self = StObject.set(x, "getAllLinks", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllNodes(value: () => js.Array[js.Any]): Self = StObject.set(x, "getAllNodes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
