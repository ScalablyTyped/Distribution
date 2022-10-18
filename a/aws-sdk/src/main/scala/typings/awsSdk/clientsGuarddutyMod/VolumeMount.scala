package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeMount extends StObject {
  
  /**
    * Volume mount path.
    */
  var MountPath: js.UndefOr[String] = js.undefined
  
  /**
    * Volume mount name.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object VolumeMount {
  
  inline def apply(): VolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMount]
  }
  
  extension [Self <: VolumeMount](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "MountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "MountPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
