package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeConfig extends StObject {
  
  /**
    * The bid price for each EC2 Spot Instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%. 
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot Instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%). If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The custom AMI ID to use for the instance type.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as defined by InstanceType. 
    */
  var EbsConfiguration: js.UndefOr[typings.awsSdk.clientsEmrMod.EbsConfiguration] = js.undefined
  
  /**
    * An EC2 instance type, such as m3.xlarge. 
    */
  var InstanceType: typings.awsSdk.clientsEmrMod.InstanceType
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. This value is 1 for a master instance fleet, and must be 1 or greater for core and task instance fleets. Defaults to 1 if not specified. 
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
}
object InstanceTypeConfig {
  
  inline def apply(InstanceType: InstanceType): InstanceTypeConfig = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceTypeConfig] (val x: Self) extends AnyVal {
    
    inline def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPrice(value: NonNegativeDouble): Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPriceUndefined: Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    inline def setEbsConfiguration(value: EbsConfiguration): Self = StObject.set(x, "EbsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEbsConfigurationUndefined: Self = StObject.set(x, "EbsConfiguration", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacity(value: WholeNumber): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
