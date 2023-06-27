package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshTexture
import typings.arcgisJsApi.esri.MeshTextureProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshTextureMod {
  
  @JSImport("esri/geometry/support/MeshTexture", JSImport.Namespace)
  @js.native
  /**
  		 * MeshTexture represents image data to be used for [MeshMaterial](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html) or [MeshMaterialMetallicRoughness](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshTexture {
    def this(properties: MeshTextureProperties) = this()
  }
}
