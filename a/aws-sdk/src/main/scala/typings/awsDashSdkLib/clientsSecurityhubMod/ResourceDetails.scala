package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDetails extends js.Object {
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined
  /**
    * Details about an Amazon S3 Bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.undefined
  /**
    * Details about a resource that doesn't have a specific type defined.
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

