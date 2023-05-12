package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualSubtitleLabelOptions extends StObject {
  
  /**
    * The long text format of the subtitle label, such as plain text or rich text.
    */
  var FormatText: js.UndefOr[LongFormatText] = js.undefined
  
  /**
    * The visibility of the subtitle label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object VisualSubtitleLabelOptions {
  
  inline def apply(): VisualSubtitleLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualSubtitleLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualSubtitleLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setFormatText(value: LongFormatText): Self = StObject.set(x, "FormatText", value.asInstanceOf[js.Any])
    
    inline def setFormatTextUndefined: Self = StObject.set(x, "FormatText", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
