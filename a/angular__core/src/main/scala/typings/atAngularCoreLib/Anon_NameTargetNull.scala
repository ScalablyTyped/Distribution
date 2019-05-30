package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTargetNull extends js.Object {
  var name: java.lang.String
  var target: stdLib.Window | scala.Null
}

object Anon_NameTargetNull {
  @scala.inline
  def apply(name: java.lang.String, target: stdLib.Window = null): Anon_NameTargetNull = {
    val __obj = js.Dynamic.literal(name = name)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_NameTargetNull]
  }
}

