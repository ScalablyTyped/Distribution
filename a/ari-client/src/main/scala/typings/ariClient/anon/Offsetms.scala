package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offsetms extends StObject {
  
  var lang: js.UndefOr[String] = js.undefined
  
  var media: String | js.Array[String]
  
  var offsetms: js.UndefOr[Double] = js.undefined
  
  var playbackId: js.UndefOr[String] = js.undefined
  
  var skipms: js.UndefOr[Double] = js.undefined
}
object Offsetms {
  
  inline def apply(media: String | js.Array[String]): Offsetms = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offsetms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offsetms] (val x: Self) extends AnyVal {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMedia(value: String | js.Array[String]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: String*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setOffsetms(value: Double): Self = StObject.set(x, "offsetms", value.asInstanceOf[js.Any])
    
    inline def setOffsetmsUndefined: Self = StObject.set(x, "offsetms", js.undefined)
    
    inline def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
    
    inline def setPlaybackIdUndefined: Self = StObject.set(x, "playbackId", js.undefined)
    
    inline def setSkipms(value: Double): Self = StObject.set(x, "skipms", value.asInstanceOf[js.Any])
    
    inline def setSkipmsUndefined: Self = StObject.set(x, "skipms", js.undefined)
  }
}
