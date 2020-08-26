package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtrudeSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  /**
    * Sets the contour edges on polygons symbolized with ExtrudeSymbol3DLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.native
  /**
    * The material used to shade the extrusion. This property defines the extrusion's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ExtrudeSymbol3DLayerMaterialProperties] = js.native
  /**
    * The height of the extrusion in meters. Negative values will extrude the polygon surface downward towards or below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#size)
    *
    * @default 1
    */
  var size: js.UndefOr[Double] = js.native
}

object ExtrudeSymbol3DLayerProperties {
  @scala.inline
  def apply(): ExtrudeSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudeSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class ExtrudeSymbol3DLayerPropertiesOps[Self <: ExtrudeSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCastShadows(value: Boolean): Self = this.set("castShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCastShadows: Self = this.set("castShadows", js.undefined)
    @scala.inline
    def setEdges(value: Edges3DProperties): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    @scala.inline
    def setMaterial(value: ExtrudeSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

