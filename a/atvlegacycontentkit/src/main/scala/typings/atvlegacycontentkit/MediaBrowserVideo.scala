package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.photo
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserVideo
  extends StObject
     with MediaBrowserItem {
  
  /**
    * A list of assets for this video. This should be snapshots of part of the video (i.e. like a thumbnail).
    */
  var previewImages: js.Array[MediaBrowserAsset]
}
object MediaBrowserVideo {
  
  inline def apply(id: String, previewImages: js.Array[MediaBrowserAsset], `type`: photo | video): MediaBrowserVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], previewImages = previewImages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBrowserVideo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaBrowserVideo] (val x: Self) extends AnyVal {
    
    inline def setPreviewImages(value: js.Array[MediaBrowserAsset]): Self = StObject.set(x, "previewImages", value.asInstanceOf[js.Any])
    
    inline def setPreviewImagesVarargs(value: MediaBrowserAsset*): Self = StObject.set(x, "previewImages", js.Array(value*))
  }
}
