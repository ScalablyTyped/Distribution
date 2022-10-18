package typings.antvGLite

import typings.antvGLite.distDomInterfacesMod.INode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsSortableMod {
  
  trait Sortable extends StObject {
    
    /**
      * need to re-sort
      */
    var dirty: Boolean
    
    /**
      * index in parent's children
      */
    var lastSortedIndex: Double
    
    /**
      * render order in whole scenegraph
      */
    var renderOrder: Double
    
    /**
      * sorted child entities
      */
    var sorted: js.Array[INode]
  }
  object Sortable {
    
    inline def apply(dirty: Boolean, lastSortedIndex: Double, renderOrder: Double, sorted: js.Array[INode]): Sortable = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], lastSortedIndex = lastSortedIndex.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sortable]
    }
    
    extension [Self <: Sortable](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setLastSortedIndex(value: Double): Self = StObject.set(x, "lastSortedIndex", value.asInstanceOf[js.Any])
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setSorted(value: js.Array[INode]): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedVarargs(value: INode*): Self = StObject.set(x, "sorted", js.Array(value*))
    }
  }
}
