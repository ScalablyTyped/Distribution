package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowListItem extends StObject {
  
  /**
    * The workflow's ARN.
    */
  var arn: js.UndefOr[WorkflowArn] = js.undefined
  
  /**
    * When the workflow was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The workflow's digest.
    */
  var digest: js.UndefOr[WorkflowDigest] = js.undefined
  
  /**
    * The workflow's ID.
    */
  var id: js.UndefOr[WorkflowId] = js.undefined
  
  /**
    *  Any metadata available for workflow. The information listed may vary depending on the workflow, and there may also be no metadata to return. 
    */
  var metadata: js.UndefOr[WorkflowMetadata] = js.undefined
  
  /**
    * The workflow's name.
    */
  var name: js.UndefOr[WorkflowName] = js.undefined
  
  /**
    * The workflow's status.
    */
  var status: js.UndefOr[WorkflowStatus] = js.undefined
  
  /**
    * The workflow's type.
    */
  var `type`: js.UndefOr[WorkflowType] = js.undefined
}
object WorkflowListItem {
  
  inline def apply(): WorkflowListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowListItem] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WorkflowArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDigest(value: WorkflowDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: WorkflowMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: WorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: WorkflowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
