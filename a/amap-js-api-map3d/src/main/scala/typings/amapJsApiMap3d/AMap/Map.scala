package typings.amapJsApiMap3d.AMap

import typings.amapJsApi.AMap.Layer
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.AMap.Map.Object3DResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  var AmbientLight: js.UndefOr[typings.amapJsApiMap3d.AMap.Lights.AmbientLight] = js.native
  
  var DirectionLight: js.UndefOr[typings.amapJsApiMap3d.AMap.Lights.DirectionLight] = js.native
  
  def getObject3DByContainerPos(pixel: Pixel): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer]): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer], all: Boolean): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: Unit, all: Boolean): Object3DResult | Null = js.native
}
object Map {
  
  trait Object3DResult extends StObject {
    
    var distance: Double
    
    var index: Double
    
    var `object`: Object3D
    
    var point: Vector3
  }
  object Object3DResult {
    
    inline def apply(distance: Double, index: Double, `object`: Object3D, point: Vector3): Object3DResult = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object3DResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Object3DResult] (val x: Self) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
}
