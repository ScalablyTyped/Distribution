package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/snowball", "Snowball")
@js.native
object SnowballNs extends js.Object {
  
  trait Address extends js.Object {
    /**
         * The unique ID for an address.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The city in an address that a Snowball is to be delivered to.
         */
    var City: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the company to receive a Snowball at an address.
         */
    var Company: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The country in an address that a Snowball is to be delivered to.
         */
    var Country: js.UndefOr[java.lang.String] = js.undefined
    /**
         * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
         */
    var IsRestricted: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * This field is no longer used and the value is ignored.
         */
    var Landmark: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of a person to receive a Snowball at an address.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The phone number associated with an address that a Snowball is to be delivered to.
         */
    var PhoneNumber: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The postal code in an address that a Snowball is to be delivered to.
         */
    var PostalCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * This field is no longer used and the value is ignored.
         */
    var PrefectureOrDistrict: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The state or province in an address that a Snowball is to be delivered to.
         */
    var StateOrProvince: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The first line in a street address that a Snowball is to be delivered to.
         */
    var Street1: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The second line in a street address that a Snowball is to be delivered to.
         */
    var Street2: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The third line in a street address that a Snowball is to be delivered to.
         */
    var Street3: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait CancelClusterRequest extends js.Object {
    /**
         * The 39-character ID for the cluster that you want to cancel, for example CID123e4567-e89b-12d3-a456-426655440000.
         */
    var ClusterId: ClusterId
  }
  
  
  trait CancelClusterResult extends js.Object
  
  
  trait CancelJobRequest extends js.Object {
    /**
         * The 39-character job ID for the job that you want to cancel, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: JobId
  }
  
  
  trait CancelJobResult extends js.Object
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ClusterListEntry extends js.Object {
    /**
         * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
         */
    var ClusterId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The current state of this cluster. For information about the state of a specific node, see JobListEntry$JobState.
         */
    var ClusterState: js.UndefOr[ClusterState] = js.undefined
    /**
         * The creation date for this cluster.
         */
    var CreationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * Defines an optional description of the cluster, for example Environmental Data Cluster-01.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ClusterMetadata extends js.Object {
    /**
         * The automatically generated ID for a specific address.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The automatically generated ID for a cluster.
         */
    var ClusterId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The current status of the cluster.
         */
    var ClusterState: js.UndefOr[ClusterState] = js.undefined
    /**
         * The creation date for this cluster.
         */
    var CreationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The optional description of the cluster.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
         */
    var JobType: js.UndefOr[JobType] = js.undefined
    /**
         * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
         */
    var KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined
    /**
         * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
         */
    var Resources: js.UndefOr[JobResource] = js.undefined
    /**
         * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
         */
    var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    /**
         * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE.
         */
    var SnowballType: js.UndefOr[SnowballType] = js.undefined
  }
  
  
  trait CompatibleImage extends js.Object {
    /**
         * The unique identifier for an individual Snowball Edge AMI.
         */
    var AmiId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The optional name of a compatible image.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait CreateAddressRequest extends js.Object {
    /**
         * The address that you want the Snowball shipped to.
         */
    var Address: Address
  }
  
  
  trait CreateAddressResult extends js.Object {
    /**
         * The automatically generated ID for a specific address. You'll use this ID when you create a job to specify which address you want the Snowball for that job shipped to.
         */
    var AddressId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait CreateClusterRequest extends js.Object {
    /**
         * The ID for the address that you want the cluster shipped to.
         */
    var AddressId: AddressId
    /**
         * An optional description of this specific cluster, for example Environmental Data Cluster-01.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The forwarding address ID for a cluster. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
         */
    var JobType: JobType
    /**
         * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in AWS Key Management Service (AWS KMS). 
         */
    var KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined
    /**
         * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda functions written in the Python language. 
         */
    var Resources: JobResource
    /**
         * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in AWS Identity and Access Management (IAM).
         */
    var RoleARN: RoleARN
    /**
         * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
         */
    var ShippingOption: ShippingOption
    /**
         * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE.
         */
    var SnowballType: js.UndefOr[SnowballType] = js.undefined
  }
  
  
  trait CreateClusterResult extends js.Object {
    /**
         * The automatically generated ID for a cluster.
         */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
  }
  
  
  trait CreateJobRequest extends js.Object {
    /**
         * The ID for the address that you want the Snowball shipped to.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
         */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    /**
         * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The forwarding address ID for a job. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * Defines the type of job that you're creating. 
         */
    var JobType: js.UndefOr[JobType] = js.undefined
    /**
         * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey AWS Key Management Service (KMS) API action.
         */
    var KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined
    /**
         * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
         */
    var Resources: js.UndefOr[JobResource] = js.undefined
    /**
         * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole AWS Identity and Access Management (IAM) API action.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
         */
    var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    /**
         * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
         */
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
    /**
         * The type of AWS Snowball device to use for this job. Currently, the only supported device type for cluster jobs is EDGE.
         */
    var SnowballType: js.UndefOr[SnowballType] = js.undefined
  }
  
  
  trait CreateJobResult extends js.Object {
    /**
         * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  
  trait DataTransfer extends js.Object {
    /**
         * The number of bytes transferred between a Snowball and Amazon S3.
         */
    var BytesTransferred: js.UndefOr[Long] = js.undefined
    /**
         * The number of objects transferred between a Snowball and Amazon S3.
         */
    var ObjectsTransferred: js.UndefOr[Long] = js.undefined
    /**
         * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
         */
    var TotalBytes: js.UndefOr[Long] = js.undefined
    /**
         * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
         */
    var TotalObjects: js.UndefOr[Long] = js.undefined
  }
  
  
  trait DescribeAddressRequest extends js.Object {
    /**
         * The automatically generated ID for a specific address.
         */
    var AddressId: AddressId
  }
  
  
  trait DescribeAddressResult extends js.Object {
    /**
         * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
         */
    var Address: js.UndefOr[Address] = js.undefined
  }
  
  
  trait DescribeAddressesRequest extends js.Object {
    /**
         * The number of ADDRESS objects to return.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * HTTP requests are stateless. To identify what object comes "next" in the list of ADDRESS objects, you have the option of specifying a value for NextToken as the starting point for your list of returned addresses.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DescribeAddressesResult extends js.Object {
    /**
         * The Snowball shipping addresses that were created for this account.
         */
    var Addresses: js.UndefOr[AddressList] = js.undefined
    /**
         * HTTP requests are stateless. If you use the automatically generated NextToken value in your next DescribeAddresses call, your list of returned addresses will start from this point in the array.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DescribeClusterRequest extends js.Object {
    /**
         * The automatically generated ID for a cluster.
         */
    var ClusterId: ClusterId
  }
  
  
  trait DescribeClusterResult extends js.Object {
    /**
         * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
         */
    var ClusterMetadata: js.UndefOr[ClusterMetadata] = js.undefined
  }
  
  
  trait DescribeJobRequest extends js.Object {
    /**
         * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: JobId
  }
  
  
  trait DescribeJobResult extends js.Object {
    /**
         * Information about a specific job, including shipping information, job status, and other important metadata.
         */
    var JobMetadata: js.UndefOr[JobMetadata] = js.undefined
    /**
         * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
         */
    var SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined
  }
  
  
  trait Ec2AmiResource extends js.Object {
    /**
         * The ID of the AMI in Amazon EC2.
         */
    var AmiId: AmiId
    /**
         * The ID of the AMI on the Snowball Edge device.
         */
    var SnowballAmiId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait EventTriggerDefinition extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger associated with this job.
         */
    var EventResourceARN: js.UndefOr[ResourceARN] = js.undefined
  }
  
  
  trait GetJobManifestRequest extends js.Object {
    /**
         * The ID for a job that you want to get the manifest file for, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: JobId
  }
  
  
  trait GetJobManifestResult extends js.Object {
    /**
         * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
         */
    var ManifestURI: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetJobUnlockCodeRequest extends js.Object {
    /**
         * The ID for the job that you want to get the UnlockCode value for, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: JobId
  }
  
  
  trait GetJobUnlockCodeResult extends js.Object {
    /**
         * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 90 days after the job has been created.
         */
    var UnlockCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetSnowballUsageRequest extends js.Object
  
  
  trait GetSnowballUsageResult extends js.Object {
    /**
         * The service limit for number of Snowballs this account can have at once. The default service limit is 1 (one).
         */
    var SnowballLimit: js.UndefOr[Integer] = js.undefined
    /**
         * The number of Snowballs that this account is currently using.
         */
    var SnowballsInUse: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait JobListEntry extends js.Object {
    /**
         * The creation date for this job.
         */
    var CreationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The optional description of this specific job, for example Important Photos 2016-08-11.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A value that indicates that this job is a master job. A master job represents a successful request to create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job part, and each job part is associated with a Snowball. It might take some time before the job parts associated with a particular master job are listed, because they are created after the master job is created.
         */
    var IsMaster: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The current state of this job.
         */
    var JobState: js.UndefOr[JobState] = js.undefined
    /**
         * The type of job.
         */
    var JobType: js.UndefOr[JobType] = js.undefined
    /**
         * The type of device used with this job.
         */
    var SnowballType: js.UndefOr[SnowballType] = js.undefined
  }
  
  
  trait JobLogs extends js.Object {
    /**
         * A link to an Amazon S3 presigned URL where the job completion report is located.
         */
    var JobCompletionReportURI: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A link to an Amazon S3 presigned URL where the job failure log is located.
         */
    var JobFailureLogURI: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A link to an Amazon S3 presigned URL where the job success log is located.
         */
    var JobSuccessLogURI: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait JobMetadata extends js.Object {
    /**
         * The ID for the address that you want the Snowball shipped to.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The 39-character ID for the cluster, for example CID123e4567-e89b-12d3-a456-426655440000.
         */
    var ClusterId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The creation date for this job.
         */
    var CreationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * A value that defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a JobState value of InProgress, for both import and export jobs.
         */
    var DataTransferProgress: js.UndefOr[DataTransfer] = js.undefined
    /**
         * The description of the job, provided at job creation.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The ID of the address that you want a job shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
         */
    var JobLogInfo: js.UndefOr[JobLogs] = js.undefined
    /**
         * The current status of the jobs.
         */
    var JobState: js.UndefOr[JobState] = js.undefined
    /**
         * The type of job.
         */
    var JobType: js.UndefOr[JobType] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This ARN was created using the CreateKey API action in AWS KMS.
         */
    var KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined
    /**
         * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The Notification object is returned as a part of the response syntax of the DescribeJob action in the JobMetadata data type.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * An array of S3Resource objects. Each S3Resource object represents an Amazon S3 bucket that your transferred data will be exported from or imported into.
         */
    var Resources: js.UndefOr[JobResource] = js.undefined
    /**
         * The role ARN associated with this job. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
         */
    var ShippingDetails: js.UndefOr[ShippingDetails] = js.undefined
    /**
         * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
         */
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
    /**
         * The type of device used with this job.
         */
    var SnowballType: js.UndefOr[SnowballType] = js.undefined
  }
  
  
  trait JobResource extends js.Object {
    /**
         * The Amazon Machine Images (AMIs) associated with this job.
         */
    var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.undefined
    /**
         * The Python-language Lambda functions for this job.
         */
    var LambdaResources: js.UndefOr[LambdaResourceList] = js.undefined
    /**
         * An array of S3Resource objects.
         */
    var S3Resources: js.UndefOr[S3ResourceList] = js.undefined
  }
  
  
  trait KeyRange extends js.Object {
    /**
         * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
         */
    var BeginMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
         */
    var EndMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait LambdaResource extends js.Object {
    /**
         * The array of ARNs for S3Resource objects to trigger the LambdaResource objects associated with this job.
         */
    var EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.undefined
    /**
         * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the associated local Amazon S3 resource.
         */
    var LambdaArn: js.UndefOr[ResourceARN] = js.undefined
  }
  
  
  trait ListClusterJobsRequest extends js.Object {
    /**
         * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
         */
    var ClusterId: ClusterId
    /**
         * The number of JobListEntry objects to return.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * HTTP requests are stateless. To identify what object comes "next" in the list of JobListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListClusterJobsResult extends js.Object {
    /**
         * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
         */
    var JobListEntries: js.UndefOr[JobListEntryList] = js.undefined
    /**
         * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ListClusterJobsResult call, your list of returned jobs will start from this point in the array.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListClustersRequest extends js.Object {
    /**
         * The number of ClusterListEntry objects to return.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * HTTP requests are stateless. To identify what object comes "next" in the list of ClusterListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListClustersResult extends js.Object {
    /**
         * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
         */
    var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined
    /**
         * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListCompatibleImagesRequest extends js.Object {
    /**
         * The maximum number of results for the list of compatible images. Currently, a Snowball Edge device can store 10 AMIs.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * HTTP requests are stateless. To identify what object comes "next" in the list of compatible images, you can specify a value for NextToken as the starting point for your list of returned images.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListCompatibleImagesResult extends js.Object {
    /**
         * A JSON-formatted object that describes a compatible AMI, including the ID and name for a Snowball Edge AMI.
         */
    var CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined
    /**
         * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListJobsRequest extends js.Object {
    /**
         * The number of JobListEntry objects to return.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * HTTP requests are stateless. To identify what object comes "next" in the list of JobListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListJobsResult extends js.Object {
    /**
         * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
         */
    var JobListEntries: js.UndefOr[JobListEntryList] = js.undefined
    /**
         * HTTP requests are stateless. If you use this automatically generated NextToken value in your next ListJobs call, your returned JobListEntry objects will start from this point in the array.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Notification extends js.Object {
    /**
         * The list of job states that will trigger a notification for this job.
         */
    var JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined
    /**
         * Any change in job state will trigger a notification for this job.
         */
    var NotifyAll: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The new SNS TopicArn that you want to associate with this job. You can create Amazon Resource Names (ARNs) for topics by using the CreateTopic Amazon SNS API action. You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the Subscribe AWS Simple Notification Service (SNS) API action.
         */
    var SnsTopicARN: js.UndefOr[SnsTopicARN] = js.undefined
  }
  
  
  trait S3Resource extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
         */
    var BucketArn: js.UndefOr[ResourceARN] = js.undefined
    /**
         * For export jobs, you can provide an optional KeyRange within a specific Amazon S3 bucket. The length of the range is defined at job creation, and has either an inclusive BeginMarker, an inclusive EndMarker, or both. Ranges are UTF-8 binary sorted.
         */
    var KeyRange: js.UndefOr[KeyRange] = js.undefined
  }
  
  
  trait Shipment extends js.Object {
    /**
         * Status information for a shipment.
         */
    var Status: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snowball as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
         */
    var TrackingNumber: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ShippingDetails extends js.Object {
    /**
         * The Status and TrackingNumber values for a Snowball being returned to AWS for a particular job.
         */
    var InboundShipment: js.UndefOr[Shipment] = js.undefined
    /**
         * The Status and TrackingNumber values for a Snowball being delivered to the address that you specified for a particular job.
         */
    var OutboundShipment: js.UndefOr[Shipment] = js.undefined
    /**
         * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.  
         */
    var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
       */
    def cancelCluster(): awsDashSdkLib.libRequestMod.Request[CancelClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
       */
    def cancelCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
       */
    def cancelCluster(params: CancelClusterRequest): awsDashSdkLib.libRequestMod.Request[CancelClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
       */
    def cancelCluster(
      params: CancelClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
       */
    def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
       */
    def cancelJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
       */
    def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
       */
    def cancelJob(
      params: CancelJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
       */
    def createAddress(): awsDashSdkLib.libRequestMod.Request[CreateAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
       */
    def createAddress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAddressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
       */
    def createAddress(params: CreateAddressRequest): awsDashSdkLib.libRequestMod.Request[CreateAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
       */
    def createAddress(
      params: CreateAddressRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAddressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
       */
    def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
       */
    def createCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
       */
    def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
       */
    def createCluster(
      params: CreateClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
       */
    def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
       */
    def createJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
       */
    def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
       */
    def createJob(
      params: CreateJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Takes an AddressId and returns specific details about that address in the form of an Address object.
       */
    def describeAddress(): awsDashSdkLib.libRequestMod.Request[DescribeAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Takes an AddressId and returns specific details about that address in the form of an Address object.
       */
    def describeAddress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAddressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Takes an AddressId and returns specific details about that address in the form of an Address object.
       */
    def describeAddress(params: DescribeAddressRequest): awsDashSdkLib.libRequestMod.Request[DescribeAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Takes an AddressId and returns specific details about that address in the form of an Address object.
       */
    def describeAddress(
      params: DescribeAddressRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAddressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
       */
    def describeAddresses(): awsDashSdkLib.libRequestMod.Request[DescribeAddressesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
       */
    def describeAddresses(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAddressesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAddressesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
       */
    def describeAddresses(params: DescribeAddressesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAddressesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
       */
    def describeAddresses(
      params: DescribeAddressesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAddressesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAddressesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
       */
    def describeCluster(): awsDashSdkLib.libRequestMod.Request[DescribeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
       */
    def describeCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
       */
    def describeCluster(params: DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[DescribeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
       */
    def describeCluster(
      params: DescribeClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific job including shipping information, job status, and other important metadata. 
       */
    def describeJob(): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific job including shipping information, job status, and other important metadata. 
       */
    def describeJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific job including shipping information, job status, and other important metadata. 
       */
    def describeJob(params: DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific job including shipping information, job status, and other important metadata. 
       */
    def describeJob(
      params: DescribeJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
       */
    def getJobManifest(): awsDashSdkLib.libRequestMod.Request[GetJobManifestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
       */
    def getJobManifest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobManifestResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobManifestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
       */
    def getJobManifest(params: GetJobManifestRequest): awsDashSdkLib.libRequestMod.Request[GetJobManifestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
       */
    def getJobManifest(
      params: GetJobManifestRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobManifestResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobManifestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
       */
    def getJobUnlockCode(): awsDashSdkLib.libRequestMod.Request[GetJobUnlockCodeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
       */
    def getJobUnlockCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobUnlockCodeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobUnlockCodeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
       */
    def getJobUnlockCode(params: GetJobUnlockCodeRequest): awsDashSdkLib.libRequestMod.Request[GetJobUnlockCodeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
       */
    def getJobUnlockCode(
      params: GetJobUnlockCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobUnlockCodeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobUnlockCodeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
       */
    def getSnowballUsage(): awsDashSdkLib.libRequestMod.Request[GetSnowballUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
       */
    def getSnowballUsage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSnowballUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSnowballUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
       */
    def getSnowballUsage(params: GetSnowballUsageRequest): awsDashSdkLib.libRequestMod.Request[GetSnowballUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
       */
    def getSnowballUsage(
      params: GetSnowballUsageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSnowballUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSnowballUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
       */
    def listClusterJobs(): awsDashSdkLib.libRequestMod.Request[ListClusterJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
       */
    def listClusterJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClusterJobsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClusterJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
       */
    def listClusterJobs(params: ListClusterJobsRequest): awsDashSdkLib.libRequestMod.Request[ListClusterJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
       */
    def listClusterJobs(
      params: ListClusterJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClusterJobsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClusterJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
       */
    def listClusters(): awsDashSdkLib.libRequestMod.Request[ListClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
       */
    def listClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
       */
    def listClusters(params: ListClustersRequest): awsDashSdkLib.libRequestMod.Request[ListClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
       */
    def listClusters(
      params: ListClustersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
       */
    def listCompatibleImages(): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
       */
    def listCompatibleImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCompatibleImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
       */
    def listCompatibleImages(params: ListCompatibleImagesRequest): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
       */
    def listCompatibleImages(
      params: ListCompatibleImagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCompatibleImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
       */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
       */
    def listJobs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
       */
    def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
       */
    def listJobs(
      params: ListJobsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
       */
    def updateCluster(): awsDashSdkLib.libRequestMod.Request[UpdateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
       */
    def updateCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
       */
    def updateCluster(params: UpdateClusterRequest): awsDashSdkLib.libRequestMod.Request[UpdateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
       */
    def updateCluster(
      params: UpdateClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
       */
    def updateJob(): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
       */
    def updateJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
       */
    def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
       */
    def updateJob(
      params: UpdateJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateClusterRequest extends js.Object {
    /**
         * The ID of the updated Address object.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The cluster ID of the cluster that you want to update, for example CID123e4567-e89b-12d3-a456-426655440000.
         */
    var ClusterId: ClusterId
    /**
         * The updated description of this cluster.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The new or updated Notification object.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * The updated arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
         */
    var Resources: js.UndefOr[JobResource] = js.undefined
    /**
         * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use the CreateRole API action in AWS Identity and Access Management (IAM).
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The updated shipping option value of this cluster's ShippingDetails object.
         */
    var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
  }
  
  
  trait UpdateClusterResult extends js.Object
  
  
  trait UpdateJobRequest extends js.Object {
    /**
         * The ID of the updated Address object.
         */
    var AddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The updated description of this job's JobMetadata object.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The updated ID for the forwarding address for a job. This field is not supported in most regions.
         */
    var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
    /**
         * The job ID of the job that you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
         */
    var JobId: JobId
    /**
         * The new or updated Notification object.
         */
    var Notification: js.UndefOr[Notification] = js.undefined
    /**
         * The updated JobResource object, or the updated JobResource object. 
         */
    var Resources: js.UndefOr[JobResource] = js.undefined
    /**
         * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the CreateRoleAWS Identity and Access Management (IAM) API action.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The updated shipping option value of this job's ShippingDetails object.
         */
    var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    /**
         * The updated SnowballCapacityPreference of this job's JobMetadata object. The 50 TB Snowballs are only available in the US regions.
         */
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
  }
  
  
  trait UpdateJobResult extends js.Object
  
  val TypesNs: this.type = js.native
  type AddressId = java.lang.String
  type AddressList = js.Array[Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[ClusterListEntry]
  type ClusterState = awsDashSdkLib.awsDashSdkLibStrings.AwaitingQuorum | awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.InUse | awsDashSdkLib.awsDashSdkLibStrings.Complete | awsDashSdkLib.awsDashSdkLibStrings.Cancelled | java.lang.String
  type CompatibleImageList = js.Array[CompatibleImage]
  type Ec2AmiResourceList = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[JobListEntry]
  type JobMetadataList = js.Array[JobMetadata]
  type JobState = awsDashSdkLib.awsDashSdkLibStrings.New | awsDashSdkLib.awsDashSdkLibStrings.PreparingAppliance | awsDashSdkLib.awsDashSdkLibStrings.PreparingShipment | awsDashSdkLib.awsDashSdkLibStrings.InTransitToCustomer | awsDashSdkLib.awsDashSdkLibStrings.WithCustomer | awsDashSdkLib.awsDashSdkLibStrings.InTransitToAWS | awsDashSdkLib.awsDashSdkLibStrings.WithAWSSortingFacility | awsDashSdkLib.awsDashSdkLibStrings.WithAWS | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Complete | awsDashSdkLib.awsDashSdkLibStrings.Cancelled | awsDashSdkLib.awsDashSdkLibStrings.Listing | awsDashSdkLib.awsDashSdkLibStrings.Pending | java.lang.String
  type JobStateList = js.Array[JobState]
  type JobType = awsDashSdkLib.awsDashSdkLibStrings.IMPORT | awsDashSdkLib.awsDashSdkLibStrings.EXPORT | awsDashSdkLib.awsDashSdkLibStrings.LOCAL_USE | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[LambdaResource]
  type ListLimit = scala.Double
  type Long = scala.Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[S3Resource]
  type ShippingOption = awsDashSdkLib.awsDashSdkLibStrings.SECOND_DAY | awsDashSdkLib.awsDashSdkLibStrings.NEXT_DAY | awsDashSdkLib.awsDashSdkLibStrings.EXPRESS | awsDashSdkLib.awsDashSdkLibStrings.STANDARD | java.lang.String
  type SnowballCapacity = awsDashSdkLib.awsDashSdkLibStrings.T50 | awsDashSdkLib.awsDashSdkLibStrings.T80 | awsDashSdkLib.awsDashSdkLibStrings.T100 | awsDashSdkLib.awsDashSdkLibStrings.NoPreference | java.lang.String
  type SnowballType = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | awsDashSdkLib.awsDashSdkLibStrings.EDGE | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-06-30` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

