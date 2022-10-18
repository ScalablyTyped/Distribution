package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticChannelConfiguration extends StObject {
  
  /**
    * The maximum number of SubChannels that you want to allow in the elastic channel.
    */
  var MaximumSubChannels: typings.awsSdk.clientsChimesdkmessagingMod.MaximumSubChannels
  
  /**
    * The minimum allowed percentage of TargetMembershipsPerSubChannel users. Ceil of the calculated value is used in balancing members among SubChannels of the elastic channel.
    */
  var MinimumMembershipPercentage: typings.awsSdk.clientsChimesdkmessagingMod.MinimumMembershipPercentage
  
  /**
    * The maximum number of members allowed in a SubChannel.
    */
  var TargetMembershipsPerSubChannel: typings.awsSdk.clientsChimesdkmessagingMod.TargetMembershipsPerSubChannel
}
object ElasticChannelConfiguration {
  
  inline def apply(
    MaximumSubChannels: MaximumSubChannels,
    MinimumMembershipPercentage: MinimumMembershipPercentage,
    TargetMembershipsPerSubChannel: TargetMembershipsPerSubChannel
  ): ElasticChannelConfiguration = {
    val __obj = js.Dynamic.literal(MaximumSubChannels = MaximumSubChannels.asInstanceOf[js.Any], MinimumMembershipPercentage = MinimumMembershipPercentage.asInstanceOf[js.Any], TargetMembershipsPerSubChannel = TargetMembershipsPerSubChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticChannelConfiguration]
  }
  
  extension [Self <: ElasticChannelConfiguration](x: Self) {
    
    inline def setMaximumSubChannels(value: MaximumSubChannels): Self = StObject.set(x, "MaximumSubChannels", value.asInstanceOf[js.Any])
    
    inline def setMinimumMembershipPercentage(value: MinimumMembershipPercentage): Self = StObject.set(x, "MinimumMembershipPercentage", value.asInstanceOf[js.Any])
    
    inline def setTargetMembershipsPerSubChannel(value: TargetMembershipsPerSubChannel): Self = StObject.set(x, "TargetMembershipsPerSubChannel", value.asInstanceOf[js.Any])
  }
}
