package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata associated with an asset.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserMetadata extends StObject {
  
  /**
    * A list of comments on the asset.
    */
  var comments: js.UndefOr[js.Array[MediaBrowserComment]] = js.undefined
  
  /**
    * The description for the liked status. E.g. "You liked this".
    */
  var likeStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the photo should be parked as liked or not.
    */
  var liked: js.UndefOr[Boolean] = js.undefined
}
object MediaBrowserMetadata {
  
  inline def apply(): MediaBrowserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaBrowserMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaBrowserMetadata] (val x: Self) extends AnyVal {
    
    inline def setComments(value: js.Array[MediaBrowserComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: MediaBrowserComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setLikeStatus(value: String): Self = StObject.set(x, "likeStatus", value.asInstanceOf[js.Any])
    
    inline def setLikeStatusUndefined: Self = StObject.set(x, "likeStatus", js.undefined)
    
    inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
    
    inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
  }
}
