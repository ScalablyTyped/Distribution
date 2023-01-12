package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsVolumeDetails extends StObject {
  
  /**
    * List of EBS volumes that were scanned.
    */
  var ScannedVolumeDetails: js.UndefOr[VolumeDetails] = js.undefined
  
  /**
    * List of EBS volumes that were skipped from the malware scan.
    */
  var SkippedVolumeDetails: js.UndefOr[VolumeDetails] = js.undefined
}
object EbsVolumeDetails {
  
  inline def apply(): EbsVolumeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolumeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsVolumeDetails] (val x: Self) extends AnyVal {
    
    inline def setScannedVolumeDetails(value: VolumeDetails): Self = StObject.set(x, "ScannedVolumeDetails", value.asInstanceOf[js.Any])
    
    inline def setScannedVolumeDetailsUndefined: Self = StObject.set(x, "ScannedVolumeDetails", js.undefined)
    
    inline def setScannedVolumeDetailsVarargs(value: VolumeDetail*): Self = StObject.set(x, "ScannedVolumeDetails", js.Array(value*))
    
    inline def setSkippedVolumeDetails(value: VolumeDetails): Self = StObject.set(x, "SkippedVolumeDetails", value.asInstanceOf[js.Any])
    
    inline def setSkippedVolumeDetailsUndefined: Self = StObject.set(x, "SkippedVolumeDetails", js.undefined)
    
    inline def setSkippedVolumeDetailsVarargs(value: VolumeDetail*): Self = StObject.set(x, "SkippedVolumeDetails", js.Array(value*))
  }
}
