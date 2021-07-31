package typings.auth0.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "UsersManager")
@js.native
class UsersManager[A, U] protected () extends StObject {
  def this(options: UsersOptions) = this()
  
  def getInfo(accessToken: String): js.Promise[User[A, U]] = js.native
  def getInfo(accessToken: String, cb: js.Function2[/* err */ Error, /* user */ User[A, U], Unit]): Unit = js.native
  
  def impersonate(userId: String, settings: ImpersonateSettingOptions): js.Promise[js.Any] = js.native
  def impersonate(
    userId: String,
    settings: ImpersonateSettingOptions,
    cb: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
}
