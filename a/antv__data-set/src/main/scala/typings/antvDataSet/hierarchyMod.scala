package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hierarchyMod {
  
  @js.native
  trait HierarchyApi extends StObject {
    
    def getAllEdges(): js.Array[_] = js.native
    
    def getAllLinks(): js.Array[_] = js.native
    
    def getAllNodes(): js.Array[_] = js.native
    
    var root: js.UndefOr[js.Any] = js.native
  }
  object HierarchyApi {
    
    @scala.inline
    def apply(getAllEdges: () => js.Array[_], getAllLinks: () => js.Array[_], getAllNodes: () => js.Array[_]): HierarchyApi = {
      val __obj = js.Dynamic.literal(getAllEdges = js.Any.fromFunction0(getAllEdges), getAllLinks = js.Any.fromFunction0(getAllLinks), getAllNodes = js.Any.fromFunction0(getAllNodes))
      __obj.asInstanceOf[HierarchyApi]
    }
    
    @scala.inline
    implicit class HierarchyApiMutableBuilder[Self <: HierarchyApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllEdges(value: () => js.Array[_]): Self = StObject.set(x, "getAllEdges", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllLinks(value: () => js.Array[_]): Self = StObject.set(x, "getAllLinks", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllNodes(value: () => js.Array[_]): Self = StObject.set(x, "getAllNodes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
