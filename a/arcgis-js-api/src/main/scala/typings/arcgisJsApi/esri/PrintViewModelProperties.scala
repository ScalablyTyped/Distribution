package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintViewModelProperties extends StObject {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * This option allows passing extra parameters to the print (export webmap) requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#extraParameters)
    */
  var extraParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Indicates whether or not to include [defaultTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#defaultTemplates).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#includeDefaultTemplates)
    */
  var includeDefaultTemplates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * @default false
    * @deprecated since version 4.22. Instead, use {@link module:esri/widgets/Print/TemplateOptions#scaleEnabled} if using the Print widget, or {@link module:esri/rest/support/PrintTemplate#scalePreserved} if calling [print()](#print) directly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing an array of `customTextElements` name-value pair objects for each print template in a custom print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#templateCustomTextElements)
    */
  var templateCustomTextElements: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * @default 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    */
  var updateDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object PrintViewModelProperties {
  
  inline def apply(): PrintViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintViewModelProperties]
  }
  
  extension [Self <: PrintViewModelProperties](x: Self) {
    
    inline def setAllowedFormats(value: String | js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    inline def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    inline def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value*))
    
    inline def setAllowedLayouts(value: String | js.Array[String]): Self = StObject.set(x, "allowedLayouts", value.asInstanceOf[js.Any])
    
    inline def setAllowedLayoutsUndefined: Self = StObject.set(x, "allowedLayouts", js.undefined)
    
    inline def setAllowedLayoutsVarargs(value: String*): Self = StObject.set(x, "allowedLayouts", js.Array(value*))
    
    inline def setExtraParameters(value: Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
    
    inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
    
    inline def setIncludeDefaultTemplates(value: Boolean): Self = StObject.set(x, "includeDefaultTemplates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultTemplatesUndefined: Self = StObject.set(x, "includeDefaultTemplates", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setPrintServiceUrl(value: String): Self = StObject.set(x, "printServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setPrintServiceUrlUndefined: Self = StObject.set(x, "printServiceUrl", js.undefined)
    
    inline def setScaleEnabled(value: Boolean): Self = StObject.set(x, "scaleEnabled", value.asInstanceOf[js.Any])
    
    inline def setScaleEnabledUndefined: Self = StObject.set(x, "scaleEnabled", js.undefined)
    
    inline def setTemplateCustomTextElements(value: js.Array[Any]): Self = StObject.set(x, "templateCustomTextElements", value.asInstanceOf[js.Any])
    
    inline def setTemplateCustomTextElementsUndefined: Self = StObject.set(x, "templateCustomTextElements", js.undefined)
    
    inline def setTemplateCustomTextElementsVarargs(value: Any*): Self = StObject.set(x, "templateCustomTextElements", js.Array(value*))
    
    inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
