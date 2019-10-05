package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.extrude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtrudeSymbol3DLayer
  extends Symbol3DLayer
     with typings.arcgisDashJsDashApi.__esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: Boolean = js.native
  /**
    * Sets the contour edges on polygons symbolized with ExtrudeSymbol3DLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#edges)
    */
  var edges: Edges3D = js.native
  /**
    * The material used to shade the extrusion. This property defines the extrusion's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#material)
    */
  var material: ExtrudeSymbol3DLayerMaterial = js.native
  /**
    * The height of the extrusion in meters. Negative values will extrude the polygon surface downward towards or below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#size)
    *
    * @default 1
    */
  var size: Double = js.native
  /**
    * For ExtrudeSymbol3DLayer the type is always `extrude`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_ExtrudeSymbol3DLayer: extrude = js.native
}

@JSGlobal("__esri.ExtrudeSymbol3DLayer")
@js.native
object ExtrudeSymbol3DLayer extends TopLevel[ExtrudeSymbol3DLayerConstructor]

