package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSymbol3D
  extends Symbol3D
     with Symbol2D3D
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol3D
     with symbolsSymbol3D {
  /**
    * For MeshSymbol3D, the type is always `mesh-3d`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html#type)
    */
  @JSName("type")
  val type_MeshSymbol3D: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`mesh-3d` = js.native
}

@JSGlobal("__esri.MeshSymbol3D")
@js.native
/**
  * MeshSymbol3D is used to render 3D mesh features in a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html)
  */
class MeshSymbol3DCls () extends MeshSymbol3D {
  def this(properties: MeshSymbol3DProperties) = this()
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

