package typings.angularCore

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTarget extends js.Object {
  var name: String
  var target: HTMLElement
}

object AnonNameTarget {
  @scala.inline
  def apply(name: String, target: HTMLElement): AnonNameTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTarget]
  }
}

