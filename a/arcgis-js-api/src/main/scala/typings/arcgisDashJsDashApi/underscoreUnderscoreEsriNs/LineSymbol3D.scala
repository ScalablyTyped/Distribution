package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`line-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol3D
  extends Symbol3D
     with Symbol2D3D
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3D
     with symbolsSymbol3D {
  /**
    * For LineSymbol3D the type is always `line-3d`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html#type)
    */
  @JSName("type")
  val type_LineSymbol3D: `line-3d` = js.native
}

@JSGlobal("__esri.LineSymbol3D")
@js.native
/**
  * LineSymbol3D is used to render features with [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html)
  */
class LineSymbol3DCls () extends LineSymbol3D {
  def this(properties: LineSymbol3DProperties) = this()
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

