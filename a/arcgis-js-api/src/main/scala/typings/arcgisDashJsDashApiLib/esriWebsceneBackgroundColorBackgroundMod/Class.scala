package typings
package arcgisDashJsDashApiLib.esriWebsceneBackgroundColorBackgroundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
@js.native
/**
  * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). The view environment stars and atmosphere will show on top of the background when enabled. To have a clear background color only, make sure to set both the [view.environment.starsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment) and [view.environment.atmosphereEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment) properties to `false`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
  */
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.backgroundColorBackground {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.backgroundColorBackgroundProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

