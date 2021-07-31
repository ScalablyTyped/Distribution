package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bearer extends StObject {
  
  var bearer: String
}
object Bearer {
  
  @scala.inline
  def apply(bearer: String): Bearer = {
    val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearer]
  }
  
  @scala.inline
  implicit class BearerMutableBuilder[Self <: Bearer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
  }
}
