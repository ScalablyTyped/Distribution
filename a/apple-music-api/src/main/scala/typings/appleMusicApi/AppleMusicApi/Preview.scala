package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/preview
trait Preview extends StObject {
  
  var artwork: js.UndefOr[Artwork] = js.undefined
  
  var url: String
}
object Preview {
  
  @scala.inline
  def apply(url: String): Preview = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preview]
  }
  
  @scala.inline
  implicit class PreviewMutableBuilder[Self <: Preview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtwork(value: Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
