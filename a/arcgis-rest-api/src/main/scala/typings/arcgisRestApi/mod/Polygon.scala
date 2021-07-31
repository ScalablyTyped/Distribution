package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polygon
  extends StObject
     with HasZM
     with Geometry {
  
  var rings: js.Array[js.Array[Position]]
}
object Polygon {
  
  @scala.inline
  def apply(rings: js.Array[js.Array[Position]]): Polygon = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  
  @scala.inline
  implicit class PolygonMutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRings(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingsVarargs(value: js.Array[Position]*): Self = StObject.set(x, "rings", js.Array(value :_*))
  }
}
