package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementResult extends js.Object {
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.native
}

object ExecuteStatementResult {
  @scala.inline
  def apply(FirstPage: Page = null): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    if (FirstPage != null) __obj.updateDynamic("FirstPage")(FirstPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementResult]
  }
}

