package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checkable extends js.Object {
  var checkable: scala.Boolean
  var openAnimation: Anon_AppearDone
  var showIcon: scala.Boolean
}

object Anon_Checkable {
  @scala.inline
  def apply(checkable: scala.Boolean, openAnimation: Anon_AppearDone, showIcon: scala.Boolean): Anon_Checkable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkable")(checkable)
    __obj.updateDynamic("openAnimation")(openAnimation)
    __obj.updateDynamic("showIcon")(showIcon)
    __obj.asInstanceOf[Anon_Checkable]
  }
}

