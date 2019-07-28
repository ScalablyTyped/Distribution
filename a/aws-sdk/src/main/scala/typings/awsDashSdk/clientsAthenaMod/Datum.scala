package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  /**
    * The value of the datum.
    */
  var VarCharValue: js.UndefOr[datumString] = js.undefined
}

object Datum {
  @scala.inline
  def apply(VarCharValue: datumString = null): Datum = {
    val __obj = js.Dynamic.literal()
    if (VarCharValue != null) __obj.updateDynamic("VarCharValue")(VarCharValue)
    __obj.asInstanceOf[Datum]
  }
}

