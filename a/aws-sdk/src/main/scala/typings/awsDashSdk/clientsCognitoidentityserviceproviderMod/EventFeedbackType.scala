package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventFeedbackType extends js.Object {
  /**
    * The event feedback date.
    */
  var FeedbackDate: js.UndefOr[DateType] = js.native
  /**
    * The event feedback value.
    */
  var FeedbackValue: FeedbackValueType = js.native
  /**
    * The provider.
    */
  var Provider: StringType = js.native
}

object EventFeedbackType {
  @scala.inline
  def apply(FeedbackValue: FeedbackValueType, Provider: StringType, FeedbackDate: DateType = null): EventFeedbackType = {
    val __obj = js.Dynamic.literal(FeedbackValue = FeedbackValue.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (FeedbackDate != null) __obj.updateDynamic("FeedbackDate")(FeedbackDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFeedbackType]
  }
}

