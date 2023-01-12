package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.photo
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The generic interface for media browser items. Use MediaBrowserPhoto or MediaBrowserVideo for the specific implementations.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserItem extends StObject {
  
  /**
    * Any badges that need attached. This is limited to a comments badge only.
    */
  var badges: js.UndefOr[js.Array[MediaBrowserBadge]] = js.undefined
  
  /**
    * A caption for the photo that is displayed in the comments view.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for this photo, which is passed back by any listeners.
    */
  var id: String
  
  /**
    * What type of item is being displayed. Either photo or video. They're functionally identitical except the video option has a different name for the assets array, and shows a video play
    * button as an overlay.
    */
  val `type`: photo | video
}
object MediaBrowserItem {
  
  inline def apply(id: String, `type`: photo | video): MediaBrowserItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBrowserItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaBrowserItem] (val x: Self) extends AnyVal {
    
    inline def setBadges(value: js.Array[MediaBrowserBadge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    inline def setBadgesVarargs(value: MediaBrowserBadge*): Self = StObject.set(x, "badges", js.Array(value*))
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: photo | video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
