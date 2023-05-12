package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelOptions extends StObject {
  
  /**
    * The options that indicate which field the label belongs to.
    */
  var ApplyTo: js.UndefOr[AxisLabelReferenceOptions] = js.undefined
  
  /**
    * The text for the axis label.
    */
  var CustomLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The font configuration of the axis label.
    */
  var FontConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontConfiguration] = js.undefined
}
object AxisLabelOptions {
  
  inline def apply(): AxisLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setApplyTo(value: AxisLabelReferenceOptions): Self = StObject.set(x, "ApplyTo", value.asInstanceOf[js.Any])
    
    inline def setApplyToUndefined: Self = StObject.set(x, "ApplyTo", js.undefined)
    
    inline def setCustomLabel(value: String): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFontConfigurationUndefined: Self = StObject.set(x, "FontConfiguration", js.undefined)
  }
}
