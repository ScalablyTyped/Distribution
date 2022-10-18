package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorVersionMetadataRequest extends StObject {
  
  /**
    * The description.
    */
  var description: typings.awsSdk.clientsFrauddetectorMod.description
  
  /**
    * The detector ID.
    */
  var detectorId: identifier
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString
}
object UpdateDetectorVersionMetadataRequest {
  
  inline def apply(description: description, detectorId: identifier, detectorVersionId: wholeNumberVersionString): UpdateDetectorVersionMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
  }
  
  extension [Self <: UpdateDetectorVersionMetadataRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
