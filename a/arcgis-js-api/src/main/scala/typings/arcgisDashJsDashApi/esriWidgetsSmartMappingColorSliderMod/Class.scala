package typings.arcgisDashJsDashApi.esriWidgetsSmartMappingColorSliderMod

import typings.arcgisDashJsDashApi.__esri.ColorSlider
import typings.arcgisDashJsDashApi.__esri.ColorSliderProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/smartMapping/ColorSlider", JSImport.Namespace)
@js.native
/**
  * The ColorSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html). At a minimum you must set the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#max), and [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#stops) properties of the widget. The stops are used to render a color gradient on the track of the slider.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html)
  */
class Class () extends ColorSlider {
  def this(properties: ColorSliderProperties) = this()
}

