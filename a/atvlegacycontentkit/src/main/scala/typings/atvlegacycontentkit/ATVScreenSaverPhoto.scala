package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A screensaver photo.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverPhoto extends StObject {
  
  /**
    * A list of the assets that contain the actual screensaver photo.
    */
  var assets: js.Array[ATVScreenSaverPhotoAsset]
  
  /**
    * The ID of this photo.
    */
  var id: String
  
  /**
    * The type of this screensaver entry. This is always photo.
    */
  val `type`: photo
}
object ATVScreenSaverPhoto {
  
  inline def apply(assets: js.Array[ATVScreenSaverPhotoAsset], id: String): ATVScreenSaverPhoto = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[ATVScreenSaverPhoto]
  }
  
  extension [Self <: ATVScreenSaverPhoto](x: Self) {
    
    inline def setAssets(value: js.Array[ATVScreenSaverPhotoAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: ATVScreenSaverPhotoAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
