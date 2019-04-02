package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Print extends Widget {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#iconClass)
    */
  var iconClass: java.lang.String = js.native
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl)
    */
  var printServiceUrl: java.lang.String = js.native
  /**
    * Defines the layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)
    */
  var templateOptions: TemplateOptions = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PrintViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#viewModel)
    */
  var viewModel: PrintViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.Print")
@js.native
/**
  * The Print widget connects your application with a [printing service](https://server.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed. It takes advantage of server-side, high-quality, full cartographic print functionality using the ExportWebMap service of ArcGIS, which can be configured with custom layout templates. One is provided that shows the map only, while another provides a layout with legend, etc. The Print widget works with the [PrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html) which generates a printer-ready version of the map.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
  */
class PrintCls () extends Print {
  def this(properties: PrintProperties) = this()
}

