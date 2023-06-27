package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshMaterial
import typings.arcgisJsApi.esri.MeshMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshMaterialMod {
  
  @JSImport("esri/geometry/support/MeshMaterial", JSImport.Namespace)
  @js.native
  /**
  		 * The material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshMaterial {
    def this(properties: MeshMaterialProperties) = this()
  }
}
