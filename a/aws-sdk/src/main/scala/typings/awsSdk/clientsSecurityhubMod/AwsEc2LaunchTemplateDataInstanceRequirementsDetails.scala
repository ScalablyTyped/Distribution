package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceRequirementsDetails extends StObject {
  
  /**
    *  The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an instance. 
    */
  var AcceleratorCount: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails] = js.undefined
  
  /**
    * Indicates whether instance types must have accelerators by specific manufacturers. 
    */
  var AcceleratorManufacturers: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The accelerators that must be on the instance type. 
    */
  var AcceleratorNames: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The minimum and maximum amount of total accelerator memory, in MiB. 
    */
  var AcceleratorTotalMemoryMiB: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails] = js.undefined
  
  /**
    * The accelerator types that must be on the instance type. 
    */
  var AcceleratorTypes: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * Indicates whether bare metal instance types must be included, excluded, or required. 
    */
  var BareMetal: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see Amazon EBS optimized instances in the Amazon EC2 User Guide. 
    */
  var BaselineEbsBandwidthMbps: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails] = js.undefined
  
  /**
    *  Indicates whether burstable performance T instance types are included, excluded, or required. For more information, Burstable performance instances in the Amazon EC2 User Guide. 
    */
  var BurstablePerformance: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The CPU manufacturers to include. 
    */
  var CpuManufacturers: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The instance types to exclude. 
    */
  var ExcludedInstanceTypes: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  Indicates whether current or previous generation instance types are included. 
    */
  var InstanceGenerations: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  Indicates whether instance types with instance store volumes are included, excluded, or required. For more information, see Amazon EC2 instance store in the Amazon EC2 User Guide. 
    */
  var LocalStorage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The type of local storage that is required. 
    */
  var LocalStorageTypes: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The minimum and maximum amount of memory per vCPU, in GiB. 
    */
  var MemoryGiBPerVCpu: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails] = js.undefined
  
  /**
    *  The minimum and maximum amount of memory, in MiB. 
    */
  var MemoryMiB: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails] = js.undefined
  
  /**
    *  The minimum and maximum number of network interfaces. 
    */
  var NetworkInterfaceCount: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails] = js.undefined
  
  /**
    *  The price protection threshold for On-Demand Instances. This is the maximum you'll pay for an On-Demand Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above your threshold. The parameter accepts an integer, which Amazon EC2 interprets as a percentage. A high value, such as 999999, turns off price protection.
    */
  var OnDemandMaxPricePercentageOverLowestPrice: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Indicates whether instance types must support hibernation for On-Demand Instances. 
    */
  var RequireHibernateSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The price protection threshold for Spot Instances. This is the maximum you'll pay for a Spot Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above your threshold.  The parameter accepts an integer, which Amazon EC2 interprets as a percentage. A high value, such as 999999, turns off price protection.
    */
  var SpotMaxPricePercentageOverLowestPrice: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The minimum and maximum amount of total local storage, in GB. 
    */
  var TotalLocalStorageGB: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails] = js.undefined
  
  /**
    *  The minimum and maximum number of vCPUs. 
    */
  var VCpuCount: js.UndefOr[AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceRequirementsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceRequirementsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceRequirementsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceRequirementsDetails] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorCount(value: AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails): Self = StObject.set(x, "AcceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "AcceleratorCount", js.undefined)
    
    inline def setAcceleratorManufacturers(value: NonEmptyStringList): Self = StObject.set(x, "AcceleratorManufacturers", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorManufacturersUndefined: Self = StObject.set(x, "AcceleratorManufacturers", js.undefined)
    
    inline def setAcceleratorManufacturersVarargs(value: NonEmptyString*): Self = StObject.set(x, "AcceleratorManufacturers", js.Array(value*))
    
    inline def setAcceleratorNames(value: NonEmptyStringList): Self = StObject.set(x, "AcceleratorNames", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorNamesUndefined: Self = StObject.set(x, "AcceleratorNames", js.undefined)
    
    inline def setAcceleratorNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AcceleratorNames", js.Array(value*))
    
    inline def setAcceleratorTotalMemoryMiB(value: AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails): Self = StObject.set(x, "AcceleratorTotalMemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTotalMemoryMiBUndefined: Self = StObject.set(x, "AcceleratorTotalMemoryMiB", js.undefined)
    
    inline def setAcceleratorTypes(value: NonEmptyStringList): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setBareMetal(value: NonEmptyString): Self = StObject.set(x, "BareMetal", value.asInstanceOf[js.Any])
    
    inline def setBareMetalUndefined: Self = StObject.set(x, "BareMetal", js.undefined)
    
    inline def setBaselineEbsBandwidthMbps(value: AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails): Self = StObject.set(x, "BaselineEbsBandwidthMbps", value.asInstanceOf[js.Any])
    
    inline def setBaselineEbsBandwidthMbpsUndefined: Self = StObject.set(x, "BaselineEbsBandwidthMbps", js.undefined)
    
    inline def setBurstablePerformance(value: NonEmptyString): Self = StObject.set(x, "BurstablePerformance", value.asInstanceOf[js.Any])
    
    inline def setBurstablePerformanceUndefined: Self = StObject.set(x, "BurstablePerformance", js.undefined)
    
    inline def setCpuManufacturers(value: NonEmptyStringList): Self = StObject.set(x, "CpuManufacturers", value.asInstanceOf[js.Any])
    
    inline def setCpuManufacturersUndefined: Self = StObject.set(x, "CpuManufacturers", js.undefined)
    
    inline def setCpuManufacturersVarargs(value: NonEmptyString*): Self = StObject.set(x, "CpuManufacturers", js.Array(value*))
    
    inline def setExcludedInstanceTypes(value: NonEmptyStringList): Self = StObject.set(x, "ExcludedInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedInstanceTypesUndefined: Self = StObject.set(x, "ExcludedInstanceTypes", js.undefined)
    
    inline def setExcludedInstanceTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "ExcludedInstanceTypes", js.Array(value*))
    
    inline def setInstanceGenerations(value: NonEmptyStringList): Self = StObject.set(x, "InstanceGenerations", value.asInstanceOf[js.Any])
    
    inline def setInstanceGenerationsUndefined: Self = StObject.set(x, "InstanceGenerations", js.undefined)
    
    inline def setInstanceGenerationsVarargs(value: NonEmptyString*): Self = StObject.set(x, "InstanceGenerations", js.Array(value*))
    
    inline def setLocalStorage(value: NonEmptyString): Self = StObject.set(x, "LocalStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypes(value: NonEmptyStringList): Self = StObject.set(x, "LocalStorageTypes", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypesUndefined: Self = StObject.set(x, "LocalStorageTypes", js.undefined)
    
    inline def setLocalStorageTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "LocalStorageTypes", js.Array(value*))
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "LocalStorage", js.undefined)
    
    inline def setMemoryGiBPerVCpu(value: AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails): Self = StObject.set(x, "MemoryGiBPerVCpu", value.asInstanceOf[js.Any])
    
    inline def setMemoryGiBPerVCpuUndefined: Self = StObject.set(x, "MemoryGiBPerVCpu", js.undefined)
    
    inline def setMemoryMiB(value: AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails): Self = StObject.set(x, "MemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setMemoryMiBUndefined: Self = StObject.set(x, "MemoryMiB", js.undefined)
    
    inline def setNetworkInterfaceCount(value: AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails): Self = StObject.set(x, "NetworkInterfaceCount", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceCountUndefined: Self = StObject.set(x, "NetworkInterfaceCount", js.undefined)
    
    inline def setOnDemandMaxPricePercentageOverLowestPrice(value: Integer): Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setOnDemandMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setRequireHibernateSupport(value: Boolean): Self = StObject.set(x, "RequireHibernateSupport", value.asInstanceOf[js.Any])
    
    inline def setRequireHibernateSupportUndefined: Self = StObject.set(x, "RequireHibernateSupport", js.undefined)
    
    inline def setSpotMaxPricePercentageOverLowestPrice(value: Integer): Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setTotalLocalStorageGB(value: AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails): Self = StObject.set(x, "TotalLocalStorageGB", value.asInstanceOf[js.Any])
    
    inline def setTotalLocalStorageGBUndefined: Self = StObject.set(x, "TotalLocalStorageGB", js.undefined)
    
    inline def setVCpuCount(value: AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails): Self = StObject.set(x, "VCpuCount", value.asInstanceOf[js.Any])
    
    inline def setVCpuCountUndefined: Self = StObject.set(x, "VCpuCount", js.undefined)
  }
}
