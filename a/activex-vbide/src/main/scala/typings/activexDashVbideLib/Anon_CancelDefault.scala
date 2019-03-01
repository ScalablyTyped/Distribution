package typings
package activexDashVbideLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDefault extends js.Object {
  val CancelDefault: scala.Boolean
  val CommandBarControl: js.Any
  val handled: scala.Boolean
}

object Anon_CancelDefault {
  @scala.inline
  def apply(CancelDefault: scala.Boolean, CommandBarControl: js.Any, handled: scala.Boolean): Anon_CancelDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CancelDefault")(CancelDefault)
    __obj.updateDynamic("CommandBarControl")(CommandBarControl)
    __obj.updateDynamic("handled")(handled)
    __obj.asInstanceOf[Anon_CancelDefault]
  }
}

