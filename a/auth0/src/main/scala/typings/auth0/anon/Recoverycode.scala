package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recoverycode extends StObject {
  
  var recovery_code: String
}
object Recoverycode {
  
  inline def apply(recovery_code: String): Recoverycode = {
    val __obj = js.Dynamic.literal(recovery_code = recovery_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recoverycode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recoverycode] (val x: Self) extends AnyVal {
    
    inline def setRecovery_code(value: String): Self = StObject.set(x, "recovery_code", value.asInstanceOf[js.Any])
  }
}
