package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTextureTransform
  extends StObject
     with Accessor {
  
  /**
  		 * The offset of the UV coordinate origin as a factor of the texture dimensions.
  		 *
  		 * @default [0, 0]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#offset)
  		 */
  var offset: js.Array[Double] = js.native
  
  /**
  		 * The rotation of the UV coordinates in degrees, counter-clockwise around the origin.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#rotation)
  		 */
  var rotation: Double = js.native
  
  /**
  		 * The scale factor applied to the components of the UV coordinates.
  		 *
  		 * @default [1, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#scale)
  		 */
  var scale: js.Array[Double] = js.native
}
