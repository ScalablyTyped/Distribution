package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoutingProfileRequest extends StObject {
  
  /**
    * The default outbound queue for the routing profile.
    */
  var DefaultOutboundQueueId: QueueId
  
  /**
    * Description of the routing profile. Must not be more than 250 characters.
    */
  var Description: RoutingProfileDescription
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var MediaConcurrencies: typings.awsSdk.clientsConnectMod.MediaConcurrencies
  
  /**
    * The name of the routing profile. Must not be more than 127 characters.
    */
  var Name: RoutingProfileName
  
  /**
    * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound calls.
    */
  var QueueConfigs: js.UndefOr[RoutingProfileQueueConfigList] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRoutingProfileRequest {
  
  inline def apply(
    DefaultOutboundQueueId: QueueId,
    Description: RoutingProfileDescription,
    InstanceId: InstanceId,
    MediaConcurrencies: MediaConcurrencies,
    Name: RoutingProfileName
  ): CreateRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(DefaultOutboundQueueId = DefaultOutboundQueueId.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], MediaConcurrencies = MediaConcurrencies.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoutingProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRoutingProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setDefaultOutboundQueueId(value: QueueId): Self = StObject.set(x, "DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value*))
    
    inline def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = StObject.set(x, "QueueConfigs", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigsUndefined: Self = StObject.set(x, "QueueConfigs", js.undefined)
    
    inline def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = StObject.set(x, "QueueConfigs", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
