package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwt extends StObject {
  
  var jwt: Claims
}
object Jwt {
  
  @scala.inline
  def apply(jwt: Claims): Jwt = {
    val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwt]
  }
  
  @scala.inline
  implicit class JwtMutableBuilder[Self <: Jwt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJwt(value: Claims): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
  }
}
