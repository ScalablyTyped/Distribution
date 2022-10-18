package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MeshMaterialMetallicRoughness
import typings.arcgisJsApi.esri.MeshMaterialMetallicRoughnessConstructor
import typings.arcgisJsApi.esri.MeshMaterialMetallicRoughnessProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshMaterialMetallicRoughnessMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshMaterialMetallicRoughness", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeshMaterialMetallicRoughnessConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshMaterialMetallicRoughness", JSImport.Namespace)
  @js.native
  /**
    * A material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html)
    */
  open class Class ()
    extends StObject
       with MeshMaterialMetallicRoughness {
    def this(properties: MeshMaterialMetallicRoughnessProperties) = this()
  }
  
  type _To = js.Object & MeshMaterialMetallicRoughnessConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometrySupportMeshMaterialMetallicRoughnessMod.foo` */
  override def _to: js.Object & MeshMaterialMetallicRoughnessConstructor = ^
}
