package typings.atvlegacycontentkit.atv

import typings.atvlegacycontentkit.MediaBrowserMetadata
import typings.atvlegacycontentkit.MediaBrowserPhoto
import typings.atvlegacycontentkit.MediaBrowserVideo
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.commentsScreenOnly
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.default
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.fullScreenOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The full screen media browser is a carousel for photos and videos (although the previews only) that has support for comments and likes.
  */
@js.native
trait FullScreenMediaBrowser extends StObject {
  
  /**
    * Hides the full screen media browser
    */
  def hide(): Unit = js.native
  
  /**
    * The callback that is called when the user selects a photo in the media browser. This may only apply to fullscreen mode.
    */
  var onItemSelection: js.UndefOr[js.Function1[/* photoId */ String, Unit]] = js.native
  
  /**
    * The callback that is called when the photo is liked or unliked.
    */
  var onLikeSelection: js.UndefOr[js.Function2[/* photoId */ String, /* metadata */ MediaBrowserMetadata, Unit]] = js.native
  
  /**
    * The callback that is called when the media browser requests metadata.
    */
  var onLoadMetadata: js.UndefOr[js.Function1[/* photoId */ String, Unit]] = js.native
  
  /**
    * The callback when the media browser considers comments viewed (and so should be dealt with accordingly).
    */
  var onMarkCommentsAsViewed: js.UndefOr[js.Function1[/* photoId */ String, Unit]] = js.native
  
  /**
    * Show the media browser.
    * @param items The list of media browser items to show.
    * @param initialSelectionIndex The index of what the initial image to be displayed should be.
    */
  def show(items: js.Array[MediaBrowserPhoto | MediaBrowserVideo]): Unit = js.native
  def show(items: js.Array[MediaBrowserPhoto | MediaBrowserVideo], initialSelectionIndex: Double): Unit = js.native
  
  /**
    * The type of this media browser. Default allows switching between fullscreen and comments modes by pressing select. Comments screen only sets the media browser to only have fullscreen
    * and fullscreen only does the same but for fullscreen.
    */
  var `type`: commentsScreenOnly | default | fullScreenOnly = js.native
  
  /**
    * Update the metadata of the asset.
    * @param photoId The ID of the photo that you want to update.
    * @param metadata The metadata you wish to set the photo to have.
    */
  def updateMetadata(photoId: String, metadata: MediaBrowserMetadata): Unit = js.native
  
  /**
    * Update the metadata of the asset. This method is specifically for updating the likes.
    * @param photoId The ID of the photo that you want to update.
    * @param metadata The metadata you wish to set the photo to have.
    */
  def updateMetadataLiked(photoId: String, metadata: MediaBrowserMetadata): Unit = js.native
}
