package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multipoint
  extends HasZM
     with Geometry {
  
  var points: js.Array[Position] = js.native
}
object Multipoint {
  
  @scala.inline
  def apply(points: js.Array[Position]): Multipoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipoint]
  }
  
  @scala.inline
  implicit class MultipointMutableBuilder[Self <: Multipoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[Position]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Position*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
