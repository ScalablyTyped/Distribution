package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`georeferenced-relative`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshGeoreferencedRelativeVertexSpace
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Origin of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html#origin)
  		 */
  var origin: js.Array[Double] = js.native
  
  /**
  		 * Type of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html#type)
  		 */
  val `type`: `georeferenced-relative` = js.native
}
