package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongFormatText extends StObject {
  
  /**
    * Plain text format.
    */
  var PlainText: js.UndefOr[LongPlainText] = js.undefined
  
  /**
    * Rich text. Examples of rich text include bold, underline, and italics.
    */
  var RichText: js.UndefOr[LongRichText] = js.undefined
}
object LongFormatText {
  
  inline def apply(): LongFormatText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongFormatText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongFormatText] (val x: Self) extends AnyVal {
    
    inline def setPlainText(value: LongPlainText): Self = StObject.set(x, "PlainText", value.asInstanceOf[js.Any])
    
    inline def setPlainTextUndefined: Self = StObject.set(x, "PlainText", js.undefined)
    
    inline def setRichText(value: LongRichText): Self = StObject.set(x, "RichText", value.asInstanceOf[js.Any])
    
    inline def setRichTextUndefined: Self = StObject.set(x, "RichText", js.undefined)
  }
}
