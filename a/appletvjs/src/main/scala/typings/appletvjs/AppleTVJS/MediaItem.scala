package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItem extends js.Object {
  /** The URL path to the artwork that accompanies the media item. */
  var artworkImageURL: String
  /**
    * The domain that the rating applies to.
    * There are three valid values for this property: movie, music, and tvshow.
    * */
  var contentRatingDomain: String
  /**
    * The rating for a video item.
    * The rating is a value from 0-1000. This value corresponds to a specific rating
    * used by different countries. For example, a rating value can represent a PG-13
    * rating in the United State and a MA15+ in Australia.
    * */
  var contentRatingRanking: Double
  /** The description for a media item. */
  var description: String
  /** An array of highlightGroup objects. */
  var highlightGroups: js.Array[HighlightGroup]
  /** An array of interstitial objects. */
  var interstitials: js.Array[Interstitial]
  /**
    * A value indicating whether the item has explicit lyrics.
    * This property is ignored if the MediaItem object type is video.
    * */
  var isExplicit: Boolean
  /**
    * The number, in seconds, that a media item starts playing at.
    * Use this to begin playing a MediaItem object at a time other than
    * at the beginning of the object. If this property contains anything
    * other than 0, the player displays “Resume” instead of
    * “Play from beginning” on playback.
    * */
  var resumeTime: Double
  /** The subtitle for a the media item. */
  var subtitle: String
  /** The title of the media item. */
  var title: String
  /**
    * The type of media item.
    * The valid values for this attribute are audio and video.
    * */
  var `type`: String
  /** The URL path to the media item. */
  var url: String
  /** A callback function used to load the asset identifier for an item. */
  def loadAssetID(url: String, callback: js.Function2[/* assetID */ String, /* error */ String, Unit]): Unit
  /** A callback function used to load the security certificate for an item. */
  def loadCertificate(url: String, callback: js.Function2[/* certificate */ String, /* error */ String, Unit]): Unit
  /** A callback function used to load the security key for an item. */
  def loadKey(
    url: String,
    requestData: js.Any,
    callback: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]
  ): Unit
}

object MediaItem {
  @scala.inline
  def apply(
    artworkImageURL: String,
    contentRatingDomain: String,
    contentRatingRanking: Double,
    description: String,
    highlightGroups: js.Array[HighlightGroup],
    interstitials: js.Array[Interstitial],
    isExplicit: Boolean,
    loadAssetID: (String, js.Function2[/* assetID */ String, /* error */ String, Unit]) => Unit,
    loadCertificate: (String, js.Function2[/* certificate */ String, /* error */ String, Unit]) => Unit,
    loadKey: (String, js.Any, js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => Unit,
    resumeTime: Double,
    subtitle: String,
    title: String,
    `type`: String,
    url: String
  ): MediaItem = {
    val __obj = js.Dynamic.literal(artworkImageURL = artworkImageURL.asInstanceOf[js.Any], contentRatingDomain = contentRatingDomain.asInstanceOf[js.Any], contentRatingRanking = contentRatingRanking.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], highlightGroups = highlightGroups.asInstanceOf[js.Any], interstitials = interstitials.asInstanceOf[js.Any], isExplicit = isExplicit.asInstanceOf[js.Any], loadAssetID = js.Any.fromFunction2(loadAssetID), loadCertificate = js.Any.fromFunction2(loadCertificate), loadKey = js.Any.fromFunction3(loadKey), resumeTime = resumeTime.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItem]
  }
}

