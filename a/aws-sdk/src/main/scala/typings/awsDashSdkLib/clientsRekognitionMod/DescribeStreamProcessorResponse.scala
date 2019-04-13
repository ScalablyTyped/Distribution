package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamProcessorResponse extends js.Object {
  /**
    * Date and time the stream processor was created
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
  /**
    * Kinesis video stream that provides the source streaming video.
    */
  var Input: js.UndefOr[StreamProcessorInput] = js.undefined
  /**
    * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
    */
  var LastUpdateTimestamp: js.UndefOr[DateTime] = js.undefined
  /**
    * Name of the stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.undefined
  /**
    * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
    */
  var Output: js.UndefOr[StreamProcessorOutput] = js.undefined
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: js.UndefOr[StreamProcessorSettings] = js.undefined
  /**
    * Current status of the stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
  /**
    * Detailed status message about the stream processor.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * ARN of the stream processor.
    */
  var StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
}

object DescribeStreamProcessorResponse {
  @scala.inline
  def apply(
    CreationTimestamp: DateTime = null,
    Input: StreamProcessorInput = null,
    LastUpdateTimestamp: DateTime = null,
    Name: StreamProcessorName = null,
    Output: StreamProcessorOutput = null,
    RoleArn: RoleArn = null,
    Settings: StreamProcessorSettings = null,
    Status: StreamProcessorStatus = null,
    StatusMessage: String = null,
    StreamProcessorArn: StreamProcessorArn = null
  ): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Input != null) __obj.updateDynamic("Input")(Input)
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Output != null) __obj.updateDynamic("Output")(Output)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (StreamProcessorArn != null) __obj.updateDynamic("StreamProcessorArn")(StreamProcessorArn)
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
}

