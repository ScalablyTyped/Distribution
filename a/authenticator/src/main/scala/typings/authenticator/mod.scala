package typings.authenticator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("authenticator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")().asInstanceOf[String]
  
  inline def generateToken(formattedKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateToken")(formattedKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateTotpUri(
    formattedKey: String,
    accountName: String,
    issuer: String,
    algorithm: String,
    digits: Double,
    period: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTotpUri")(formattedKey.asInstanceOf[js.Any], accountName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyToken(formattedKey: String, formattedToken: String): VerifyResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyToken")(formattedKey.asInstanceOf[js.Any], formattedToken.asInstanceOf[js.Any])).asInstanceOf[VerifyResult | Null]
  
  trait VerifyResult extends StObject {
    
    var delta: Double
  }
  object VerifyResult {
    
    inline def apply(delta: Double): VerifyResult = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyResult]
    }
    
    extension [Self <: VerifyResult](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    }
  }
}
