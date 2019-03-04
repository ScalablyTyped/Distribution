package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animate extends js.Object {
  var args: js.Array[_]
  var `type`: java.lang.String
}

object Animate {
  @scala.inline
  def apply(args: js.Array[_], `type`: java.lang.String): Animate = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Animate]
  }
}

