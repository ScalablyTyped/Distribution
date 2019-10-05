package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).  This property applies only to [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the contour edges on 3D Objects. This is only applicable for [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html).  ![symbol3D-edges-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-edges-solid-2.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.undefined
  /**
    * The material defines the final color of the graphic, by blending the `color` property set in the material with the feature's geometry color/texture information. `colorMixMode` defines how these colors are mixed together.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[FillSymbol3DLayerMaterialProperties] = js.undefined
  /**
    * The outline used to draw a line around the filled geometry. This property is not supported in [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbol layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[FillSymbol3DLayerOutlineProperties] = js.undefined
}

object FillSymbol3DLayerProperties {
  @scala.inline
  def apply(
    castShadows: js.UndefOr[Boolean] = js.undefined,
    edges: Edges3DProperties = null,
    material: FillSymbol3DLayerMaterialProperties = null,
    outline: FillSymbol3DLayerOutlineProperties = null
  ): FillSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(castShadows)) __obj.updateDynamic("castShadows")(castShadows)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    __obj.asInstanceOf[FillSymbol3DLayerProperties]
  }
}

