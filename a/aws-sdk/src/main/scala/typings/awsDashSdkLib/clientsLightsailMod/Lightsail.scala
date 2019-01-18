package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lightsail
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Lightsail: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsLightsailMod.LightsailNs.ClientConfiguration = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def allocateStaticIp(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AllocateStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachDisk(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachInstancesToLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachInstancesToLoadBalancer(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachInstancesToLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachLoadBalancerTlsCertificate(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def attachStaticIp(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.AttachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def closeInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def closeInstancePublicPorts(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CloseInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
    */
  def copySnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
    */
  def copySnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCloudFormationStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCloudFormationStack(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateCloudFormationStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDisk(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDiskFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDiskFromSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDiskSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomain(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX record. The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX record. The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomainEntry(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstanceSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. Use the get blueprints operation to return a list of available blueprints. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. Use the get blueprints operation to return a list of available blueprints. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstances(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical configuration. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstancesFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical configuration. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInstancesFromSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateInstancesFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createKeyPair(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancer(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancerTlsCertificate(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabaseFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabaseFromSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRelationalDatabaseSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.CreateRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDisk(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDiskSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDomain(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDomainEntry(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific Amazon Lightsail virtual private server, or instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific Amazon Lightsail virtual private server, or instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInstance(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInstanceSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by keyPairName. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by keyPairName. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteKeyPair(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancer(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancerTlsCertificate(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteLoadBalancerTlsCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRelationalDatabaseSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DeleteRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachDisk(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachInstancesFromLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachInstancesFromLoadBalancer(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachInstancesFromLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detachStaticIp(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DetachStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def downloadDefaultKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def downloadDefaultKeyPair(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.DownloadDefaultKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ExportSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getActiveNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getActiveNames(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetActiveNamesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new virtual private server already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.
    */
  def getBlueprints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBlueprints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new virtual private server already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.
    */
  def getBlueprints(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBlueprints(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBundles(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCloudFormationStackRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCloudFormationStackRecords(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetCloudFormationStackRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDisk(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiskSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiskSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiskSnapshots(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDiskSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDisks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDisks(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDisksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomain(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomains(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetDomainsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExportSnapshotRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExportSnapshotRecords(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetExportSnapshotRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstance(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceAccessDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceAccessDetails(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceAccessDetailsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceMetricData(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstancePortStates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstancePortStates(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancePortStatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceSnapshots(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceState(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstanceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstances(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getKeyPair(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getKeyPairs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getKeyPairs(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetKeyPairsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancer(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancerMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancerMetricData(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancerTlsCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancerTlsCertificates(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancerTlsCertificatesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLoadBalancers(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperation(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperations(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getOperationsForResource(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetOperationsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRegions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRegions(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRegionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseBlueprints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseBlueprints(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBlueprintsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseBundles(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseEvents(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseLogEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseLogEvents(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogEventsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseLogStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseLogStreams(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseLogStreamsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseMasterUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseMasterUserPassword(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMasterUserPasswordResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseMetricData(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseMetricDataResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseParameters(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseSnapshot(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabaseSnapshots(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabaseSnapshotsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRelationalDatabases(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetRelationalDatabasesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStaticIp(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStaticIps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStaticIps(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.GetStaticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importKeyPair(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ImportKeyPairResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def isVpcPeered(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def isVpcPeered(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.IsVpcPeeredResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def openInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def openInstancePublicPorts(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.OpenInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def peerVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def peerVpc(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putInstancePublicPorts(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.PutInstancePublicPortsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootInstance(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.RebootRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def releaseStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def releaseStaticIp(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.ReleaseStaticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startInstance(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StartRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopInstance(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.StopRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.TagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unpeerVpc(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unpeerVpc(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UnpeerVpcResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UntagResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDomainEntry(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateDomainEntryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLoadBalancerAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLoadBalancerAttribute(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateLoadBalancerAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRelationalDatabase(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which paramater updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRelationalDatabaseParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which paramater updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRelationalDatabaseParameters(
    params: awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLightsailMod.LightsailNs.UpdateRelationalDatabaseParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

