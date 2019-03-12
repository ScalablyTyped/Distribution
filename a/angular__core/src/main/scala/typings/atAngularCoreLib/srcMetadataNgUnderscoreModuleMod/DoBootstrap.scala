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
  def apply(ngDoBootstrap: atAngularCoreLib.srcApplicationUnderscoreRefMod.ApplicationRef => scala.Unit): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1(ngDoBootstrap))
  
    __obj.asInstanceOf[DoBootstrap]
  }
}

