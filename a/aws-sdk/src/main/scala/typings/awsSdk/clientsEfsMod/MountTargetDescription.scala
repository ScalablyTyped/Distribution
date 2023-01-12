package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountTargetDescription extends StObject {
  
  /**
    * The unique and consistent identifier of the Availability Zone that the mount target resides in. For example, use1-az1 is an AZ ID for the us-east-1 Region and it has the same location in every Amazon Web Services account.
    */
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneId] = js.undefined
  
  /**
    * The name of the Availability Zone in which the mount target is located. Availability Zones are independently mapped to names for each Amazon Web Services account. For example, the Availability Zone us-east-1a for your Amazon Web Services account might not be the same location as us-east-1a for another Amazon Web Services account.
    */
  var AvailabilityZoneName: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneName] = js.undefined
  
  /**
    * The ID of the file system for which the mount target is intended.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
  
  /**
    * Address at which the file system can be mounted by using the mount target.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsEfsMod.IpAddress] = js.undefined
  
  /**
    * Lifecycle state of the mount target.
    */
  var LifeCycleState: typings.awsSdk.clientsEfsMod.LifeCycleState
  
  /**
    * System-assigned mount target ID.
    */
  var MountTargetId: typings.awsSdk.clientsEfsMod.MountTargetId
  
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.clientsEfsMod.NetworkInterfaceId] = js.undefined
  
  /**
    * Amazon Web Services account ID that owns the resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The ID of the mount target's subnet.
    */
  var SubnetId: typings.awsSdk.clientsEfsMod.SubnetId
  
  /**
    * The virtual private cloud (VPC) ID that the mount target is configured in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsEfsMod.VpcId] = js.undefined
}
object MountTargetDescription {
  
  inline def apply(
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    MountTargetId: MountTargetId,
    SubnetId: SubnetId
  ): MountTargetDescription = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MountTargetDescription] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneName(value: AvailabilityZoneName): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setLifeCycleState(value: LifeCycleState): Self = StObject.set(x, "LifeCycleState", value.asInstanceOf[js.Any])
    
    inline def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
