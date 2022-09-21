package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "TokensManager")
@js.native
open class TokensManager protected () extends StObject {
  def this(options: TokensManagerOptions) = this()
  
  def revokeRefreshToken(data: RevokeRefreshTokenOptions): js.Promise[Unit] = js.native
  def revokeRefreshToken(data: RevokeRefreshTokenOptions, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
