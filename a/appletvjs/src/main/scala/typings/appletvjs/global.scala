package typings.appletvjs

import typings.appletvjs.AppleTVJS.NavigationDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var App: typings.appletvjs.AppleTVJS.App = js.native
  var Device: typings.appletvjs.AppleTVJS.Device = js.native
  var Settings: typings.appletvjs.AppleTVJS.Settings = js.native
  var navigationDocument: NavigationDocument = js.native
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  @js.native
  object AppleTVJS extends js.Object {
    @js.native
    class Highlight ()
      extends typings.appletvjs.AppleTVJS.Highlight {
      /** The description of the highlight. */
      /* CompleteClass */
      override var description: String = js.native
      /** The duration of the highlight. */
      /* CompleteClass */
      override var duration: Double = js.native
      /** The imageURL of the highlight. */
      /* CompleteClass */
      override var imageURL: String = js.native
      /** The name of the highlight. */
      /* CompleteClass */
      override var name: String = js.native
      /** The starttime of the highlight. */
      /* CompleteClass */
      override var starttime: Double = js.native
    }
    
    @js.native
    class HighlightGroup ()
      extends typings.appletvjs.AppleTVJS.HighlightGroup {
      /** The hightlights in the highlight group. */
      /* CompleteClass */
      override var hightlights: js.Array[typings.appletvjs.AppleTVJS.Highlight] = js.native
      /** The name of the highlight group. */
      /* CompleteClass */
      override var name: String = js.native
    }
    
    @js.native
    class Interstitial ()
      extends typings.appletvjs.AppleTVJS.Interstitial {
      /** The duration of the interstitial. */
      /* CompleteClass */
      override var duration: Double = js.native
      /** The starttime of the interstitial. */
      /* CompleteClass */
      override var starttime: Double = js.native
    }
    
    @js.native
    class MediaItem protected ()
      extends typings.appletvjs.AppleTVJS.MediaItem {
      /**
        * Creates a new MediaItem object from the information stored in the URL location.
        * @type: Valid values are: audio, video. Defaults to video.
        * @url: The URL pointing to the media item information.
        * */
      def this(`type`: String) = this()
      def this(`type`: String, url: String) = this()
      /** The URL path to the artwork that accompanies the media item. */
      /* CompleteClass */
      override var artworkImageURL: String = js.native
      /**
        * The domain that the rating applies to.
        * There are three valid values for this property: movie, music, and tvshow.
        * */
      /* CompleteClass */
      override var contentRatingDomain: String = js.native
      /**
        * The rating for a video item.
        * The rating is a value from 0-1000. This value corresponds to a specific rating
        * used by different countries. For example, a rating value can represent a PG-13
        * rating in the United State and a MA15+ in Australia.
        * */
      /* CompleteClass */
      override var contentRatingRanking: Double = js.native
      /** The description for a media item. */
      /* CompleteClass */
      override var description: String = js.native
      /** An array of highlightGroup objects. */
      /* CompleteClass */
      override var highlightGroups: js.Array[typings.appletvjs.AppleTVJS.HighlightGroup] = js.native
      /** An array of interstitial objects. */
      /* CompleteClass */
      override var interstitials: js.Array[typings.appletvjs.AppleTVJS.Interstitial] = js.native
      /**
        * A value indicating whether the item has explicit lyrics.
        * This property is ignored if the MediaItem object type is video.
        * */
      /* CompleteClass */
      override var isExplicit: Boolean = js.native
      /**
        * The number, in seconds, that a media item starts playing at.
        * Use this to begin playing a MediaItem object at a time other than
        * at the beginning of the object. If this property contains anything
        * other than 0, the player displays “Resume” instead of
        * “Play from beginning” on playback.
        * */
      /* CompleteClass */
      override var resumeTime: Double = js.native
      /** The subtitle for a the media item. */
      /* CompleteClass */
      override var subtitle: String = js.native
      /** The title of the media item. */
      /* CompleteClass */
      override var title: String = js.native
      /**
        * The type of media item.
        * The valid values for this attribute are audio and video.
        * */
      /* CompleteClass */
      override var `type`: String = js.native
      /** The URL path to the media item. */
      /* CompleteClass */
      override var url: String = js.native
      /** A callback function used to load the asset identifier for an item. */
      /* CompleteClass */
      override def loadAssetID(url: String, callback: js.Function2[/* assetID */ String, /* error */ String, Unit]): Unit = js.native
      /** A callback function used to load the security certificate for an item. */
      /* CompleteClass */
      override def loadCertificate(url: String, callback: js.Function2[/* certificate */ String, /* error */ String, Unit]): Unit = js.native
      /** A callback function used to load the security key for an item. */
      /* CompleteClass */
      override def loadKey(
        url: String,
        requestData: js.Any,
        callback: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]
      ): Unit = js.native
    }
    
    @js.native
    class Player ()
      extends typings.appletvjs.AppleTVJS.Player
    
    @js.native
    class Playlist ()
      extends typings.appletvjs.AppleTVJS.Playlist {
      /** The number of items in the playlist. */
      /* CompleteClass */
      override var length: Double = js.native
      /** Returns the MediaItem located in the indicated array index. */
      /* CompleteClass */
      override def item(index: Double): typings.appletvjs.AppleTVJS.MediaItem = js.native
      /** Removes a media item from the end of a playlist. */
      /* CompleteClass */
      override def pop(): typings.appletvjs.AppleTVJS.MediaItem = js.native
      /** Adds a media item to the end of a playlist. */
      /* CompleteClass */
      override def push(`object`: typings.appletvjs.AppleTVJS.MediaItem): Unit = js.native
      /** Deletes the indicated array elements and replaces them with the specified elements. */
      /* CompleteClass */
      override def splice(index: Double, howManu: Double, `object`: typings.appletvjs.AppleTVJS.MediaItem): js.Array[typings.appletvjs.AppleTVJS.MediaItem] = js.native
    }
    
    @js.native
    class TVError ()
      extends typings.appletvjs.AppleTVJS.TVError {
      /** The error code. */
      /* CompleteClass */
      override var code: String = js.native
      /** A string containing the description of the error. */
      /* CompleteClass */
      override var description: String = js.native
      /**
        * A string containing the error domain.
        *
        * The predefined error domains:
        * NSPOSIXErrorDomain - POSIX/BSD errors
        * NSOSStatusErrorDomain - OS X/Carbon errors
        * NSMachErrorDomain - Mach errors
        * */
      /* CompleteClass */
      override var domain: String = js.native
      /**
        * The user info dictionary.
        *
        * These keys may exist in the user info dictionary:
        * NSLocalizedDesciptionKey
        * NSFilePathErrorKey
        * NSStringEncodingErrorKey
        * NSUnderlyingErrorKey
        * NSURLErrorKey
        * NSLocalizedFailureReasonErrorKey
        * NSLocalizedRecoverySuggestionErrorKey
        * NSLocalizedRecoveryOptionsErrorKey
        * NSRecoveryAttempterErrorKey
        * NSHelpAnchorErrorKey
        * NSURLErrorFailingURLErrorKey
        * NSURLErrorFailingURLStringErrorKey
        * NSURLErrorFailingURLPeerTrustErrorKey
        * */
      /* CompleteClass */
      override var userInfo: js.Any = js.native
    }
    
  }
  
}

