package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusInfo extends StObject {
  
  /**
    * The details of the volume status.
    */
  var Details: js.UndefOr[VolumeStatusDetailsList] = js.undefined
  
  /**
    * The status of the volume.
    */
  var Status: js.UndefOr[VolumeStatusInfoStatus] = js.undefined
}
object VolumeStatusInfo {
  
  inline def apply(): VolumeStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeStatusInfo] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: VolumeStatusDetailsList): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setDetailsVarargs(value: VolumeStatusDetails*): Self = StObject.set(x, "Details", js.Array(value*))
    
    inline def setStatus(value: VolumeStatusInfoStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
