package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineValueLabelConfiguration extends StObject {
  
  /**
    * The format configuration of the value label.
    */
  var FormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined
  
  /**
    * The relative position of the value label. Choose one of the following options:    BEFORE_CUSTOM_LABEL     AFTER_CUSTOM_LABEL   
    */
  var RelativePosition: js.UndefOr[ReferenceLineValueLabelRelativePosition] = js.undefined
}
object ReferenceLineValueLabelConfiguration {
  
  inline def apply(): ReferenceLineValueLabelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceLineValueLabelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineValueLabelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFormatConfiguration(value: NumericFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
    
    inline def setRelativePosition(value: ReferenceLineValueLabelRelativePosition): Self = StObject.set(x, "RelativePosition", value.asInstanceOf[js.Any])
    
    inline def setRelativePositionUndefined: Self = StObject.set(x, "RelativePosition", js.undefined)
  }
}
