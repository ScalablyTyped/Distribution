package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSyncJobResponse extends StObject {
  
  /**
    * The SyncJob ARN.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time for the SyncJob creation.
    */
  var creationDateTime: js.Date
  
  /**
    * The SyncJob response state.
    */
  var state: SyncJobState
}
object CreateSyncJobResponse {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date, state: SyncJobState): CreateSyncJobResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSyncJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSyncJobResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: SyncJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
