package typings.awsLambda.dynamodbStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.KEYS_ONLY
import typings.awsLambda.awsLambdaStrings.NEW_AND_OLD_IMAGES
import typings.awsLambda.awsLambdaStrings.NEW_IMAGE
import typings.awsLambda.awsLambdaStrings.OLD_IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.native
  var Keys: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var NewImage: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var OldImage: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var SequenceNumber: js.UndefOr[String] = js.native
  var SizeBytes: js.UndefOr[Double] = js.native
  var StreamViewType: js.UndefOr[KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES] = js.native
}

object StreamRecord {
  @scala.inline
  def apply(): StreamRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamRecord]
  }
  @scala.inline
  implicit class StreamRecordOps[Self <: StreamRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproximateCreationDateTime(value: Double): Self = this.set("ApproximateCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateCreationDateTime: Self = this.set("ApproximateCreationDateTime", js.undefined)
    @scala.inline
    def setKeys(value: StringDictionary[AttributeValue]): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("Keys", js.undefined)
    @scala.inline
    def setNewImage(value: StringDictionary[AttributeValue]): Self = this.set("NewImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewImage: Self = this.set("NewImage", js.undefined)
    @scala.inline
    def setOldImage(value: StringDictionary[AttributeValue]): Self = this.set("OldImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldImage: Self = this.set("OldImage", js.undefined)
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
    @scala.inline
    def setSizeBytes(value: Double): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeBytes: Self = this.set("SizeBytes", js.undefined)
    @scala.inline
    def setStreamViewType(value: KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
  }
  
}

