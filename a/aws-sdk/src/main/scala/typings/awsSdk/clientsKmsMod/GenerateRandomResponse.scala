package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomResponse extends StObject {
  
  /**
    * The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}
object GenerateRandomResponse {
  
  inline def apply(): GenerateRandomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomResponse]
  }
  
  extension [Self <: GenerateRandomResponse](x: Self) {
    
    inline def setPlaintext(value: PlaintextType): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
  }
}
