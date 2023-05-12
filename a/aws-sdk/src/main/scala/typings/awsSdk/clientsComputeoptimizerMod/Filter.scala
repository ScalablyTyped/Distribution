package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific finding classification. For example, Underprovisioned. Specify RecommendationSourceType to return recommendations of a specific resource type. For example, Ec2Instance. Specify FindingReasonCodes to return recommendations with a specific finding reason code. For example, CPUUnderprovisioned. Specify InferredWorkloadTypes to return recommendations of a specific inferred workload. For example, Redis. You can filter your EC2 instance recommendations by tag:key and tag-key tags. A tag:key is a key and value combination of a tag assigned to your recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find all recommendations that have a tag with the key of Owner and the value of TeamA, specify tag:Owner for the filter name and TeamA for the filter value. A tag-key is the key of a tag assigned to your recommendations. Use this filter to find all of your recommendations that have a tag with a specific key. This doesn’t consider the tag value. For example, you can find your recommendations with a tag key value of Owner or without any tag keys assigned.
    */
  var name: js.UndefOr[FilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values for this parameter are as follows, depending on what you specify for the name parameter and the resource type that you wish to filter results for:   Specify Optimized or NotOptimized if you specify the name parameter as Finding and you want to filter results for Auto Scaling groups.   Specify Underprovisioned, Overprovisioned, or Optimized if you specify the name parameter as Finding and you want to filter results for EC2 instances.   Specify Ec2Instance or AutoScalingGroup if you specify the name parameter as RecommendationSourceType.   Specify one of the following options if you specify the name parameter as FindingReasonCodes:     CPUOverprovisioned  — The instance’s CPU configuration can be sized down while still meeting the performance requirements of your workload.     CPUUnderprovisioned  — The instance’s CPU configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better CPU performance.     MemoryOverprovisioned  — The instance’s memory configuration can be sized down while still meeting the performance requirements of your workload.     MemoryUnderprovisioned  — The instance’s memory configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better memory performance.     EBSThroughputOverprovisioned  — The instance’s EBS throughput configuration can be sized down while still meeting the performance requirements of your workload.     EBSThroughputUnderprovisioned  — The instance’s EBS throughput configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better EBS throughput performance.     EBSIOPSOverprovisioned  — The instance’s EBS IOPS configuration can be sized down while still meeting the performance requirements of your workload.     EBSIOPSUnderprovisioned  — The instance’s EBS IOPS configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS performance.     NetworkBandwidthOverprovisioned  — The instance’s network bandwidth configuration can be sized down while still meeting the performance requirements of your workload.     NetworkBandwidthUnderprovisioned  — The instance’s network bandwidth configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better network bandwidth performance. This finding reason happens when the NetworkIn or NetworkOut performance of an instance is impacted.     NetworkPPSOverprovisioned  — The instance’s network PPS (packets per second) configuration can be sized down while still meeting the performance requirements of your workload.     NetworkPPSUnderprovisioned  — The instance’s network PPS (packets per second) configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better network PPS performance.     DiskIOPSOverprovisioned  — The instance’s disk IOPS configuration can be sized down while still meeting the performance requirements of your workload.     DiskIOPSUnderprovisioned  — The instance’s disk IOPS configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better disk IOPS performance.     DiskThroughputOverprovisioned  — The instance’s disk throughput configuration can be sized down while still meeting the performance requirements of your workload.     DiskThroughputUnderprovisioned  — The instance’s disk throughput configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better disk throughput performance.    
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
