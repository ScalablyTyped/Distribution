package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshTextureTransform
import typings.arcgisJsApi.esri.MeshTextureTransformProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshTextureTransformMod {
  
  @JSImport("esri/geometry/support/MeshTextureTransform", JSImport.Namespace)
  @js.native
  /**
  		 * MeshTextureTransform represents a transformation of UV mesh coordinates used to sample a [MeshTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshTextureTransform {
    def this(properties: MeshTextureTransformProperties) = this()
  }
}
