package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.PointSymbol3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "PointSymbol3D")
@js.native
/**
  * PointSymbol3D is used to render features with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html)
  */
class PointSymbol3DCls ()
  extends typings.arcgisJsApi.esri.PointSymbol3D {
  def this(properties: PointSymbol3DProperties) = this()
}

