package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The credentials saved by the app.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSavedCredentials extends StObject {
  
  /**
    * The password from that login. May not be present.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The username saved by the last successful login.
    */
  var username: String
}
object ATVSavedCredentials {
  
  inline def apply(username: String): ATVSavedCredentials = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVSavedCredentials]
  }
  
  extension [Self <: ATVSavedCredentials](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
