package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCachediSCSIVolumesInput extends StObject {
  
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the specified cached volumes must be from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typings.awsSdk.clientsStoragegatewayMod.VolumeARNs
}
object DescribeCachediSCSIVolumesInput {
  
  inline def apply(VolumeARNs: VolumeARNs): DescribeCachediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCachediSCSIVolumesInput]
  }
  
  extension [Self <: DescribeCachediSCSIVolumesInput](x: Self) {
    
    inline def setVolumeARNs(value: VolumeARNs): Self = StObject.set(x, "VolumeARNs", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNsVarargs(value: VolumeARN*): Self = StObject.set(x, "VolumeARNs", js.Array(value*))
  }
}
