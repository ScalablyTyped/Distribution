package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUseCaseRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: typings.awsSdk.clientsConnectMod.IntegrationAssociationId
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of use case to associate to the integration association. Each integration association can have only one of each use case type.
    */
  var UseCaseType: typings.awsSdk.clientsConnectMod.UseCaseType
}
object CreateUseCaseRequest {
  
  inline def apply(
    InstanceId: InstanceId,
    IntegrationAssociationId: IntegrationAssociationId,
    UseCaseType: UseCaseType
  ): CreateUseCaseRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationAssociationId = IntegrationAssociationId.asInstanceOf[js.Any], UseCaseType = UseCaseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUseCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUseCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUseCaseType(value: UseCaseType): Self = StObject.set(x, "UseCaseType", value.asInstanceOf[js.Any])
  }
}
