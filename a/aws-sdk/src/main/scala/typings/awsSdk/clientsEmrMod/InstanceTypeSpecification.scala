package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeSpecification extends StObject {
  
  /**
    * The bid price for each Amazon EC2 Spot Instance type as defined by InstanceType. Expressed in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The bid price, as a percentage of On-Demand price, for each Amazon EC2 Spot Instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%).
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The custom AMI ID to use for the instance type.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as defined by InstanceType.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
  
  /**
    * Evaluates to TRUE when the specified InstanceType is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The Amazon EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceType] = js.undefined
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. Capacity values represent performance characteristics such as vCPUs, memory, or I/O. If not specified, the default value is 1.
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
}
object InstanceTypeSpecification {
  
  inline def apply(): InstanceTypeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceTypeSpecification] (val x: Self) extends AnyVal {
    
    inline def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPrice(value: NonNegativeDouble): Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPriceUndefined: Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    inline def setEbsBlockDevices(value: EbsBlockDeviceList): Self = StObject.set(x, "EbsBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "EbsBlockDevices", js.undefined)
    
    inline def setEbsBlockDevicesVarargs(value: EbsBlockDevice*): Self = StObject.set(x, "EbsBlockDevices", js.Array(value*))
    
    inline def setEbsOptimized(value: BooleanObject): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWeightedCapacity(value: WholeNumber): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
