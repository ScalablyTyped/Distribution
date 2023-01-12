package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artwork
trait Artwork extends StObject {
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var textColor1: js.UndefOr[String] = js.undefined
  
  var textColor2: js.UndefOr[String] = js.undefined
  
  var textColor3: js.UndefOr[String] = js.undefined
  
  var textColor4: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var width: Double
}
object Artwork {
  
  inline def apply(height: Double, url: String, width: Double): Artwork = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artwork] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTextColor1(value: String): Self = StObject.set(x, "textColor1", value.asInstanceOf[js.Any])
    
    inline def setTextColor1Undefined: Self = StObject.set(x, "textColor1", js.undefined)
    
    inline def setTextColor2(value: String): Self = StObject.set(x, "textColor2", value.asInstanceOf[js.Any])
    
    inline def setTextColor2Undefined: Self = StObject.set(x, "textColor2", js.undefined)
    
    inline def setTextColor3(value: String): Self = StObject.set(x, "textColor3", value.asInstanceOf[js.Any])
    
    inline def setTextColor3Undefined: Self = StObject.set(x, "textColor3", js.undefined)
    
    inline def setTextColor4(value: String): Self = StObject.set(x, "textColor4", value.asInstanceOf[js.Any])
    
    inline def setTextColor4Undefined: Self = StObject.set(x, "textColor4", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
