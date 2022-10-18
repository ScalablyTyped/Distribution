package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pose extends StObject {
  
  /**
    * Value representing the face rotation on the pitch axis.
    */
  var Pitch: js.UndefOr[Degree] = js.undefined
  
  /**
    * Value representing the face rotation on the roll axis.
    */
  var Roll: js.UndefOr[Degree] = js.undefined
  
  /**
    * Value representing the face rotation on the yaw axis.
    */
  var Yaw: js.UndefOr[Degree] = js.undefined
}
object Pose {
  
  inline def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  
  extension [Self <: Pose](x: Self) {
    
    inline def setPitch(value: Degree): Self = StObject.set(x, "Pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "Pitch", js.undefined)
    
    inline def setRoll(value: Degree): Self = StObject.set(x, "Roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "Roll", js.undefined)
    
    inline def setYaw(value: Degree): Self = StObject.set(x, "Yaw", value.asInstanceOf[js.Any])
    
    inline def setYawUndefined: Self = StObject.set(x, "Yaw", js.undefined)
  }
}
