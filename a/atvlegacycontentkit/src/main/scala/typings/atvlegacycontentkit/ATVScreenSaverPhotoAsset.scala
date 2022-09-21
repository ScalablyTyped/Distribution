package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual screensaver asset.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverPhotoAsset extends StObject {
  
  /**
    * The height of the photo.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the image.
    */
  var src: String
  
  /**
    * The width of the photo.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ATVScreenSaverPhotoAsset {
  
  inline def apply(src: String): ATVScreenSaverPhotoAsset = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVScreenSaverPhotoAsset]
  }
  
  extension [Self <: ATVScreenSaverPhotoAsset](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
