package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateIngestEndpointCredentialsRequest extends StObject {
  
  /**
    * The ID of the channel the IngestEndpoint is on.
    */
  var Id: string
  
  /**
    * The id of the IngestEndpoint whose credentials should be rotated
    */
  var IngestEndpointId: string
}
object RotateIngestEndpointCredentialsRequest {
  
  inline def apply(Id: string, IngestEndpointId: string): RotateIngestEndpointCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IngestEndpointId = IngestEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateIngestEndpointCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateIngestEndpointCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIngestEndpointId(value: string): Self = StObject.set(x, "IngestEndpointId", value.asInstanceOf[js.Any])
  }
}
