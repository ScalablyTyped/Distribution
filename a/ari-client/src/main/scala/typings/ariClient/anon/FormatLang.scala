package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatLang extends StObject {
  
  var format: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
}
object FormatLang {
  
  @scala.inline
  def apply(): FormatLang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLang]
  }
  
  @scala.inline
  implicit class FormatLangMutableBuilder[Self <: FormatLang] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
  }
}
