package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDetails extends js.Object {
  /**
    * The details of an Amazon EC2 instance.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
  /**
    * IAM access key details related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined
  /**
    * The details of an Amazon S3 Bucket.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined
  /**
    * Container details related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.undefined
  /**
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var Other: js.UndefOr[FieldMap] = js.undefined
}

object ResourceDetails {
  @scala.inline
  def apply(
    AwsEc2Instance: AwsEc2InstanceDetails = null,
    AwsIamAccessKey: AwsIamAccessKeyDetails = null,
    AwsS3Bucket: AwsS3BucketDetails = null,
    Container: ContainerDetails = null,
    Other: FieldMap = null
  ): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (AwsEc2Instance != null) __obj.updateDynamic("AwsEc2Instance")(AwsEc2Instance)
    if (AwsIamAccessKey != null) __obj.updateDynamic("AwsIamAccessKey")(AwsIamAccessKey)
    if (AwsS3Bucket != null) __obj.updateDynamic("AwsS3Bucket")(AwsS3Bucket)
    if (Container != null) __obj.updateDynamic("Container")(Container)
    if (Other != null) __obj.updateDynamic("Other")(Other)
    __obj.asInstanceOf[ResourceDetails]
  }
}

