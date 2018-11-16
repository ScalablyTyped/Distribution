package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snowball
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Snowball: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSnowballMod.SnowballNs.ClientConfiguration = js.native
  /**
     * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
     */
  def cancelCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
     */
  def cancelCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
     */
  def cancelCluster(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status. You'll have at least an hour after creating a cluster job to cancel it.
     */
  def cancelCluster(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
     */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
     */
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
     */
  def cancelJob(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the specified job. You can only cancel a job before its JobState value changes to PreparingAppliance. Requesting the ListJobs or DescribeJob action returns a job's JobState as part of the response element data returned.
     */
  def cancelJob(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CancelJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
     */
  def createAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
     */
  def createAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
     */
  def createAddress(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.
     */
  def createAddress(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     */
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     */
  def createCluster(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     */
  def createCluster(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
     */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
     */
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
     */
  def createJob(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the clusterId value; the other job attributes are inherited from the cluster. 
     */
  def createJob(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.CreateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes an AddressId and returns specific details about that address in the form of an Address object.
     */
  def describeAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes an AddressId and returns specific details about that address in the form of an Address object.
     */
  def describeAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes an AddressId and returns specific details about that address in the form of an Address object.
     */
  def describeAddress(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes an AddressId and returns specific details about that address in the form of an Address object.
     */
  def describeAddress(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
     */
  def describeAddresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
     */
  def describeAddresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
     */
  def describeAddresses(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.
     */
  def describeAddresses(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeAddressesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
     */
  def describeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
     */
  def describeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
     */
  def describeCluster(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific cluster including shipping information, cluster status, and other important metadata.
     */
  def describeCluster(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific job including shipping information, job status, and other important metadata. 
     */
  def describeJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific job including shipping information, job status, and other important metadata. 
     */
  def describeJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific job including shipping information, job status, and other important metadata. 
     */
  def describeJob(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific job including shipping information, job status, and other important metadata. 
     */
  def describeJob(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.DescribeJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
     */
  def getJobManifest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
     */
  def getJobManifest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
     */
  def getJobManifest(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the GetJobManifest action. The manifest is an encrypted file that you can download after your job enters the WithCustomer status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job. The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.
     */
  def getJobManifest(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobManifestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
     */
  def getJobUnlockCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
     */
  def getJobUnlockCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
     */
  def getJobUnlockCode(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the UnlockCode code value for the specified job. A particular UnlockCode value can be accessed for up to 90 days after the associated job has been created. The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time. As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.
     */
  def getJobUnlockCode(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetJobUnlockCodeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
     */
  def getSnowballUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
     */
  def getSnowballUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
     */
  def getSnowballUsage(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use. The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.
     */
  def getSnowballUsage(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.GetSnowballUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     */
  def listClusterJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     */
  def listClusterJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     */
  def listClusterJobs(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     */
  def listClusterJobs(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClusterJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
     */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
     */
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
     */
  def listClusters(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterListEntry objects of the specified length. Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
     */
  def listClusters(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
     */
  def listCompatibleImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
     */
  def listCompatibleImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
     */
  def listCompatibleImages(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.
     */
  def listCompatibleImages(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListCompatibleImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
     */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
     */
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
     */
  def listJobs(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of JobListEntry objects of the specified length. Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.
     */
  def listJobs(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
     */
  def updateCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
     */
  def updateCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
     */
  def updateCluster(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.
     */
  def updateCluster(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
     */
  def updateJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
     */
  def updateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
     */
  def updateJob(params: awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * While a job's JobState value is New, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.
     */
  def updateJob(
    params: awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnowballMod.SnowballNs.UpdateJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

