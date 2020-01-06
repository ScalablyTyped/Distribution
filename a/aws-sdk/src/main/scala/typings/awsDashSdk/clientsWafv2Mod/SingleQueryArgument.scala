package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleQueryArgument extends js.Object {
  /**
    * The name of the query argument to inspect.
    */
  var Name: FieldToMatchData = js.native
}

object SingleQueryArgument {
  @scala.inline
  def apply(Name: FieldToMatchData): SingleQueryArgument = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleQueryArgument]
  }
}

