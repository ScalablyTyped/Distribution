package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorVersionStatusRequest extends StObject {
  
  /**
    * The detector ID. 
    */
  var detectorId: identifier
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString
  
  /**
    * The new status. The only supported values are ACTIVE and INACTIVE 
    */
  var status: DetectorVersionStatus
}
object UpdateDetectorVersionStatusRequest {
  
  inline def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString, status: DetectorVersionStatus): UpdateDetectorVersionStatusRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDetectorVersionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
