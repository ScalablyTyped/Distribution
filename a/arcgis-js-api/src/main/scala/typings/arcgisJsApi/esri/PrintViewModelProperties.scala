package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintViewModelProperties extends js.Object {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    */
  var updateDelay: js.UndefOr[Double] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object PrintViewModelProperties {
  
  @scala.inline
  def apply(): PrintViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintViewModelProperties]
  }
  
  @scala.inline
  implicit class PrintViewModelPropertiesOps[Self <: PrintViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setAllowedFormatsVarargs(value: String*): Self = this.set("allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFormats(value: String | js.Array[String]): Self = this.set("allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFormats: Self = this.set("allowedFormats", js.undefined)
    
    @scala.inline
    def setAllowedLayoutsVarargs(value: String*): Self = this.set("allowedLayouts", js.Array(value :_*))
    
    @scala.inline
    def setAllowedLayouts(value: String | js.Array[String]): Self = this.set("allowedLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedLayouts: Self = this.set("allowedLayouts", js.undefined)
    
    @scala.inline
    def setPrintServiceUrl(value: String): Self = this.set("printServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintServiceUrl: Self = this.set("printServiceUrl", js.undefined)
    
    @scala.inline
    def setScaleEnabled(value: Boolean): Self = this.set("scaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleEnabled: Self = this.set("scaleEnabled", js.undefined)
    
    @scala.inline
    def setUpdateDelay(value: Double): Self = this.set("updateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDelay: Self = this.set("updateDelay", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
