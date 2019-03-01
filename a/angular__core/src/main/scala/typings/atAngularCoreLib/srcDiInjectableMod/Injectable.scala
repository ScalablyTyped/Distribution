package typings
package atAngularCoreLib.srcDiInjectableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injectable extends js.Object {
  /**
    * Determines which injectors will provide the injectable,
    * by either associating it with an @NgModule or other `InjectorType`,
    * or by specifying that this injectable should be provided in the
    * 'root' injector, which will be the application-level injector in most apps.
    */
  var providedIn: js.UndefOr[
    atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | scala.Null
  ] = js.undefined
}

object Injectable {
  @scala.inline
  def apply(
    providedIn: atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root = null
  ): Injectable = {
    val __obj = js.Dynamic.literal()
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Injectable]
  }
}

