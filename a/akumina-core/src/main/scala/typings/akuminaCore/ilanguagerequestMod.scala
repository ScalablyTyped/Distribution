package typings.akuminaCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ilanguagerequestMod {
  
  @js.native
  trait ILanguageRequest extends StObject {
    
    var languageCode: js.UndefOr[String] = js.native
    
    var languageId: Double = js.native
  }
  object ILanguageRequest {
    
    @scala.inline
    def apply(languageId: Double): ILanguageRequest = {
      val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILanguageRequest]
    }
    
    @scala.inline
    implicit class ILanguageRequestMutableBuilder[Self <: ILanguageRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      
      @scala.inline
      def setLanguageId(value: Double): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    }
  }
}
