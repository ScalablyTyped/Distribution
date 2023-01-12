package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProgrammaticAccessCredentialsRequest extends StObject {
  
  /**
    * The time duration in which the credentials remain valid. 
    */
  var durationInMinutes: js.UndefOr[SessionDuration] = js.undefined
  
  /**
    * The FinSpace environment identifier.
    */
  var environmentId: IdType
}
object GetProgrammaticAccessCredentialsRequest {
  
  inline def apply(environmentId: IdType): GetProgrammaticAccessCredentialsRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProgrammaticAccessCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProgrammaticAccessCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setDurationInMinutes(value: SessionDuration): Self = StObject.set(x, "durationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDurationInMinutesUndefined: Self = StObject.set(x, "durationInMinutes", js.undefined)
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
