package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleHeader extends js.Object {
  /**
    * The name of the query header to inspect.
    */
  var Name: FieldToMatchData = js.native
}

object SingleHeader {
  @scala.inline
  def apply(Name: FieldToMatchData): SingleHeader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleHeader]
  }
}

