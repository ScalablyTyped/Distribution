package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthCra extends StObject {
  
  def derive_key(secret: String, salt: String, iterations: Double, keylen: Double): String
  
  def sign(key: String, challenge: String): String
}
object IAuthCra {
  
  inline def apply(derive_key: (String, String, Double, Double) => String, sign: (String, String) => String): IAuthCra = {
    val __obj = js.Dynamic.literal(derive_key = js.Any.fromFunction4(derive_key), sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[IAuthCra]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAuthCra] (val x: Self) extends AnyVal {
    
    inline def setDerive_key(value: (String, String, Double, Double) => String): Self = StObject.set(x, "derive_key", js.Any.fromFunction4(value))
    
    inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
  }
}
