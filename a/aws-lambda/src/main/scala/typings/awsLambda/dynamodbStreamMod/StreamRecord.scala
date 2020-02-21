package typings.awsLambda.dynamodbStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.KEYS_ONLY
import typings.awsLambda.awsLambdaStrings.NEW_AND_OLD_IMAGES
import typings.awsLambda.awsLambdaStrings.NEW_IMAGE
import typings.awsLambda.awsLambdaStrings.OLD_IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.undefined
  var Keys: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
  var NewImage: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
  var OldImage: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
  var SequenceNumber: js.UndefOr[String] = js.undefined
  var SizeBytes: js.UndefOr[Double] = js.undefined
  var StreamViewType: js.UndefOr[KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES] = js.undefined
}

object StreamRecord {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Int | Double = null,
    Keys: StringDictionary[AttributeValue] = null,
    NewImage: StringDictionary[AttributeValue] = null,
    OldImage: StringDictionary[AttributeValue] = null,
    SequenceNumber: String = null,
    SizeBytes: Int | Double = null,
    StreamViewType: KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES = null
  ): StreamRecord = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCreationDateTime != null) __obj.updateDynamic("ApproximateCreationDateTime")(ApproximateCreationDateTime.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage.asInstanceOf[js.Any])
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (SizeBytes != null) __obj.updateDynamic("SizeBytes")(SizeBytes.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRecord]
  }
}

