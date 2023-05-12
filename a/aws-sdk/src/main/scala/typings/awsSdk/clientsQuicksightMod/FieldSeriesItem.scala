package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSeriesItem extends StObject {
  
  /**
    * The axis that you are binding the field to.
    */
  var AxisBinding: typings.awsSdk.clientsQuicksightMod.AxisBinding
  
  /**
    * The field ID of the field for which you are setting the axis binding.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The options that determine the presentation of line series associated to the field.
    */
  var Settings: js.UndefOr[LineChartSeriesSettings] = js.undefined
}
object FieldSeriesItem {
  
  inline def apply(AxisBinding: AxisBinding, FieldId: FieldId): FieldSeriesItem = {
    val __obj = js.Dynamic.literal(AxisBinding = AxisBinding.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSeriesItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldSeriesItem] (val x: Self) extends AnyVal {
    
    inline def setAxisBinding(value: AxisBinding): Self = StObject.set(x, "AxisBinding", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: LineChartSeriesSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
