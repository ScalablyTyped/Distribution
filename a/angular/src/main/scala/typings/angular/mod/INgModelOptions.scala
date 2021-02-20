package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
@js.native
trait INgModelOptions extends StObject {
  
  var allowInvalid: js.UndefOr[Boolean] = js.native
  
  var debounce: js.UndefOr[Double | StringDictionary[Double]] = js.native
  
  var getterSetter: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if the time and datetime-local types should show seconds and milliseconds.
    * The option follows the format string of date filter.
    * By default, the options is undefined which is equal to 'ss.sss' (seconds and milliseconds)
    */
  var timeSecondsFormat: js.UndefOr[String] = js.native
  
  /**
    * Defines if the time and datetime-local types should strip the seconds and milliseconds
    * from the formatted value if they are zero. This option is applied after `timeSecondsFormat`
    */
  var timeStripZeroSeconds: js.UndefOr[Boolean] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var updateOn: js.UndefOr[String] = js.native
}
object INgModelOptions {
  
  @scala.inline
  def apply(): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INgModelOptions]
  }
  
  @scala.inline
  implicit class INgModelOptionsMutableBuilder[Self <: INgModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double | StringDictionary[Double]): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    @scala.inline
    def setGetterSetter(value: Boolean): Self = StObject.set(x, "getterSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetterSetterUndefined: Self = StObject.set(x, "getterSetter", js.undefined)
    
    @scala.inline
    def setTimeSecondsFormat(value: String): Self = StObject.set(x, "timeSecondsFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSecondsFormatUndefined: Self = StObject.set(x, "timeSecondsFormat", js.undefined)
    
    @scala.inline
    def setTimeStripZeroSeconds(value: Boolean): Self = StObject.set(x, "timeStripZeroSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStripZeroSecondsUndefined: Self = StObject.set(x, "timeStripZeroSeconds", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setUpdateOn(value: String): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
