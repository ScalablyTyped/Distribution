package typings.authenticator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("authenticator", "generateKey")
  @js.native
  def generateKey(): String = js.native
  
  @JSImport("authenticator", "generateToken")
  @js.native
  def generateToken(formattedKey: String): String = js.native
  
  @JSImport("authenticator", "generateTotpUri")
  @js.native
  def generateTotpUri(
    formattedKey: String,
    accountName: String,
    issuer: String,
    algorithm: String,
    digits: Double,
    period: Double
  ): String = js.native
  
  @JSImport("authenticator", "verifyToken")
  @js.native
  def verifyToken(formattedKey: String, formattedToken: String): VerifyResult | Null = js.native
  
  @js.native
  trait VerifyResult extends StObject {
    
    var delta: Double = js.native
  }
  object VerifyResult {
    
    @scala.inline
    def apply(delta: Double): VerifyResult = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyResult]
    }
    
    @scala.inline
    implicit class VerifyResultMutableBuilder[Self <: VerifyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    }
  }
}
