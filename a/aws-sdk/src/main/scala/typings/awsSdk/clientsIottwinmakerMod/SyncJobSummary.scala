package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncJobSummary extends StObject {
  
  /**
    * The SyncJob summary ARN.
    */
  var arn: js.UndefOr[TwinMakerArn] = js.undefined
  
  /**
    * The creation date and time.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The SyncJob summaries status.
    */
  var status: js.UndefOr[SyncJobStatus] = js.undefined
  
  /**
    * The sync source.
    */
  var syncSource: js.UndefOr[SyncSource] = js.undefined
  
  /**
    * The update date and time.
    */
  var updateDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the workspace that contains the sync job.
    */
  var workspaceId: js.UndefOr[Id] = js.undefined
}
object SyncJobSummary {
  
  inline def apply(): SyncJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncJobSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setStatus(value: SyncJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setSyncSourceUndefined: Self = StObject.set(x, "syncSource", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTimeUndefined: Self = StObject.set(x, "updateDateTime", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
