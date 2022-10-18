package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmStatusDetails extends StObject {
  
  /**
    * The status of the scan of the algorithm's Docker image container.
    */
  var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
  
  /**
    * The status of algorithm validation.
    */
  var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
}
object AlgorithmStatusDetails {
  
  inline def apply(): AlgorithmStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmStatusDetails]
  }
  
  extension [Self <: AlgorithmStatusDetails](x: Self) {
    
    inline def setImageScanStatuses(value: AlgorithmStatusItemList): Self = StObject.set(x, "ImageScanStatuses", value.asInstanceOf[js.Any])
    
    inline def setImageScanStatusesUndefined: Self = StObject.set(x, "ImageScanStatuses", js.undefined)
    
    inline def setImageScanStatusesVarargs(value: AlgorithmStatusItem*): Self = StObject.set(x, "ImageScanStatuses", js.Array(value*))
    
    inline def setValidationStatuses(value: AlgorithmStatusItemList): Self = StObject.set(x, "ValidationStatuses", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusesUndefined: Self = StObject.set(x, "ValidationStatuses", js.undefined)
    
    inline def setValidationStatusesVarargs(value: AlgorithmStatusItem*): Self = StObject.set(x, "ValidationStatuses", js.Array(value*))
  }
}
