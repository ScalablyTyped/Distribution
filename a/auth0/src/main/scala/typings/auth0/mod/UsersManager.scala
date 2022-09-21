package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "UsersManager")
@js.native
open class UsersManager[A, U] protected () extends StObject {
  def this(options: UsersOptions) = this()
  
  def getInfo(accessToken: String): js.Promise[User[A, U]] = js.native
  def getInfo(accessToken: String, cb: js.Function2[/* err */ js.Error, /* user */ User[A, U], Unit]): Unit = js.native
  
  def getUserOrganizations(data: ObjectWithId): js.Promise[js.Array[Organization]] = js.native
  def getUserOrganizations(data: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* orgs */ js.Array[Organization], Unit]): Unit = js.native
  
  def impersonate(userId: String, settings: ImpersonateSettingOptions): js.Promise[Any] = js.native
  def impersonate(
    userId: String,
    settings: ImpersonateSettingOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
}
