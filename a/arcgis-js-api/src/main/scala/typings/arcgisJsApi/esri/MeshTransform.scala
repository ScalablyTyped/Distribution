package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTransform
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Rotation angle in degrees.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#rotationAngle)
  		 */
  var rotationAngle: Double = js.native
  
  /**
  		 * Axis of rotation.
  		 *
  		 * @default [0, 0, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#rotationAxis)
  		 */
  var rotationAxis: js.Array[Double] = js.native
  
  /**
  		 * Scale.
  		 *
  		 * @default [1, 1, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#scale)
  		 */
  var scale: js.Array[Double] = js.native
  
  /**
  		 * Translation.
  		 *
  		 * @default [0, 0, 0]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#translation)
  		 */
  var translation: js.Array[Double] = js.native
}
