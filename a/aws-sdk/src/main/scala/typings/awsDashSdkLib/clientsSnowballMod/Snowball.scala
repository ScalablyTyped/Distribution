package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snowball
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Snowball: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
    */
  def cancelCluster(): awsDashSdkLib.libRequestMod.Request[CancelClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def cancelJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
    */
  def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CancelJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
    */
  def createAddress(): awsDashSdkLib.libRequestMod.Request[CreateAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def createJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
    */
  def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Takes an AddressId and returns specific details about that address in the form of an Address object.
    */
  def describeAddress(): awsDashSdkLib.libRequestMod.Request[DescribeAddressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListClustersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on EDGE, EDGE_C, and EDGE_CG devices. For more information on compatible AMIs, see Using Amazon EC2 Compute Instances in the AWS Snowball Developer Guide.
    */
  def listCompatibleImages(): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCompatibleImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCompatibleImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on EDGE, EDGE_C, and EDGE_CG devices. For more information on compatible AMIs, see Using Amazon EC2 Compute Instances in the AWS Snowball Developer Guide.
    */
  def listCompatibleImages(params: ListCompatibleImagesRequest): awsDashSdkLib.libRequestMod.Request[ListCompatibleImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def listJobs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
    */
  def updateCluster(): awsDashSdkLib.libRequestMod.Request[UpdateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def updateJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
    */
  def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJob(
    params: UpdateJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

