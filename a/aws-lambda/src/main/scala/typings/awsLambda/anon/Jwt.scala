package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwt extends StObject {
  
  var jwt: Claims
}
object Jwt {
  
  inline def apply(jwt: Claims): Jwt = {
    val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwt]
  }
  
  extension [Self <: Jwt](x: Self) {
    
    inline def setJwt(value: Claims): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
  }
}
