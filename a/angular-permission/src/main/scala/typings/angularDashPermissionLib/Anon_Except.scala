package typings
package angularDashPermissionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Except extends js.Object {
  var except: js.UndefOr[
    js.Function0[scala.Unit] | java.lang.String | js.Array[java.lang.String] | angularLib.angularMod.angularNs.IPromise[_]
  ] = js.undefined
  var only: js.UndefOr[
    js.Function0[scala.Unit] | java.lang.String | js.Array[java.lang.String] | angularLib.angularMod.angularNs.IPromise[_]
  ] = js.undefined
  var redirectTo: java.lang.String | js.Function0[java.lang.String] | js.Function0[angularDashPermissionLib.angularMod.permissionNs.PermissionRedirectConfigation] | org.scalablytyped.runtime.StringDictionary[angularDashPermissionLib.angularMod.permissionNs.PermissionRedirectConfigation]
}

object Anon_Except {
  @scala.inline
  def apply(
    redirectTo: java.lang.String | js.Function0[java.lang.String] | js.Function0[angularDashPermissionLib.angularMod.permissionNs.PermissionRedirectConfigation] | org.scalablytyped.runtime.StringDictionary[angularDashPermissionLib.angularMod.permissionNs.PermissionRedirectConfigation],
    except: js.Function0[scala.Unit] | java.lang.String | js.Array[java.lang.String] | angularLib.angularMod.angularNs.IPromise[_] = null,
    only: js.Function0[scala.Unit] | java.lang.String | js.Array[java.lang.String] | angularLib.angularMod.angularNs.IPromise[_] = null
  ): Anon_Except = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Except]
  }
}

