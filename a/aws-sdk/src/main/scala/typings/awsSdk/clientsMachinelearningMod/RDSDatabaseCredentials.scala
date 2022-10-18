package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSDatabaseCredentials extends StObject {
  
  var Password: RDSDatabasePassword
  
  var Username: RDSDatabaseUsername
}
object RDSDatabaseCredentials {
  
  inline def apply(Password: RDSDatabasePassword, Username: RDSDatabaseUsername): RDSDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDatabaseCredentials]
  }
  
  extension [Self <: RDSDatabaseCredentials](x: Self) {
    
    inline def setPassword(value: RDSDatabasePassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: RDSDatabaseUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
