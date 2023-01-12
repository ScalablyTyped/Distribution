package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrendmicroConnectorProfileCredentials extends StObject {
  
  /**
    *  The Secret Access Key portion of the credentials. 
    */
  var apiSecretKey: ApiSecretKey
}
object TrendmicroConnectorProfileCredentials {
  
  inline def apply(apiSecretKey: ApiSecretKey): TrendmicroConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiSecretKey = apiSecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendmicroConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrendmicroConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setApiSecretKey(value: ApiSecretKey): Self = StObject.set(x, "apiSecretKey", value.asInstanceOf[js.Any])
  }
}
