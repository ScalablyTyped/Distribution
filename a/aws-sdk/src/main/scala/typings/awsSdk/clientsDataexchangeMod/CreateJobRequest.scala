package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * The details for the CreateJob request.
    */
  var Details: RequestDetails
  
  /**
    * The type of job to be created.
    */
  var Type: typings.awsSdk.clientsDataexchangeMod.Type
}
object CreateJobRequest {
  
  inline def apply(Details: RequestDetails, Type: Type): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: RequestDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
