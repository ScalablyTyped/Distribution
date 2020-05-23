package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshMaterialMetallicRoughnessProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.MeshMaterialMetallicRoughness")
@js.native
/**
  * A material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized. This particular material (based on [MeshMaterial](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)) uses the metallic/roughness lighting model to enable physically based lighting. The metallic and roughness properties can be used to model various realistic materials including metals and plastics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html)
  */
class MeshMaterialMetallicRoughnessCls ()
  extends typings.arcgisJsApi.esri.MeshMaterialMetallicRoughness {
  def this(properties: MeshMaterialMetallicRoughnessProperties) = this()
}

