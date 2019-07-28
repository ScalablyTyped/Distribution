package typings.angularDashPermission

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import typings.angularDashPermission.angularMod.permissionNs.PermissionRedirectConfigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Except extends js.Object {
  var except: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.undefined
  var only: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.undefined
  var redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
}

object Anon_Except {
  @scala.inline
  def apply(
    redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation],
    except: js.Function0[Unit] | String | js.Array[String] | IPromise[_] = null,
    only: js.Function0[Unit] | String | js.Array[String] | IPromise[_] = null
  ): Anon_Except = {
    val __obj = js.Dynamic.literal(redirectTo = redirectTo.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Except]
  }
}

