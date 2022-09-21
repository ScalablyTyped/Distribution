package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.commentsBadge
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.readComment
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.unreadComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A badge to be added to the photo in the comments view.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserBadge extends StObject {
  
  /**
    * The style of the badge. Either read or unread comment. These look to produce the same output, so the functionality of them is unknown.
    */
  var style: js.UndefOr[readComment | unreadComment] = js.undefined
  
  /**
    * The type of the badge. This can only be a comments badge.
    */
  var `type`: commentsBadge
}
object MediaBrowserBadge {
  
  inline def apply(): MediaBrowserBadge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commentsBadge")
    __obj.asInstanceOf[MediaBrowserBadge]
  }
  
  extension [Self <: MediaBrowserBadge](x: Self) {
    
    inline def setStyle(value: readComment | unreadComment): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: commentsBadge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
