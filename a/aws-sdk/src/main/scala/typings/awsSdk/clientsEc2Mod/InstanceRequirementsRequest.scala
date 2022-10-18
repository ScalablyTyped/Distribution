package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRequirementsRequest extends StObject {
  
  /**
    * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an instance. To exclude accelerator-enabled instance types, set Max to 0. Default: No minimum or maximum limits
    */
  var AcceleratorCount: js.UndefOr[AcceleratorCountRequest] = js.undefined
  
  /**
    * Indicates whether instance types must have accelerators by specific manufacturers.   For instance types with NVIDIA devices, specify nvidia.   For instance types with AMD devices, specify amd.   For instance types with Amazon Web Services devices, specify amazon-web-services.   For instance types with Xilinx devices, specify xilinx.   Default: Any manufacturer
    */
  var AcceleratorManufacturers: js.UndefOr[AcceleratorManufacturerSet] = js.undefined
  
  /**
    * The accelerators that must be on the instance type.   For instance types with NVIDIA A100 GPUs, specify a100.   For instance types with NVIDIA V100 GPUs, specify v100.   For instance types with NVIDIA K80 GPUs, specify k80.   For instance types with NVIDIA T4 GPUs, specify t4.   For instance types with NVIDIA M60 GPUs, specify m60.   For instance types with AMD Radeon Pro V520 GPUs, specify radeon-pro-v520.   For instance types with Xilinx VU9P FPGAs, specify  vu9p.   For instance types with Amazon Web Services Inferentia chips, specify inferentia.   For instance types with NVIDIA GRID K520 GPUs, specify k520.   Default: Any accelerator
    */
  var AcceleratorNames: js.UndefOr[AcceleratorNameSet] = js.undefined
  
  /**
    * The minimum and maximum amount of total accelerator memory, in MiB. Default: No minimum or maximum limits
    */
  var AcceleratorTotalMemoryMiB: js.UndefOr[AcceleratorTotalMemoryMiBRequest] = js.undefined
  
  /**
    * The accelerator types that must be on the instance type.   To include instance types with GPU hardware, specify gpu.   To include instance types with FPGA hardware, specify fpga.   To include instance types with inference hardware, specify inference.   Default: Any accelerator type
    */
  var AcceleratorTypes: js.UndefOr[AcceleratorTypeSet] = js.undefined
  
  /**
    * Indicates whether bare metal instance types must be included, excluded, or required.   To include bare metal instance types, specify included.   To require only bare metal instance types, specify required.   To exclude bare metal instance types, specify excluded.   Default: excluded 
    */
  var BareMetal: js.UndefOr[typings.awsSdk.clientsEc2Mod.BareMetal] = js.undefined
  
  /**
    * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see Amazon EBS–optimized instances in the Amazon EC2 User Guide. Default: No minimum or maximum limits
    */
  var BaselineEbsBandwidthMbps: js.UndefOr[BaselineEbsBandwidthMbpsRequest] = js.undefined
  
  /**
    * Indicates whether burstable performance T instance types are included, excluded, or required. For more information, see Burstable performance instances.   To include burstable performance instance types, specify included.   To require only burstable performance instance types, specify required.   To exclude burstable performance instance types, specify excluded.   Default: excluded 
    */
  var BurstablePerformance: js.UndefOr[typings.awsSdk.clientsEc2Mod.BurstablePerformance] = js.undefined
  
  /**
    * The CPU manufacturers to include.   For instance types with Intel CPUs, specify intel.   For instance types with AMD CPUs, specify amd.   For instance types with Amazon Web Services CPUs, specify amazon-web-services.    Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.  Default: Any manufacturer
    */
  var CpuManufacturers: js.UndefOr[CpuManufacturerSet] = js.undefined
  
  /**
    * The instance types to exclude. You can use strings with one or more wild cards, represented by an asterisk (*), to exclude an instance family, type, size, or generation. The following are examples: m5.8xlarge, c5*.*, m5a.*, r*, *3*. For example, if you specify c5*,Amazon EC2 will exclude the entire C5 instance family, which includes all C5a and C5n instance types. If you specify m5a.*, Amazon EC2 will exclude all the M5a instance types, but not the M5n instance types. Default: No excluded instance types
    */
  var ExcludedInstanceTypes: js.UndefOr[ExcludedInstanceTypeSet] = js.undefined
  
  /**
    * Indicates whether current or previous generation instance types are included. The current generation instance types are recommended for use. Current generation instance types are typically the latest two to three generations in each instance family. For more information, see Instance types in the Amazon EC2 User Guide. For current generation instance types, specify current. For previous generation instance types, specify previous. Default: Current and previous generation instance types
    */
  var InstanceGenerations: js.UndefOr[InstanceGenerationSet] = js.undefined
  
  /**
    * Indicates whether instance types with instance store volumes are included, excluded, or required. For more information, Amazon EC2 instance store in the Amazon EC2 User Guide.   To include instance types with instance store volumes, specify included.   To require only instance types with instance store volumes, specify required.   To exclude instance types with instance store volumes, specify excluded.   Default: included 
    */
  var LocalStorage: js.UndefOr[typings.awsSdk.clientsEc2Mod.LocalStorage] = js.undefined
  
  /**
    * The type of local storage that is required.   For instance types with hard disk drive (HDD) storage, specify hdd.   For instance types with solid state drive (SSD) storage, specify ssd.   Default: hdd and ssd 
    */
  var LocalStorageTypes: js.UndefOr[LocalStorageTypeSet] = js.undefined
  
  /**
    * The minimum and maximum amount of memory per vCPU, in GiB. Default: No minimum or maximum limits
    */
  var MemoryGiBPerVCpu: js.UndefOr[MemoryGiBPerVCpuRequest] = js.undefined
  
  /**
    * The minimum and maximum amount of memory, in MiB.
    */
  var MemoryMiB: MemoryMiBRequest
  
  /**
    * The minimum and maximum number of network interfaces. Default: No minimum or maximum limits
    */
  var NetworkInterfaceCount: js.UndefOr[NetworkInterfaceCountRequest] = js.undefined
  
  /**
    * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above your threshold. The parameter accepts an integer, which Amazon EC2 interprets as a percentage. To turn off price protection, specify a high value, such as 999999. This parameter is not supported for GetSpotPlacementScores and GetInstanceTypesFromInstanceRequirements.  If you set TargetCapacityUnitType to vcpu or memory-mib, the price protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.  Default: 20 
    */
  var OnDemandMaxPricePercentageOverLowestPrice: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether instance types must support hibernation for On-Demand Instances. This parameter is not supported for GetSpotPlacementScores. Default: false 
    */
  var RequireHibernateSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The price protection threshold for Spot Instance. This is the maximum you’ll pay for an Spot Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above your threshold. The parameter accepts an integer, which Amazon EC2 interprets as a percentage. To turn off price protection, specify a high value, such as 999999. This parameter is not supported for GetSpotPlacementScores and GetInstanceTypesFromInstanceRequirements.  If you set TargetCapacityUnitType to vcpu or memory-mib, the price protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.  Default: 100 
    */
  var SpotMaxPricePercentageOverLowestPrice: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum and maximum amount of total local storage, in GB. Default: No minimum or maximum limits
    */
  var TotalLocalStorageGB: js.UndefOr[TotalLocalStorageGBRequest] = js.undefined
  
  /**
    * The minimum and maximum number of vCPUs.
    */
  var VCpuCount: VCpuCountRangeRequest
}
object InstanceRequirementsRequest {
  
  inline def apply(MemoryMiB: MemoryMiBRequest, VCpuCount: VCpuCountRangeRequest): InstanceRequirementsRequest = {
    val __obj = js.Dynamic.literal(MemoryMiB = MemoryMiB.asInstanceOf[js.Any], VCpuCount = VCpuCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRequirementsRequest]
  }
  
  extension [Self <: InstanceRequirementsRequest](x: Self) {
    
    inline def setAcceleratorCount(value: AcceleratorCountRequest): Self = StObject.set(x, "AcceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "AcceleratorCount", js.undefined)
    
    inline def setAcceleratorManufacturers(value: AcceleratorManufacturerSet): Self = StObject.set(x, "AcceleratorManufacturers", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorManufacturersUndefined: Self = StObject.set(x, "AcceleratorManufacturers", js.undefined)
    
    inline def setAcceleratorManufacturersVarargs(value: AcceleratorManufacturer*): Self = StObject.set(x, "AcceleratorManufacturers", js.Array(value*))
    
    inline def setAcceleratorNames(value: AcceleratorNameSet): Self = StObject.set(x, "AcceleratorNames", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorNamesUndefined: Self = StObject.set(x, "AcceleratorNames", js.undefined)
    
    inline def setAcceleratorNamesVarargs(value: AcceleratorName*): Self = StObject.set(x, "AcceleratorNames", js.Array(value*))
    
    inline def setAcceleratorTotalMemoryMiB(value: AcceleratorTotalMemoryMiBRequest): Self = StObject.set(x, "AcceleratorTotalMemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTotalMemoryMiBUndefined: Self = StObject.set(x, "AcceleratorTotalMemoryMiB", js.undefined)
    
    inline def setAcceleratorTypes(value: AcceleratorTypeSet): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setBareMetal(value: BareMetal): Self = StObject.set(x, "BareMetal", value.asInstanceOf[js.Any])
    
    inline def setBareMetalUndefined: Self = StObject.set(x, "BareMetal", js.undefined)
    
    inline def setBaselineEbsBandwidthMbps(value: BaselineEbsBandwidthMbpsRequest): Self = StObject.set(x, "BaselineEbsBandwidthMbps", value.asInstanceOf[js.Any])
    
    inline def setBaselineEbsBandwidthMbpsUndefined: Self = StObject.set(x, "BaselineEbsBandwidthMbps", js.undefined)
    
    inline def setBurstablePerformance(value: BurstablePerformance): Self = StObject.set(x, "BurstablePerformance", value.asInstanceOf[js.Any])
    
    inline def setBurstablePerformanceUndefined: Self = StObject.set(x, "BurstablePerformance", js.undefined)
    
    inline def setCpuManufacturers(value: CpuManufacturerSet): Self = StObject.set(x, "CpuManufacturers", value.asInstanceOf[js.Any])
    
    inline def setCpuManufacturersUndefined: Self = StObject.set(x, "CpuManufacturers", js.undefined)
    
    inline def setCpuManufacturersVarargs(value: CpuManufacturer*): Self = StObject.set(x, "CpuManufacturers", js.Array(value*))
    
    inline def setExcludedInstanceTypes(value: ExcludedInstanceTypeSet): Self = StObject.set(x, "ExcludedInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedInstanceTypesUndefined: Self = StObject.set(x, "ExcludedInstanceTypes", js.undefined)
    
    inline def setExcludedInstanceTypesVarargs(value: ExcludedInstanceType*): Self = StObject.set(x, "ExcludedInstanceTypes", js.Array(value*))
    
    inline def setInstanceGenerations(value: InstanceGenerationSet): Self = StObject.set(x, "InstanceGenerations", value.asInstanceOf[js.Any])
    
    inline def setInstanceGenerationsUndefined: Self = StObject.set(x, "InstanceGenerations", js.undefined)
    
    inline def setInstanceGenerationsVarargs(value: InstanceGeneration*): Self = StObject.set(x, "InstanceGenerations", js.Array(value*))
    
    inline def setLocalStorage(value: LocalStorage): Self = StObject.set(x, "LocalStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypes(value: LocalStorageTypeSet): Self = StObject.set(x, "LocalStorageTypes", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypesUndefined: Self = StObject.set(x, "LocalStorageTypes", js.undefined)
    
    inline def setLocalStorageTypesVarargs(value: LocalStorageType*): Self = StObject.set(x, "LocalStorageTypes", js.Array(value*))
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "LocalStorage", js.undefined)
    
    inline def setMemoryGiBPerVCpu(value: MemoryGiBPerVCpuRequest): Self = StObject.set(x, "MemoryGiBPerVCpu", value.asInstanceOf[js.Any])
    
    inline def setMemoryGiBPerVCpuUndefined: Self = StObject.set(x, "MemoryGiBPerVCpu", js.undefined)
    
    inline def setMemoryMiB(value: MemoryMiBRequest): Self = StObject.set(x, "MemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceCount(value: NetworkInterfaceCountRequest): Self = StObject.set(x, "NetworkInterfaceCount", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceCountUndefined: Self = StObject.set(x, "NetworkInterfaceCount", js.undefined)
    
    inline def setOnDemandMaxPricePercentageOverLowestPrice(value: Integer): Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setOnDemandMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setRequireHibernateSupport(value: Boolean): Self = StObject.set(x, "RequireHibernateSupport", value.asInstanceOf[js.Any])
    
    inline def setRequireHibernateSupportUndefined: Self = StObject.set(x, "RequireHibernateSupport", js.undefined)
    
    inline def setSpotMaxPricePercentageOverLowestPrice(value: Integer): Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setTotalLocalStorageGB(value: TotalLocalStorageGBRequest): Self = StObject.set(x, "TotalLocalStorageGB", value.asInstanceOf[js.Any])
    
    inline def setTotalLocalStorageGBUndefined: Self = StObject.set(x, "TotalLocalStorageGB", js.undefined)
    
    inline def setVCpuCount(value: VCpuCountRangeRequest): Self = StObject.set(x, "VCpuCount", value.asInstanceOf[js.Any])
  }
}
