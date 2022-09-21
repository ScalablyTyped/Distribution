package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.liveStreamingStopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUrl extends StObject {
  
  var `type`: liveStreamingStopped
  
  /**
    * The CDN streaming URL.
    */
  var url: String
}
object TypeUrl {
  
  inline def apply(url: String): TypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("liveStreamingStopped")
    __obj.asInstanceOf[TypeUrl]
  }
  
  extension [Self <: TypeUrl](x: Self) {
    
    inline def setType(value: liveStreamingStopped): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
