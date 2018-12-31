package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AppleTVJS.MediaItem")
@js.native
class MediaItem protected () extends js.Object {
  /**
  		 * Creates a new MediaItem object from the information stored in the URL location.
  		 * @type: Valid values are: audio, video. Defaults to video.
  		 * @url: The URL pointing to the media item information.
  		 * */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, url: java.lang.String) = this()
  /** The URL path to the artwork that accompanies the media item. */
  var artworkImageURL: java.lang.String = js.native
  /**
  		 * The domain that the rating applies to.
  		 * There are three valid values for this property: movie, music, and tvshow.
  		 * */
  var contentRatingDomain: java.lang.String = js.native
  /**
  		 * The rating for a video item.
  		 * The rating is a value from 0-1000. This value corresponds to a specific rating
  		 * used by different countries. For example, a rating value can represent a PG-13
  		 * rating in the United State and a MA15+ in Australia.
  		 * */
  var contentRatingRanking: scala.Double = js.native
  /** The description for a media item. */
  var description: java.lang.String = js.native
  /** An array of highlightGroup objects. */
  var highlightGroups: js.Array[HighlightGroup] = js.native
  /** An array of interstitial objects. */
  var interstitials: js.Array[Interstitial] = js.native
  /**
  		 * A value indicating whether the item has explicit lyrics.
  		 * This property is ignored if the MediaItem object type is video.
  		 * */
  var isExplicit: scala.Boolean = js.native
  /**
  		 * The number, in seconds, that a media item starts playing at.
  		 * Use this to begin playing a MediaItem object at a time other than
  		 * at the beginning of the object. If this property contains anything
  		 * other than 0, the player displays “Resume” instead of
  		 * “Play from beginning” on playback.
  		 * */
  var resumeTime: scala.Double = js.native
  /** The subtitle for a the media item. */
  var subtitle: java.lang.String = js.native
  /** The title of the media item. */
  var title: java.lang.String = js.native
  /**
  		 * The type of media item.
  		 * The valid values for this attribute are audio and video.
  		 * */
  var `type`: java.lang.String = js.native
  /** The URL path to the media item. */
  var url: java.lang.String = js.native
  /** A callback function used to load the asset identifier for an item. */
  def loadAssetID(
    url: java.lang.String,
    callback: js.Function2[/* assetID */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /** A callback function used to load the security certificate for an item. */
  def loadCertificate(
    url: java.lang.String,
    callback: js.Function2[/* certificate */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /** A callback function used to load the security key for an item. */
  def loadKey(
    url: java.lang.String,
    requestData: js.Any,
    callback: js.Function3[
      /* key */ java.lang.String, 
      /* renewalDate */ java.lang.String, 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

