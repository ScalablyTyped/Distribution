package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceImportJobResponse extends StObject {
  
  /**
    * When the job completed.
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the job was created.
    */
  var creationTime: js.Date
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
  
  /**
    * The job's service role ARN.
    */
  var roleArn: RoleArn
  
  /**
    * The job's source files.
    */
  var sources: ImportReferenceSourceList
  
  /**
    * The job's status.
    */
  var status: ReferenceImportJobStatus
  
  /**
    * The job's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
}
object GetReferenceImportJobResponse {
  
  inline def apply(
    creationTime: js.Date,
    id: ImportJobId,
    referenceStoreId: ReferenceStoreId,
    roleArn: RoleArn,
    sources: ImportReferenceSourceList,
    status: ReferenceImportJobStatus
  ): GetReferenceImportJobResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceImportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSources(value: ImportReferenceSourceList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: ImportReferenceSourceItem*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStatus(value: ReferenceImportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
