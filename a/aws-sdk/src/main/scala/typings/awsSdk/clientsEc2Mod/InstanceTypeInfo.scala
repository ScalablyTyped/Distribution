package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeInfo extends StObject {
  
  /**
    * Indicates whether auto recovery is supported.
    */
  var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.undefined
  
  /**
    * Indicates whether the instance is a bare metal instance type.
    */
  var BareMetal: js.UndefOr[BareMetalFlag] = js.undefined
  
  /**
    * Indicates whether the instance type is a burstable performance instance type.
    */
  var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.undefined
  
  /**
    * Indicates whether the instance type is current generation.
    */
  var CurrentGeneration: js.UndefOr[CurrentGenerationFlag] = js.undefined
  
  /**
    * Indicates whether Dedicated Hosts are supported on the instance type.
    */
  var DedicatedHostsSupported: js.UndefOr[DedicatedHostFlag] = js.undefined
  
  /**
    * Describes the Amazon EBS settings for the instance type.
    */
  var EbsInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.EbsInfo] = js.undefined
  
  /**
    * Describes the FPGA accelerator settings for the instance type.
    */
  var FpgaInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.FpgaInfo] = js.undefined
  
  /**
    * Indicates whether the instance type is eligible for the free tier.
    */
  var FreeTierEligible: js.UndefOr[FreeTierEligibleFlag] = js.undefined
  
  /**
    * Describes the GPU accelerator settings for the instance type.
    */
  var GpuInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.GpuInfo] = js.undefined
  
  /**
    * Indicates whether On-Demand hibernation is supported.
    */
  var HibernationSupported: js.UndefOr[HibernationFlag] = js.undefined
  
  /**
    * The hypervisor for the instance type.
    */
  var Hypervisor: js.UndefOr[InstanceTypeHypervisor] = js.undefined
  
  /**
    * Describes the Inference accelerator settings for the instance type.
    */
  var InferenceAcceleratorInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.InferenceAcceleratorInfo] = js.undefined
  
  /**
    * Describes the instance storage for the instance type.
    */
  var InstanceStorageInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceStorageInfo] = js.undefined
  
  /**
    * Indicates whether instance storage is supported.
    */
  var InstanceStorageSupported: js.UndefOr[InstanceStorageFlag] = js.undefined
  
  /**
    * The instance type. For more information, see Instance types in the Amazon EC2 User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * Describes the memory for the instance type.
    */
  var MemoryInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.MemoryInfo] = js.undefined
  
  /**
    * Describes the network settings for the instance type.
    */
  var NetworkInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInfo] = js.undefined
  
  /**
    * Describes the placement group settings for the instance type.
    */
  var PlacementGroupInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.PlacementGroupInfo] = js.undefined
  
  /**
    * Describes the processor.
    */
  var ProcessorInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.ProcessorInfo] = js.undefined
  
  /**
    * The supported boot modes. For more information, see Boot modes in the Amazon EC2 User Guide.
    */
  var SupportedBootModes: js.UndefOr[BootModeTypeList] = js.undefined
  
  /**
    * The supported root device types.
    */
  var SupportedRootDeviceTypes: js.UndefOr[RootDeviceTypeList] = js.undefined
  
  /**
    * Indicates whether the instance type is offered for spot or On-Demand.
    */
  var SupportedUsageClasses: js.UndefOr[UsageClassTypeList] = js.undefined
  
  /**
    * The supported virtualization types.
    */
  var SupportedVirtualizationTypes: js.UndefOr[VirtualizationTypeList] = js.undefined
  
  /**
    * Describes the vCPU configurations for the instance type.
    */
  var VCpuInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.VCpuInfo] = js.undefined
}
object InstanceTypeInfo {
  
  inline def apply(): InstanceTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeInfo]
  }
  
  extension [Self <: InstanceTypeInfo](x: Self) {
    
    inline def setAutoRecoverySupported(value: AutoRecoveryFlag): Self = StObject.set(x, "AutoRecoverySupported", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoverySupportedUndefined: Self = StObject.set(x, "AutoRecoverySupported", js.undefined)
    
    inline def setBareMetal(value: BareMetalFlag): Self = StObject.set(x, "BareMetal", value.asInstanceOf[js.Any])
    
    inline def setBareMetalUndefined: Self = StObject.set(x, "BareMetal", js.undefined)
    
    inline def setBurstablePerformanceSupported(value: BurstablePerformanceFlag): Self = StObject.set(x, "BurstablePerformanceSupported", value.asInstanceOf[js.Any])
    
    inline def setBurstablePerformanceSupportedUndefined: Self = StObject.set(x, "BurstablePerformanceSupported", js.undefined)
    
    inline def setCurrentGeneration(value: CurrentGenerationFlag): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    inline def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    inline def setDedicatedHostsSupported(value: DedicatedHostFlag): Self = StObject.set(x, "DedicatedHostsSupported", value.asInstanceOf[js.Any])
    
    inline def setDedicatedHostsSupportedUndefined: Self = StObject.set(x, "DedicatedHostsSupported", js.undefined)
    
    inline def setEbsInfo(value: EbsInfo): Self = StObject.set(x, "EbsInfo", value.asInstanceOf[js.Any])
    
    inline def setEbsInfoUndefined: Self = StObject.set(x, "EbsInfo", js.undefined)
    
    inline def setFpgaInfo(value: FpgaInfo): Self = StObject.set(x, "FpgaInfo", value.asInstanceOf[js.Any])
    
    inline def setFpgaInfoUndefined: Self = StObject.set(x, "FpgaInfo", js.undefined)
    
    inline def setFreeTierEligible(value: FreeTierEligibleFlag): Self = StObject.set(x, "FreeTierEligible", value.asInstanceOf[js.Any])
    
    inline def setFreeTierEligibleUndefined: Self = StObject.set(x, "FreeTierEligible", js.undefined)
    
    inline def setGpuInfo(value: GpuInfo): Self = StObject.set(x, "GpuInfo", value.asInstanceOf[js.Any])
    
    inline def setGpuInfoUndefined: Self = StObject.set(x, "GpuInfo", js.undefined)
    
    inline def setHibernationSupported(value: HibernationFlag): Self = StObject.set(x, "HibernationSupported", value.asInstanceOf[js.Any])
    
    inline def setHibernationSupportedUndefined: Self = StObject.set(x, "HibernationSupported", js.undefined)
    
    inline def setHypervisor(value: InstanceTypeHypervisor): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setInferenceAcceleratorInfo(value: InferenceAcceleratorInfo): Self = StObject.set(x, "InferenceAcceleratorInfo", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorInfoUndefined: Self = StObject.set(x, "InferenceAcceleratorInfo", js.undefined)
    
    inline def setInstanceStorageInfo(value: InstanceStorageInfo): Self = StObject.set(x, "InstanceStorageInfo", value.asInstanceOf[js.Any])
    
    inline def setInstanceStorageInfoUndefined: Self = StObject.set(x, "InstanceStorageInfo", js.undefined)
    
    inline def setInstanceStorageSupported(value: InstanceStorageFlag): Self = StObject.set(x, "InstanceStorageSupported", value.asInstanceOf[js.Any])
    
    inline def setInstanceStorageSupportedUndefined: Self = StObject.set(x, "InstanceStorageSupported", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    inline def setNetworkInfo(value: NetworkInfo): Self = StObject.set(x, "NetworkInfo", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoUndefined: Self = StObject.set(x, "NetworkInfo", js.undefined)
    
    inline def setPlacementGroupInfo(value: PlacementGroupInfo): Self = StObject.set(x, "PlacementGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupInfoUndefined: Self = StObject.set(x, "PlacementGroupInfo", js.undefined)
    
    inline def setProcessorInfo(value: ProcessorInfo): Self = StObject.set(x, "ProcessorInfo", value.asInstanceOf[js.Any])
    
    inline def setProcessorInfoUndefined: Self = StObject.set(x, "ProcessorInfo", js.undefined)
    
    inline def setSupportedBootModes(value: BootModeTypeList): Self = StObject.set(x, "SupportedBootModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedBootModesUndefined: Self = StObject.set(x, "SupportedBootModes", js.undefined)
    
    inline def setSupportedBootModesVarargs(value: BootModeType*): Self = StObject.set(x, "SupportedBootModes", js.Array(value*))
    
    inline def setSupportedRootDeviceTypes(value: RootDeviceTypeList): Self = StObject.set(x, "SupportedRootDeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedRootDeviceTypesUndefined: Self = StObject.set(x, "SupportedRootDeviceTypes", js.undefined)
    
    inline def setSupportedRootDeviceTypesVarargs(value: RootDeviceType*): Self = StObject.set(x, "SupportedRootDeviceTypes", js.Array(value*))
    
    inline def setSupportedUsageClasses(value: UsageClassTypeList): Self = StObject.set(x, "SupportedUsageClasses", value.asInstanceOf[js.Any])
    
    inline def setSupportedUsageClassesUndefined: Self = StObject.set(x, "SupportedUsageClasses", js.undefined)
    
    inline def setSupportedUsageClassesVarargs(value: UsageClassType*): Self = StObject.set(x, "SupportedUsageClasses", js.Array(value*))
    
    inline def setSupportedVirtualizationTypes(value: VirtualizationTypeList): Self = StObject.set(x, "SupportedVirtualizationTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedVirtualizationTypesUndefined: Self = StObject.set(x, "SupportedVirtualizationTypes", js.undefined)
    
    inline def setSupportedVirtualizationTypesVarargs(value: VirtualizationType*): Self = StObject.set(x, "SupportedVirtualizationTypes", js.Array(value*))
    
    inline def setVCpuInfo(value: VCpuInfo): Self = StObject.set(x, "VCpuInfo", value.asInstanceOf[js.Any])
    
    inline def setVCpuInfoUndefined: Self = StObject.set(x, "VCpuInfo", js.undefined)
  }
}
