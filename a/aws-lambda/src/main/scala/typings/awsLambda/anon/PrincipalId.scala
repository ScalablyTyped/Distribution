package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalId extends StObject {
  
  var principalId: String
}
object PrincipalId {
  
  inline def apply(principalId: String): PrincipalId = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrincipalId] (val x: Self) extends AnyVal {
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
  }
}
