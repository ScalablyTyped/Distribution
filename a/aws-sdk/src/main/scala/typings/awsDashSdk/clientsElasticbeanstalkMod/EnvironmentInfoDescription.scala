package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentInfoDescription extends js.Object {
  /**
    * The Amazon EC2 Instance ID for this information.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Ec2InstanceId] = js.undefined
  /**
    * The type of information retrieved.
    */
  var InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined
  /**
    * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Message] = js.undefined
  /**
    * The time stamp when this information was retrieved.
    */
  var SampleTimestamp: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SampleTimestamp] = js.undefined
}

object EnvironmentInfoDescription {
  @scala.inline
  def apply(
    Ec2InstanceId: Ec2InstanceId = null,
    InfoType: EnvironmentInfoType = null,
    Message: Message = null,
    SampleTimestamp: SampleTimestamp = null
  ): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId)
    if (InfoType != null) __obj.updateDynamic("InfoType")(InfoType.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (SampleTimestamp != null) __obj.updateDynamic("SampleTimestamp")(SampleTimestamp)
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
}

