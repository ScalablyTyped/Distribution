package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorediSCSIVolumesInput extends StObject {
  
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a stored volume. All of the specified stored volumes must be from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typings.awsSdk.clientsStoragegatewayMod.VolumeARNs
}
object DescribeStorediSCSIVolumesInput {
  
  inline def apply(VolumeARNs: VolumeARNs): DescribeStorediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorediSCSIVolumesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorediSCSIVolumesInput] (val x: Self) extends AnyVal {
    
    inline def setVolumeARNs(value: VolumeARNs): Self = StObject.set(x, "VolumeARNs", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNsVarargs(value: VolumeARN*): Self = StObject.set(x, "VolumeARNs", js.Array(value*))
  }
}
