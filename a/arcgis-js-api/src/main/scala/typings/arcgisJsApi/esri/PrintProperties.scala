package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedFormats)
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedLayouts)
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * This option allows passing extra parameters (in addition to [templateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)) to the print (export webmap) requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#extraParameters)
    */
  var extraParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Indicates the heading level to use for the "Exported files" text where users can access the exported map printout.
    *
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not to include [defaultTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#defaultTemplates).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#includeDefaultTemplates)
    */
  var includeDefaultTemplates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * An object containing an array of `customTextElements` name-value pair objects for each print template in a custom print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateCustomTextElements)
    */
  var templateCustomTextElements: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Defines the layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)
    */
  var templateOptions: js.UndefOr[TemplateOptionsProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#viewModel)
    */
  var viewModel: js.UndefOr[PrintViewModelProperties] = js.undefined
}
object PrintProperties {
  
  inline def apply(): PrintProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowedFormats(value: String | js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    inline def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    inline def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value*))
    
    inline def setAllowedLayouts(value: String | js.Array[String]): Self = StObject.set(x, "allowedLayouts", value.asInstanceOf[js.Any])
    
    inline def setAllowedLayoutsUndefined: Self = StObject.set(x, "allowedLayouts", js.undefined)
    
    inline def setAllowedLayoutsVarargs(value: String*): Self = StObject.set(x, "allowedLayouts", js.Array(value*))
    
    inline def setExtraParameters(value: Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
    
    inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIncludeDefaultTemplates(value: Boolean): Self = StObject.set(x, "includeDefaultTemplates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultTemplatesUndefined: Self = StObject.set(x, "includeDefaultTemplates", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setPrintServiceUrl(value: String): Self = StObject.set(x, "printServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setPrintServiceUrlUndefined: Self = StObject.set(x, "printServiceUrl", js.undefined)
    
    inline def setTemplateCustomTextElements(value: js.Array[Any]): Self = StObject.set(x, "templateCustomTextElements", value.asInstanceOf[js.Any])
    
    inline def setTemplateCustomTextElementsUndefined: Self = StObject.set(x, "templateCustomTextElements", js.undefined)
    
    inline def setTemplateCustomTextElementsVarargs(value: Any*): Self = StObject.set(x, "templateCustomTextElements", js.Array(value*))
    
    inline def setTemplateOptions(value: TemplateOptionsProperties): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: PrintViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
