package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandAction extends js.Object {
  var expandAction: java.lang.String
  var showIcon: scala.Boolean
}

object Anon_ExpandAction {
  @scala.inline
  def apply(expandAction: java.lang.String, showIcon: scala.Boolean): Anon_ExpandAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandAction")(expandAction)
    __obj.updateDynamic("showIcon")(showIcon)
    __obj.asInstanceOf[Anon_ExpandAction]
  }
}

