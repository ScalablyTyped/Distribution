package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualTitleLabelOptions extends StObject {
  
  /**
    * The short text format of the title label, such as plain text or rich text.
    */
  var FormatText: js.UndefOr[ShortFormatText] = js.undefined
  
  /**
    * The visibility of the title label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object VisualTitleLabelOptions {
  
  inline def apply(): VisualTitleLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualTitleLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualTitleLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setFormatText(value: ShortFormatText): Self = StObject.set(x, "FormatText", value.asInstanceOf[js.Any])
    
    inline def setFormatTextUndefined: Self = StObject.set(x, "FormatText", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
