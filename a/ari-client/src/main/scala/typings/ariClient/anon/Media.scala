package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  var bridgeId: String
  
  var lang: js.UndefOr[String] = js.undefined
  
  var media: String | js.Array[String]
  
  var offsetms: js.UndefOr[Double] = js.undefined
  
  var playbackId: String
  
  var skipms: js.UndefOr[Double] = js.undefined
}
object Media {
  
  inline def apply(bridgeId: String, media: String | js.Array[String], playbackId: String): Media = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMedia(value: String | js.Array[String]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: String*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    inline def setOffsetms(value: Double): Self = StObject.set(x, "offsetms", value.asInstanceOf[js.Any])
    
    inline def setOffsetmsUndefined: Self = StObject.set(x, "offsetms", js.undefined)
    
    inline def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
    
    inline def setSkipms(value: Double): Self = StObject.set(x, "skipms", value.asInstanceOf[js.Any])
    
    inline def setSkipmsUndefined: Self = StObject.set(x, "skipms", js.undefined)
  }
}
