package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MeshTexture
import typings.arcgisJsApi.esri.MeshTextureConstructor
import typings.arcgisJsApi.esri.MeshTextureProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshTextureMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshTexture", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeshTextureConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshTexture", JSImport.Namespace)
  @js.native
  /**
    * MeshTexture represents image data to be used for [MeshMaterial](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html) or [MeshMaterialMetallicRoughness](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)
    */
  open class Class ()
    extends StObject
       with MeshTexture {
    def this(properties: MeshTextureProperties) = this()
  }
  
  type _To = js.Object & MeshTextureConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometrySupportMeshTextureMod.foo` */
  override def _to: js.Object & MeshTextureConstructor = ^
}
