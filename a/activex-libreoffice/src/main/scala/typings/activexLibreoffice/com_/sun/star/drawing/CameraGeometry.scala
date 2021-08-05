package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a three-dimensional camera. */
trait CameraGeometry extends StObject {
  
  /** is the camera view direction */
  var vpn: Direction3D
  
  /** is the camera position */
  var vrp: Position3D
  
  /** is the camera up direction */
  var vup: Direction3D
}
object CameraGeometry {
  
  inline def apply(vpn: Direction3D, vrp: Position3D, vup: Direction3D): CameraGeometry = {
    val __obj = js.Dynamic.literal(vpn = vpn.asInstanceOf[js.Any], vrp = vrp.asInstanceOf[js.Any], vup = vup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraGeometry]
  }
  
  extension [Self <: CameraGeometry](x: Self) {
    
    inline def setVpn(value: Direction3D): Self = StObject.set(x, "vpn", value.asInstanceOf[js.Any])
    
    inline def setVrp(value: Position3D): Self = StObject.set(x, "vrp", value.asInstanceOf[js.Any])
    
    inline def setVup(value: Direction3D): Self = StObject.set(x, "vup", value.asInstanceOf[js.Any])
  }
}
