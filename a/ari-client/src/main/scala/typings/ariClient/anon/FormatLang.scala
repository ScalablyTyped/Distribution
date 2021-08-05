package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatLang extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
}
object FormatLang {
  
  inline def apply(): FormatLang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLang]
  }
  
  extension [Self <: FormatLang](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
  }
}
