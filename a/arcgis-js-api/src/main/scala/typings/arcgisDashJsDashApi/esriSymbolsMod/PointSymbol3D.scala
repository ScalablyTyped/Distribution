package typings.arcgisDashJsDashApi.esriSymbolsMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PointSymbol3D
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PointSymbol3DProperties
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
class PointSymbol3DCls () extends PointSymbol3D {
  def this(properties: PointSymbol3DProperties) = this()
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

