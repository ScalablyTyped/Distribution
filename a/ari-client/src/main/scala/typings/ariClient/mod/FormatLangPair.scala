package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatLangPair extends StObject {
  
  /**
    * Format.
    */
  var format: String = js.native
  
  /**
    * Language.
    */
  var language: String = js.native
}
object FormatLangPair {
  
  @scala.inline
  def apply(format: String, language: String): FormatLangPair = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLangPair]
  }
  
  @scala.inline
  implicit class FormatLangPairMutableBuilder[Self <: FormatLangPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
