package typings.angularCore.anon

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameTarget extends js.Object {
  var name: String
  var target: Document
}

object NameTarget {
  @scala.inline
  def apply(name: String, target: Document): NameTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTarget]
  }
}

