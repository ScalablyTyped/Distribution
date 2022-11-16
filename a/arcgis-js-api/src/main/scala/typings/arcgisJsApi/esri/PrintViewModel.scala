package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.initializing
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintViewModel
  extends StObject
     with Accessor {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    */
  var allowedFormats: String | js.Array[String] = js.native
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    */
  var allowedLayouts: String | js.Array[String] = js.native
  
  /**
    * A collection of print templates defined on the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#defaultTemplates)
    */
  val defaultTemplates: Collection[CustomTemplate] = js.native
  
  /**
    * The effective URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#effectivePrintServiceUrl)
    */
  val effectivePrintServiceUrl: String = js.native
  
  /**
    * Returns an array of objects of all print templates available on the custom print service to see which templates were published with `customTextElements`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#effectiveTemplateCustomTextElements)
    */
  val effectiveTemplateCustomTextElements: js.Array[Any] = js.native
  
  /**
    * This option allows passing extra parameters to the print (export webmap) requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#extraParameters)
    */
  var extraParameters: Any = js.native
  
  /**
    * Indicates whether or not to include [defaultTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#defaultTemplates).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#includeDefaultTemplates)
    */
  var includeDefaultTemplates: Boolean = js.native
  
  /**
    * This method should be called to load the view model's printing resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#load)
    */
  def load(): js.Promise[Any] = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * Prints (exports) the current MapView according to selected options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#print)
    */
  def print(printTemplate: PrintTemplate): js.Promise[Any] = js.native
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: String = js.native
  
  /**
    * The view model's state.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#state)
    */
  val state: disabled | initializing | ready | error = js.native
  
  /**
    * An object containing an array of `customTextElements` name-value pair objects for each print template in a custom print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#templateCustomTextElements)
    */
  var templateCustomTextElements: js.Array[Any] = js.native
  
  /**
    * The service metadata that contains the [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format) and [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) information for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#templatesInfo)
    */
  val templatesInfo: Any = js.native
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * @default 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    */
  var updateDelay: Double = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: MapView = js.native
}
