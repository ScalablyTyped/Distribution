package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOptions extends StObject {
  
  /**
    * The text for the label.
    */
  var CustomLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The font configuration of the label.
    */
  var FontConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontConfiguration] = js.undefined
  
  /**
    * Determines whether or not the label is visible.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object LabelOptions {
  
  inline def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: String): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFontConfigurationUndefined: Self = StObject.set(x, "FontConfiguration", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
