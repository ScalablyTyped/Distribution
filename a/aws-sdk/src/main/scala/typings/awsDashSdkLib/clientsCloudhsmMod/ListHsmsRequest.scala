package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHsmsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListHsms. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListHsmsRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null): ListHsmsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHsmsRequest]
  }
}

