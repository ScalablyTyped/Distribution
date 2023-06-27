package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshLocalVertexSpace
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Origin of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshLocalVertexSpace.html#origin)
  		 */
  var origin: js.Array[Double] = js.native
  
  /**
  		 * Type of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshLocalVertexSpace.html#type)
  		 */
  val `type`: local = js.native
}
