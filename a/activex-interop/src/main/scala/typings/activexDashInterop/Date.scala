package typings.activexDashInterop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  def getVarDate(): VarDate
}

object Date {
  @scala.inline
  def apply(getVarDate: () => VarDate): Date = {
    val __obj = js.Dynamic.literal(getVarDate = js.Any.fromFunction0(getVarDate))
  
    __obj.asInstanceOf[Date]
  }
}

