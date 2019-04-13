package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHapgsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListHapgs. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListHapgsRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null): ListHapgsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHapgsRequest]
  }
}

