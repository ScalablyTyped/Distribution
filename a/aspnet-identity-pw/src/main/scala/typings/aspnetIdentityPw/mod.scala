package typings.aspnetIdentityPw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aspnet-identity-pw", "hashPassword")
  @js.native
  def hashPassword(password: String): String = js.native
  @JSImport("aspnet-identity-pw", "hashPassword")
  @js.native
  def hashPassword(password: String, callback: js.Function2[/* err */ js.Any, /* result */ String, Unit]): Unit = js.native
  
  @JSImport("aspnet-identity-pw", "validatePassword")
  @js.native
  def validatePassword(password: String, hashedPass: String): Boolean = js.native
  @JSImport("aspnet-identity-pw", "validatePassword")
  @js.native
  def validatePassword(
    password: String,
    hashedPass: String,
    callback: js.Function2[/* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
}
