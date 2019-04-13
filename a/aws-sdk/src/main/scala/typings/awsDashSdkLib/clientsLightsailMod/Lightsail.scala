package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lightsail
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Lightsail: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(): awsDashSdkLib.libRequestMod.Request[AllocateStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AllocateStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AllocateStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(params: AllocateStaticIpRequest): awsDashSdkLib.libRequestMod.Request[AllocateStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def allocateStaticIp(
    params: AllocateStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AllocateStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AllocateStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(): awsDashSdkLib.libRequestMod.Request[AttachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(params: AttachDiskRequest): awsDashSdkLib.libRequestMod.Request[AttachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachDisk(
    params: AttachDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(): awsDashSdkLib.libRequestMod.Request[AttachInstancesToLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInstancesToLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachInstancesToLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachInstancesToLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(params: AttachInstancesToLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[AttachInstancesToLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInstancesToLoadBalancer(
    params: AttachInstancesToLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachInstancesToLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachInstancesToLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(params: AttachLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerTlsCertificate(
    params: AttachLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(): awsDashSdkLib.libRequestMod.Request[AttachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(params: AttachStaticIpRequest): awsDashSdkLib.libRequestMod.Request[AttachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachStaticIp(
    params: AttachStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[CloseInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def closeInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CloseInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CloseInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(params: CloseInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[CloseInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def closeInstancePublicPorts(
    params: CloseInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CloseInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CloseInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
    */
  def copySnapshot(): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copySnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
    */
  def copySnapshot(params: CopySnapshotRequest): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(params: CreateCloudFormationStackRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationStack(
    params: CreateCloudFormationStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(): awsDashSdkLib.libRequestMod.Request[CreateDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(params: CreateDiskRequest): awsDashSdkLib.libRequestMod.Request[CreateDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDisk(
    params: CreateDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDiskFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDiskFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For more information, see Regions and Availability Zones in Lightsail. The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateDiskFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDiskFromSnapshot(
    params: CreateDiskFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(params: CreateDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDiskSnapshot(
    params: CreateDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(): awsDashSdkLib.libRequestMod.Request[CreateDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(params: CreateDomainRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(): awsDashSdkLib.libRequestMod.Request[CreateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(params: CreateDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainEntry(
    params: CreateDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(params: CreateInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstanceSnapshot(
    params: CreateInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. Use the get blueprints operation to return a list of available blueprints. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(): awsDashSdkLib.libRequestMod.Request[CreateInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. Use the get blueprints operation to return a list of available blueprints. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(params: CreateInstancesRequest): awsDashSdkLib.libRequestMod.Request[CreateInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstances(
    params: CreateInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical configuration. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateInstancesFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstancesFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstancesFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstancesFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical configuration. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(params: CreateInstancesFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateInstancesFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstancesFromSnapshot(
    params: CreateInstancesFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstancesFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstancesFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(): awsDashSdkLib.libRequestMod.Request[CreateKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(params: CreateKeyPairRequest): awsDashSdkLib.libRequestMod.Request[CreateKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createKeyPair(
    params: CreateKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(params: CreateLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    params: CreateLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(params: CreateLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    params: CreateLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(params: CreateRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabase(
    params: CreateRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(params: CreateRelationalDatabaseFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    params: CreateRelationalDatabaseFromSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(params: CreateRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    params: CreateRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(): awsDashSdkLib.libRequestMod.Request[DeleteDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(params: DeleteDiskRequest): awsDashSdkLib.libRequestMod.Request[DeleteDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDisk(
    params: DeleteDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(params: DeleteDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDiskSnapshot(
    params: DeleteDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(): awsDashSdkLib.libRequestMod.Request[DeleteDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(params: DeleteDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(): awsDashSdkLib.libRequestMod.Request[DeleteDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(params: DeleteDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[DeleteDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainEntry(
    params: DeleteDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific Amazon Lightsail virtual private server, or instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(): awsDashSdkLib.libRequestMod.Request[DeleteInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific Amazon Lightsail virtual private server, or instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(params: DeleteInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeleteInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstanceSnapshot(
    params: DeleteInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by keyPairName. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(): awsDashSdkLib.libRequestMod.Request[DeleteKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by keyPairName. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(params: DeleteKeyPairRequest): awsDashSdkLib.libRequestMod.Request[DeleteKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKeyPair(
    params: DeleteKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the instance after a host key mismatch.  Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client. 
    */
  def deleteKnownHostKeys(): awsDashSdkLib.libRequestMod.Request[DeleteKnownHostKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKnownHostKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteKnownHostKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteKnownHostKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the instance after a host key mismatch.  Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client. 
    */
  def deleteKnownHostKeys(params: DeleteKnownHostKeysRequest): awsDashSdkLib.libRequestMod.Request[DeleteKnownHostKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteKnownHostKeys(
    params: DeleteKnownHostKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteKnownHostKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteKnownHostKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(params: DeleteLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(params: DeleteLoadBalancerTlsCertificateRequest): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    params: DeleteLoadBalancerTlsCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerTlsCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerTlsCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRelationalDatabase(
    params: DeleteRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(params: DeleteRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    params: DeleteRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(): awsDashSdkLib.libRequestMod.Request[DetachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachDisk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by diskName. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(params: DetachDiskRequest): awsDashSdkLib.libRequestMod.Request[DetachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachDisk(
    params: DetachDiskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachDiskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DetachInstancesFromLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInstancesFromLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachInstancesFromLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachInstancesFromLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(params: DetachInstancesFromLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[DetachInstancesFromLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInstancesFromLoadBalancer(
    params: DetachInstancesFromLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachInstancesFromLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachInstancesFromLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(): awsDashSdkLib.libRequestMod.Request[DetachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(params: DetachStaticIpRequest): awsDashSdkLib.libRequestMod.Request[DetachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachStaticIp(
    params: DetachStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(): awsDashSdkLib.libRequestMod.Request[DownloadDefaultKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def downloadDefaultKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DownloadDefaultKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DownloadDefaultKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): awsDashSdkLib.libRequestMod.Request[DownloadDefaultKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def downloadDefaultKeyPair(
    params: DownloadDefaultKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DownloadDefaultKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DownloadDefaultKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(): awsDashSdkLib.libRequestMod.Request[ExportSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(params: ExportSnapshotRequest): awsDashSdkLib.libRequestMod.Request[ExportSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportSnapshot(
    params: ExportSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(): awsDashSdkLib.libRequestMod.Request[GetActiveNamesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getActiveNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetActiveNamesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetActiveNamesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(params: GetActiveNamesRequest): awsDashSdkLib.libRequestMod.Request[GetActiveNamesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getActiveNames(
    params: GetActiveNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetActiveNamesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetActiveNamesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new virtual private server already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.
    */
  def getBlueprints(): awsDashSdkLib.libRequestMod.Request[GetBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBlueprints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new virtual private server already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.
    */
  def getBlueprints(params: GetBlueprintsRequest): awsDashSdkLib.libRequestMod.Request[GetBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBlueprints(
    params: GetBlueprintsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(): awsDashSdkLib.libRequestMod.Request[GetBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(params: GetBundlesRequest): awsDashSdkLib.libRequestMod.Request[GetBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBundles(
    params: GetBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(): awsDashSdkLib.libRequestMod.Request[GetCloudFormationStackRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFormationStackRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFormationStackRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationStackRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(params: GetCloudFormationStackRecordsRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFormationStackRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFormationStackRecords(
    params: GetCloudFormationStackRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFormationStackRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationStackRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(): awsDashSdkLib.libRequestMod.Request[GetDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDisk(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDiskResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(params: GetDiskRequest): awsDashSdkLib.libRequestMod.Request[GetDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDisk(
    params: GetDiskRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDiskResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDiskSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(params: GetDiskSnapshotRequest): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDiskSnapshot(
    params: GetDiskSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDiskSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDiskSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDiskSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(params: GetDiskSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDiskSnapshots(
    params: GetDiskSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDiskSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDiskSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(): awsDashSdkLib.libRequestMod.Request[GetDisksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDisks(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDisksResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDisksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(params: GetDisksRequest): awsDashSdkLib.libRequestMod.Request[GetDisksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDisks(
    params: GetDisksRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDisksResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDisksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(): awsDashSdkLib.libRequestMod.Request[GetDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomain(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDomainResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(params: GetDomainRequest): awsDashSdkLib.libRequestMod.Request[GetDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomain(
    params: GetDomainRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDomainResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(): awsDashSdkLib.libRequestMod.Request[GetDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(params: GetDomainsRequest): awsDashSdkLib.libRequestMod.Request[GetDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomains(
    params: GetDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(): awsDashSdkLib.libRequestMod.Request[GetExportSnapshotRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportSnapshotRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportSnapshotRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportSnapshotRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(params: GetExportSnapshotRecordsRequest): awsDashSdkLib.libRequestMod.Request[GetExportSnapshotRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportSnapshotRecords(
    params: GetExportSnapshotRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportSnapshotRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportSnapshotRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(): awsDashSdkLib.libRequestMod.Request[GetInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(params: GetInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstance(
    params: GetInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessDetailsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceAccessDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceAccessDetailsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessDetailsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessDetailsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceAccessDetails(
    params: GetInstanceAccessDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceAccessDetailsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessDetailsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(): awsDashSdkLib.libRequestMod.Request[GetInstanceMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(params: GetInstanceMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceMetricData(
    params: GetInstanceMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(): awsDashSdkLib.libRequestMod.Request[GetInstancePortStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstancePortStates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancePortStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancePortStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(params: GetInstancePortStatesRequest): awsDashSdkLib.libRequestMod.Request[GetInstancePortStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstancePortStates(
    params: GetInstancePortStatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancePortStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancePortStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(params: GetInstanceSnapshotRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceSnapshot(
    params: GetInstanceSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(params: GetInstanceSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceSnapshots(
    params: GetInstanceSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(): awsDashSdkLib.libRequestMod.Request[GetInstanceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(params: GetInstanceStateRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceState(
    params: GetInstanceStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(): awsDashSdkLib.libRequestMod.Request[GetInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(params: GetInstancesRequest): awsDashSdkLib.libRequestMod.Request[GetInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstances(
    params: GetInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(): awsDashSdkLib.libRequestMod.Request[GetKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(params: GetKeyPairRequest): awsDashSdkLib.libRequestMod.Request[GetKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getKeyPair(
    params: GetKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(): awsDashSdkLib.libRequestMod.Request[GetKeyPairsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getKeyPairs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetKeyPairsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(params: GetKeyPairsRequest): awsDashSdkLib.libRequestMod.Request[GetKeyPairsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getKeyPairs(
    params: GetKeyPairsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetKeyPairsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetKeyPairsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(params: GetLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancer(
    params: GetLoadBalancerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancerMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(params: GetLoadBalancerMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancerMetricData(
    params: GetLoadBalancerMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerTlsCertificatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancerTlsCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerTlsCertificatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerTlsCertificatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(params: GetLoadBalancerTlsCertificatesRequest): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerTlsCertificatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancerTlsCertificates(
    params: GetLoadBalancerTlsCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancerTlsCertificatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancerTlsCertificatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(): awsDashSdkLib.libRequestMod.Request[GetLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(params: GetLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[GetLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoadBalancers(
    params: GetLoadBalancersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(): awsDashSdkLib.libRequestMod.Request[GetOperationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(params: GetOperationRequest): awsDashSdkLib.libRequestMod.Request[GetOperationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperation(
    params: GetOperationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(): awsDashSdkLib.libRequestMod.Request[GetOperationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(params: GetOperationsRequest): awsDashSdkLib.libRequestMod.Request[GetOperationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperations(
    params: GetOperationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(): awsDashSdkLib.libRequestMod.Request[GetOperationsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(params: GetOperationsForResourceRequest): awsDashSdkLib.libRequestMod.Request[GetOperationsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperationsForResource(
    params: GetOperationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(): awsDashSdkLib.libRequestMod.Request[GetRegionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRegions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRegionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(params: GetRegionsRequest): awsDashSdkLib.libRequestMod.Request[GetRegionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRegions(
    params: GetRegionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRegionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRegionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(params: GetRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabase(
    params: GetRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseBlueprints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(params: GetRelationalDatabaseBlueprintsRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseBlueprints(
    params: GetRelationalDatabaseBlueprintsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseBlueprintsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBlueprintsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(params: GetRelationalDatabaseBundlesRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseBundles(
    params: GetRelationalDatabaseBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(params: GetRelationalDatabaseEventsRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseEvents(
    params: GetRelationalDatabaseEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseLogEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseLogEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(params: GetRelationalDatabaseLogEventsRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseLogEvents(
    params: GetRelationalDatabaseLogEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseLogEventsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogEventsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseLogStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseLogStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(params: GetRelationalDatabaseLogStreamsRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseLogStreams(
    params: GetRelationalDatabaseLogStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseLogStreamsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseLogStreamsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMasterUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseMasterUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseMasterUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMasterUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(params: GetRelationalDatabaseMasterUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMasterUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseMasterUserPassword(
    params: GetRelationalDatabaseMasterUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseMasterUserPasswordResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMasterUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(params: GetRelationalDatabaseMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseMetricData(
    params: GetRelationalDatabaseMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseMetricDataResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseMetricDataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(params: GetRelationalDatabaseParametersRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseParameters(
    params: GetRelationalDatabaseParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(params: GetRelationalDatabaseSnapshotRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseSnapshot(
    params: GetRelationalDatabaseSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(params: GetRelationalDatabaseSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabaseSnapshots(
    params: GetRelationalDatabaseSnapshotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabaseSnapshotsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabaseSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabasesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabasesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabasesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(params: GetRelationalDatabasesRequest): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabasesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRelationalDatabases(
    params: GetRelationalDatabasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRelationalDatabasesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRelationalDatabasesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(): awsDashSdkLib.libRequestMod.Request[GetStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(params: GetStaticIpRequest): awsDashSdkLib.libRequestMod.Request[GetStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStaticIp(
    params: GetStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(): awsDashSdkLib.libRequestMod.Request[GetStaticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStaticIps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStaticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStaticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(params: GetStaticIpsRequest): awsDashSdkLib.libRequestMod.Request[GetStaticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStaticIps(
    params: GetStaticIpsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStaticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStaticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(): awsDashSdkLib.libRequestMod.Request[ImportKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importKeyPair(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(params: ImportKeyPairRequest): awsDashSdkLib.libRequestMod.Request[ImportKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importKeyPair(
    params: ImportKeyPairRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportKeyPairResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportKeyPairResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(): awsDashSdkLib.libRequestMod.Request[IsVpcPeeredResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def isVpcPeered(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IsVpcPeeredResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IsVpcPeeredResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(params: IsVpcPeeredRequest): awsDashSdkLib.libRequestMod.Request[IsVpcPeeredResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def isVpcPeered(
    params: IsVpcPeeredRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IsVpcPeeredResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IsVpcPeeredResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[OpenInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def openInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OpenInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OpenInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(params: OpenInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[OpenInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def openInstancePublicPorts(
    params: OpenInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OpenInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OpenInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(): awsDashSdkLib.libRequestMod.Request[PeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def peerVpc(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PeerVpcResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(params: PeerVpcRequest): awsDashSdkLib.libRequestMod.Request[PeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def peerVpc(
    params: PeerVpcRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PeerVpcResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(): awsDashSdkLib.libRequestMod.Request[PutInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putInstancePublicPorts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(params: PutInstancePublicPortsRequest): awsDashSdkLib.libRequestMod.Request[PutInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putInstancePublicPorts(
    params: PutInstancePublicPortsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutInstancePublicPortsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutInstancePublicPortsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(): awsDashSdkLib.libRequestMod.Request[RebootInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(params: RebootInstanceRequest): awsDashSdkLib.libRequestMod.Request[RebootInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootInstance(
    params: RebootInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[RebootRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(params: RebootRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[RebootRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootRelationalDatabase(
    params: RebootRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(): awsDashSdkLib.libRequestMod.Request[ReleaseStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def releaseStaticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReleaseStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReleaseStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(params: ReleaseStaticIpRequest): awsDashSdkLib.libRequestMod.Request[ReleaseStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def releaseStaticIp(
    params: ReleaseStaticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReleaseStaticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReleaseStaticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(): awsDashSdkLib.libRequestMod.Request[StartInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(params: StartInstanceRequest): awsDashSdkLib.libRequestMod.Request[StartInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startInstance(
    params: StartInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[StartRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(params: StartRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[StartRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startRelationalDatabase(
    params: StartRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(): awsDashSdkLib.libRequestMod.Request[StopInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(params: StopInstanceRequest): awsDashSdkLib.libRequestMod.Request[StopInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopInstance(
    params: StopInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[StopRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(params: StopRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[StopRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRelationalDatabase(
    params: StopRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(): awsDashSdkLib.libRequestMod.Request[UnpeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unpeerVpc(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UnpeerVpcResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UnpeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(params: UnpeerVpcRequest): awsDashSdkLib.libRequestMod.Request[UnpeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unpeerVpc(
    params: UnpeerVpcRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UnpeerVpcResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UnpeerVpcResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(): awsDashSdkLib.libRequestMod.Request[UpdateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainEntry(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domainName. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(params: UpdateDomainEntryRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainEntry(
    params: UpdateDomainEntryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainEntryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainEntryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(): awsDashSdkLib.libRequestMod.Request[UpdateLoadBalancerAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLoadBalancerAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLoadBalancerAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLoadBalancerAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(params: UpdateLoadBalancerAttributeRequest): awsDashSdkLib.libRequestMod.Request[UpdateLoadBalancerAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLoadBalancerAttribute(
    params: UpdateLoadBalancerAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLoadBalancerAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLoadBalancerAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRelationalDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(params: UpdateRelationalDatabaseRequest): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRelationalDatabase(
    params: UpdateRelationalDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRelationalDatabaseResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which paramater updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRelationalDatabaseParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which paramater updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(params: UpdateRelationalDatabaseParametersRequest): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRelationalDatabaseParameters(
    params: UpdateRelationalDatabaseParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRelationalDatabaseParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRelationalDatabaseParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

