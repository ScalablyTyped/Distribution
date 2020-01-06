package typings.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackFlagProps extends js.Object {
  var isDismissAllowed: js.UndefOr[Boolean] = js.undefined
  var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object FeedbackFlagProps {
  @scala.inline
  def apply(
    isDismissAllowed: js.UndefOr[Boolean] = js.undefined,
    onDismissed: /* repeated */ js.Any => _ = null
  ): FeedbackFlagProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDismissAllowed)) __obj.updateDynamic("isDismissAllowed")(isDismissAllowed.asInstanceOf[js.Any])
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction1(onDismissed))
    __obj.asInstanceOf[FeedbackFlagProps]
  }
}

