package typings.acmeClient.typesRfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeAbstract extends StObject {
  
  var error: js.UndefOr[js.Object] = js.undefined
  
  var status: pending | processing | valid | invalid
  
  var `type`: String
  
  var url: String
  
  var validated: js.UndefOr[String] = js.undefined
}
object ChallengeAbstract {
  
  inline def apply(status: pending | processing | valid | invalid, `type`: String, url: String): ChallengeAbstract = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAbstract]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeAbstract] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: pending | processing | valid | invalid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: String): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    inline def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
  }
}
