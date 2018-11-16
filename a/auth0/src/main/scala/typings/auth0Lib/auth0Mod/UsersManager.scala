package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "UsersManager")
@js.native
class UsersManager protected () extends js.Object {
  def this(options: UsersOptions) = this()
  def getInfo(accessToken: java.lang.String): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def getInfo(
    accessToken: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]
  ): scala.Unit = js.native
  def impersonate(userId: java.lang.String, settings: ImpersonateSettingOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def impersonate(
    userId: java.lang.String,
    settings: ImpersonateSettingOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

