package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshTextureTransformProperties extends StObject {
  
  /**
  		 * The offset of the UV coordinate origin as a factor of the texture dimensions.
  		 *
  		 * @default [0, 0]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#offset)
  		 */
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * The rotation of the UV coordinates in degrees, counter-clockwise around the origin.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#rotation)
  		 */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The scale factor applied to the components of the UV coordinates.
  		 *
  		 * @default [1, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTextureTransform.html#scale)
  		 */
  var scale: js.UndefOr[js.Array[Double]] = js.undefined
}
object MeshTextureTransformProperties {
  
  inline def apply(): MeshTextureTransformProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshTextureTransformProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshTextureTransformProperties] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
  }
}
