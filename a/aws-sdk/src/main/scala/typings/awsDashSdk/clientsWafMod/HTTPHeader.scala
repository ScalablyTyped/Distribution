package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPHeader extends js.Object {
  /**
    * The name of one of the headers in the sampled web request.
    */
  var Name: js.UndefOr[HeaderName] = js.undefined
  /**
    * The value of one of the headers in the sampled web request.
    */
  var Value: js.UndefOr[HeaderValue] = js.undefined
}

object HTTPHeader {
  @scala.inline
  def apply(Name: HeaderName = null, Value: HeaderValue = null): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[HTTPHeader]
  }
}

