package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPHeader extends js.Object {
  /**
    * The name of one of the headers in the sampled web request.
    */
  var Name: js.UndefOr[HeaderName] = js.native
  /**
    * The value of one of the headers in the sampled web request.
    */
  var Value: js.UndefOr[HeaderValue] = js.native
}

object HTTPHeader {
  @scala.inline
  def apply(Name: HeaderName = null, Value: HeaderValue = null): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPHeader]
  }
}

