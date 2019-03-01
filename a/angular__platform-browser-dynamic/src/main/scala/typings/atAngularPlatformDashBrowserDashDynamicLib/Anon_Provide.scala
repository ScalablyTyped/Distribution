package typings
package atAngularPlatformDashBrowserDashDynamicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provide extends js.Object {
  var provide: atAngularCoreLib.atAngularCoreMod.InjectionToken[java.lang.String]
  var useValue: java.lang.String
}

object Anon_Provide {
  @scala.inline
  def apply(
    provide: atAngularCoreLib.atAngularCoreMod.InjectionToken[java.lang.String],
    useValue: java.lang.String
  ): Anon_Provide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provide")(provide)
    __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[Anon_Provide]
  }
}

