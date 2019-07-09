package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleBar extends Widget {
  /**
    * The style for the scale bar. When `unit` is set to `dual`, the style will always be `line`.  **Possible Values:** ruler | line
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#style)
    */
  var style: java.lang.String = js.native
  /**
    * Units to use for the scale bar. When using `dual`, the scale bar displays both metric and non-metric units. Metric values show either kilometers or meters depending on the scale, and non-metric values show either miles or feet depending on the scale.  **Possible Values:** non-metric | metric | dual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#unit)
    *
    * @default non-metric
    */
  var unit: java.lang.String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ScaleBarViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar-ScaleBarViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#viewModel)
    */
  var viewModel: ScaleBarViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.ScaleBar")
@js.native
/**
  * The ScaleBar widget displays a scale bar on the map or in a specified HTML node. The widget respects various coordinate systems and displays units in metric or non-metric values. Metric values shows either kilometers or meters depending on the scale, and likewise non-metric values shows miles and feet depending on the scale. When working with Web Mercator or geographic coordinate systems the scale bar takes into account projection distortion and dynamically adjusts the scale bar. The [ScaleBar widget sample](https://developers.arcgis.com/javascript/latest/sample-code/widgets-scalebar/index.html), which uses a map that has the Web Mercator projection, shows this behavior. Open the sample and note that as you pan the map south towards the equator the scale bar gets shorter and as you pan north it gets longer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html)
  */
class ScaleBarCls () extends ScaleBar {
  def this(properties: ScaleBarProperties) = this()
}

