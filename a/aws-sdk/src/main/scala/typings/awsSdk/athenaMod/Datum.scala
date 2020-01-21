package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datum extends js.Object {
  /**
    * The value of the datum.
    */
  var VarCharValue: js.UndefOr[datumString] = js.native
}

object Datum {
  @scala.inline
  def apply(VarCharValue: datumString = null): Datum = {
    val __obj = js.Dynamic.literal()
    if (VarCharValue != null) __obj.updateDynamic("VarCharValue")(VarCharValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

