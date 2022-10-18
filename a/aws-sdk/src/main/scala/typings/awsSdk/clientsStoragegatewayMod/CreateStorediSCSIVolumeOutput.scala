package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorediSCSIVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
  
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
}
object CreateStorediSCSIVolumeOutput {
  
  inline def apply(): CreateStorediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
  }
  
  extension [Self <: CreateStorediSCSIVolumeOutput](x: Self) {
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    inline def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
  }
}
