package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintProperties extends WidgetProperties {
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service formats are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedFormats` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedFormats)
    *
    * @default "all"
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service layouts are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedLayouts` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedLayouts)
    *
    * @default "all"
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.native
  /**
    * Defines the layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)
    */
  var templateOptions: js.UndefOr[TemplateOptionsProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PrintViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#viewModel)
    */
  var viewModel: js.UndefOr[PrintViewModelProperties] = js.native
}

object PrintProperties {
  @scala.inline
  def apply(): PrintProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintProperties]
  }
  @scala.inline
  implicit class PrintPropertiesOps[Self <: PrintProperties] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setPrintServiceUrl(value: String): Self = this.set("printServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintServiceUrl: Self = this.set("printServiceUrl", js.undefined)
    @scala.inline
    def setTemplateOptions(value: TemplateOptionsProperties): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateOptions: Self = this.set("templateOptions", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: PrintViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

