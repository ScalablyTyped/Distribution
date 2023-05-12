package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedLanguage extends StObject {
  
  /**
    *  2 digit ISO 639-1 code. e.g. en 
    */
  var code: js.UndefOr[Code] = js.undefined
  
  /**
    *  Language display value e.g. ENGLISH 
    */
  var display: js.UndefOr[Display] = js.undefined
  
  /**
    *  Full language description e.g. ENGLISH 
    */
  var language: js.UndefOr[Language] = js.undefined
}
object SupportedLanguage {
  
  inline def apply(): SupportedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedLanguage] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDisplay(value: Display): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
