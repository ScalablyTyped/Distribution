package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFlowInstancesDetail extends StObject {
  
  /**
    * The name of an Amazon EC2 key pair that can be used to connect to the master node using SSH.
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * For clusters launched within Amazon Virtual Private Cloud, this is the identifier of the subnet where the cluster was launched.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The Hadoop version for the cluster.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The number of Amazon EC2 instances in the cluster. If the value is 1, the same instance serves as both the master and core and task node. If the value is greater than 1, one instance is the master node and all others are core and task nodes.
    */
  var InstanceCount: Integer
  
  /**
    * Details about the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.undefined
  
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon EC2 instance identifier of the master node.
    */
  var MasterInstanceId: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The Amazon EC2 master node instance type.
    */
  var MasterInstanceType: InstanceType
  
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[XmlString] = js.undefined
  
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is increased one time for every hour that an m1.small instance runs. Larger instances are weighted more heavily, so an Amazon EC2 instance that is roughly four times more expensive would result in the normalized instance hours being increased incrementally four times. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon EC2 Availability Zone for the cluster.
    */
  var Placement: js.UndefOr[PlacementType] = js.undefined
  
  /**
    * The Amazon EC2 core and task node instance type.
    */
  var SlaveInstanceType: InstanceType
  
  /**
    * Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.undefined
}
object JobFlowInstancesDetail {
  
  inline def apply(InstanceCount: Integer, MasterInstanceType: InstanceType, SlaveInstanceType: InstanceType): JobFlowInstancesDetail = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], MasterInstanceType = MasterInstanceType.asInstanceOf[js.Any], SlaveInstanceType = SlaveInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowInstancesDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobFlowInstancesDetail] (val x: Self) extends AnyVal {
    
    inline def setEc2KeyName(value: XmlStringMaxLen256): Self = StObject.set(x, "Ec2KeyName", value.asInstanceOf[js.Any])
    
    inline def setEc2KeyNameUndefined: Self = StObject.set(x, "Ec2KeyName", js.undefined)
    
    inline def setEc2SubnetId(value: XmlStringMaxLen256): Self = StObject.set(x, "Ec2SubnetId", value.asInstanceOf[js.Any])
    
    inline def setEc2SubnetIdUndefined: Self = StObject.set(x, "Ec2SubnetId", js.undefined)
    
    inline def setHadoopVersion(value: XmlStringMaxLen256): Self = StObject.set(x, "HadoopVersion", value.asInstanceOf[js.Any])
    
    inline def setHadoopVersionUndefined: Self = StObject.set(x, "HadoopVersion", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroups(value: InstanceGroupDetailList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: InstanceGroupDetail*): Self = StObject.set(x, "InstanceGroups", js.Array(value*))
    
    inline def setKeepJobFlowAliveWhenNoSteps(value: Boolean): Self = StObject.set(x, "KeepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
    
    inline def setKeepJobFlowAliveWhenNoStepsUndefined: Self = StObject.set(x, "KeepJobFlowAliveWhenNoSteps", js.undefined)
    
    inline def setMasterInstanceId(value: XmlString): Self = StObject.set(x, "MasterInstanceId", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceIdUndefined: Self = StObject.set(x, "MasterInstanceId", js.undefined)
    
    inline def setMasterInstanceType(value: InstanceType): Self = StObject.set(x, "MasterInstanceType", value.asInstanceOf[js.Any])
    
    inline def setMasterPublicDnsName(value: XmlString): Self = StObject.set(x, "MasterPublicDnsName", value.asInstanceOf[js.Any])
    
    inline def setMasterPublicDnsNameUndefined: Self = StObject.set(x, "MasterPublicDnsName", js.undefined)
    
    inline def setNormalizedInstanceHours(value: Integer): Self = StObject.set(x, "NormalizedInstanceHours", value.asInstanceOf[js.Any])
    
    inline def setNormalizedInstanceHoursUndefined: Self = StObject.set(x, "NormalizedInstanceHours", js.undefined)
    
    inline def setPlacement(value: PlacementType): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setSlaveInstanceType(value: InstanceType): Self = StObject.set(x, "SlaveInstanceType", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtected(value: Boolean): Self = StObject.set(x, "TerminationProtected", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtectedUndefined: Self = StObject.set(x, "TerminationProtected", js.undefined)
  }
}
