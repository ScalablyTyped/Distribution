package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
@js.native
trait INgModelOptions extends js.Object {
  
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
  implicit class INgModelOptionsOps[Self <: INgModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowInvalid(value: Boolean): Self = this.set("allowInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInvalid: Self = this.set("allowInvalid", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double | StringDictionary[Double]): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setGetterSetter(value: Boolean): Self = this.set("getterSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetterSetter: Self = this.set("getterSetter", js.undefined)
    
    @scala.inline
    def setTimeSecondsFormat(value: String): Self = this.set("timeSecondsFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSecondsFormat: Self = this.set("timeSecondsFormat", js.undefined)
    
    @scala.inline
    def setTimeStripZeroSeconds(value: Boolean): Self = this.set("timeStripZeroSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStripZeroSeconds: Self = this.set("timeStripZeroSeconds", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setUpdateOn(value: String): Self = this.set("updateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOn: Self = this.set("updateOn", js.undefined)
  }
}
