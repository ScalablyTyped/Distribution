package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageStatusDetails extends StObject {
  
  /**
    * The status of the scan of the Docker image container for the model package.
    */
  var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined
  
  /**
    * The validation status of the model package.
    */
  var ValidationStatuses: ModelPackageStatusItemList
}
object ModelPackageStatusDetails {
  
  inline def apply(ValidationStatuses: ModelPackageStatusItemList): ModelPackageStatusDetails = {
    val __obj = js.Dynamic.literal(ValidationStatuses = ValidationStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusDetails]
  }
  
  extension [Self <: ModelPackageStatusDetails](x: Self) {
    
    inline def setImageScanStatuses(value: ModelPackageStatusItemList): Self = StObject.set(x, "ImageScanStatuses", value.asInstanceOf[js.Any])
    
    inline def setImageScanStatusesUndefined: Self = StObject.set(x, "ImageScanStatuses", js.undefined)
    
    inline def setImageScanStatusesVarargs(value: ModelPackageStatusItem*): Self = StObject.set(x, "ImageScanStatuses", js.Array(value*))
    
    inline def setValidationStatuses(value: ModelPackageStatusItemList): Self = StObject.set(x, "ValidationStatuses", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusesVarargs(value: ModelPackageStatusItem*): Self = StObject.set(x, "ValidationStatuses", js.Array(value*))
  }
}
