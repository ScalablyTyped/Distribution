package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`datetime-picker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePickerInputProperties extends InputProperties {
  
  /**
    * Indicates if the input should provide an option to select the time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#includeTime)
    */
  var includeTime: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * The type of input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#type)
    */
  var `type`: js.UndefOr[`datetime-picker`] = js.native
}
object DateTimePickerInputProperties {
  
  @scala.inline
  def apply(): DateTimePickerInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerInputProperties]
  }
  
  @scala.inline
  implicit class DateTimePickerInputPropertiesOps[Self <: DateTimePickerInputProperties] (val x: Self) extends AnyVal {
    
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
    def setIncludeTime(value: Boolean): Self = this.set("includeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTime: Self = this.set("includeTime", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setType(value: `datetime-picker`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
