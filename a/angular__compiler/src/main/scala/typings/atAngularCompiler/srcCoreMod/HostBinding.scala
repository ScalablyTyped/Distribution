package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostBinding extends js.Object {
  var hostPropertyName: js.UndefOr[String] = js.undefined
}

object HostBinding {
  @scala.inline
  def apply(hostPropertyName: String = null): HostBinding = {
    val __obj = js.Dynamic.literal()
    if (hostPropertyName != null) __obj.updateDynamic("hostPropertyName")(hostPropertyName)
    __obj.asInstanceOf[HostBinding]
  }
}

