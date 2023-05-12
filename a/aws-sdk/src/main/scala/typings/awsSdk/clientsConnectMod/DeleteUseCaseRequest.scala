package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUseCaseRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: typings.awsSdk.clientsConnectMod.IntegrationAssociationId
  
  /**
    * The identifier for the use case.
    */
  var UseCaseId: typings.awsSdk.clientsConnectMod.UseCaseId
}
object DeleteUseCaseRequest {
  
  inline def apply(InstanceId: InstanceId, IntegrationAssociationId: IntegrationAssociationId, UseCaseId: UseCaseId): DeleteUseCaseRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationAssociationId = IntegrationAssociationId.asInstanceOf[js.Any], UseCaseId = UseCaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUseCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUseCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setUseCaseId(value: UseCaseId): Self = StObject.set(x, "UseCaseId", value.asInstanceOf[js.Any])
  }
}
