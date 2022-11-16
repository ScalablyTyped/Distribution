package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshComponent
import typings.arcgisJsApi.esri.MeshComponentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshComponentMod {
  
  @JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
  @js.native
  /**
    * The MeshComponent class is used to apply one or more materials to a single [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html)
    */
  open class ^ ()
    extends StObject
       with MeshComponent {
    def this(properties: MeshComponentProperties) = this()
  }
}
