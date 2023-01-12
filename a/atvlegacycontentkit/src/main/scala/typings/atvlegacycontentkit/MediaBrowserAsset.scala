package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An asset to be displayed in the media browser. This is always an image, but can represent a photo or a thumbnail of a video.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserAsset extends StObject {
  
  /**
    * The height of the asset.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the asset.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A URL containing the image file.
    */
  var src: String
  
  /**
    * The width of the asset.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object MediaBrowserAsset {
  
  inline def apply(src: String): MediaBrowserAsset = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBrowserAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaBrowserAsset] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
