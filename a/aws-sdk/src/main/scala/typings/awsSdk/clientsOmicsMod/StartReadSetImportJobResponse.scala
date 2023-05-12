package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetImportJobResponse extends StObject {
  
  /**
    * When the job was created.
    */
  var creationTime: js.Date
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's service role ARN.
    */
  var roleArn: RoleArn
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's status.
    */
  var status: ReadSetImportJobStatus
}
object StartReadSetImportJobResponse {
  
  inline def apply(
    creationTime: js.Date,
    id: ImportJobId,
    roleArn: RoleArn,
    sequenceStoreId: SequenceStoreId,
    status: ReadSetImportJobStatus
  ): StartReadSetImportJobResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetImportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetImportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
