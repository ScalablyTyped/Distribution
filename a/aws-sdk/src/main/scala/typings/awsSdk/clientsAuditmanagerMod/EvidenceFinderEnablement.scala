package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceFinderEnablement extends StObject {
  
  /**
    * The current status of the evidence data backfill process.  The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data store with your past two years’ worth of evidence data so that your evidence can be queried.    NOT_STARTED means that the backfill hasn’t started yet.     IN_PROGRESS means that the backfill is in progress. This can take up to 7 days to complete, depending on the amount of evidence data.     COMPLETED means that the backfill is complete. All of your past evidence is now queryable.   
    */
  var backfillStatus: js.UndefOr[EvidenceFinderBackfillStatus] = js.undefined
  
  /**
    * The current status of the evidence finder feature and the related event data store.     ENABLE_IN_PROGRESS means that you requested to enable evidence finder. An event data store is currently being created to support evidence finder queries.    ENABLED means that an event data store was successfully created and evidence finder is enabled. We recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of evidence data. You can use evidence finder in the meantime, but not all data might be available until the backfill is complete.    DISABLE_IN_PROGRESS means that you requested to disable evidence finder, and your request is pending the deletion of the event data store.    DISABLED means that you have permanently disabled evidence finder and the event data store has been deleted. You can't re-enable evidence finder after this point.  
    */
  var enablementStatus: js.UndefOr[EvidenceFinderEnablementStatus] = js.undefined
  
  /**
    * Represents any errors that occurred when enabling or disabling evidence finder. 
    */
  var error: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The event data store is the lake of evidence data that evidence finder runs queries against.
    */
  var eventDataStoreArn: js.UndefOr[CloudTrailArn] = js.undefined
}
object EvidenceFinderEnablement {
  
  inline def apply(): EvidenceFinderEnablement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceFinderEnablement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceFinderEnablement] (val x: Self) extends AnyVal {
    
    inline def setBackfillStatus(value: EvidenceFinderBackfillStatus): Self = StObject.set(x, "backfillStatus", value.asInstanceOf[js.Any])
    
    inline def setBackfillStatusUndefined: Self = StObject.set(x, "backfillStatus", js.undefined)
    
    inline def setEnablementStatus(value: EvidenceFinderEnablementStatus): Self = StObject.set(x, "enablementStatus", value.asInstanceOf[js.Any])
    
    inline def setEnablementStatusUndefined: Self = StObject.set(x, "enablementStatus", js.undefined)
    
    inline def setError(value: ErrorMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEventDataStoreArn(value: CloudTrailArn): Self = StObject.set(x, "eventDataStoreArn", value.asInstanceOf[js.Any])
    
    inline def setEventDataStoreArnUndefined: Self = StObject.set(x, "eventDataStoreArn", js.undefined)
  }
}
