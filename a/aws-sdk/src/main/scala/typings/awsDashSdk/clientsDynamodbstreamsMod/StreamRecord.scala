package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamRecord extends js.Object {
  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var ApproximateCreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var Keys: js.UndefOr[AttributeMap] = js.undefined
  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var NewImage: js.UndefOr[AttributeMap] = js.undefined
  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var OldImage: js.UndefOr[AttributeMap] = js.undefined
  /**
    * The sequence number of the stream record.
    */
  var SequenceNumber: js.UndefOr[typings.awsDashSdk.clientsDynamodbstreamsMod.SequenceNumber] = js.undefined
  /**
    * The size of the stream record, in bytes.
    */
  var SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
    */
  var StreamViewType: js.UndefOr[typings.awsDashSdk.clientsDynamodbstreamsMod.StreamViewType] = js.undefined
}

object StreamRecord {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: _Date = null,
    Keys: AttributeMap = null,
    NewImage: AttributeMap = null,
    OldImage: AttributeMap = null,
    SequenceNumber: SequenceNumber = null,
    SizeBytes: Int | Double = null,
    StreamViewType: StreamViewType = null
  ): StreamRecord = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCreationDateTime != null) __obj.updateDynamic("ApproximateCreationDateTime")(ApproximateCreationDateTime)
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage)
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    if (SizeBytes != null) __obj.updateDynamic("SizeBytes")(SizeBytes.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRecord]
  }
}

