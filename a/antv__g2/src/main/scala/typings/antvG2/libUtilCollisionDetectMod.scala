package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCollisionDetectMod {
  
  @JSImport("@antv/g2/lib/util/collision-detect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def intersect(box1: Item, box2: Item): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersect(box1: Item, box2: Item, margin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIntersectRect(box1: Item, box2: Item): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectRect")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isIntersectRect(box1: Item, box2: Item, margin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectRect")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Item extends StObject {
    
    var height: Double
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Item {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Item = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
