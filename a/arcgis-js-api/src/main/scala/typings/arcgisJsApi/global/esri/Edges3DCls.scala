package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.Edges3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Edges3D")
@js.native
/**
  * Edges3D is the base class for symbol classes that add edge rendering visualization to existing symbols. Edge rendering visualization is specific for 3D visualizations and can only be applied to [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html) on [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html) on [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html)
  */
class Edges3DCls ()
  extends typings.arcgisJsApi.esri.Edges3D {
  def this(properties: Edges3DProperties) = this()
}

