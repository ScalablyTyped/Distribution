package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a 3-dimensional vector. */
@js.native
trait Direction3D extends StObject {
  
  var DirectionX: Double = js.native
  
  var DirectionY: Double = js.native
  
  var DirectionZ: Double = js.native
}
object Direction3D {
  
  @scala.inline
  def apply(DirectionX: Double, DirectionY: Double, DirectionZ: Double): Direction3D = {
    val __obj = js.Dynamic.literal(DirectionX = DirectionX.asInstanceOf[js.Any], DirectionY = DirectionY.asInstanceOf[js.Any], DirectionZ = DirectionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction3D]
  }
  
  @scala.inline
  implicit class Direction3DMutableBuilder[Self <: Direction3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectionX(value: Double): Self = StObject.set(x, "DirectionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionY(value: Double): Self = StObject.set(x, "DirectionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionZ(value: Double): Self = StObject.set(x, "DirectionZ", value.asInstanceOf[js.Any])
  }
}
