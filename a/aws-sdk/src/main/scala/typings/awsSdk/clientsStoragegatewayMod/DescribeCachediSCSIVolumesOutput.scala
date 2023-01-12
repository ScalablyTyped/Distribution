package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCachediSCSIVolumesOutput extends StObject {
  
  /**
    * An array of objects where each object contains metadata about one cached volume.
    */
  var CachediSCSIVolumes: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.CachediSCSIVolumes] = js.undefined
}
object DescribeCachediSCSIVolumesOutput {
  
  inline def apply(): DescribeCachediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCachediSCSIVolumesOutput] (val x: Self) extends AnyVal {
    
    inline def setCachediSCSIVolumes(value: CachediSCSIVolumes): Self = StObject.set(x, "CachediSCSIVolumes", value.asInstanceOf[js.Any])
    
    inline def setCachediSCSIVolumesUndefined: Self = StObject.set(x, "CachediSCSIVolumes", js.undefined)
    
    inline def setCachediSCSIVolumesVarargs(value: CachediSCSIVolume*): Self = StObject.set(x, "CachediSCSIVolumes", js.Array(value*))
  }
}
