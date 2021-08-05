package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdLang extends StObject {
  
  var channelId: String
  
  var lang: js.UndefOr[String] = js.undefined
  
  var media: String | js.Array[String]
  
  var offsetms: js.UndefOr[Double] = js.undefined
  
  var playbackId: String
  
  var skipms: js.UndefOr[Double] = js.undefined
}
object ChannelIdLang {
  
  inline def apply(channelId: String, media: String | js.Array[String], playbackId: String): ChannelIdLang = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdLang]
  }
  
  extension [Self <: ChannelIdLang](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
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
