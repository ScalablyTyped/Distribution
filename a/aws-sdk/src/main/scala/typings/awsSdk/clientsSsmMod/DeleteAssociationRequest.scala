package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssociationRequest extends StObject {
  
  /**
    * The association ID that you want to delete.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * The managed node ID.   InstanceId has been deprecated. To specify a managed node ID for an association, use the Targets parameter. Requests that include the parameter InstanceID with Systems Manager documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter InstanceId, you can't use the parameters AssociationName, DocumentVersion, MaxErrors, MaxConcurrency, OutputLocation, or ScheduleExpression. To use these parameters, you must use the Targets parameter. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
}
object DeleteAssociationRequest {
  
  inline def apply(): DeleteAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAssociationRequest]
  }
  
  extension [Self <: DeleteAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
