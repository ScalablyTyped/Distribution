package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryChannel extends js.Object {
  /**
    * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
    */
  var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined
  /**
    * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that has the desired name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  /**
    * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history files. If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon S3 Bucket in the AWS Config Developer Guide.
    */
  var s3BucketName: js.UndefOr[String] = js.undefined
  /**
    * The prefix for the specified Amazon S3 bucket.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about configuration changes. If you choose a topic from another account, the topic must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon SNS Topic in the AWS Config Developer Guide.
    */
  var snsTopicARN: js.UndefOr[String] = js.undefined
}

object DeliveryChannel {
  @scala.inline
  def apply(
    configSnapshotDeliveryProperties: ConfigSnapshotDeliveryProperties = null,
    name: ChannelName = null,
    s3BucketName: String = null,
    s3KeyPrefix: String = null,
    snsTopicARN: String = null
  ): DeliveryChannel = {
    val __obj = js.Dynamic.literal()
    if (configSnapshotDeliveryProperties != null) __obj.updateDynamic("configSnapshotDeliveryProperties")(configSnapshotDeliveryProperties)
    if (name != null) __obj.updateDynamic("name")(name)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix)
    if (snsTopicARN != null) __obj.updateDynamic("snsTopicARN")(snsTopicARN)
    __obj.asInstanceOf[DeliveryChannel]
  }
}

