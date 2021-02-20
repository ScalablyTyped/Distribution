package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a three-dimensional boundary volume with two positions. */
@js.native
trait BoundVolume extends StObject {
  
  /** this is the maximum position inside the boundary volume. */
  var max: Position3D = js.native
  
  /** this is the minimum position inside the boundary volume. */
  var min: Position3D = js.native
}
object BoundVolume {
  
  @scala.inline
  def apply(max: Position3D, min: Position3D): BoundVolume = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundVolume]
  }
  
  @scala.inline
  implicit class BoundVolumeMutableBuilder[Self <: BoundVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Position3D): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Position3D): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
