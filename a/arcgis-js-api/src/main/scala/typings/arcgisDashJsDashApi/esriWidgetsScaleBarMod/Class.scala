package typings.arcgisDashJsDashApi.esriWidgetsScaleBarMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ScaleBar
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ScaleBarProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
@js.native
/**
  * The ScaleBar widget displays a scale bar on the map or in a specified HTML node. The widget respects various coordinate systems and displays units in metric or non-metric values. Metric values shows either kilometers or meters depending on the scale, and likewise non-metric values shows miles and feet depending on the scale. When working with Web Mercator or geographic coordinate systems the scale bar takes into account projection distortion and dynamically adjusts the scale bar. The [ScaleBar widget sample](https://developers.arcgis.com/javascript/latest/sample-code/widgets-scalebar/index.html), which uses a map that has the Web Mercator projection, shows this behavior. Open the sample and note that as you pan the map south towards the equator the scale bar gets shorter and as you pan north it gets longer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html)
  */
class Class () extends ScaleBar {
  def this(properties: ScaleBarProperties) = this()
}

