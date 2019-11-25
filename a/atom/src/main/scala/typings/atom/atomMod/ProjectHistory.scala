package typings.atom.atomMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectHistory extends js.Object {
  var lastOpened: Date
  var paths: js.Array[String]
}

object ProjectHistory {
  @scala.inline
  def apply(lastOpened: Date, paths: js.Array[String]): ProjectHistory = {
    val __obj = js.Dynamic.literal(lastOpened = lastOpened.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectHistory]
  }
}

