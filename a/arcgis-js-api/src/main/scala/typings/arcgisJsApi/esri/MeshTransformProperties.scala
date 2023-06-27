package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshTransformProperties extends StObject {
  
  /**
  		 * Rotation angle in degrees.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#rotationAngle)
  		 */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Axis of rotation.
  		 *
  		 * @default [0, 0, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#rotationAxis)
  		 */
  var rotationAxis: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * Scale.
  		 *
  		 * @default [1, 1, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#scale)
  		 */
  var scale: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * Translation.
  		 *
  		 * @default [0, 0, 0]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTransform.html#translation)
  		 */
  var translation: js.UndefOr[js.Array[Double]] = js.undefined
}
object MeshTransformProperties {
  
  inline def apply(): MeshTransformProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshTransformProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshTransformProperties] (val x: Self) extends AnyVal {
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setRotationAxis(value: js.Array[Double]): Self = StObject.set(x, "rotationAxis", value.asInstanceOf[js.Any])
    
    inline def setRotationAxisUndefined: Self = StObject.set(x, "rotationAxis", js.undefined)
    
    inline def setRotationAxisVarargs(value: Double*): Self = StObject.set(x, "rotationAxis", js.Array(value*))
    
    inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setTranslation(value: js.Array[Double]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setTranslationVarargs(value: Double*): Self = StObject.set(x, "translation", js.Array(value*))
  }
}
