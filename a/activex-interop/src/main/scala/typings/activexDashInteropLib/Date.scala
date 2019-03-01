package typings
package activexDashInteropLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  def getVarDate(): VarDate
}

object Date {
  @scala.inline
  def apply(getVarDate: js.Function0[VarDate]): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVarDate")(getVarDate)
    __obj.asInstanceOf[Date]
  }
}

