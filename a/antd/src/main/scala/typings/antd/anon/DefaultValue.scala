package typings.antd.anon

import typings.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue[DateType, DisabledTime] extends StObject {
  
  var defaultValue: js.UndefOr[DateType] = js.undefined
  
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
  
  var disabledTime: js.UndefOr[DisabledTime] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  
  var hourStep: js.UndefOr[Double] = js.undefined
  
  var minuteStep: js.UndefOr[Double] = js.undefined
  
  var picker: js.UndefOr[PickerMode] = js.undefined
  
  var secondStep: js.UndefOr[Double] = js.undefined
  
  var showHour: js.UndefOr[Boolean] = js.undefined
  
  var showMinute: js.UndefOr[Boolean] = js.undefined
  
  var showNow: js.UndefOr[Boolean] = js.undefined
  
  var showSecond: js.UndefOr[Boolean] = js.undefined
  
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}
object DefaultValue {
  
  inline def apply[DateType, DisabledTime](): DefaultValue[DateType, DisabledTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue[DateType, DisabledTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue[?, ?], DateType, DisabledTime] (val x: Self & (DefaultValue[DateType, DisabledTime])) extends AnyVal {
    
    inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
    
    inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
    
    inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
    
    inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
    
    inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
    
    inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
    
    inline def setDisabledTime(value: DisabledTime): Self = StObject.set(x, "disabledTime", value.asInstanceOf[js.Any])
    
    inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
    
    inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
    
    inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
    inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
    
    inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    inline def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
    
    inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
    
    inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
    
    inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
    
    inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
    
    inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
    
    inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
    
    inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
    
    inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
    
    inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
  }
}
