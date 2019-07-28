package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventFeedbackType extends js.Object {
  /**
    * The event feedback date.
    */
  var FeedbackDate: js.UndefOr[DateType] = js.undefined
  /**
    * The event feedback value.
    */
  var FeedbackValue: FeedbackValueType
  /**
    * The provider.
    */
  var Provider: StringType
}

object EventFeedbackType {
  @scala.inline
  def apply(FeedbackValue: FeedbackValueType, Provider: StringType, FeedbackDate: DateType = null): EventFeedbackType = {
    val __obj = js.Dynamic.literal(FeedbackValue = FeedbackValue.asInstanceOf[js.Any], Provider = Provider)
    if (FeedbackDate != null) __obj.updateDynamic("FeedbackDate")(FeedbackDate)
    __obj.asInstanceOf[EventFeedbackType]
  }
}

