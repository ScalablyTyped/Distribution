package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).  This property applies only to [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  /**
    * Sets the contour edges on 3D Objects. This is only applicable for [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html).  ![symbol3D-edges-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-edges-solid-2.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.native
  /**
    * The material defines the final color of the graphic, by blending the `color` property set in the material with the feature's geometry color/texture information. `colorMixMode` defines how these colors are mixed together.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[FillSymbol3DLayerMaterialProperties] = js.native
  /**
    * The outline used to draw a line around the filled geometry. This property is not supported in [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbol layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[FillSymbol3DLayerOutlineProperties] = js.native
}

object FillSymbol3DLayerProperties {
  @scala.inline
  def apply(): FillSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class FillSymbol3DLayerPropertiesOps[Self <: FillSymbol3DLayerProperties] (val x: Self) extends AnyVal {
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
    def setMaterial(value: FillSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setOutline(value: FillSymbol3DLayerOutlineProperties): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
  }
  
}

