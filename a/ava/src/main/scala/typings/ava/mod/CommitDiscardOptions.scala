package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitDiscardOptions extends js.Object {
  /**
  	 * Whether the logs should be included in those of the parent test.
  	 */
  var retainLogs: js.UndefOr[Boolean] = js.undefined
}

object CommitDiscardOptions {
  @scala.inline
  def apply(retainLogs: js.UndefOr[Boolean] = js.undefined): CommitDiscardOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(retainLogs)) __obj.updateDynamic("retainLogs")(retainLogs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitDiscardOptions]
  }
}

