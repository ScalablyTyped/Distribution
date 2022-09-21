package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Print_
  extends StObject
     with Widget_ {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedFormats)
    */
  var allowedFormats: String | js.Array[String] = js.native
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedLayouts)
    */
  var allowedLayouts: String | js.Array[String] = js.native
  
  /**
    * The collection of links exported from the Print widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#exportedLinks)
    */
  val exportedLinks: Collection[FileLink] = js.native
  
  /**
    * This option allows passing extra parameters (in addition to [templateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)) to the print (export webmap) requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#extraParameters)
    */
  var extraParameters: Any = js.native
  
  /**
    * Indicates the heading level to use for the "Exported files" text where users can access the exported map printout.
    *
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#headingLevel)
    */
  var headingLevel: Double = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Indicates whether or not to include [defaultTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#defaultTemplates).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#includeDefaultTemplates)
    */
  var includeDefaultTemplates: Boolean = js.native
  
  @JSName("on")
  def on_complete(name: complete, eventHandler: PrintCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_submit(name: submit, eventHandler: PrintSubmitEventHandler): IHandle = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl)
    */
  var printServiceUrl: String = js.native
  
  /**
    * An object containing an array of `customTextElements` name-value pair objects for each print template in a custom print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateCustomTextElements)
    */
  var templateCustomTextElements: js.Array[Any] = js.native
  
  /**
    * Defines the layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)
    */
  var templateOptions: TemplateOptions = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: MapView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#viewModel)
    */
  var viewModel: PrintViewModel = js.native
}
