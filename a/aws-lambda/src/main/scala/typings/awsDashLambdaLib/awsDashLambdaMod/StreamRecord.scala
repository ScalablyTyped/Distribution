package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[scala.Double] = js.undefined
  var Keys: js.UndefOr[org.scalablytyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var NewImage: js.UndefOr[org.scalablytyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var OldImage: js.UndefOr[org.scalablytyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var SequenceNumber: js.UndefOr[java.lang.String] = js.undefined
  var SizeBytes: js.UndefOr[scala.Double] = js.undefined
  var StreamViewType: js.UndefOr[
    awsDashLambdaLib.awsDashLambdaLibStrings.KEYS_ONLY | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.OLD_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_AND_OLD_IMAGES
  ] = js.undefined
}

object StreamRecord {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: scala.Int | scala.Double = null,
    Keys: org.scalablytyped.runtime.StringDictionary[AttributeValue] = null,
    NewImage: org.scalablytyped.runtime.StringDictionary[AttributeValue] = null,
    OldImage: org.scalablytyped.runtime.StringDictionary[AttributeValue] = null,
    SequenceNumber: java.lang.String = null,
    SizeBytes: scala.Int | scala.Double = null,
    StreamViewType: awsDashLambdaLib.awsDashLambdaLibStrings.KEYS_ONLY | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.OLD_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_AND_OLD_IMAGES = null
  ): StreamRecord = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCreationDateTime != null) __obj.updateDynamic("ApproximateCreationDateTime")(ApproximateCreationDateTime.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage)
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    if (SizeBytes != null) __obj.updateDynamic("SizeBytes")(SizeBytes.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRecord]
  }
}

