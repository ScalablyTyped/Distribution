package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectHistory extends js.Object {
  var lastOpened: stdLib.Date
  var paths: js.Array[java.lang.String]
}

object ProjectHistory {
  @scala.inline
  def apply(lastOpened: stdLib.Date, paths: js.Array[java.lang.String]): ProjectHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lastOpened")(lastOpened)
    __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[ProjectHistory]
  }
}

