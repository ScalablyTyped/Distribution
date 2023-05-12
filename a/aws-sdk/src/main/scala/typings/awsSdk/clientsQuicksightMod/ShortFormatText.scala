package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortFormatText extends StObject {
  
  /**
    * Plain text format.
    */
  var PlainText: js.UndefOr[ShortPlainText] = js.undefined
  
  /**
    * Rich text. Examples of rich text include bold, underline, and italics.
    */
  var RichText: js.UndefOr[ShortRichText] = js.undefined
}
object ShortFormatText {
  
  inline def apply(): ShortFormatText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortFormatText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortFormatText] (val x: Self) extends AnyVal {
    
    inline def setPlainText(value: ShortPlainText): Self = StObject.set(x, "PlainText", value.asInstanceOf[js.Any])
    
    inline def setPlainTextUndefined: Self = StObject.set(x, "PlainText", js.undefined)
    
    inline def setRichText(value: ShortRichText): Self = StObject.set(x, "RichText", value.asInstanceOf[js.Any])
    
    inline def setRichTextUndefined: Self = StObject.set(x, "RichText", js.undefined)
  }
}
