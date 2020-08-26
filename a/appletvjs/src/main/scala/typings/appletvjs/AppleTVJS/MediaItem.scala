package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItem extends js.Object {
  /** The URL path to the artwork that accompanies the media item. */
  var artworkImageURL: String = js.native
  /**
    * The domain that the rating applies to.
    * There are three valid values for this property: movie, music, and tvshow.
    * */
  var contentRatingDomain: String = js.native
  /**
    * The rating for a video item.
    * The rating is a value from 0-1000. This value corresponds to a specific rating
    * used by different countries. For example, a rating value can represent a PG-13
    * rating in the United State and a MA15+ in Australia.
    * */
  var contentRatingRanking: Double = js.native
  /** The description for a media item. */
  var description: String = js.native
  /** An array of highlightGroup objects. */
  var highlightGroups: js.Array[HighlightGroup] = js.native
  /** An array of interstitial objects. */
  var interstitials: js.Array[Interstitial] = js.native
  /**
    * A value indicating whether the item has explicit lyrics.
    * This property is ignored if the MediaItem object type is video.
    * */
  var isExplicit: Boolean = js.native
  /**
    * The number, in seconds, that a media item starts playing at.
    * Use this to begin playing a MediaItem object at a time other than
    * at the beginning of the object. If this property contains anything
    * other than 0, the player displays “Resume” instead of
    * “Play from beginning” on playback.
    * */
  var resumeTime: Double = js.native
  /** The subtitle for a the media item. */
  var subtitle: String = js.native
  /** The title of the media item. */
  var title: String = js.native
  /**
    * The type of media item.
    * The valid values for this attribute are audio and video.
    * */
  var `type`: String = js.native
  /** The URL path to the media item. */
  var url: String = js.native
  /** A callback function used to load the asset identifier for an item. */
  def loadAssetID(url: String, callback: js.Function2[/* assetID */ String, /* error */ String, Unit]): Unit = js.native
  /** A callback function used to load the security certificate for an item. */
  def loadCertificate(url: String, callback: js.Function2[/* certificate */ String, /* error */ String, Unit]): Unit = js.native
  /** A callback function used to load the security key for an item. */
  def loadKey(
    url: String,
    requestData: js.Any,
    callback: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class MediaItemOps[Self <: MediaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArtworkImageURL(value: String): Self = this.set("artworkImageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentRatingDomain(value: String): Self = this.set("contentRatingDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentRatingRanking(value: Double): Self = this.set("contentRatingRanking", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightGroupsVarargs(value: HighlightGroup*): Self = this.set("highlightGroups", js.Array(value :_*))
    @scala.inline
    def setHighlightGroups(value: js.Array[HighlightGroup]): Self = this.set("highlightGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterstitialsVarargs(value: Interstitial*): Self = this.set("interstitials", js.Array(value :_*))
    @scala.inline
    def setInterstitials(value: js.Array[Interstitial]): Self = this.set("interstitials", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExplicit(value: Boolean): Self = this.set("isExplicit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadAssetID(value: (String, js.Function2[/* assetID */ String, /* error */ String, Unit]) => Unit): Self = this.set("loadAssetID", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadCertificate(value: (String, js.Function2[/* certificate */ String, /* error */ String, Unit]) => Unit): Self = this.set("loadCertificate", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadKey(
      value: (String, js.Any, js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => Unit
    ): Self = this.set("loadKey", js.Any.fromFunction3(value))
    @scala.inline
    def setResumeTime(value: Double): Self = this.set("resumeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

