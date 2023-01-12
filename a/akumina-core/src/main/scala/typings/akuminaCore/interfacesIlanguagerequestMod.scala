package typings.akuminaCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesIlanguagerequestMod {
  
  trait ILanguageRequest extends StObject {
    
    var languageCode: js.UndefOr[String] = js.undefined
    
    var languageId: Double
  }
  object ILanguageRequest {
    
    inline def apply(languageId: Double): ILanguageRequest = {
      val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILanguageRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILanguageRequest] (val x: Self) extends AnyVal {
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      
      inline def setLanguageId(value: Double): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    }
  }
}
