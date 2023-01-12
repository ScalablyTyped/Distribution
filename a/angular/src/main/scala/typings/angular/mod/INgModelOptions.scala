package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
trait INgModelOptions extends StObject {
  
  var allowInvalid: js.UndefOr[Boolean] = js.undefined
  
  var debounce: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  var getterSetter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if the time and datetime-local types should show seconds and milliseconds.
    * The option follows the format string of date filter.
    * By default, the options is undefined which is equal to 'ss.sss' (seconds and milliseconds)
    */
  var timeSecondsFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Defines if the time and datetime-local types should strip the seconds and milliseconds
    * from the formatted value if they are zero. This option is applied after `timeSecondsFormat`
    */
  var timeStripZeroSeconds: js.UndefOr[Boolean] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var updateOn: js.UndefOr[String] = js.undefined
}
object INgModelOptions {
  
  inline def apply(): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INgModelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INgModelOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
    
    inline def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
    
    inline def setDebounce(value: Double | StringDictionary[Double]): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setGetterSetter(value: Boolean): Self = StObject.set(x, "getterSetter", value.asInstanceOf[js.Any])
    
    inline def setGetterSetterUndefined: Self = StObject.set(x, "getterSetter", js.undefined)
    
    inline def setTimeSecondsFormat(value: String): Self = StObject.set(x, "timeSecondsFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeSecondsFormatUndefined: Self = StObject.set(x, "timeSecondsFormat", js.undefined)
    
    inline def setTimeStripZeroSeconds(value: Boolean): Self = StObject.set(x, "timeStripZeroSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeStripZeroSecondsUndefined: Self = StObject.set(x, "timeStripZeroSeconds", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUpdateOn(value: String): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
