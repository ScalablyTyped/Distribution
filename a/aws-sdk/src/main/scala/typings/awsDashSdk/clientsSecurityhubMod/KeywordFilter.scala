package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordFilter extends js.Object {
  /**
    * A value for the keyword.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object KeywordFilter {
  @scala.inline
  def apply(Value: NonEmptyString = null): KeywordFilter = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordFilter]
  }
}

