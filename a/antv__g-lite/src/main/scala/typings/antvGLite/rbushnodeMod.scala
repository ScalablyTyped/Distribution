package typings.antvGLite

import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbushnodeMod {
  
  @JSImport("@antv/g-lite/dist/components/RBushNode", "RBushRoot")
  @js.native
  val RBushRoot: DefinedToken = js.native
  
  trait RBushNode extends StObject {
    
    var aabb: js.UndefOr[RBushNodeAABB] = js.undefined
  }
  object RBushNode {
    
    inline def apply(): RBushNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RBushNode]
    }
    
    extension [Self <: RBushNode](x: Self) {
      
      inline def setAabb(value: RBushNodeAABB): Self = StObject.set(x, "aabb", value.asInstanceOf[js.Any])
      
      inline def setAabbUndefined: Self = StObject.set(x, "aabb", js.undefined)
    }
  }
  
  trait RBushNodeAABB extends StObject {
    
    var id: Double
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
  }
  object RBushNodeAABB {
    
    inline def apply(id: Double, maxX: Double, maxY: Double, minX: Double, minY: Double): RBushNodeAABB = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[RBushNodeAABB]
    }
    
    extension [Self <: RBushNodeAABB](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
}
