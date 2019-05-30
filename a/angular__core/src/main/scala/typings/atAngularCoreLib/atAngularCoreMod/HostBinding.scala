package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostBinding extends js.Object {
  /**
    * The DOM property that is bound to a data property.
    */
  var hostPropertyName: js.UndefOr[java.lang.String] = js.undefined
}

object HostBinding {
  @scala.inline
  def apply(hostPropertyName: java.lang.String = null): HostBinding = {
    val __obj = js.Dynamic.literal()
    if (hostPropertyName != null) __obj.updateDynamic("hostPropertyName")(hostPropertyName)
    __obj.asInstanceOf[HostBinding]
  }
}

