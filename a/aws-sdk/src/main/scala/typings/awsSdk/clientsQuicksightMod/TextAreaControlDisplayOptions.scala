package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaControlDisplayOptions extends StObject {
  
  /**
    * The configuration of the placeholder options in a text area control.
    */
  var PlaceholderOptions: js.UndefOr[TextControlPlaceholderOptions] = js.undefined
  
  /**
    * The options to configure the title visibility, name, and font size.
    */
  var TitleOptions: js.UndefOr[LabelOptions] = js.undefined
}
object TextAreaControlDisplayOptions {
  
  inline def apply(): TextAreaControlDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaControlDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAreaControlDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setPlaceholderOptions(value: TextControlPlaceholderOptions): Self = StObject.set(x, "PlaceholderOptions", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderOptionsUndefined: Self = StObject.set(x, "PlaceholderOptions", js.undefined)
    
    inline def setTitleOptions(value: LabelOptions): Self = StObject.set(x, "TitleOptions", value.asInstanceOf[js.Any])
    
    inline def setTitleOptionsUndefined: Self = StObject.set(x, "TitleOptions", js.undefined)
  }
}
