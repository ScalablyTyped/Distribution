package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.alipayjssdk.alipayjssdkStrings.album
import typings.alipayjssdk.alipayjssdkStrings.camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  /** 前置或者后置摄像头，默认前后都有，即：[‘front’, ‘back’] */
  var camera: js.UndefOr[js.Array[String]] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 最大录制时长，单位秒，默认60s */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /** 相册选取或者拍照，默认 ['camera','album'] */
  var sourceType: js.UndefOr[js.Array[camera | album]] = js.undefined
}
object Camera {
  
  inline def apply(): Camera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setCamera(value: js.Array[String]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCameraVarargs(value: String*): Self = StObject.set(x, "camera", js.Array(value*))
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setSourceType(value: js.Array[camera | album]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: (camera | album)*): Self = StObject.set(x, "sourceType", js.Array(value*))
  }
}
