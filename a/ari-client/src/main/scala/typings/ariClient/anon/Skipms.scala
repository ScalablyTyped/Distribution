package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skipms extends StObject {
  
  var channelId: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var media: String | js.Array[String] = js.native
  
  var offsetms: js.UndefOr[Double] = js.native
  
  var playbackId: js.UndefOr[String] = js.native
  
  var skipms: js.UndefOr[Double] = js.native
}
object Skipms {
  
  @scala.inline
  def apply(channelId: String, media: String | js.Array[String]): Skipms = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skipms]
  }
  
  @scala.inline
  implicit class SkipmsMutableBuilder[Self <: Skipms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMedia(value: String | js.Array[String]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: String*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setOffsetms(value: Double): Self = StObject.set(x, "offsetms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetmsUndefined: Self = StObject.set(x, "offsetms", js.undefined)
    
    @scala.inline
    def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackIdUndefined: Self = StObject.set(x, "playbackId", js.undefined)
    
    @scala.inline
    def setSkipms(value: Double): Self = StObject.set(x, "skipms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipmsUndefined: Self = StObject.set(x, "skipms", js.undefined)
  }
}
