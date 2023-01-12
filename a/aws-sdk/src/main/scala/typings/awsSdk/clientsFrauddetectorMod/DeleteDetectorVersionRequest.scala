package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDetectorVersionRequest extends StObject {
  
  /**
    * The ID of the parent detector for the detector version to delete.
    */
  var detectorId: identifier
  
  /**
    * The ID of the detector version to delete.
    */
  var detectorVersionId: wholeNumberVersionString
}
object DeleteDetectorVersionRequest {
  
  inline def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): DeleteDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDetectorVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
