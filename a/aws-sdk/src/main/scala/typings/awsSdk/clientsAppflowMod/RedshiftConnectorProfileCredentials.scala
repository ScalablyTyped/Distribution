package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftConnectorProfileCredentials extends StObject {
  
  /**
    *  The password that corresponds to the user name. 
    */
  var password: js.UndefOr[Password] = js.undefined
  
  /**
    *  The name of the user. 
    */
  var username: js.UndefOr[String] = js.undefined
}
object RedshiftConnectorProfileCredentials {
  
  inline def apply(): RedshiftConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
