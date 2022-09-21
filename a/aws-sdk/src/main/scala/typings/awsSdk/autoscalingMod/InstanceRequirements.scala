package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRequirements extends StObject {
  
  /**
    * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for an instance type. To exclude accelerator-enabled instance types, set Max to 0. Default: No minimum or maximum
    */
  var AcceleratorCount: js.UndefOr[AcceleratorCountRequest] = js.undefined
  
  /**
    * Indicates whether instance types must have accelerators by specific manufacturers.   For instance types with NVIDIA devices, specify nvidia.   For instance types with AMD devices, specify amd.   For instance types with Amazon Web Services devices, specify amazon-web-services.   For instance types with Xilinx devices, specify xilinx.   Default: Any manufacturer
    */
  var AcceleratorManufacturers: js.UndefOr[typings.awsSdk.autoscalingMod.AcceleratorManufacturers] = js.undefined
  
  /**
    * Lists the accelerators that must be on an instance type.   For instance types with NVIDIA A100 GPUs, specify a100.   For instance types with NVIDIA V100 GPUs, specify v100.   For instance types with NVIDIA K80 GPUs, specify k80.   For instance types with NVIDIA T4 GPUs, specify t4.   For instance types with NVIDIA M60 GPUs, specify m60.   For instance types with AMD Radeon Pro V520 GPUs, specify radeon-pro-v520.   For instance types with Xilinx VU9P FPGAs, specify vu9p.   Default: Any accelerator
    */
  var AcceleratorNames: js.UndefOr[typings.awsSdk.autoscalingMod.AcceleratorNames] = js.undefined
  
  /**
    * The minimum and maximum total memory size for the accelerators on an instance type, in MiB. Default: No minimum or maximum
    */
  var AcceleratorTotalMemoryMiB: js.UndefOr[AcceleratorTotalMemoryMiBRequest] = js.undefined
  
  /**
    * Lists the accelerator types that must be on an instance type.   For instance types with GPU accelerators, specify gpu.   For instance types with FPGA accelerators, specify fpga.   For instance types with inference accelerators, specify inference.   Default: Any accelerator type
    */
  var AcceleratorTypes: js.UndefOr[typings.awsSdk.autoscalingMod.AcceleratorTypes] = js.undefined
  
  /**
    * Indicates whether bare metal instance types are included, excluded, or required. Default: excluded 
    */
  var BareMetal: js.UndefOr[typings.awsSdk.autoscalingMod.BareMetal] = js.undefined
  
  /**
    * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more information, see Amazon EBS–optimized instances in the Amazon EC2 User Guide for Linux Instances. Default: No minimum or maximum
    */
  var BaselineEbsBandwidthMbps: js.UndefOr[BaselineEbsBandwidthMbpsRequest] = js.undefined
  
  /**
    * Indicates whether burstable performance instance types are included, excluded, or required. For more information, see Burstable performance instances in the Amazon EC2 User Guide for Linux Instances. Default: excluded 
    */
  var BurstablePerformance: js.UndefOr[typings.awsSdk.autoscalingMod.BurstablePerformance] = js.undefined
  
  /**
    * Lists which specific CPU manufacturers to include.   For instance types with Intel CPUs, specify intel.   For instance types with AMD CPUs, specify amd.   For instance types with Amazon Web Services CPUs, specify amazon-web-services.    Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.   Default: Any manufacturer
    */
  var CpuManufacturers: js.UndefOr[typings.awsSdk.autoscalingMod.CpuManufacturers] = js.undefined
  
  /**
    * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an asterisk (*). The following are examples: c5*, m5a.*, r*, *3*.  For example, if you specify c5*, you are excluding the entire C5 instance family, which includes all C5a and C5n instance types. If you specify m5a.*, you are excluding all the M5a instance types, but not the M5n instance types. Default: No excluded instance types
    */
  var ExcludedInstanceTypes: js.UndefOr[typings.awsSdk.autoscalingMod.ExcludedInstanceTypes] = js.undefined
  
  /**
    * Indicates whether current or previous generation instance types are included.   For current generation instance types, specify current. The current generation includes EC2 instance types currently recommended for use. This typically includes the latest two to three generations in each instance family. For more information, see Instance types in the Amazon EC2 User Guide for Linux Instances.   For previous generation instance types, specify previous.   Default: Any current or previous generation
    */
  var InstanceGenerations: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceGenerations] = js.undefined
  
  /**
    * Indicates whether instance types with instance store volumes are included, excluded, or required. For more information, see Amazon EC2 instance store in the Amazon EC2 User Guide for Linux Instances. Default: included 
    */
  var LocalStorage: js.UndefOr[typings.awsSdk.autoscalingMod.LocalStorage] = js.undefined
  
  /**
    * Indicates the type of local storage that is required.   For instance types with hard disk drive (HDD) storage, specify hdd.   For instance types with solid state drive (SSD) storage, specify ssd.   Default: Any local storage type
    */
  var LocalStorageTypes: js.UndefOr[typings.awsSdk.autoscalingMod.LocalStorageTypes] = js.undefined
  
  /**
    * The minimum and maximum amount of memory per vCPU for an instance type, in GiB. Default: No minimum or maximum
    */
  var MemoryGiBPerVCpu: js.UndefOr[MemoryGiBPerVCpuRequest] = js.undefined
  
  /**
    * The minimum and maximum instance memory size for an instance type, in MiB.
    */
  var MemoryMiB: MemoryMiBRequest
  
  /**
    * The minimum and maximum number of network interfaces for an instance type. Default: No minimum or maximum
    */
  var NetworkInterfaceCount: js.UndefOr[NetworkInterfaceCountRequest] = js.undefined
  
  /**
    * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance, expressed as a percentage higher than the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999.  If you set DesiredCapacityType to vcpu or memory-mib, the price protection threshold is applied based on the per vCPU or per memory price instead of the per instance price.  Default: 20 
    */
  var OnDemandMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * Indicates whether instance types must provide On-Demand Instance hibernation support. Default: false 
    */
  var RequireHibernateSupport: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed as a percentage higher than the least expensive current generation M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999.  If you set DesiredCapacityType to vcpu or memory-mib, the price protection threshold is applied based on the per vCPU or per memory price instead of the per instance price.  Default: 100 
    */
  var SpotMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The minimum and maximum total local storage size for an instance type, in GB. Default: No minimum or maximum
    */
  var TotalLocalStorageGB: js.UndefOr[TotalLocalStorageGBRequest] = js.undefined
  
  /**
    * The minimum and maximum number of vCPUs for an instance type.
    */
  var VCpuCount: VCpuCountRequest
}
object InstanceRequirements {
  
  inline def apply(MemoryMiB: MemoryMiBRequest, VCpuCount: VCpuCountRequest): InstanceRequirements = {
    val __obj = js.Dynamic.literal(MemoryMiB = MemoryMiB.asInstanceOf[js.Any], VCpuCount = VCpuCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRequirements]
  }
  
  extension [Self <: InstanceRequirements](x: Self) {
    
    inline def setAcceleratorCount(value: AcceleratorCountRequest): Self = StObject.set(x, "AcceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "AcceleratorCount", js.undefined)
    
    inline def setAcceleratorManufacturers(value: AcceleratorManufacturers): Self = StObject.set(x, "AcceleratorManufacturers", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorManufacturersUndefined: Self = StObject.set(x, "AcceleratorManufacturers", js.undefined)
    
    inline def setAcceleratorManufacturersVarargs(value: AcceleratorManufacturer*): Self = StObject.set(x, "AcceleratorManufacturers", js.Array(value*))
    
    inline def setAcceleratorNames(value: AcceleratorNames): Self = StObject.set(x, "AcceleratorNames", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorNamesUndefined: Self = StObject.set(x, "AcceleratorNames", js.undefined)
    
    inline def setAcceleratorNamesVarargs(value: AcceleratorName*): Self = StObject.set(x, "AcceleratorNames", js.Array(value*))
    
    inline def setAcceleratorTotalMemoryMiB(value: AcceleratorTotalMemoryMiBRequest): Self = StObject.set(x, "AcceleratorTotalMemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTotalMemoryMiBUndefined: Self = StObject.set(x, "AcceleratorTotalMemoryMiB", js.undefined)
    
    inline def setAcceleratorTypes(value: AcceleratorTypes): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setBareMetal(value: BareMetal): Self = StObject.set(x, "BareMetal", value.asInstanceOf[js.Any])
    
    inline def setBareMetalUndefined: Self = StObject.set(x, "BareMetal", js.undefined)
    
    inline def setBaselineEbsBandwidthMbps(value: BaselineEbsBandwidthMbpsRequest): Self = StObject.set(x, "BaselineEbsBandwidthMbps", value.asInstanceOf[js.Any])
    
    inline def setBaselineEbsBandwidthMbpsUndefined: Self = StObject.set(x, "BaselineEbsBandwidthMbps", js.undefined)
    
    inline def setBurstablePerformance(value: BurstablePerformance): Self = StObject.set(x, "BurstablePerformance", value.asInstanceOf[js.Any])
    
    inline def setBurstablePerformanceUndefined: Self = StObject.set(x, "BurstablePerformance", js.undefined)
    
    inline def setCpuManufacturers(value: CpuManufacturers): Self = StObject.set(x, "CpuManufacturers", value.asInstanceOf[js.Any])
    
    inline def setCpuManufacturersUndefined: Self = StObject.set(x, "CpuManufacturers", js.undefined)
    
    inline def setCpuManufacturersVarargs(value: CpuManufacturer*): Self = StObject.set(x, "CpuManufacturers", js.Array(value*))
    
    inline def setExcludedInstanceTypes(value: ExcludedInstanceTypes): Self = StObject.set(x, "ExcludedInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedInstanceTypesUndefined: Self = StObject.set(x, "ExcludedInstanceTypes", js.undefined)
    
    inline def setExcludedInstanceTypesVarargs(value: ExcludedInstance*): Self = StObject.set(x, "ExcludedInstanceTypes", js.Array(value*))
    
    inline def setInstanceGenerations(value: InstanceGenerations): Self = StObject.set(x, "InstanceGenerations", value.asInstanceOf[js.Any])
    
    inline def setInstanceGenerationsUndefined: Self = StObject.set(x, "InstanceGenerations", js.undefined)
    
    inline def setInstanceGenerationsVarargs(value: InstanceGeneration*): Self = StObject.set(x, "InstanceGenerations", js.Array(value*))
    
    inline def setLocalStorage(value: LocalStorage): Self = StObject.set(x, "LocalStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypes(value: LocalStorageTypes): Self = StObject.set(x, "LocalStorageTypes", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageTypesUndefined: Self = StObject.set(x, "LocalStorageTypes", js.undefined)
    
    inline def setLocalStorageTypesVarargs(value: LocalStorageType*): Self = StObject.set(x, "LocalStorageTypes", js.Array(value*))
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "LocalStorage", js.undefined)
    
    inline def setMemoryGiBPerVCpu(value: MemoryGiBPerVCpuRequest): Self = StObject.set(x, "MemoryGiBPerVCpu", value.asInstanceOf[js.Any])
    
    inline def setMemoryGiBPerVCpuUndefined: Self = StObject.set(x, "MemoryGiBPerVCpu", js.undefined)
    
    inline def setMemoryMiB(value: MemoryMiBRequest): Self = StObject.set(x, "MemoryMiB", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceCount(value: NetworkInterfaceCountRequest): Self = StObject.set(x, "NetworkInterfaceCount", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceCountUndefined: Self = StObject.set(x, "NetworkInterfaceCount", js.undefined)
    
    inline def setOnDemandMaxPricePercentageOverLowestPrice(value: NullablePositiveInteger): Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setOnDemandMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "OnDemandMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setRequireHibernateSupport(value: NullableBoolean): Self = StObject.set(x, "RequireHibernateSupport", value.asInstanceOf[js.Any])
    
    inline def setRequireHibernateSupportUndefined: Self = StObject.set(x, "RequireHibernateSupport", js.undefined)
    
    inline def setSpotMaxPricePercentageOverLowestPrice(value: NullablePositiveInteger): Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxPricePercentageOverLowestPriceUndefined: Self = StObject.set(x, "SpotMaxPricePercentageOverLowestPrice", js.undefined)
    
    inline def setTotalLocalStorageGB(value: TotalLocalStorageGBRequest): Self = StObject.set(x, "TotalLocalStorageGB", value.asInstanceOf[js.Any])
    
    inline def setTotalLocalStorageGBUndefined: Self = StObject.set(x, "TotalLocalStorageGB", js.undefined)
    
    inline def setVCpuCount(value: VCpuCountRequest): Self = StObject.set(x, "VCpuCount", value.asInstanceOf[js.Any])
  }
}
