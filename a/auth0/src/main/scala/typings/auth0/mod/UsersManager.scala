package typings.auth0.mod

import typings.auth0.anon.Recoverycode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "UsersManager")
@js.native
open class UsersManager[A, U] protected () extends StObject {
  def this(options: UsersOptions) = this()
  
  def deleteAuthenticationMethodById(data: AuthenticationMethodByIdOptions): js.Promise[Unit] = js.native
  def deleteAuthenticationMethodById(data: AuthenticationMethodByIdOptions, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteAuthenticationMethods(data: ObjectWithId): js.Promise[Unit] = js.native
  def deleteAuthenticationMethods(data: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def getAuthenticationMethodById(data: AuthenticationMethodByIdOptions): js.Promise[AuthenticationMethod] = js.native
  def getAuthenticationMethodById(
    data: AuthenticationMethodByIdOptions,
    cb: js.Function2[/* err */ js.Error, /* authenticationMethod */ AuthenticationMethod, Unit]
  ): Unit = js.native
  
  def getAuthenticationMethods(data: ObjectWithId): js.Promise[js.Array[AuthenticationMethod]] = js.native
  def getAuthenticationMethods(
    data: ObjectWithId,
    cb: js.Function2[/* err */ js.Error, /* authenticationMethods */ js.Array[AuthenticationMethod], Unit]
  ): Unit = js.native
  
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
  
  def regenerateRecoveryCode(data: ObjectWithId): js.Promise[Recoverycode] = js.native
  def regenerateRecoveryCode(data: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* res */ Recoverycode, Unit]): Unit = js.native
}
