package typings.arcgisDashJsDashApi.esriWidgetsSmartMappingClassedColorSliderMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClassedColorSlider
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClassedColorSliderProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/smartMapping/ClassedColorSlider", JSImport.Namespace)
@js.native
/**
  * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks) property of the widget. The breaks are used to set the thumbs and render the color of each slider segment.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
  */
class Class () extends ClassedColorSlider {
  def this(properties: ClassedColorSliderProperties) = this()
}

