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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserData] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
