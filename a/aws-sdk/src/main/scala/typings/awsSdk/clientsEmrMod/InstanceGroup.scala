package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroup extends StObject {
  
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  
  /**
    * If specified, indicates that the instance group uses Spot Instances. This is the maximum price you are willing to pay for Spot Instances. Specify OnDemandPrice to set the amount equal to the On-Demand price, or specify an amount in USD.
    */
  var BidPrice: js.UndefOr[String] = js.undefined
  
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an Amazon EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.undefined
  
  /**
    * The custom AMI ID to use for the provisioned instance group.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
  
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.undefined
  
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceGroupType] = js.undefined
  
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceType] = js.undefined
  
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.undefined
  
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.clientsEmrMod.ShrinkPolicy] = js.undefined
  
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.undefined
}
object InstanceGroup {
  
  inline def apply(): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroup]
  }
  
  extension [Self <: InstanceGroup](x: Self) {
    
    inline def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    inline def setBidPrice(value: String): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setConfigurationsVersion(value: Long): Self = StObject.set(x, "ConfigurationsVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsVersionUndefined: Self = StObject.set(x, "ConfigurationsVersion", js.undefined)
    
    inline def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    inline def setEbsBlockDevices(value: EbsBlockDeviceList): Self = StObject.set(x, "EbsBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "EbsBlockDevices", js.undefined)
    
    inline def setEbsBlockDevicesVarargs(value: EbsBlockDevice*): Self = StObject.set(x, "EbsBlockDevices", js.Array(value*))
    
    inline def setEbsOptimized(value: BooleanObject): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setId(value: InstanceGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceGroupType(value: InstanceGroupType): Self = StObject.set(x, "InstanceGroupType", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupTypeUndefined: Self = StObject.set(x, "InstanceGroupType", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLastSuccessfullyAppliedConfigurations(value: ConfigurationList): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfullyAppliedConfigurationsUndefined: Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", js.undefined)
    
    inline def setLastSuccessfullyAppliedConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", js.Array(value*))
    
    inline def setLastSuccessfullyAppliedConfigurationsVersion(value: Long): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurationsVersion", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfullyAppliedConfigurationsVersionUndefined: Self = StObject.set(x, "LastSuccessfullyAppliedConfigurationsVersion", js.undefined)
    
    inline def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestedInstanceCount(value: Integer): Self = StObject.set(x, "RequestedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setRequestedInstanceCountUndefined: Self = StObject.set(x, "RequestedInstanceCount", js.undefined)
    
    inline def setRunningInstanceCount(value: Integer): Self = StObject.set(x, "RunningInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setRunningInstanceCountUndefined: Self = StObject.set(x, "RunningInstanceCount", js.undefined)
    
    inline def setShrinkPolicy(value: ShrinkPolicy): Self = StObject.set(x, "ShrinkPolicy", value.asInstanceOf[js.Any])
    
    inline def setShrinkPolicyUndefined: Self = StObject.set(x, "ShrinkPolicy", js.undefined)
    
    inline def setStatus(value: InstanceGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
