package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderData extends js.Object {
  var instance: js.Any
}

object ProviderData {
  @scala.inline
  def apply(instance: js.Any): ProviderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[ProviderData]
  }
}

