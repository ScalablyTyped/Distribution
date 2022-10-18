package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDetectorRequest extends StObject {
  
  /**
    * The list of detectors (instances) to update, along with the values to update.
    */
  var detectors: UpdateDetectorRequests
}
object BatchUpdateDetectorRequest {
  
  inline def apply(detectors: UpdateDetectorRequests): BatchUpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDetectorRequest]
  }
  
  extension [Self <: BatchUpdateDetectorRequest](x: Self) {
    
    inline def setDetectors(value: UpdateDetectorRequests): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: UpdateDetectorRequest*): Self = StObject.set(x, "detectors", js.Array(value*))
  }
}
