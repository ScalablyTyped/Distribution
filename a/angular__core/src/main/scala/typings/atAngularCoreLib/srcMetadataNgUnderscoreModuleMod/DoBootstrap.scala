package typings
package atAngularCoreLib.srcMetadataNgUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoBootstrap extends js.Object {
  def ngDoBootstrap(appRef: atAngularCoreLib.srcApplicationUnderscoreRefMod.ApplicationRef): scala.Unit
}

object DoBootstrap {
  @scala.inline
  def apply(
    ngDoBootstrap: js.Function1[atAngularCoreLib.srcApplicationUnderscoreRefMod.ApplicationRef, scala.Unit]
  ): DoBootstrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngDoBootstrap")(ngDoBootstrap)
    __obj.asInstanceOf[DoBootstrap]
  }
}

