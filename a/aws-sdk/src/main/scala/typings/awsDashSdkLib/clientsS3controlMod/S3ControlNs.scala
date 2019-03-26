package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/s3control", "S3Control")
@js.native
object S3ControlNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DeletePublicAccessBlockRequest extends js.Object {
    /**
      * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to remove.
      */
    var AccountId: awsDashSdkLib.clientsS3controlMod.S3ControlNs.AccountId
  }
  
  trait GetPublicAccessBlockOutput extends js.Object {
    /**
      * The Public Access Block configuration currently in effect for this Amazon Web Services account.
      */
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
  }
  
  trait GetPublicAccessBlockRequest extends js.Object {
    /**
      * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to retrieve.
      */
    var AccountId: awsDashSdkLib.clientsS3controlMod.S3ControlNs.AccountId
  }
  
  trait PublicAccessBlockConfiguration extends js.Object {
    /**
      * Specifies whether Amazon S3 should block public ACLs for buckets in this account. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.   PUT Object calls will fail if the request includes an object ACL.   Note that enabling this setting doesn't affect existing policies or ACLs.
      */
    var BlockPublicAcls: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Note that enabling this setting doesn't affect existing bucket policies.
      */
    var BlockPublicPolicy: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they contain.  Note that enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
      */
    var IgnorePublicAcls: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. If this element is set to TRUE, then only the bucket owner and AWS Services can access buckets with public policies. Note that enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. 
      */
    var RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
  }
  
  trait PutPublicAccessBlockRequest extends js.Object {
    /**
      * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
      */
    var AccountId: awsDashSdkLib.clientsS3controlMod.S3ControlNs.AccountId
    /**
      * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
      */
    var PublicAccessBlockConfiguration: awsDashSdkLib.clientsS3controlMod.S3ControlNs.PublicAccessBlockConfiguration
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Removes the Public Access Block configuration for an Amazon Web Services account.
      */
    def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicAccessBlock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the Public Access Block configuration for an Amazon Web Services account.
      */
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicAccessBlock(
      params: DeletePublicAccessBlockRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Public Access Block configuration for an Amazon Web Services account.
      */
    def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicAccessBlock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicAccessBlockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Public Access Block configuration for an Amazon Web Services account.
      */
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicAccessBlock(
      params: GetPublicAccessBlockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicAccessBlockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
      */
    def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPublicAccessBlock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
      */
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPublicAccessBlock(
      params: PutPublicAccessBlockRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountId = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions with ClientApiVersions
  type Setting = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-20`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

