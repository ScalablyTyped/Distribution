package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationExecutionTarget extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationVersion] = js.undefined
  
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
  
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typings.awsSdk.clientsSsmMod.OutputSource] = js.undefined
  
  /**
    * The resource ID, for example, the managed node ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.undefined
  
  /**
    * The resource type, for example, EC2.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.undefined
  
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
}
object AssociationExecutionTarget {
  
  inline def apply(): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationExecutionTarget] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    inline def setExecutionId(value: AssociationExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    inline def setOutputSource(value: OutputSource): Self = StObject.set(x, "OutputSource", value.asInstanceOf[js.Any])
    
    inline def setOutputSourceUndefined: Self = StObject.set(x, "OutputSource", js.undefined)
    
    inline def setResourceId(value: AssociationResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: AssociationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
