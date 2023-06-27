package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MeshMaterial")
@js.native
/**
		 * The material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
		 */
open class MeshMaterial ()
  extends StObject
     with typings.arcgisJsApi.esri.MeshMaterial {
  def this(properties: MeshMaterialProperties) = this()
}
