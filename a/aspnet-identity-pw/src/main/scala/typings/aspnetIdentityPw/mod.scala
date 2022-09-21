package typings.aspnetIdentityPw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aspnet-identity-pw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashPassword(password: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPassword")(password.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashPassword(password: String, callback: js.Function2[/* err */ Any, /* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashPassword")(password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validatePassword(password: String, hashedPass: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePassword")(password.asInstanceOf[js.Any], hashedPass.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validatePassword(
    password: String,
    hashedPass: String,
    callback: js.Function2[/* err */ Any, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePassword")(password.asInstanceOf[js.Any], hashedPass.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
