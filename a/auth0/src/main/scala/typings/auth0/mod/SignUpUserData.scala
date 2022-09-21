package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignUpUserData
  extends StObject
     with UserData[AppMetadata, UserMetadata] {
  
  var connection: js.UndefOr[String] = js.undefined
}
object SignUpUserData {
  
  inline def apply(): SignUpUserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignUpUserData]
  }
  
  extension [Self <: SignUpUserData](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
  }
}
