package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.photo
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A photo to be displayed in the media browser.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserPhoto
  extends StObject
     with MediaBrowserItem {
  
  /**
    * A list of assets for this photo (i.e. the images themselves). It's unclear why multiple of these are allowed, but it could be so that you can have multiple sizes and it picks the best one.
    */
  var assets: js.Array[MediaBrowserAsset]
}
object MediaBrowserPhoto {
  
  inline def apply(assets: js.Array[MediaBrowserAsset], id: String, `type`: photo | video): MediaBrowserPhoto = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBrowserPhoto]
  }
  
  extension [Self <: MediaBrowserPhoto](x: Self) {
    
    inline def setAssets(value: js.Array[MediaBrowserAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: MediaBrowserAsset*): Self = StObject.set(x, "assets", js.Array(value*))
  }
}
