package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteStatementResult extends js.Object {
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.undefined
}

object ExecuteStatementResult {
  @scala.inline
  def apply(FirstPage: Page = null): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    if (FirstPage != null) __obj.updateDynamic("FirstPage")(FirstPage)
    __obj.asInstanceOf[ExecuteStatementResult]
  }
}

