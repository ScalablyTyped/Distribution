package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfile extends StObject {
  
  /**
    * The identifier of the default outbound queue for this routing profile.
    */
  var DefaultOutboundQueueId: js.UndefOr[QueueId] = js.undefined
  
  /**
    * The description of the routing profile.
    */
  var Description: js.UndefOr[RoutingProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsConnectMod.InstanceId] = js.undefined
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var MediaConcurrencies: js.UndefOr[typings.awsSdk.clientsConnectMod.MediaConcurrencies] = js.undefined
  
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.undefined
  
  /**
    * The number of associated queues in routing profile.
    */
  var NumberOfAssociatedQueues: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of associated users in routing profile.
    */
  var NumberOfAssociatedUsers: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var RoutingProfileArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfileId] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object RoutingProfile {
  
  inline def apply(): RoutingProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfile]
  }
  
  extension [Self <: RoutingProfile](x: Self) {
    
    inline def setDefaultOutboundQueueId(value: QueueId): Self = StObject.set(x, "DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    inline def setDefaultOutboundQueueIdUndefined: Self = StObject.set(x, "DefaultOutboundQueueId", js.undefined)
    
    inline def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrenciesUndefined: Self = StObject.set(x, "MediaConcurrencies", js.undefined)
    
    inline def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value*))
    
    inline def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberOfAssociatedQueues(value: Long): Self = StObject.set(x, "NumberOfAssociatedQueues", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociatedQueuesUndefined: Self = StObject.set(x, "NumberOfAssociatedQueues", js.undefined)
    
    inline def setNumberOfAssociatedUsers(value: Long): Self = StObject.set(x, "NumberOfAssociatedUsers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociatedUsersUndefined: Self = StObject.set(x, "NumberOfAssociatedUsers", js.undefined)
    
    inline def setRoutingProfileArn(value: ARN): Self = StObject.set(x, "RoutingProfileArn", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileArnUndefined: Self = StObject.set(x, "RoutingProfileArn", js.undefined)
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
