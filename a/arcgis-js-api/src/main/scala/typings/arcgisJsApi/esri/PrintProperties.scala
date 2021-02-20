package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintProperties extends WidgetProperties {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedFormats)
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedLayouts)
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
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  
  /**
    * The view model for this widget.
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
  implicit class PrintPropertiesMutableBuilder[Self <: PrintProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFormats(value: String | js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    @scala.inline
    def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setAllowedLayouts(value: String | js.Array[String]): Self = StObject.set(x, "allowedLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedLayoutsUndefined: Self = StObject.set(x, "allowedLayouts", js.undefined)
    
    @scala.inline
    def setAllowedLayoutsVarargs(value: String*): Self = StObject.set(x, "allowedLayouts", js.Array(value :_*))
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setPrintServiceUrl(value: String): Self = StObject.set(x, "printServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintServiceUrlUndefined: Self = StObject.set(x, "printServiceUrl", js.undefined)
    
    @scala.inline
    def setTemplateOptions(value: TemplateOptionsProperties): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: PrintViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
