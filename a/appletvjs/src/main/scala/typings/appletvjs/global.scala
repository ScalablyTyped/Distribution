package typings.appletvjs

import typings.appletvjs.AppleTVJS.App
import typings.appletvjs.AppleTVJS.Device
import typings.appletvjs.AppleTVJS.NavigationDocument
import typings.appletvjs.AppleTVJS.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App: typings.appletvjs.AppleTVJS.App = js.native
  @scala.inline
  def App_=(x: App): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
  
  object AppleTVJS {
    
    @JSGlobal("AppleTVJS.Highlight")
    @js.native
    class Highlight ()
      extends StObject
         with typings.appletvjs.AppleTVJS.Highlight {
      
      /** The description of the highlight. */
      /* CompleteClass */
      var description: String = js.native
      
      /** The duration of the highlight. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** The imageURL of the highlight. */
      /* CompleteClass */
      var imageURL: String = js.native
      
      /** The name of the highlight. */
      /* CompleteClass */
      var name: String = js.native
      
      /** The starttime of the highlight. */
      /* CompleteClass */
      var starttime: Double = js.native
    }
    
    @JSGlobal("AppleTVJS.HighlightGroup")
    @js.native
    class HighlightGroup ()
      extends StObject
         with typings.appletvjs.AppleTVJS.HighlightGroup {
      
      /** The hightlights in the highlight group. */
      /* CompleteClass */
      var hightlights: js.Array[typings.appletvjs.AppleTVJS.Highlight] = js.native
      
      /** The name of the highlight group. */
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSGlobal("AppleTVJS.Interstitial")
    @js.native
    class Interstitial ()
      extends StObject
         with typings.appletvjs.AppleTVJS.Interstitial {
      
      /** The duration of the interstitial. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** The starttime of the interstitial. */
      /* CompleteClass */
      var starttime: Double = js.native
    }
    
    @JSGlobal("AppleTVJS.MediaItem")
    @js.native
    class MediaItem protected ()
      extends StObject
         with typings.appletvjs.AppleTVJS.MediaItem {
      /**
        * Creates a new MediaItem object from the information stored in the URL location.
        * @type: Valid values are: audio, video. Defaults to video.
        * @url: The URL pointing to the media item information.
        * */
      def this(`type`: String) = this()
      def this(`type`: String, url: String) = this()
      
      /** The URL path to the artwork that accompanies the media item. */
      /* CompleteClass */
      var artworkImageURL: String = js.native
      
      /**
        * The domain that the rating applies to.
        * There are three valid values for this property: movie, music, and tvshow.
        * */
      /* CompleteClass */
      var contentRatingDomain: String = js.native
      
      /**
        * The rating for a video item.
        * The rating is a value from 0-1000. This value corresponds to a specific rating
        * used by different countries. For example, a rating value can represent a PG-13
        * rating in the United State and a MA15+ in Australia.
        * */
      /* CompleteClass */
      var contentRatingRanking: Double = js.native
      
      /** The description for a media item. */
      /* CompleteClass */
      var description: String = js.native
      
      /** An array of highlightGroup objects. */
      /* CompleteClass */
      var highlightGroups: js.Array[typings.appletvjs.AppleTVJS.HighlightGroup] = js.native
      
      /** An array of interstitial objects. */
      /* CompleteClass */
      var interstitials: js.Array[typings.appletvjs.AppleTVJS.Interstitial] = js.native
      
      /**
        * A value indicating whether the item has explicit lyrics.
        * This property is ignored if the MediaItem object type is video.
        * */
      /* CompleteClass */
      var isExplicit: Boolean = js.native
      
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
      
      /**
        * The number, in seconds, that a media item starts playing at.
        * Use this to begin playing a MediaItem object at a time other than
        * at the beginning of the object. If this property contains anything
        * other than 0, the player displays “Resume” instead of
        * “Play from beginning” on playback.
        * */
      /* CompleteClass */
      var resumeTime: Double = js.native
      
      /** The subtitle for a the media item. */
      /* CompleteClass */
      var subtitle: String = js.native
      
      /** The title of the media item. */
      /* CompleteClass */
      var title: String = js.native
      
      /**
        * The type of media item.
        * The valid values for this attribute are audio and video.
        * */
      /* CompleteClass */
      var `type`: String = js.native
      
      /** The URL path to the media item. */
      /* CompleteClass */
      var url: String = js.native
    }
    
    @JSGlobal("AppleTVJS.Player")
    @js.native
    class Player ()
      extends StObject
         with typings.appletvjs.AppleTVJS.Player
    
    @JSGlobal("AppleTVJS.Playlist")
    @js.native
    class Playlist ()
      extends StObject
         with typings.appletvjs.AppleTVJS.Playlist {
      
      /** Returns the MediaItem located in the indicated array index. */
      /* CompleteClass */
      override def item(index: Double): typings.appletvjs.AppleTVJS.MediaItem = js.native
      
      /** The number of items in the playlist. */
      /* CompleteClass */
      var length: Double = js.native
      
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
    
    @JSGlobal("AppleTVJS.TVError")
    @js.native
    class TVError ()
      extends StObject
         with typings.appletvjs.AppleTVJS.TVError {
      
      /** The error code. */
      /* CompleteClass */
      var code: String = js.native
      
      /** A string containing the description of the error. */
      /* CompleteClass */
      var description: String = js.native
      
      /**
        * A string containing the error domain.
        *
        * The predefined error domains:
        * NSPOSIXErrorDomain - POSIX/BSD errors
        * NSOSStatusErrorDomain - OS X/Carbon errors
        * NSMachErrorDomain - Mach errors
        * */
      /* CompleteClass */
      var domain: String = js.native
      
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
      var userInfo: js.Any = js.native
    }
  }
  
  @JSGlobal("Device")
  @js.native
  def Device: typings.appletvjs.AppleTVJS.Device = js.native
  @scala.inline
  def Device_=(x: Device): Unit = js.Dynamic.global.updateDynamic("Device")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Settings")
  @js.native
  def Settings: typings.appletvjs.AppleTVJS.Settings = js.native
  @scala.inline
  def Settings_=(x: Settings): Unit = js.Dynamic.global.updateDynamic("Settings")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = (js.Dynamic.global.applyDynamic("evaluateScripts")(scripts.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("navigationDocument")
  @js.native
  def navigationDocument: NavigationDocument = js.native
  @scala.inline
  def navigationDocument_=(x: NavigationDocument): Unit = js.Dynamic.global.updateDynamic("navigationDocument")(x.asInstanceOf[js.Any])
}
