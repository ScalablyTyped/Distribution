package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserData
  extends StObject
     with UserData[AppMetadata, UserMetadata] {
  
  var connection: String
}
object CreateUserData {
  
  inline def apply(connection: String): CreateUserData = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserData]
  }
  
  extension [Self <: CreateUserData](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
