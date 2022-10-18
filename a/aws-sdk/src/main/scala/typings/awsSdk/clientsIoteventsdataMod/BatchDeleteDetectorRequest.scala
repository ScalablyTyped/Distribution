package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDetectorRequest extends StObject {
  
  /**
    * The list of one or more detectors to be deleted.
    */
  var detectors: DeleteDetectorRequests
}
object BatchDeleteDetectorRequest {
  
  inline def apply(detectors: DeleteDetectorRequests): BatchDeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDetectorRequest]
  }
  
  extension [Self <: BatchDeleteDetectorRequest](x: Self) {
    
    inline def setDetectors(value: DeleteDetectorRequests): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: DeleteDetectorRequest*): Self = StObject.set(x, "detectors", js.Array(value*))
  }
}
