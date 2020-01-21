package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animate extends js.Object {
  var args: js.Array[_]
  var `type`: String
}

object Animate {
  @scala.inline
  def apply(args: js.Array[_], `type`: String): Animate = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
}

