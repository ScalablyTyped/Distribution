package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/lightsail", "Lightsail")
@js.native
object LightsailNs extends js.Object {
  trait AllocateStaticIpRequest extends js.Object {
    /**
      * The name of the static IP address.
      */
    var staticIpName: ResourceName
  }
  
  trait AllocateStaticIpResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the static IP address you allocated.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait AttachDiskRequest extends js.Object {
    /**
      * The unique Lightsail disk name (e.g., my-disk).
      */
    var diskName: ResourceName
    /**
      * The disk path to expose to the instance (e.g., /dev/xvdf).
      */
    var diskPath: NonEmptyString
    /**
      * The name of the Lightsail instance where you want to utilize the storage disk.
      */
    var instanceName: ResourceName
  }
  
  trait AttachDiskResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait AttachInstancesToLoadBalancerRequest extends js.Object {
    /**
      * An array of strings representing the instance name(s) you want to attach to your load balancer. An instance must be running before you can attach it to your load balancer. There are no additional limits on the number of instances you can attach to your load balancer, aside from the limit of Lightsail instances you can create in your account (20).
      */
    var instanceNames: ResourceNameList
    /**
      * The name of the load balancer.
      */
    var loadBalancerName: ResourceName
  }
  
  trait AttachInstancesToLoadBalancerResult extends js.Object {
    /**
      * An object representing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
    /**
      * The name of your SSL/TLS certificate.
      */
    var certificateName: ResourceName
    /**
      * The name of the load balancer to which you want to associate the SSL/TLS certificate.
      */
    var loadBalancerName: ResourceName
  }
  
  trait AttachLoadBalancerTlsCertificateResult extends js.Object {
    /**
      * An object representing the API operations. These SSL/TLS certificates are only usable by Lightsail load balancers. You can't get the certificate and use it for another purpose.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait AttachStaticIpRequest extends js.Object {
    /**
      * The instance name to which you want to attach the static IP address.
      */
    var instanceName: ResourceName
    /**
      * The name of the static IP.
      */
    var staticIpName: ResourceName
  }
  
  trait AttachStaticIpResult extends js.Object {
    /**
      * An array of key-value pairs containing information about your API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait AttachedDiskMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DiskMapList]
  
  trait AvailabilityZone extends js.Object {
    /**
      * The state of the Availability Zone.
      */
    var state: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The name of the Availability Zone. The format is us-east-2a (case-sensitive).
      */
    var zoneName: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait Blueprint extends js.Object {
    /**
      * The ID for the virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0).
      */
    var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The description of the blueprint.
      */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The group name of the blueprint (e.g., amazon-linux).
      */
    var group: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases.
      */
    var isActive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The end-user license agreement URL for the image or blueprint.
      */
    var licenseUrl: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500. 0 indicates that the blueprint runs on all instance sizes. 
      */
    var minPower: js.UndefOr[integer] = js.undefined
    /**
      * The friendly name of the blueprint (e.g., Amazon Linux).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
      */
    var platform: js.UndefOr[InstancePlatform] = js.undefined
    /**
      * The product URL to learn more about the image or blueprint.
      */
    var productUrl: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of the blueprint (e.g., os or app).
      */
    var `type`: js.UndefOr[BlueprintType] = js.undefined
    /**
      * The version number of the operating system, application, or stack (e.g., 2016.03.0).
      */
    var version: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The version code.
      */
    var versionCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Bundle extends js.Object {
    /**
      * The bundle ID (e.g., micro_1_0).
      */
    var bundleId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The number of vCPUs included in the bundle (e.g., 2).
      */
    var cpuCount: js.UndefOr[integer] = js.undefined
    /**
      * The size of the SSD (e.g., 30).
      */
    var diskSizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * The Amazon EC2 instance type (e.g., t2.micro).
      */
    var instanceType: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A Boolean value indicating whether the bundle is active.
      */
    var isActive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A friendly name for the bundle (e.g., Micro).
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
      */
    var power: js.UndefOr[integer] = js.undefined
    /**
      * The price in US dollars (e.g., 5.0).
      */
    var price: js.UndefOr[float] = js.undefined
    /**
      * The amount of RAM in GB (e.g., 2.0).
      */
    var ramSizeInGb: js.UndefOr[float] = js.undefined
    /**
      * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
      */
    var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.undefined
    /**
      * The data transfer rate per month in GB (e.g., 2000).
      */
    var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloseInstancePublicPortsRequest extends js.Object {
    /**
      * The name of the instance on which you're attempting to close the public ports.
      */
    var instanceName: ResourceName
    /**
      * Information about the public port you are trying to close.
      */
    var portInfo: PortInfo
  }
  
  trait CloseInstancePublicPortsResult extends js.Object {
    /**
      * An array of key-value pairs that contains information about the operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait CloudFormationStackRecord extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the CloudFormation stack record.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The date when the CloudFormation stack record was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * A list of objects describing the destination service, which is AWS CloudFormation, and the Amazon Resource Name (ARN) of the AWS CloudFormation stack.
      */
    var destinationInfo: js.UndefOr[DestinationInfo] = js.undefined
    /**
      * A list of objects describing the Availability Zone and AWS Region of the CloudFormation stack record.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the CloudFormation stack record. It starts with CloudFormationStackRecord followed by a GUID.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The Lightsail resource type (e.g., CloudFormationStackRecord).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * A list of objects describing the source of the CloudFormation stack record.
      */
    var sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList] = js.undefined
    /**
      * The current state of the CloudFormation stack record.
      */
    var state: js.UndefOr[RecordState] = js.undefined
  }
  
  trait CloudFormationStackRecordSourceInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the export snapshot record.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The name of the record.
      */
    var name: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The Lightsail resource type (e.g., ExportSnapshotRecord).
      */
    var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
  }
  
  trait CopySnapshotRequest extends js.Object {
    /**
      * The AWS Region where the source snapshot is located.
      */
    var sourceRegion: RegionName
    /**
      * The name of the source instance or disk snapshot to be copied.
      */
    var sourceSnapshotName: ResourceName
    /**
      * The name of the new instance or disk snapshot to be created as a copy.
      */
    var targetSnapshotName: ResourceName
  }
  
  trait CopySnapshotResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateCloudFormationStackRequest extends js.Object {
    /**
      * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry in this array.
      */
    var instances: InstanceEntryList
  }
  
  trait CreateCloudFormationStackResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateDiskFromSnapshotRequest extends js.Object {
    /**
      * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
      */
    var availabilityZone: NonEmptyString
    /**
      * The unique Lightsail disk name (e.g., my-disk).
      */
    var diskName: ResourceName
    /**
      * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk.
      */
    var diskSnapshotName: ResourceName
    /**
      * The size of the disk in GB (e.g., 32).
      */
    var sizeInGb: integer
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDiskFromSnapshotResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateDiskRequest extends js.Object {
    /**
      * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
      */
    var availabilityZone: NonEmptyString
    /**
      * The unique Lightsail disk name (e.g., my-disk).
      */
    var diskName: ResourceName
    /**
      * The size of the disk in GB (e.g., 32).
      */
    var sizeInGb: integer
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDiskResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateDiskSnapshotRequest extends js.Object {
    /**
      * The unique name of the source disk (e.g., Disk-Virginia-1).  This parameter cannot be defined together with the instance name parameter. The disk name and instance name parameters are mutually exclusive. 
      */
    var diskName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The name of the destination disk snapshot (e.g., my-disk-snapshot) based on the source disk.
      */
    var diskSnapshotName: ResourceName
    /**
      * The unique name of the source instance (e.g., Amazon_Linux-512MB-Virginia-1). When this is defined, a snapshot of the instance's system volume is created.  This parameter cannot be defined together with the disk name parameter. The instance name and disk name parameters are mutually exclusive. 
      */
    var instanceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDiskSnapshotResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateDomainEntryRequest extends js.Object {
    /**
      * An array of key-value pairs containing information about the domain entry request.
      */
    var domainEntry: DomainEntry
    /**
      * The domain name (e.g., example.com) for which you want to create the domain entry.
      */
    var domainName: DomainName
  }
  
  trait CreateDomainEntryResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait CreateDomainRequest extends js.Object {
    /**
      * The domain name to manage (e.g., example.com).  You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or another domain name registrar. If you have already registered your domain, you can enter its name in this parameter to manage the DNS records for that domain. 
      */
    var domainName: DomainName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDomainResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the domain resource you created.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait CreateInstanceSnapshotRequest extends js.Object {
    /**
      * The Lightsail instance on which to base your snapshot.
      */
    var instanceName: ResourceName
    /**
      * The name for your new snapshot.
      */
    var instanceSnapshotName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateInstanceSnapshotResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your create instances snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateInstancesFromSnapshotRequest extends js.Object {
    /**
      * An object containing information about one or more disk mappings.
      */
    var attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined
    /**
      * The Availability Zone where you want to create your instances. Use the following formatting: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
      */
    var availabilityZone: java.lang.String
    /**
      * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
      */
    var bundleId: NonEmptyString
    /**
      * The names for your new instances.
      */
    var instanceNames: StringList
    /**
      * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots operation to return information about your existing snapshots.
      */
    var instanceSnapshotName: ResourceName
    /**
      * The name for your key pair.
      */
    var keyPairName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * You can create a launch script that configures a server with additional user data. For example, apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
      */
    var userData: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateInstancesFromSnapshotResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your create instances from snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateInstancesRequest extends js.Object {
    /**
      * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
      */
    var availabilityZone: java.lang.String
    /**
      * The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0). Use the get blueprints operation to return a list of available images (or blueprints).
      */
    var blueprintId: NonEmptyString
    /**
      * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
      */
    var bundleId: NonEmptyString
    /**
      * (Deprecated) The name for your custom image.  In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated. 
      */
    var customImageName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for example: ["MyFirstInstance","MySecondInstance"] 
      */
    var instanceNames: StringList
    /**
      * The name of your key pair.
      */
    var keyPairName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
      */
    var userData: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateInstancesResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your create instances request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateKeyPairRequest extends js.Object {
    /**
      * The name for your new key pair.
      */
    var keyPairName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateKeyPairResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the new key pair you just created.
      */
    var keyPair: js.UndefOr[KeyPair] = js.undefined
    /**
      * An array of key-value pairs containing information about the results of your create key pair request.
      */
    var operation: js.UndefOr[Operation] = js.undefined
    /**
      * A base64-encoded RSA private key.
      */
    var privateKeyBase64: js.UndefOr[Base64] = js.undefined
    /**
      * A base64-encoded public key of the ssh-rsa type.
      */
    var publicKeyBase64: js.UndefOr[Base64] = js.undefined
  }
  
  trait CreateLoadBalancerRequest extends js.Object {
    /**
      * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
      */
    var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined
    /**
      * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
      */
    var certificateDomainName: js.UndefOr[DomainName] = js.undefined
    /**
      * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
      */
    var certificateName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
      */
    var healthCheckPath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The instance port where you're creating your load balancer.
      */
    var instancePort: Port
    /**
      * The name of your load balancer.
      */
    var loadBalancerName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateLoadBalancerResult extends js.Object {
    /**
      * An object containing information about the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateLoadBalancerTlsCertificateRequest extends js.Object {
    /**
      * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain). We do not support wildcards (e.g., *.example.com).
      */
    var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined
    /**
      * The domain name (e.g., example.com) for your SSL/TLS certificate.
      */
    var certificateDomainName: DomainName
    /**
      * The SSL/TLS certificate name. You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2 certificates associated with it at one time. There is also an overall limit to the number of certificates that can be issue in a 365-day period. For more information, see Limits.
      */
    var certificateName: ResourceName
    /**
      * The load balancer name where you want to create the SSL/TLS certificate.
      */
    var loadBalancerName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateLoadBalancerTlsCertificateResult extends js.Object {
    /**
      * An object containing information about the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
    /**
      * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
      */
    var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
      */
    var publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation. When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the source database.
      */
    var relationalDatabaseBundleId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
      */
    var relationalDatabaseName: ResourceName
    /**
      * The name of the database snapshot from which to create your new database.
      */
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The date and time to restore your database from. Constraints:   Must be before the latest restorable time for the database.   Cannot be specified if the use latest restorable time parameter is true.   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the restore time.  
      */
    var restoreTime: js.UndefOr[IsoDate] = js.undefined
    /**
      * The name of the source database.
      */
    var sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * Specifies whether your database is restored from the latest backup time. A value of true restores from the latest backup time.  Default: false  Constraints: Cannot be specified if the restore time parameter is provided.
      */
    var useLatestRestorableTime: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
    /**
      * An object describing the result of your create relational database from snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateRelationalDatabaseRequest extends js.Object {
    /**
      * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
      */
    var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the master database created when the Lightsail database resource is created. Constraints:   Must contain from 1 to 64 alphanumeric characters.   Cannot be a word reserved by the specified database engine  
      */
    var masterDatabaseName: java.lang.String
    /**
      * The password for the master user of your new database. The password can include any printable ASCII character except "/", """, or "@". Constraints: Must contain 8 to 41 characters.
      */
    var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
    /**
      * The master user name for your new database. Constraints:   Master user name is required.   Must contain from 1 to 16 alphanumeric characters.   The first character must be a letter.   Cannot be a reserved word for the database engine you choose. For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for MySQL 5.6 or MySQL 5.7 respectively.  
      */
    var masterUsername: java.lang.String
    /**
      * The daily time range during which automated backups are created for your new database if automated backups are enabled. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more information about the preferred backup window time blocks for each region, see the Working With Backups guide in the Amazon Relational Database Service (Amazon RDS) documentation. Constraints:   Must be in the hh24:mi-hh24:mi format. Example: 16:00-16:30    Specified in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
      */
    var preferredBackupWindow: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur on your new database. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Constraints:   Must be in the ddd:hh24:mi-ddd:hh24:mi format.   Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be at least 30 minutes.   Specified in Universal Coordinated Time (UTC).   Example: Tue:17:00-Tue:17:30   
      */
    var preferredMaintenanceWindow: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
      */
    var publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The blueprint ID for your new database. A blueprint describes the major engine version of a database. You can get a list of database blueprints IDs by using the get relational database blueprints operation.
      */
    var relationalDatabaseBlueprintId: java.lang.String
    /**
      * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation.
      */
    var relationalDatabaseBundleId: java.lang.String
    /**
      * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
      */
    var relationalDatabaseName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your create relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
    /**
      * The name of the database on which to base your new snapshot.
      */
    var relationalDatabaseName: ResourceName
    /**
      * The name for your new database snapshot. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
      */
    var relationalDatabaseSnapshotName: ResourceName
    /**
      * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateRelationalDatabaseSnapshotResult extends js.Object {
    /**
      * An object describing the result of your create relational database snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteDiskRequest extends js.Object {
    /**
      * The unique name of the disk you want to delete (e.g., my-disk).
      */
    var diskName: ResourceName
  }
  
  trait DeleteDiskResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteDiskSnapshotRequest extends js.Object {
    /**
      * The name of the disk snapshot you want to delete (e.g., my-disk-snapshot).
      */
    var diskSnapshotName: ResourceName
  }
  
  trait DeleteDiskSnapshotResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteDomainEntryRequest extends js.Object {
    /**
      * An array of key-value pairs containing information about your domain entries.
      */
    var domainEntry: DomainEntry
    /**
      * The name of the domain entry to delete.
      */
    var domainName: DomainName
  }
  
  trait DeleteDomainEntryResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your delete domain entry request.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait DeleteDomainRequest extends js.Object {
    /**
      * The specific domain name to delete.
      */
    var domainName: DomainName
  }
  
  trait DeleteDomainResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your delete domain request.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait DeleteInstanceRequest extends js.Object {
    /**
      * The name of the instance to delete.
      */
    var instanceName: ResourceName
  }
  
  trait DeleteInstanceResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your delete instance request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteInstanceSnapshotRequest extends js.Object {
    /**
      * The name of the snapshot to delete.
      */
    var instanceSnapshotName: ResourceName
  }
  
  trait DeleteInstanceSnapshotResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your delete instance snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteKeyPairRequest extends js.Object {
    /**
      * The name of the key pair to delete.
      */
    var keyPairName: ResourceName
  }
  
  trait DeleteKeyPairResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your delete key pair request.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait DeleteKnownHostKeysRequest extends js.Object {
    /**
      * The name of the instance for which you want to reset the host key or certificate.
      */
    var instanceName: ResourceName
  }
  
  trait DeleteKnownHostKeysResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteLoadBalancerRequest extends js.Object {
    /**
      * The name of the load balancer you want to delete.
      */
    var loadBalancerName: ResourceName
  }
  
  trait DeleteLoadBalancerResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
    /**
      * The SSL/TLS certificate name.
      */
    var certificateName: ResourceName
    /**
      * When true, forces the deletion of an SSL/TLS certificate. There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The force parameter is required when the primary SSL/TLS certificate is in use by an instance attached to the load balancer.
      */
    var force: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The load balancer name.
      */
    var loadBalancerName: ResourceName
  }
  
  trait DeleteLoadBalancerTlsCertificateResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteRelationalDatabaseRequest extends js.Object {
    /**
      * The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.  Specifying this parameter and also specifying the skip final snapshot parameter to true results in an error.  Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
      */
    var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The name of the database that you are deleting.
      */
    var relationalDatabaseName: ResourceName
    /**
      * Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false. Default: false 
      */
    var skipFinalSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait DeleteRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your delete relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
    /**
      * The name of the database snapshot that you are deleting.
      */
    var relationalDatabaseSnapshotName: ResourceName
  }
  
  trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
    /**
      * An object describing the result of your delete relational database snapshot request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DestinationInfo extends js.Object {
    /**
      * The ID of the resource created at the destination.
      */
    var id: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The destination service of the record.
      */
    var service: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait DetachDiskRequest extends js.Object {
    /**
      * The unique name of the disk you want to detach from your instance (e.g., my-disk).
      */
    var diskName: ResourceName
  }
  
  trait DetachDiskResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DetachInstancesFromLoadBalancerRequest extends js.Object {
    /**
      * An array of strings containing the names of the instances you want to detach from the load balancer.
      */
    var instanceNames: ResourceNameList
    /**
      * The name of the Lightsail load balancer.
      */
    var loadBalancerName: ResourceName
  }
  
  trait DetachInstancesFromLoadBalancerResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait DetachStaticIpRequest extends js.Object {
    /**
      * The name of the static IP to detach from the instance.
      */
    var staticIpName: ResourceName
  }
  
  trait DetachStaticIpResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your detach static IP request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait Disk extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the disk.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The resources to which the disk is attached.
      */
    var attachedTo: js.UndefOr[ResourceName] = js.undefined
    /**
      * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
      */
    var attachmentState: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date when the disk was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
      */
    var gbInUse: js.UndefOr[integer] = js.undefined
    /**
      * The input/output operations per second (IOPS) of the disk.
      */
    var iops: js.UndefOr[integer] = js.undefined
    /**
      * A Boolean value indicating whether the disk is attached.
      */
    var isAttached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
      */
    var isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The AWS Region and Availability Zone where the disk is located.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The unique name of the disk.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The disk path.
      */
    var path: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Lightsail resource type (e.g., Disk).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The size of the disk in GB.
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * Describes the status of the disk.
      */
    var state: js.UndefOr[DiskState] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait DiskInfo extends js.Object {
    /**
      * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
      */
    var isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The disk name.
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The disk path.
      */
    var path: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The size of the disk in GB (e.g., 32).
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
  }
  
  trait DiskMap extends js.Object {
    /**
      * The new disk name (e.g., my-new-disk).
      */
    var newDiskName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The original disk path exposed to the instance (for example, /dev/sdh).
      */
    var originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait DiskSnapshot extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the disk snapshot.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The date when the disk snapshot was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
      */
    var fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The unique name of the source disk from which the disk snapshot was created.
      */
    var fromDiskName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
      */
    var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The unique name of the source instance from which the disk (system volume) snapshot was created.
      */
    var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The AWS Region and Availability Zone where the disk snapshot was created.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the disk snapshot (e.g., my-disk-snapshot).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The progress of the disk snapshot operation.
      */
    var progress: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Lightsail resource type (e.g., DiskSnapshot).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The size of the disk in GB.
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * The status of the disk snapshot operation.
      */
    var state: js.UndefOr[DiskSnapshotState] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait DiskSnapshotInfo extends js.Object {
    /**
      * The size of the disk in GB (e.g., 32).
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
  }
  
  trait Domain extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the domain recordset (e.g., arn:aws:lightsail:global:123456789101:Domain/824cede0-abc7-4f84-8dbc-12345EXAMPLE).
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The date when the domain recordset was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * An array of key-value pairs containing information about the domain entries.
      */
    var domainEntries: js.UndefOr[DomainEntryList] = js.undefined
    /**
      * The AWS Region and Availability Zones where the domain recordset was created.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the domain.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The resource type. 
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait DomainEntry extends js.Object {
    /**
      * The ID of the domain recordset entry.
      */
    var id: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * When true, specifies whether the domain entry is an alias used by the Lightsail load balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic to your load balancer
      */
    var isAlias: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The name of the domain.
      */
    var name: js.UndefOr[DomainName] = js.undefined
    /**
      * (Deprecated) The options for the domain entry.  In releases prior to November 29, 2017, this parameter was not included in the API response. It is now deprecated. 
      */
    var options: js.UndefOr[DomainEntryOptions] = js.undefined
    /**
      * The target AWS name server (e.g., ns-111.awsdns-22.com.). For Lightsail load balancers, the value looks like ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com. Be sure to also set isAlias to true when setting up an A record for a load balancer.
      */
    var target: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The following domain entry types can be used:    A     CNAME     MX     NS     SOA     SRV     TXT   
      */
    var `type`: js.UndefOr[DomainEntryType] = js.undefined
  }
  
  trait DomainEntryOptions
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  trait DownloadDefaultKeyPairRequest extends js.Object
  
  trait DownloadDefaultKeyPairResult extends js.Object {
    /**
      * A base64-encoded RSA private key.
      */
    var privateKeyBase64: js.UndefOr[Base64] = js.undefined
    /**
      * A base64-encoded public key of the ssh-rsa type.
      */
    var publicKeyBase64: js.UndefOr[Base64] = js.undefined
  }
  
  trait ExportSnapshotRecord extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the export snapshot record.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The date when the export snapshot record was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * A list of objects describing the destination of the export snapshot record.
      */
    var destinationInfo: js.UndefOr[DestinationInfo] = js.undefined
    /**
      * The AWS Region and Availability Zone where the export snapshot record is located.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The export snapshot record name.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The Lightsail resource type (e.g., ExportSnapshotRecord).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * A list of objects describing the source of the export snapshot record.
      */
    var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.undefined
    /**
      * The state of the export snapshot record.
      */
    var state: js.UndefOr[RecordState] = js.undefined
  }
  
  trait ExportSnapshotRecordSourceInfo extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The date when the source instance or disk snapshot was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * A list of objects describing a disk snapshot.
      */
    var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
      */
    var fromResourceArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The name of the snapshot's source instance or disk.
      */
    var fromResourceName: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A list of objects describing an instance snapshot.
      */
    var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.undefined
    /**
      * The name of the source instance or disk snapshot.
      */
    var name: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
      */
    var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.undefined
  }
  
  trait ExportSnapshotRequest extends js.Object {
    /**
      * The name of the instance or disk snapshot to be exported to Amazon EC2.
      */
    var sourceSnapshotName: ResourceName
  }
  
  trait ExportSnapshotResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait GetActiveNamesRequest extends js.Object {
    /**
      * A token used for paginating results from your get active names request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetActiveNamesResult extends js.Object {
    /**
      * The list of active names returned by the get active names request.
      */
    var activeNames: js.UndefOr[StringList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get active names request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBlueprintsRequest extends js.Object {
    /**
      * A Boolean value indicating whether to include inactive results in your request.
      */
    var includeInactive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get blueprints request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBlueprintsResult extends js.Object {
    /**
      * An array of key-value pairs that contains information about the available blueprints.
      */
    var blueprints: js.UndefOr[BlueprintList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get blueprints request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBundlesRequest extends js.Object {
    /**
      * A Boolean value that indicates whether to include inactive bundle results in your request.
      */
    var includeInactive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get bundles request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBundlesResult extends js.Object {
    /**
      * An array of key-value pairs that contains information about the available bundles.
      */
    var bundles: js.UndefOr[BundleList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get active names request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetCloudFormationStackRecordsRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get cloud formation stack records request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetCloudFormationStackRecordsResult extends js.Object {
    /**
      * A list of objects describing the CloudFormation stack records.
      */
    var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.undefined
    /**
      * A token used for advancing to the next page of results of your get relational database bundles request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDiskRequest extends js.Object {
    /**
      * The name of the disk (e.g., my-disk).
      */
    var diskName: ResourceName
  }
  
  trait GetDiskResult extends js.Object {
    /**
      * An object containing information about the disk.
      */
    var disk: js.UndefOr[Disk] = js.undefined
  }
  
  trait GetDiskSnapshotRequest extends js.Object {
    /**
      * The name of the disk snapshot (e.g., my-disk-snapshot).
      */
    var diskSnapshotName: ResourceName
  }
  
  trait GetDiskSnapshotResult extends js.Object {
    /**
      * An object containing information about the disk snapshot.
      */
    var diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
  }
  
  trait GetDiskSnapshotsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your GetDiskSnapshots request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDiskSnapshotsResult extends js.Object {
    /**
      * An array of objects containing information about all block storage disk snapshots.
      */
    var diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your GetDiskSnapshots request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDisksRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your GetDisks request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDisksResult extends js.Object {
    /**
      * An array of objects containing information about all block storage disks.
      */
    var disks: js.UndefOr[DiskList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your GetDisks request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDomainRequest extends js.Object {
    /**
      * The domain name for which your want to return information about.
      */
    var domainName: DomainName
  }
  
  trait GetDomainResult extends js.Object {
    /**
      * An array of key-value pairs containing information about your get domain request.
      */
    var domain: js.UndefOr[Domain] = js.undefined
  }
  
  trait GetDomainsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get domains request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDomainsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about each of the domain entries in the user's account.
      */
    var domains: js.UndefOr[DomainList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get active names request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetExportSnapshotRecordsRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get export snapshot records request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetExportSnapshotRecordsResult extends js.Object {
    /**
      * A list of objects describing the export snapshot records.
      */
    var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.undefined
    /**
      * A token used for advancing to the next page of results of your get relational database bundles request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetInstanceAccessDetailsRequest extends js.Object {
    /**
      * The name of the instance to access.
      */
    var instanceName: ResourceName
    /**
      * The protocol to use to connect to your instance. Defaults to ssh.
      */
    var protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
  }
  
  trait GetInstanceAccessDetailsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about a get instance access request.
      */
    var accessDetails: js.UndefOr[InstanceAccessDetails] = js.undefined
  }
  
  trait GetInstanceMetricDataRequest extends js.Object {
    /**
      * The end time of the time period.
      */
    var endTime: timestamp
    /**
      * The name of the instance for which you want to get metrics data.
      */
    var instanceName: ResourceName
    /**
      * The metric name to get data about. 
      */
    var metricName: InstanceMetricName
    /**
      * The granularity, in seconds, of the returned data points.
      */
    var period: MetricPeriod
    /**
      * The start time of the time period.
      */
    var startTime: timestamp
    /**
      * The instance statistics. 
      */
    var statistics: MetricStatisticList
    /**
      * The unit. The list of valid values is below.
      */
    var unit: MetricUnit
  }
  
  trait GetInstanceMetricDataResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your get instance metric data request.
      */
    var metricData: js.UndefOr[MetricDatapointList] = js.undefined
    /**
      * The metric name to return data for.
      */
    var metricName: js.UndefOr[InstanceMetricName] = js.undefined
  }
  
  trait GetInstancePortStatesRequest extends js.Object {
    /**
      * The name of the instance.
      */
    var instanceName: ResourceName
  }
  
  trait GetInstancePortStatesResult extends js.Object {
    /**
      * Information about the port states resulting from your request.
      */
    var portStates: js.UndefOr[InstancePortStateList] = js.undefined
  }
  
  trait GetInstanceRequest extends js.Object {
    /**
      * The name of the instance.
      */
    var instanceName: ResourceName
  }
  
  trait GetInstanceResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the specified instance.
      */
    var instance: js.UndefOr[Instance] = js.undefined
  }
  
  trait GetInstanceSnapshotRequest extends js.Object {
    /**
      * The name of the snapshot for which you are requesting information.
      */
    var instanceSnapshotName: ResourceName
  }
  
  trait GetInstanceSnapshotResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your get instance snapshot request.
      */
    var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
  }
  
  trait GetInstanceSnapshotsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get instance snapshots request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetInstanceSnapshotsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your get instance snapshots request.
      */
    var instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get instance snapshots request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetInstanceStateRequest extends js.Object {
    /**
      * The name of the instance to get state information about.
      */
    var instanceName: ResourceName
  }
  
  trait GetInstanceStateResult extends js.Object {
    /**
      * The state of the instance.
      */
    var state: js.UndefOr[InstanceState] = js.undefined
  }
  
  trait GetInstancesRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get instances request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetInstancesResult extends js.Object {
    /**
      * An array of key-value pairs containing information about your instances.
      */
    var instances: js.UndefOr[InstanceList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get instances request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetKeyPairRequest extends js.Object {
    /**
      * The name of the key pair for which you are requesting information.
      */
    var keyPairName: ResourceName
  }
  
  trait GetKeyPairResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the key pair.
      */
    var keyPair: js.UndefOr[KeyPair] = js.undefined
  }
  
  trait GetKeyPairsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get key pairs request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetKeyPairsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the key pairs.
      */
    var keyPairs: js.UndefOr[KeyPairList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get key pairs request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetLoadBalancerMetricDataRequest extends js.Object {
    /**
      * The end time of the period.
      */
    var endTime: timestamp
    /**
      * The name of the load balancer.
      */
    var loadBalancerName: ResourceName
    /**
      * The metric about which you want to return information. Valid values are listed below, along with the most useful statistics to include in your request.     ClientTLSNegotiationErrorCount  - The number of TLS connections initiated by the client that did not establish a session with the load balancer. Possible causes include a mismatch of ciphers or protocols.  Statistics: The most useful statistic is Sum.     HealthyHostCount  - The number of target instances that are considered healthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     UnhealthyHostCount  - The number of target instances that are considered unhealthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     HTTPCode_LB_4XX_Count  - The number of HTTP 4XX client error codes that originate from the load balancer. Client errors are generated when requests are malformed or incomplete. These requests have not been received by the target instance. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_LB_5XX_Count  - The number of HTTP 5XX server error codes that originate from the load balancer. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_2XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_3XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.   Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_4XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_5XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     InstanceResponseTime  - The time elapsed, in seconds, after the request leaves the load balancer until a response from the target instance is received.  Statistics: The most useful statistic is Average.     RejectedConnectionCount  - The number of connections that were rejected because the load balancer had reached its maximum number of connections.  Statistics: The most useful statistic is Sum.     RequestCount  - The number of requests processed over IPv4. This count includes only the requests with a response generated by a target instance of the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.  
      */
    var metricName: LoadBalancerMetricName
    /**
      * The granularity, in seconds, of the returned data points.
      */
    var period: MetricPeriod
    /**
      * The start time of the period.
      */
    var startTime: timestamp
    /**
      * An array of statistics that you want to request metrics for. Valid values are listed below.     SampleCount  - The count (number) of data points used for the statistical calculation.     Average  - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum. This comparison helps you to know when to increase or decrease your resources as needed.     Sum  - All values submitted for the matching metric added together. This statistic can be useful for determining the total volume of a metric.     Minimum  - The lowest value observed during the specified period. You can use this value to determine low volumes of activity for your application.     Maximum  - The highest value observed during the specified period. You can use this value to determine high volumes of activity for your application.  
      */
    var statistics: MetricStatisticList
    /**
      * The unit for the time period request. Valid values are listed below.
      */
    var unit: MetricUnit
  }
  
  trait GetLoadBalancerMetricDataResult extends js.Object {
    /**
      * An array of metric datapoint objects.
      */
    var metricData: js.UndefOr[MetricDatapointList] = js.undefined
    /**
      * The metric about which you are receiving information. Valid values are listed below, along with the most useful statistics to include in your request.     ClientTLSNegotiationErrorCount  - The number of TLS connections initiated by the client that did not establish a session with the load balancer. Possible causes include a mismatch of ciphers or protocols.  Statistics: The most useful statistic is Sum.     HealthyHostCount  - The number of target instances that are considered healthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     UnhealthyHostCount  - The number of target instances that are considered unhealthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     HTTPCode_LB_4XX_Count  - The number of HTTP 4XX client error codes that originate from the load balancer. Client errors are generated when requests are malformed or incomplete. These requests have not been received by the target instance. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_LB_5XX_Count  - The number of HTTP 5XX server error codes that originate from the load balancer. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_2XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_3XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.   Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_4XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_5XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     InstanceResponseTime  - The time elapsed, in seconds, after the request leaves the load balancer until a response from the target instance is received.  Statistics: The most useful statistic is Average.     RejectedConnectionCount  - The number of connections that were rejected because the load balancer had reached its maximum number of connections.  Statistics: The most useful statistic is Sum.     RequestCount  - The number of requests processed over IPv4. This count includes only the requests with a response generated by a target instance of the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.  
      */
    var metricName: js.UndefOr[LoadBalancerMetricName] = js.undefined
  }
  
  trait GetLoadBalancerRequest extends js.Object {
    /**
      * The name of the load balancer.
      */
    var loadBalancerName: ResourceName
  }
  
  trait GetLoadBalancerResult extends js.Object {
    /**
      * An object containing information about your load balancer.
      */
    var loadBalancer: js.UndefOr[LoadBalancer] = js.undefined
  }
  
  trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
    /**
      * The name of the load balancer you associated with your SSL/TLS certificate.
      */
    var loadBalancerName: ResourceName
  }
  
  trait GetLoadBalancerTlsCertificatesResult extends js.Object {
    /**
      * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
      */
    var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined
  }
  
  trait GetLoadBalancersRequest extends js.Object {
    /**
      * A token used for paginating the results from your GetLoadBalancers request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetLoadBalancersResult extends js.Object {
    /**
      * An array of LoadBalancer objects describing your load balancers.
      */
    var loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
    /**
      * A token used for advancing to the next page of results from your GetLoadBalancers request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetOperationRequest extends js.Object {
    /**
      * A GUID used to identify the operation.
      */
    var operationId: NonEmptyString
  }
  
  trait GetOperationResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the results of your get operation request.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait GetOperationsForResourceRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get operations for resource request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the resource for which you are requesting information.
      */
    var resourceName: ResourceName
  }
  
  trait GetOperationsForResourceResult extends js.Object {
    /**
      * (Deprecated) Returns the number of pages of results that remain.  In releases prior to June 12, 2017, this parameter returned null by the API. It is now deprecated, and the API returns the next page token parameter instead. 
      */
    var nextPageCount: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of key-value pairs containing information about the results of your get operations for resource request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait GetOperationsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get operations request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetOperationsResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get operations request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of key-value pairs containing information about the results of your get operations request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait GetRegionsRequest extends js.Object {
    /**
      * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability Zones are indicated with a letter: e.g., us-east-2a.
      */
    var includeAvailabilityZones: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions request. Availability Zones are indicated with a letter (e.g., us-east-2a).
      */
    var includeRelationalDatabaseAvailabilityZones: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait GetRegionsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about your get regions request.
      */
    var regions: js.UndefOr[RegionList] = js.undefined
  }
  
  trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get relational database blueprints request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabaseBlueprintsResult extends js.Object {
    /**
      * An object describing the result of your get relational database blueprints request.
      */
    var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined
    /**
      * A token used for advancing to the next page of results of your get relational database blueprints request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabaseBundlesRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get relational database bundles request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabaseBundlesResult extends js.Object {
    /**
      * An object describing the result of your get relational database bundles request.
      */
    var bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined
    /**
      * A token used for advancing to the next page of results of your get relational database bundles request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabaseEventsRequest extends js.Object {
    /**
      * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2 hours, enter 120. Default: 60  The minimum is 1 and the maximum is 14 days (20160 minutes).
      */
    var durationInMinutes: js.UndefOr[integer] = js.undefined
    /**
      * A token used for advancing to a specific page of results from for get relational database events request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the database from which to get events.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait GetRelationalDatabaseEventsResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get relational database events request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An object describing the result of your get relational database events request.
      */
    var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined
  }
  
  trait GetRelationalDatabaseLogEventsRequest extends js.Object {
    /**
      * The end of the time interval from which to get log events. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
      */
    var endTime: js.UndefOr[IsoDate] = js.undefined
    /**
      * The name of the log stream. Use the get relational database log streams operation to get a list of available log streams.
      */
    var logStreamName: java.lang.String
    /**
      * A token used for advancing to a specific page of results for your get relational database log events request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of your database for which to get log events.
      */
    var relationalDatabaseName: ResourceName
    /**
      * Parameter to specify if the log should start from head or tail. If true is specified, the log event starts from the head of the log. If false is specified, the log event starts from the tail of the log. Default: false 
      */
    var startFromHead: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The start of the time interval from which to get log events. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
      */
    var startTime: js.UndefOr[IsoDate] = js.undefined
  }
  
  trait GetRelationalDatabaseLogEventsResult extends js.Object {
    /**
      * A token used for advancing to the previous page of results from your get relational database log events request.
      */
    var nextBackwardToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A token used for advancing to the next page of results from your get relational database log events request.
      */
    var nextForwardToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An object describing the result of your get relational database log events request.
      */
    var resourceLogEvents: js.UndefOr[LogEventList] = js.undefined
  }
  
  trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
    /**
      * The name of your database for which to get log streams.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait GetRelationalDatabaseLogStreamsResult extends js.Object {
    /**
      * An object describing the result of your get relational database log streams request.
      */
    var logStreams: js.UndefOr[StringList] = js.undefined
  }
  
  trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
    /**
      * The password version to return. Specifying CURRENT or PREVIOUS returns the current or previous passwords respectively. Specifying PENDING returns the newest version of the password that will rotate to CURRENT. After the PENDING password rotates to CURRENT, the PENDING password is no longer available. Default: CURRENT 
      */
    var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined
    /**
      * The name of your database for which to get the master user password.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
    /**
      * The timestamp when the specified version of the master user password was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The master user password for the password version specified.
      */
    var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
  }
  
  trait GetRelationalDatabaseMetricDataRequest extends js.Object {
    /**
      * The end of the time interval from which to get metric data. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
      */
    var endTime: IsoDate
    /**
      * The name of the metric data to return.
      */
    var metricName: RelationalDatabaseMetricName
    /**
      * The granularity, in seconds, of the returned data points.
      */
    var period: MetricPeriod
    /**
      * The name of your database from which to get metric data.
      */
    var relationalDatabaseName: ResourceName
    /**
      * The start of the time interval from which to get metric data. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
      */
    var startTime: IsoDate
    /**
      * The array of statistics for your metric data request.
      */
    var statistics: MetricStatisticList
    /**
      * The unit for the metric data request.
      */
    var unit: MetricUnit
  }
  
  trait GetRelationalDatabaseMetricDataResult extends js.Object {
    /**
      * An object describing the result of your get relational database metric data request.
      */
    var metricData: js.UndefOr[MetricDatapointList] = js.undefined
    /**
      * The name of the metric.
      */
    var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined
  }
  
  trait GetRelationalDatabaseParametersRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get relational database parameters request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of your database for which to get parameters.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait GetRelationalDatabaseParametersResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get static IPs request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An object describing the result of your get relational database parameters request.
      */
    var parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined
  }
  
  trait GetRelationalDatabaseRequest extends js.Object {
    /**
      * The name of the database that you are looking up.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait GetRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the specified database.
      */
    var relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined
  }
  
  trait GetRelationalDatabaseSnapshotRequest extends js.Object {
    /**
      * The name of the database snapshot for which to get information.
      */
    var relationalDatabaseSnapshotName: ResourceName
  }
  
  trait GetRelationalDatabaseSnapshotResult extends js.Object {
    /**
      * An object describing the specified database snapshot.
      */
    var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined
  }
  
  trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get relational database snapshots request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabaseSnapshotsResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get relational database snapshots request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An object describing the result of your get relational database snapshots request.
      */
    var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined
  }
  
  trait GetRelationalDatabasesRequest extends js.Object {
    /**
      * A token used for advancing to a specific page of results for your get relational database request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetRelationalDatabasesResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get relational databases request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An object describing the result of your get relational databases request.
      */
    var relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined
  }
  
  trait GetStaticIpRequest extends js.Object {
    /**
      * The name of the static IP in Lightsail.
      */
    var staticIpName: ResourceName
  }
  
  trait GetStaticIpResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the requested static IP.
      */
    var staticIp: js.UndefOr[StaticIp] = js.undefined
  }
  
  trait GetStaticIpsRequest extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get static IPs request.
      */
    var pageToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetStaticIpsResult extends js.Object {
    /**
      * A token used for advancing to the next page of results from your get static IPs request.
      */
    var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of key-value pairs containing information about your get static IPs request.
      */
    var staticIps: js.UndefOr[StaticIpList] = js.undefined
  }
  
  trait HostKeyAttributes extends js.Object {
    /**
      * The SSH host key algorithm or the RDP certificate format. For SSH host keys, the algorithm may be ssh-rsa, ecdsa-sha2-nistp256, ssh-ed25519, etc. For RDP certificates, the algorithm is always x509-cert.
      */
    var algorithm: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-1 SSH fingerprint:  SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0    Example of an SHA-1 RDP fingerprint:  af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45   
      */
    var fingerprintSHA1: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-256 SSH fingerprint:  SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o    Example of an SHA-256 RDP fingerprint:  03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68   
      */
    var fingerprintSHA256: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The returned RDP certificate is not valid after this point in time. This value is listed only for RDP certificates.
      */
    var notValidAfter: js.UndefOr[IsoDate] = js.undefined
    /**
      * The returned RDP certificate is valid after this point in time. This value is listed only for RDP certificates.
      */
    var notValidBefore: js.UndefOr[IsoDate] = js.undefined
    /**
      * The public SSH host key or the RDP certificate.
      */
    var publicKey: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The time that the SSH host key or RDP certificate was recorded by Lightsail.
      */
    var witnessedAt: js.UndefOr[IsoDate] = js.undefined
  }
  
  trait ImportKeyPairRequest extends js.Object {
    /**
      * The name of the key pair for which you want to import the public key.
      */
    var keyPairName: ResourceName
    /**
      * A base64-encoded public key of the ssh-rsa type.
      */
    var publicKeyBase64: Base64
  }
  
  trait ImportKeyPairResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The blueprint ID (e.g., os_amlinux_2016_03).
      */
    var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The friendly name of the blueprint (e.g., Amazon Linux).
      */
    var blueprintName: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The bundle for the instance (e.g., micro_1_0).
      */
    var bundleId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The timestamp when the instance was created (e.g., 1479734909.17).
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The size of the vCPU and the amount of RAM for the instance.
      */
    var hardware: js.UndefOr[InstanceHardware] = js.undefined
    /**
      * The IPv6 address of the instance.
      */
    var ipv6Address: js.UndefOr[IpV6Address] = js.undefined
    /**
      * A Boolean value indicating whether this instance has a static IP assigned to it.
      */
    var isStaticIp: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The region name and Availability Zone where the instance is located.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * Information about the public ports and monthly data transfer rates for the instance.
      */
    var networking: js.UndefOr[InstanceNetworking] = js.undefined
    /**
      * The private IP address of the instance.
      */
    var privateIpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * The public IP address of the instance.
      */
    var publicIpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * The type of resource (usually Instance).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
      */
    var sshKeyName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The status code and the state (e.g., running) for the instance.
      */
    var state: js.UndefOr[InstanceState] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * The user name for connecting to the instance (e.g., ec2-user).
      */
    var username: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait InstanceAccessDetails extends js.Object {
    /**
      * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
      */
    var certKey: js.UndefOr[java.lang.String] = js.undefined
    /**
      * For SSH access, the date on which the temporary keys expire.
      */
    var expiresAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * Describes the public SSH host keys or the RDP certificate.
      */
    var hostKeys: js.UndefOr[HostKeysList] = js.undefined
    /**
      * The name of this Amazon Lightsail instance.
      */
    var instanceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The public IP address of the Amazon Lightsail instance.
      */
    var ipAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
      */
    var password: js.UndefOr[java.lang.String] = js.undefined
    /**
      * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
      */
    var passwordData: js.UndefOr[PasswordData] = js.undefined
    /**
      * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
      */
    var privateKey: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The protocol for these Amazon Lightsail instance access details.
      */
    var protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
    /**
      * The user name to use when logging in to the Amazon Lightsail instance.
      */
    var username: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InstanceEntry extends js.Object {
    /**
      * The Availability Zone for the new Amazon EC2 instance.
      */
    var availabilityZone: java.lang.String
    /**
      * The instance type (e.g., t2.micro) to use for the new Amazon EC2 instance.
      */
    var instanceType: NonEmptyString
    /**
      * The port configuration to use for the new Amazon EC2 instance. The following configuration options are available:   DEFAULT — Use the default firewall settings from the image.   INSTANCE — Use the firewall settings from the source Lightsail instance.   NONE — Default to Amazon EC2.   CLOSED — All ports closed.  
      */
    var portInfoSource: PortInfoSourceType
    /**
      * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used as the source of the new Amazon EC2 instance. Use the get export snapshot records operation to get a list of export snapshot records that you can use to create a CloudFormation stack.
      */
    var sourceName: ResourceName
    /**
      * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. 
      */
    var userData: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InstanceHardware extends js.Object {
    /**
      * The number of vCPUs the instance has.
      */
    var cpuCount: js.UndefOr[integer] = js.undefined
    /**
      * The disks attached to the instance.
      */
    var disks: js.UndefOr[DiskList] = js.undefined
    /**
      * The amount of RAM in GB on the instance (e.g., 1.0).
      */
    var ramSizeInGb: js.UndefOr[float] = js.undefined
  }
  
  trait InstanceHealthSummary extends js.Object {
    /**
      * Describes the overall instance health. Valid values are below.
      */
    var instanceHealth: js.UndefOr[InstanceHealthState] = js.undefined
    /**
      * More information about the instance health. If the instanceHealth is healthy, then an instanceHealthReason value is not provided. If  instanceHealth  is initial, the  instanceHealthReason  value can be one of the following:     Lb.RegistrationInProgress  - The target instance is in the process of being registered with the load balancer.     Lb.InitialHealthChecking  - The Lightsail load balancer is still sending the target instance the minimum number of health checks required to determine its health status.   If  instanceHealth  is unhealthy, the  instanceHealthReason  value can be one of the following:     Instance.ResponseCodeMismatch  - The health checks did not return an expected HTTP code.     Instance.Timeout  - The health check requests timed out.     Instance.FailedHealthChecks  - The health checks failed because the connection to the target instance timed out, the target instance response was malformed, or the target instance failed the health check for an unknown reason.     Lb.InternalError  - The health checks failed due to an internal error.   If  instanceHealth  is unused, the  instanceHealthReason  value can be one of the following:     Instance.NotRegistered  - The target instance is not registered with the target group.     Instance.NotInUse  - The target group is not used by any load balancer, or the target instance is in an Availability Zone that is not enabled for its load balancer.     Instance.IpUnusable  - The target IP address is reserved for use by a Lightsail load balancer.     Instance.InvalidState  - The target is in the stopped or terminated state.   If  instanceHealth  is draining, the  instanceHealthReason  value can be one of the following:     Instance.DeregistrationInProgress  - The target instance is in the process of being deregistered and the deregistration delay period has not expired.  
      */
    var instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.undefined
    /**
      * The name of the Lightsail instance for which you are requesting health check data.
      */
    var instanceName: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait InstanceNetworking extends js.Object {
    /**
      * The amount of data in GB allocated for monthly data transfers.
      */
    var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined
    /**
      * An array of key-value pairs containing information about the ports on the instance.
      */
    var ports: js.UndefOr[InstancePortInfoList] = js.undefined
  }
  
  trait InstancePortInfo extends js.Object {
    /**
      * The access direction (inbound or outbound).
      */
    var accessDirection: js.UndefOr[AccessDirection] = js.undefined
    /**
      * The location from which access is allowed (e.g., Anywhere (0.0.0.0/0)).
      */
    var accessFrom: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of access (Public or Private).
      */
    var accessType: js.UndefOr[PortAccessType] = js.undefined
    /**
      * The common name.
      */
    var commonName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The first port in the range.
      */
    var fromPort: js.UndefOr[Port] = js.undefined
    /**
      * The protocol being used. Can be one of the following.    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.  
      */
    var protocol: js.UndefOr[NetworkProtocol] = js.undefined
    /**
      * The last port in the range.
      */
    var toPort: js.UndefOr[Port] = js.undefined
  }
  
  trait InstancePortState extends js.Object {
    /**
      * The first port in the range.
      */
    var fromPort: js.UndefOr[Port] = js.undefined
    /**
      * The protocol being used. Can be one of the following.    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.  
      */
    var protocol: js.UndefOr[NetworkProtocol] = js.undefined
    /**
      * Specifies whether the instance port is open or closed.
      */
    var state: js.UndefOr[PortState] = js.undefined
    /**
      * The last port in the range.
      */
    var toPort: js.UndefOr[Port] = js.undefined
  }
  
  trait InstanceSnapshot extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the snapshot (e.g., arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE).
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The timestamp when the snapshot was created (e.g., 1479907467.024).
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * An array of disk objects containing information about all block storage disks.
      */
    var fromAttachedDisks: js.UndefOr[DiskList] = js.undefined
    /**
      * The blueprint ID from which you created the snapshot (e.g., os_debian_8_3). A blueprint is a virtual private server (or instance) image used to create instances quickly.
      */
    var fromBlueprintId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The bundle ID from which you created the snapshot (e.g., micro_1_0).
      */
    var fromBundleId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE).
      */
    var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The instance from which the snapshot was created.
      */
    var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The region name and Availability Zone where you created the snapshot.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the snapshot.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The progress of the snapshot.
      */
    var progress: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of resource (usually InstanceSnapshot).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The size in GB of the SSD.
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * The state the snapshot is in.
      */
    var state: js.UndefOr[InstanceSnapshotState] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait InstanceSnapshotInfo extends js.Object {
    /**
      * The blueprint ID from which the source instance (e.g., os_debian_8_3).
      */
    var fromBlueprintId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The bundle ID from which the source instance was created (e.g., micro_1_0).
      */
    var fromBundleId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A list of objects describing the disks that were attached to the source instance.
      */
    var fromDiskInfo: js.UndefOr[DiskInfoList] = js.undefined
  }
  
  trait InstanceState extends js.Object {
    /**
      * The status code for the instance.
      */
    var code: js.UndefOr[integer] = js.undefined
    /**
      * The state of the instance (e.g., running or pending).
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IsVpcPeeredRequest extends js.Object
  
  trait IsVpcPeeredResult extends js.Object {
    /**
      * Returns true if the Lightsail VPC is peered; otherwise, false.
      */
    var isPeered: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait KeyPair extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the key pair (e.g., arn:aws:lightsail:us-east-2:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE).
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The timestamp when the key pair was created (e.g., 1479816991.349).
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The RSA fingerprint of the key pair.
      */
    var fingerprint: js.UndefOr[Base64] = js.undefined
    /**
      * The region name and Availability Zone where the key pair was created.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The friendly name of the SSH key pair.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The resource type (usually KeyPair).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait LoadBalancer extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the load balancer.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A string to string map of the configuration options for your load balancer. Valid values are listed below.
      */
    var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.undefined
    /**
      * The date when your load balancer was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The DNS name of your Lightsail load balancer.
      */
    var dnsName: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a request to the default (root) page.
      */
    var healthCheckPath: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * An array of InstanceHealthSummary objects describing the health of the load balancer.
      */
    var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.undefined
    /**
      * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port 443.
      */
    var instancePort: js.UndefOr[integer] = js.undefined
    /**
      * The AWS Region where your load balancer was created (e.g., us-east-2a). Lightsail automatically creates your load balancer across Availability Zones.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the load balancer (e.g., my-load-balancer).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The protocol you have enabled for your load balancer. Valid values are below. You can't just have HTTP_HTTPS, but you can have just HTTP.
      */
    var protocol: js.UndefOr[LoadBalancerProtocol] = js.undefined
    /**
      * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
      */
    var publicPorts: js.UndefOr[PortList] = js.undefined
    /**
      * The resource type (e.g., LoadBalancer.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The status of your load balancer. Valid values are below.
      */
    var state: js.UndefOr[LoadBalancerState] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS certificates. For example, if true, the certificate is attached to the load balancer.
      */
    var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.undefined
  }
  
  trait LoadBalancerConfigurationOptions
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  trait LoadBalancerTlsCertificate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The time when you created your SSL/TLS certificate.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The domain name for your SSL/TLS certificate.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
    /**
      * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
      */
    var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.undefined
    /**
      * The reason for the SSL/TLS certificate validation failure.
      */
    var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.undefined
    /**
      * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
      */
    var isAttached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The time when the SSL/TLS certificate was issued.
      */
    var issuedAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The issuer of the certificate.
      */
    var issuer: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The algorithm that was used to generate the key pair (the public and private key).
      */
    var keyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The load balancer name where your SSL/TLS certificate is attached.
      */
    var loadBalancerName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The AWS Region and Availability Zone where you created your certificate.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the SSL/TLS certificate (e.g., my-certificate).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The timestamp when the SSL/TLS certificate expires.
      */
    var notAfter: js.UndefOr[IsoDate] = js.undefined
    /**
      * The timestamp when the SSL/TLS certificate is first valid.
      */
    var notBefore: js.UndefOr[IsoDate] = js.undefined
    /**
      * An object containing information about the status of Lightsail's managed renewal for the certificate.
      */
    var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.undefined
    /**
      * The resource type (e.g., LoadBalancerTlsCertificate).     Instance  - A Lightsail instance (a virtual private server)     StaticIp  - A static IP address     KeyPair  - The key pair used to connect to a Lightsail instance     InstanceSnapshot  - A Lightsail instance snapshot     Domain  - A DNS zone     PeeredVpc  - A peered VPC     LoadBalancer  - A Lightsail load balancer     LoadBalancerTlsCertificate  - An SSL/TLS certificate associated with a Lightsail load balancer     Disk  - A Lightsail block storage disk     DiskSnapshot  - A block storage disk snapshot  
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The reason the certificate was revoked. Valid values are below.
      */
    var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.undefined
    /**
      * The timestamp when the SSL/TLS certificate was revoked.
      */
    var revokedAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The serial number of the certificate.
      */
    var serial: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The algorithm that was used to sign the certificate.
      */
    var signatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The status of the SSL/TLS certificate. Valid values are below.
      */
    var status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.undefined
    /**
      * The name of the entity that is associated with the public key contained in the certificate.
      */
    var subject: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website, such as example.com, www.example.com, or m.example.com.
      */
    var subjectAlternativeNames: js.UndefOr[StringList] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
    /**
      * The fully qualified domain name in the certificate request.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
    /**
      * The status of the domain validation. Valid values are listed below.
      */
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
  }
  
  trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
    /**
      * The domain name against which your SSL/TLS certificate was validated.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
    /**
      * A fully qualified domain name in the certificate. For example, example.com.
      */
    var name: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The type of validation record. For example, CNAME for domain validation.
      */
    var `type`: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The validation status. Valid values are listed below.
      */
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
    /**
      * The value for that type.
      */
    var value: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
    /**
      * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request.
      */
    var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.undefined
    /**
      * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
      */
    var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.undefined
  }
  
  trait LoadBalancerTlsCertificateSummary extends js.Object {
    /**
      * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
      */
    var isAttached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The name of the SSL/TLS certificate.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait LogEvent extends js.Object {
    /**
      * The timestamp when the database log event was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The message of the database log event.
      */
    var message: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait MetricDatapoint extends js.Object {
    /**
      * The average.
      */
    var average: js.UndefOr[double] = js.undefined
    /**
      * The maximum.
      */
    var maximum: js.UndefOr[double] = js.undefined
    /**
      * The minimum.
      */
    var minimum: js.UndefOr[double] = js.undefined
    /**
      * The sample count.
      */
    var sampleCount: js.UndefOr[double] = js.undefined
    /**
      * The sum.
      */
    var sum: js.UndefOr[double] = js.undefined
    /**
      * The timestamp (e.g., 1479816991.349).
      */
    var timestamp: js.UndefOr[timestamp] = js.undefined
    /**
      * The unit. 
      */
    var unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  trait MonthlyTransfer extends js.Object {
    /**
      * The amount allocated per month (in GB).
      */
    var gbPerMonthAllocated: js.UndefOr[integer] = js.undefined
  }
  
  trait OpenInstancePublicPortsRequest extends js.Object {
    /**
      * The name of the instance for which you want to open the public ports.
      */
    var instanceName: ResourceName
    /**
      * An array of key-value pairs containing information about the port mappings.
      */
    var portInfo: PortInfo
  }
  
  trait OpenInstancePublicPortsResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait Operation extends js.Object {
    /**
      * The timestamp when the operation was initialized (e.g., 1479816991.349).
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The error code.
      */
    var errorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The error details.
      */
    var errorDetails: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the operation.
      */
    var id: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A Boolean value indicating whether the operation is terminal.
      */
    var isTerminal: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The region and Availability Zone.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * Details about the operation (e.g., Debian-1GB-Ohio-1).
      */
    var operationDetails: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of operation. 
      */
    var operationType: js.UndefOr[OperationType] = js.undefined
    /**
      * The resource name.
      */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The resource type. 
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The status of the operation. 
      */
    var status: js.UndefOr[OperationStatus] = js.undefined
    /**
      * The timestamp when the status was changed (e.g., 1479816991.349).
      */
    var statusChangedAt: js.UndefOr[IsoDate] = js.undefined
  }
  
  trait PasswordData extends js.Object {
    /**
      * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you use the default key pair (LightsailDefaultKeyPair), the decrypted password will be available in the password field. If you are using a custom key pair, you need to use your own means of decryption. If you change the Administrator password on the instance, Lightsail will continue to return the original ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
      */
    var ciphertext: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the key pair that you used when creating your instance. If no key pair name was specified when creating the instance, Lightsail uses the default key pair (LightsailDefaultKeyPair). If you are using a custom key pair, you need to use your own means of decrypting your password using the ciphertext. Lightsail creates the ciphertext by encrypting your password with the public key part of this key pair.
      */
    var keyPairName: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait PeerVpcRequest extends js.Object
  
  trait PeerVpcResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait PendingMaintenanceAction extends js.Object {
    /**
      * The type of pending database maintenance action.
      */
    var action: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The effective date of the pending database maintenance action.
      */
    var currentApplyDate: js.UndefOr[IsoDate] = js.undefined
    /**
      * Additional detail about the pending database maintenance action.
      */
    var description: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait PendingModifiedRelationalDatabaseValues extends js.Object {
    /**
      * A Boolean value indicating whether automated backup retention is enabled.
      */
    var backupRetentionEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The database engine version.
      */
    var engineVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The password for the master user of the database.
      */
    var masterUserPassword: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait PortInfo extends js.Object {
    /**
      * The first port in the range.
      */
    var fromPort: js.UndefOr[Port] = js.undefined
    /**
      * The protocol. 
      */
    var protocol: js.UndefOr[NetworkProtocol] = js.undefined
    /**
      * The last port in the range.
      */
    var toPort: js.UndefOr[Port] = js.undefined
  }
  
  trait PutInstancePublicPortsRequest extends js.Object {
    /**
      * The Lightsail instance name of the public port(s) you are setting.
      */
    var instanceName: ResourceName
    /**
      * Specifies information about the public port(s).
      */
    var portInfos: PortInfoList
  }
  
  trait PutInstancePublicPortsResult extends js.Object {
    /**
      * Describes metadata about the operation you just executed.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait RebootInstanceRequest extends js.Object {
    /**
      * The name of the instance to reboot.
      */
    var instanceName: ResourceName
  }
  
  trait RebootInstanceResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait RebootRelationalDatabaseRequest extends js.Object {
    /**
      * The name of your database to reboot.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait RebootRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your reboot relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait Region extends js.Object {
    /**
      * The Availability Zones. Follows the format us-east-2a (case-sensitive).
      */
    var availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
      * The continent code (e.g., NA, meaning North America).
      */
    var continentCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The description of the AWS Region (e.g., This region is recommended to serve users in the eastern United States and eastern Canada).
      */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The display name (e.g., Ohio).
      */
    var displayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The region name (e.g., us-east-2).
      */
    var name: js.UndefOr[RegionName] = js.undefined
    /**
      * The Availability Zones for databases. Follows the format us-east-2a (case-sensitive).
      */
    var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  }
  
  trait RelationalDatabase extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the database.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A Boolean value indicating whether automated backup retention is enabled for the database.
      */
    var backupRetentionEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The timestamp when the database was created. Formatted in Unix time.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The database software (for example, MySQL).
      */
    var engine: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The database engine version (for example, 5.7.23).
      */
    var engineVersion: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Describes the hardware of the database.
      */
    var hardware: js.UndefOr[RelationalDatabaseHardware] = js.undefined
    /**
      * The latest point in time to which the database can be restored. Formatted in Unix time.
      */
    var latestRestorableTime: js.UndefOr[IsoDate] = js.undefined
    /**
      * The Region name and Availability Zone where the database is located.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the master database created when the Lightsail database resource is created.
      */
    var masterDatabaseName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The master endpoint for the database.
      */
    var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.undefined
    /**
      * The master user name of the database.
      */
    var masterUsername: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The unique name of the database resource in Lightsail.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The status of parameter updates for the database.
      */
    var parameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Describes the pending maintenance actions for the database.
      */
    var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.undefined
    /**
      * Describes pending database value modifications.
      */
    var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.undefined
    /**
      * The daily time range during which automated backups are created for the database (for example, 16:00-16:30).
      */
    var preferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur on the database. In the format ddd:hh24:mi-ddd:hh24:mi. For example, Tue:17:00-Tue:17:30.
      */
    var preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * A Boolean value indicating whether the database is publicly accessible.
      */
    var publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The blueprint ID for the database. A blueprint describes the major engine version of a database.
      */
    var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The bundle ID for the database. A bundle describes the performance specifications for your database.
      */
    var relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The Lightsail resource type for the database (for example, RelationalDatabase).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
      */
    var secondaryAvailabilityZone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Describes the current state of the database.
      */
    var state: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait RelationalDatabaseBlueprint extends js.Object {
    /**
      * The ID for the database blueprint.
      */
    var blueprintId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The database software of the database blueprint (for example, MySQL).
      */
    var engine: js.UndefOr[RelationalDatabaseEngine] = js.undefined
    /**
      * The description of the database engine for the database blueprint.
      */
    var engineDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The database engine version for the database blueprint (for example, 5.7.23).
      */
    var engineVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The description of the database engine version for the database blueprint.
      */
    var engineVersionDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A Boolean value indicating whether the engine version is the default for the database blueprint.
      */
    var isEngineDefault: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait RelationalDatabaseBundle extends js.Object {
    /**
      * The ID for the database bundle.
      */
    var bundleId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of virtual CPUs (vCPUs) for the database bundle.
      */
    var cpuCount: js.UndefOr[integer] = js.undefined
    /**
      * The size of the disk for the database bundle.
      */
    var diskSizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * A Boolean value indicating whether the database bundle is active.
      */
    var isActive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A Boolean value indicating whether the database bundle is encrypted.
      */
    var isEncrypted: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The name for the database bundle.
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The cost of the database bundle in US currency.
      */
    var price: js.UndefOr[float] = js.undefined
    /**
      * The amount of RAM in GB (for example, 2.0) for the database bundle.
      */
    var ramSizeInGb: js.UndefOr[float] = js.undefined
    /**
      * The data transfer rate per month in GB for the database bundle.
      */
    var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
  }
  
  trait RelationalDatabaseEndpoint extends js.Object {
    /**
      * Specifies the DNS address of the database.
      */
    var address: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Specifies the port that the database is listening on.
      */
    var port: js.UndefOr[integer] = js.undefined
  }
  
  trait RelationalDatabaseEvent extends js.Object {
    /**
      * The timestamp when the database event was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The category that the database event belongs to.
      */
    var eventCategories: js.UndefOr[StringList] = js.undefined
    /**
      * The message of the database event.
      */
    var message: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The database that the database event relates to.
      */
    var resource: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait RelationalDatabaseHardware extends js.Object {
    /**
      * The number of vCPUs for the database.
      */
    var cpuCount: js.UndefOr[integer] = js.undefined
    /**
      * The size of the disk for the database.
      */
    var diskSizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * The amount of RAM in GB for the database.
      */
    var ramSizeInGb: js.UndefOr[float] = js.undefined
  }
  
  trait RelationalDatabaseParameter extends js.Object {
    /**
      * Specifies the valid range of values for the parameter.
      */
    var allowedValues: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
      */
    var applyMethod: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the engine-specific parameter type.
      */
    var applyType: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the valid data type for the parameter.
      */
    var dataType: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Provides a description of the parameter.
      */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A Boolean value indicating whether the parameter can be modified.
      */
    var isModifiable: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Specifies the name of the parameter.
      */
    var parameterName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the value of the parameter.
      */
    var parameterValue: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RelationalDatabaseSnapshot extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the database snapshot.
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The timestamp when the database snapshot was created.
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The software of the database snapshot (for example, MySQL)
      */
    var engine: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The database engine version for the database snapshot (for example, 5.7.23).
      */
    var engineVersion: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
      */
    var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
      */
    var fromRelationalDatabaseBlueprintId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The bundle ID of the database from which the database snapshot was created.
      */
    var fromRelationalDatabaseBundleId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the source database from which the database snapshot was created.
      */
    var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The Region name and Availability Zone where the database snapshot is located.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the database snapshot.
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The Lightsail resource type.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The size of the disk in GB (for example, 32) for the database snapshot.
      */
    var sizeInGb: js.UndefOr[integer] = js.undefined
    /**
      * The state of the database snapshot.
      */
    var state: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ReleaseStaticIpRequest extends js.Object {
    /**
      * The name of the static IP to delete.
      */
    var staticIpName: ResourceName
  }
  
  trait ReleaseStaticIpResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait ResourceLocation extends js.Object {
    /**
      * The Availability Zone. Follows the format us-east-2a (case-sensitive).
      */
    var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The AWS Region name.
      */
    var regionName: js.UndefOr[RegionName] = js.undefined
  }
  
  trait StartInstanceRequest extends js.Object {
    /**
      * The name of the instance (a virtual private server) to start.
      */
    var instanceName: ResourceName
  }
  
  trait StartInstanceResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait StartRelationalDatabaseRequest extends js.Object {
    /**
      * The name of your database to start.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait StartRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your start relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait StaticIp extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the static IP (e.g., arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE).
      */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The instance where the static IP is attached (e.g., Amazon_Linux-1GB-Ohio-1).
      */
    var attachedTo: js.UndefOr[ResourceName] = js.undefined
    /**
      * The timestamp when the static IP was created (e.g., 1479735304.222).
      */
    var createdAt: js.UndefOr[IsoDate] = js.undefined
    /**
      * The static IP address.
      */
    var ipAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * A Boolean value indicating whether the static IP is attached.
      */
    var isAttached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The region and Availability Zone where the static IP was created.
      */
    var location: js.UndefOr[ResourceLocation] = js.undefined
    /**
      * The name of the static IP (e.g., StaticIP-Ohio-EXAMPLE).
      */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
      * The resource type (usually StaticIp).
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
      */
    var supportCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait StopInstanceRequest extends js.Object {
    /**
      * When set to True, forces a Lightsail instance that is stuck in a stopping state to stop.  Only use the force parameter if your instance is stuck in the stopping state. In any other state, your instance should stop normally without adding this parameter to your API request. 
      */
    var force: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The name of the instance (a virtual private server) to stop.
      */
    var instanceName: ResourceName
  }
  
  trait StopInstanceResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait StopRelationalDatabaseRequest extends js.Object {
    /**
      * The name of your database to stop.
      */
    var relationalDatabaseName: ResourceName
    /**
      * The name of your new database snapshot to be created before stopping your database.
      */
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait StopRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your stop relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag. Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in UTF-8, or the following characters: + - = . _ : / @
      */
    var key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of the tag. Constraints: Tag values accept a maximum of 256 letters, numbers, spaces in UTF-8, or the following characters: + - = . _ : / @
      */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The name of the resource to which you are adding tags.
      */
    var resourceName: ResourceName
    /**
      * The tag key and optional value.
      */
    var tags: TagList
  }
  
  trait TagResourceResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UnpeerVpcRequest extends js.Object
  
  trait UnpeerVpcResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The name of the resource from which you are removing a tag.
      */
    var resourceName: ResourceName
    /**
      * The tag keys to delete from the specified resource.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResult extends js.Object {
    /**
      * A list of objects describing the API operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait UpdateDomainEntryRequest extends js.Object {
    /**
      * An array of key-value pairs containing information about the domain entry.
      */
    var domainEntry: DomainEntry
    /**
      * The name of the domain recordset to update.
      */
    var domainName: DomainName
  }
  
  trait UpdateDomainEntryResult extends js.Object {
    /**
      * An array of key-value pairs containing information about the request operation.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait UpdateLoadBalancerAttributeRequest extends js.Object {
    /**
      * The name of the attribute you want to update. Valid values are below.
      */
    var attributeName: LoadBalancerAttributeName
    /**
      * The value that you want to specify for the attribute name.
      */
    var attributeValue: StringMax256
    /**
      * The name of the load balancer that you want to modify (e.g., my-load-balancer.
      */
    var loadBalancerName: ResourceName
  }
  
  trait UpdateLoadBalancerAttributeResult extends js.Object {
    /**
      * An object describing the API operations.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait UpdateRelationalDatabaseParametersRequest extends js.Object {
    /**
      * The database parameters to update.
      */
    var parameters: RelationalDatabaseParameterList
    /**
      * The name of your database for which to update parameters.
      */
    var relationalDatabaseName: ResourceName
  }
  
  trait UpdateRelationalDatabaseParametersResult extends js.Object {
    /**
      * An object describing the result of your update relational database parameters request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait UpdateRelationalDatabaseRequest extends js.Object {
    /**
      * When true, applies changes immediately. When false, applies changes during the preferred maintenance window. Some changes may cause an outage. Default: false 
      */
    var applyImmediately: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * When true, disables automated backup retention for your database. Disabling backup retention deletes all automated database backups. Before disabling this, you may want to create a snapshot of your database using the create relational database snapshot operation. Updates are applied during the next maintenance window because this can result in an outage.
      */
    var disableBackupRetention: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * When true, enables automated backup retention for your database. Updates are applied during the next maintenance window because this can result in an outage.
      */
    var enableBackupRetention: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The password for the master user of your database. The password can include any printable ASCII character except "/", """, or "@". Constraints: Must contain 8 to 41 characters.
      */
    var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
    /**
      * The daily time range during which automated backups are created for your database if automated backups are enabled. Constraints:   Must be in the hh24:mi-hh24:mi format. Example: 16:00-16:30    Specified in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
      */
    var preferredBackupWindow: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur on your database. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Constraints:   Must be in the ddd:hh24:mi-ddd:hh24:mi format.   Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be at least 30 minutes.   Specified in Universal Coordinated Time (UTC).   Example: Tue:17:00-Tue:17:30   
      */
    var preferredMaintenanceWindow: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the accessibility options for your database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
      */
    var publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The name of your database to update.
      */
    var relationalDatabaseName: ResourceName
    /**
      * When true, the master user password is changed to a new strong password generated by Lightsail. Use the get relational database master user password operation to get the new password.
      */
    var rotateMasterUserPassword: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait UpdateRelationalDatabaseResult extends js.Object {
    /**
      * An object describing the result of your update relational database request.
      */
    var operations: js.UndefOr[OperationList] = js.undefined
  }
  
  trait _AccessDirection extends js.Object
  
  trait _BlueprintType extends js.Object
  
  trait _DiskSnapshotState extends js.Object
  
  trait _DiskState extends js.Object
  
  trait _ExportSnapshotRecordSourceType extends js.Object
  
  trait _InstanceAccessProtocol extends js.Object
  
  trait _InstanceHealthReason extends js.Object
  
  trait _InstanceHealthState extends js.Object
  
  trait _InstanceMetricName extends js.Object
  
  trait _InstancePlatform extends js.Object
  
  trait _InstanceSnapshotState extends js.Object
  
  trait _LoadBalancerAttributeName extends js.Object
  
  trait _LoadBalancerMetricName extends js.Object
  
  trait _LoadBalancerProtocol extends js.Object
  
  trait _LoadBalancerState extends js.Object
  
  trait _LoadBalancerTlsCertificateDomainStatus extends js.Object
  
  trait _LoadBalancerTlsCertificateFailureReason extends js.Object
  
  trait _LoadBalancerTlsCertificateRenewalStatus extends js.Object
  
  trait _LoadBalancerTlsCertificateRevocationReason extends js.Object
  
  trait _LoadBalancerTlsCertificateStatus extends js.Object
  
  trait _MetricStatistic extends js.Object
  
  trait _MetricUnit extends js.Object
  
  trait _NetworkProtocol extends js.Object
  
  trait _OperationStatus extends js.Object
  
  trait _OperationType extends js.Object
  
  trait _PortAccessType extends js.Object
  
  trait _PortInfoSourceType extends js.Object
  
  trait _PortState extends js.Object
  
  trait _RecordState extends js.Object
  
  trait _RegionName extends js.Object
  
  trait _RelationalDatabaseMetricName extends js.Object
  
  trait _RelationalDatabasePasswordVersion extends js.Object
  
  trait _ResourceType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.inbound
    - awsDashSdkLib.awsDashSdkLibStrings.outbound
    - java.lang.String
  */
  type AccessDirection = _AccessDirection | java.lang.String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type Base64 = java.lang.String
  type BlueprintList = js.Array[Blueprint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.os
    - awsDashSdkLib.awsDashSdkLibStrings.app
    - java.lang.String
  */
  type BlueprintType = _BlueprintType | java.lang.String
  type BundleList = js.Array[Bundle]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudFormationStackRecordList = js.Array[CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = awsDashSdkLib.awsDashSdkLibStrings.ExportSnapshotRecord | java.lang.String
  type DiskInfoList = js.Array[DiskInfo]
  type DiskList = js.Array[Disk]
  type DiskMapList = js.Array[DiskMap]
  type DiskSnapshotList = js.Array[DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type DiskSnapshotState = _DiskSnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.`in-use`
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type DiskState = _DiskState | java.lang.String
  type DomainEntryList = js.Array[DomainEntry]
  type DomainEntryOptionsKeys = java.lang.String
  type DomainEntryType = java.lang.String
  type DomainList = js.Array[Domain]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type ExportSnapshotRecordList = js.Array[ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = _ExportSnapshotRecordSourceType | java.lang.String
  type HostKeysList = js.Array[HostKeyAttributes]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ssh
    - awsDashSdkLib.awsDashSdkLibStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = _InstanceAccessProtocol | java.lang.String
  type InstanceEntryList = js.Array[InstanceEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTRegistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTInitialHealthChecking
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTInternalError
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTResponseCodeMismatch
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTTimeout
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTFailedHealthChecks
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTNotRegistered
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTNotInUse
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTDeregistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTInvalidState
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTIpUnusable
    - java.lang.String
  */
  type InstanceHealthReason = _InstanceHealthReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.initial
    - awsDashSdkLib.awsDashSdkLibStrings.healthy
    - awsDashSdkLib.awsDashSdkLibStrings.unhealthy
    - awsDashSdkLib.awsDashSdkLibStrings.unused
    - awsDashSdkLib.awsDashSdkLibStrings.draining
    - awsDashSdkLib.awsDashSdkLibStrings.unavailable
    - java.lang.String
  */
  type InstanceHealthState = _InstanceHealthState | java.lang.String
  type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed_Instance
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed_System
    - java.lang.String
  */
  type InstanceMetricName = _InstanceMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX_UNIX
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = _InstancePlatform | java.lang.String
  type InstancePlatformList = js.Array[InstancePlatform]
  type InstancePortInfoList = js.Array[InstancePortInfo]
  type InstancePortStateList = js.Array[InstancePortState]
  type InstanceSnapshotList = js.Array[InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - java.lang.String
  */
  type InstanceSnapshotState = _InstanceSnapshotState | java.lang.String
  type IpAddress = java.lang.String
  type IpV6Address = java.lang.String
  type IsoDate = stdLib.Date
  type KeyPairList = js.Array[KeyPair]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HealthCheckPath
    - awsDashSdkLib.awsDashSdkLibStrings.SessionStickinessEnabled
    - awsDashSdkLib.awsDashSdkLibStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = _LoadBalancerAttributeName | java.lang.String
  type LoadBalancerList = js.Array[LoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ClientTLSNegotiationErrorCount
    - awsDashSdkLib.awsDashSdkLibStrings.HealthyHostCount
    - awsDashSdkLib.awsDashSdkLibStrings.UnhealthyHostCount
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_LB_4XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_LB_5XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_2XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_3XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_4XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_5XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceResponseTime
    - awsDashSdkLib.awsDashSdkLibStrings.RejectedConnectionCount
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCount
    - java.lang.String
  */
  type LoadBalancerMetricName = _LoadBalancerMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = _LoadBalancerProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.provisioning
    - awsDashSdkLib.awsDashSdkLibStrings.active_impaired
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type LoadBalancerState = _LoadBalancerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = _LoadBalancerTlsCertificateDomainStatus | java.lang.String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NO_AVAILABLE_CONTACTS
    - awsDashSdkLib.awsDashSdkLibStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_NOT_ALLOWED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_PUBLIC_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = _LoadBalancerTlsCertificateFailureReason | java.lang.String
  type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_AUTO_RENEWAL
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = _LoadBalancerTlsCertificateRenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.AFFILIATION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.SUPERCEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CESSATION_OF_OPERATION
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_HOLD
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE_FROM_CRL
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVILEGE_WITHDRAWN
    - awsDashSdkLib.awsDashSdkLibStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRevocationReason = _LoadBalancerTlsCertificateRevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.ISSUED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REVOKED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type LoadBalancerTlsCertificateStatus = _LoadBalancerTlsCertificateStatus | java.lang.String
  type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[LogEvent]
  type MetricDatapointList = js.Array[MetricDatapoint]
  type MetricPeriod = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | java.lang.String
  type MetricStatisticList = js.Array[MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Seconds
    - awsDashSdkLib.awsDashSdkLibStrings.Microseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Milliseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Bytes
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobytes
    - awsDashSdkLib.awsDashSdkLibStrings.Megabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Terabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Bits
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobits
    - awsDashSdkLib.awsDashSdkLibStrings.Megabits
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabits
    - awsDashSdkLib.awsDashSdkLibStrings.Terabits
    - awsDashSdkLib.awsDashSdkLibStrings.Percent
    - awsDashSdkLib.awsDashSdkLibStrings.Count
    - awsDashSdkLib.awsDashSdkLibStrings.`Bytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Bits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Count/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - java.lang.String
  */
  type MetricUnit = _MetricUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tcp
    - awsDashSdkLib.awsDashSdkLibStrings.all
    - awsDashSdkLib.awsDashSdkLibStrings.udp
    - java.lang.String
  */
  type NetworkProtocol = _NetworkProtocol | java.lang.String
  type NonEmptyString = java.lang.String
  type OperationList = js.Array[Operation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotStarted
    - awsDashSdkLib.awsDashSdkLibStrings.Started
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteKnownHostKeys
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInstance
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstance
    - awsDashSdkLib.awsDashSdkLibStrings.StopInstance
    - awsDashSdkLib.awsDashSdkLibStrings.StartInstance
    - awsDashSdkLib.awsDashSdkLibStrings.RebootInstance
    - awsDashSdkLib.awsDashSdkLibStrings.OpenInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.PutInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.CloseInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.AllocateStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.AttachStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.DetachStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateDomainEntry
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDomainEntry
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDomain
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDomain
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstancesFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.AttachInstancesToLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.DetachInstancesFromLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateLoadBalancerAttribute
    - awsDashSdkLib.awsDashSdkLibStrings.CreateLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.AttachLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDisk
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDisk
    - awsDashSdkLib.awsDashSdkLibStrings.AttachDisk
    - awsDashSdkLib.awsDashSdkLibStrings.DetachDisk
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDiskFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabaseFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteRelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateRelationalDatabaseParameters
    - awsDashSdkLib.awsDashSdkLibStrings.StartRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.RebootRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.StopRelationalDatabase
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Public
    - awsDashSdkLib.awsDashSdkLibStrings.Private
    - java.lang.String
  */
  type PortAccessType = _PortAccessType | java.lang.String
  type PortInfoList = js.Array[PortInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = _PortInfoSourceType | java.lang.String
  type PortList = js.Array[Port]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - java.lang.String
  */
  type PortState = _PortState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Started
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type RecordState = _RecordState | java.lang.String
  type RegionList = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ca-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-2`
    - java.lang.String
  */
  type RegionName = _RegionName | java.lang.String
  type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEngine = awsDashSdkLib.awsDashSdkLibStrings.mysql | java.lang.String
  type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.DatabaseConnections
    - awsDashSdkLib.awsDashSdkLibStrings.DiskQueueDepth
    - awsDashSdkLib.awsDashSdkLibStrings.FreeStorageSpace
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkReceiveThroughput
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = _RelationalDatabaseMetricName | java.lang.String
  type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURRENT
    - awsDashSdkLib.awsDashSdkLibStrings.PREVIOUS
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = _RelationalDatabasePasswordVersion | java.lang.String
  type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[ResourceName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Instance
    - awsDashSdkLib.awsDashSdkLibStrings.StaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.KeyPair
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.Domain
    - awsDashSdkLib.awsDashSdkLibStrings.PeeredVpc
    - awsDashSdkLib.awsDashSdkLibStrings.LoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.LoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.Disk
    - awsDashSdkLib.awsDashSdkLibStrings.DiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.RelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.RelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.ExportSnapshotRecord
    - awsDashSdkLib.awsDashSdkLibStrings.CloudFormationStackRecord
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type SensitiveString = java.lang.String
  type StaticIpList = js.Array[StaticIp]
  type StringList = js.Array[java.lang.String]
  type StringMax256 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type double = scala.Double
  type float = scala.Double
  type integer = scala.Double
  type timestamp = stdLib.Date
}

