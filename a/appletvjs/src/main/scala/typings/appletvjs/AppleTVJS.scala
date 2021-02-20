package typings.appletvjs

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppleTVJS {
  
  @js.native
  trait App extends StObject {
    
    /**
      * The onError attribute is used to handle any errors sent from the device.
      * This attribute must be set to a function that accepts an “options” argument.
      * For example App.onError = function (options) {}.
      * */
    def onError(options: js.Any): Unit = js.native
    
    /**
      * The onExit attribute is used to complete any actions that need to be cleaned
      * up when the app has been exited. This attribute must be set to a function that
      * accepts an “options” argument. For example App.onExit = function (options) {}.
      * */
    def onExit(options: js.Any): Unit = js.native
    
    /**
      * The onLaunch attribute is used to start any required actions when the app
      * launches. This attribute must be set to a function that accepts an “options”
      * argument. For example App.onLaunch = function (options) {}.
      * */
    def onLaunch(options: js.Any): Unit = js.native
    
    /**
      * This function reloads the initial JavaScript file without quitting the app.
      * The optional reloadData parameter provides developers with a way to capture
      * and restart the app in it’s current state. If the reloadData parameter is not
      * present, the app is restarted in its initial state. This attribute must be set
      * to a function that accepts an “options” argument.
      * For example App.onError = function (options) {}.
      * */
    def reload(): Unit = js.native
    def reload(options: js.UndefOr[scala.Nothing], reloadData: js.Any): Unit = js.native
    def reload(options: js.Any): Unit = js.native
    def reload(options: js.Any, reloadData: js.Any): Unit = js.native
  }
  
  @js.native
  trait Device extends StObject {
    
    /** The unique identifier for the app. */
    var appIdentifier: String = js.native
    
    /** The current app version. */
    var appVersion: String = js.native
    
    /** A string that identifies the device model. */
    var model: String = js.native
    
    /** The version of the product installed on the device. */
    var productType: String = js.native
    
    /** The operating system on the device. */
    var systemVersion: String = js.native
    
    /** The UUID of the device. */
    var vendorIdentifier: String = js.native
  }
  object Device {
    
    @scala.inline
    def apply(
      appIdentifier: String,
      appVersion: String,
      model: String,
      productType: String,
      systemVersion: String,
      vendorIdentifier: String
    ): Device = {
      val __obj = js.Dynamic.literal(appIdentifier = appIdentifier.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], vendorIdentifier = vendorIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIdentifier(value: String): Self = StObject.set(x, "appIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemVersion(value: String): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorIdentifier(value: String): Self = StObject.set(x, "vendorIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureElement extends Element {
    
    /** Gets a feature for a given element. */
    def getFeature(feature: String): js.Any = js.native
  }
  
  @js.native
  trait Highlight extends StObject {
    
    /** The description of the highlight. */
    var description: String = js.native
    
    /** The duration of the highlight. */
    var duration: Double = js.native
    
    /** The imageURL of the highlight. */
    var imageURL: String = js.native
    
    /** The name of the highlight. */
    var name: String = js.native
    
    /** The starttime of the highlight. */
    var starttime: Double = js.native
  }
  object Highlight {
    
    @scala.inline
    def apply(description: String, duration: Double, imageURL: String, name: String, starttime: Double): Highlight = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], imageURL = imageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlight]
    }
    
    @scala.inline
    implicit class HighlightMutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarttime(value: Double): Self = StObject.set(x, "starttime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HighlightGroup extends StObject {
    
    /** The hightlights in the highlight group. */
    var hightlights: js.Array[Highlight] = js.native
    
    /** The name of the highlight group. */
    var name: String = js.native
  }
  object HighlightGroup {
    
    @scala.inline
    def apply(hightlights: js.Array[Highlight], name: String): HighlightGroup = {
      val __obj = js.Dynamic.literal(hightlights = hightlights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightGroup]
    }
    
    @scala.inline
    implicit class HighlightGroupMutableBuilder[Self <: HighlightGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHightlights(value: js.Array[Highlight]): Self = StObject.set(x, "hightlights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHightlightsVarargs(value: Highlight*): Self = StObject.set(x, "hightlights", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Interstitial extends StObject {
    
    /** The duration of the interstitial. */
    var duration: Double = js.native
    
    /** The starttime of the interstitial. */
    var starttime: Double = js.native
  }
  object Interstitial {
    
    @scala.inline
    def apply(duration: Double, starttime: Double): Interstitial = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interstitial]
    }
    
    @scala.inline
    implicit class InterstitialMutableBuilder[Self <: Interstitial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarttime(value: Double): Self = StObject.set(x, "starttime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Keyboard extends StObject {
    
    /**
      * A callback function that is called when the text inside
      * of searchField or textField element changes.
      * */
    def onTextChange(): Unit = js.native
    
    /** The text inside of a searchField or textField element. */
    var text: String = js.native
  }
  object Keyboard {
    
    @scala.inline
    def apply(onTextChange: () => Unit, text: String): Keyboard = {
      val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction0(onTextChange), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyboard]
    }
    
    @scala.inline
    implicit class KeyboardMutableBuilder[Self <: Keyboard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTextChange(value: () => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaItem extends StObject {
    
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
    implicit class MediaItemMutableBuilder[Self <: MediaItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtworkImageURL(value: String): Self = StObject.set(x, "artworkImageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRatingDomain(value: String): Self = StObject.set(x, "contentRatingDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRatingRanking(value: Double): Self = StObject.set(x, "contentRatingRanking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGroups(value: js.Array[HighlightGroup]): Self = StObject.set(x, "highlightGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGroupsVarargs(value: HighlightGroup*): Self = StObject.set(x, "highlightGroups", js.Array(value :_*))
      
      @scala.inline
      def setInterstitials(value: js.Array[Interstitial]): Self = StObject.set(x, "interstitials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterstitialsVarargs(value: Interstitial*): Self = StObject.set(x, "interstitials", js.Array(value :_*))
      
      @scala.inline
      def setIsExplicit(value: Boolean): Self = StObject.set(x, "isExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadAssetID(value: (String, js.Function2[/* assetID */ String, /* error */ String, Unit]) => Unit): Self = StObject.set(x, "loadAssetID", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadCertificate(value: (String, js.Function2[/* certificate */ String, /* error */ String, Unit]) => Unit): Self = StObject.set(x, "loadCertificate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadKey(
        value: (String, js.Any, js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => Unit
      ): Self = StObject.set(x, "loadKey", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResumeTime(value: Double): Self = StObject.set(x, "resumeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuBarDocument extends StObject {
    
    /**
      * Retrieves the document associated with the specified menu item.
      * */
    def getDocument(menuItem: Element): Document = js.native
    
    /**
      * Associates a document with a menu item.
      * */
    def setDocument(document: Document, menuItem: Element): Unit = js.native
    
    /**
      * Sets the focus in a menu bar to the specified menu item.
      * */
    def setSelectedItem(menuItem: Element): Unit = js.native
  }
  object MenuBarDocument {
    
    @scala.inline
    def apply(
      getDocument: Element => Document,
      setDocument: (Document, Element) => Unit,
      setSelectedItem: Element => Unit
    ): MenuBarDocument = {
      val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2(setDocument), setSelectedItem = js.Any.fromFunction1(setSelectedItem))
      __obj.asInstanceOf[MenuBarDocument]
    }
    
    @scala.inline
    implicit class MenuBarDocumentMutableBuilder[Self <: MenuBarDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDocument(value: Element => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDocument(value: (Document, Element) => Unit): Self = StObject.set(x, "setDocument", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSelectedItem(value: Element => Unit): Self = StObject.set(x, "setSelectedItem", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NavigationDocument extends StObject {
    
    /**
      * Removes all documents currently on the stack.
      * */
    def clear(): Unit = js.native
    
    /** Dismisses the document displayed in modal view. */
    def dismissModal(): Unit = js.native
    
    /** The documents currently on the stack. */
    var documents: js.Array[Document] = js.native
    
    /**
      * Inserts a new document directly before a document currently on the stack.
      * */
    def insertBeforeDocument(document: Document): Unit = js.native
    def insertBeforeDocument(document: Document, beforeDocument: Document): Unit = js.native
    
    /**
      * Removes the top most document from the stack.
      * */
    def popDocument(): Unit = js.native
    
    /**
      * Removes all of the documents on the stack that are above the passed document.
      * */
    def popToDocument(document: Document): Unit = js.native
    
    /**
      * Removes all documents from the stack except for the bottom most document.
      * */
    def popToRootDocument(): Unit = js.native
    
    /**
      * Displays the passed document on top of the current document.
      * */
    def presentModal(document: Document): Unit = js.native
    
    /**
      * This function searches the stack for the first instance of the document
      * contained in the beforeDocument parameter and inserts the document contained
      * in the document parameter on top of it.
      * */
    def pushDocument(document: Document): Unit = js.native
    
    /**
      * Removes the specified document from the stack.
      * */
    def removeDocument(document: Document): Unit = js.native
    
    /**
      * Replaces a document on the stack with a new document.
      * */
    def replaceDocument(document: Document): Unit = js.native
    def replaceDocument(document: Document, beforeDocument: Document): Unit = js.native
  }
  
  @js.native
  trait Player extends StObject {
    
    /** The currently selected media item in the playlist. */
    var currentMediaItem: MediaItem = js.native
    
    /**
      * An event notifying the listener that the player is about to change media items.
      *
      * Valid values are:
      * errorDidOccur
      * fastForwardedToEndOfMediaItem
      * mannuallyChanged
      * newPlaylist
      * playerInvalidated
      * playedToEndOfMediaItem
      * */
    def mediaItemDidChange(reason: String): Unit = js.native
    
    /** The next media item in the playlist. */
    var nextMediaItem: MediaItem = js.native
    
    /** The annotations for a video created by placing a DOM document over the video. */
    var overlayDocument: Document = js.native
    
    /** Pauses the currently playing media item. */
    def pause(): Unit = js.native
    
    /** Plays the currently selected media item. */
    def play(): Unit = js.native
    
    /**
      * The current state of the player.
      *
      * This property can contain the following valid values:
      * begin
      * end
      * loading
      * playing
      * paused
      * scanning
      * */
    var playbackState: String = js.native
    
    /** The play list for a player. */
    var playlist: Playlist = js.native
    
    /** Shows the player UI if it is not currently visible. */
    def present(): Unit = js.native
    
    /** The previous MediaItem object in the playlist. */
    var previousMediaItem: MediaItem = js.native
    
    /**
      * An event that indicates if a seek to time request was accomplished.
      *
      * The values for this attribute can be one of the following:
      * true — The seek performed as requested.
      * false or null— The seek was not performed.
      * An integer value — The seek will be performed to the stated value and not the initial requested value.
      * */
    def requestSeekToTime(): Unit = js.native
    def requestSeekToTime(result: js.Any): Unit = js.native
    
    /** Sets the playback point to a specified time. */
    def seekToTime(time: Double): Unit = js.native
    
    /** Sets the playback speed. */
    def setPlaybackRate(playbackRate: Double): Unit = js.native
    
    /** An event that indicates a state change request has occurred. */
    def shouldHandleStateChange(result: Boolean): Unit = js.native
    
    /** An event that indicates the state has changed. */
    def stateDidChange(): Unit = js.native
    
    /** An event that indicates the state is about to change. */
    def stateWillChange(): Unit = js.native
    
    /** Stops the currently playing item and dismisses the player UI. */
    def stop(): Unit = js.native
    
    /** An event that indicates a particular playback time has been crossed. */
    def timeBoundaryDidCross(): Unit = js.native
    
    /** An event that happens at a specified interval. */
    def timeDidChange(): Unit = js.native
    
    /** An event that happens whenever a specified piece of metadata occurs. */
    def timedMetadata(): Unit = js.native
  }
  
  @js.native
  trait Playlist extends StObject {
    
    /** Returns the MediaItem located in the indicated array index. */
    def item(index: Double): MediaItem = js.native
    
    /** The number of items in the playlist. */
    var length: Double = js.native
    
    /** Removes a media item from the end of a playlist. */
    def pop(): MediaItem = js.native
    
    /** Adds a media item to the end of a playlist. */
    def push(`object`: MediaItem): Unit = js.native
    
    /** Deletes the indicated array elements and replaces them with the specified elements. */
    def splice(index: Double, howManu: Double, `object`: MediaItem): js.Array[MediaItem] = js.native
  }
  object Playlist {
    
    @scala.inline
    def apply(
      item: Double => MediaItem,
      length: Double,
      pop: () => MediaItem,
      push: MediaItem => Unit,
      splice: (Double, Double, MediaItem) => js.Array[MediaItem]
    ): Playlist = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), splice = js.Any.fromFunction3(splice))
      __obj.asInstanceOf[Playlist]
    }
    
    @scala.inline
    implicit class PlaylistMutableBuilder[Self <: Playlist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => MediaItem): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPop(value: () => MediaItem): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: MediaItem => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSplice(value: (Double, Double, MediaItem) => js.Array[MediaItem]): Self = StObject.set(x, "splice", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Restrictions extends StObject {
    
    /** A boolean value that indicates if explicit media is allowed. */
    var allowsExplicit: Boolean = js.native
    
    /** The maximum movie ranking allowed. */
    var maxMovieRank: Double = js.native
    
    /** The maximum movie rating allowed for the specified country. */
    def maxMovieRatingForCountry(countryCode: String): String = js.native
    
    /** The maximum television show ranking allowed. */
    var maxTVShowRank: Double = js.native
    
    /** Sets the maximum television show rating allowed for the specified country. */
    def maxTVShowRatingForCountry(countryCode: String): String = js.native
  }
  object Restrictions {
    
    @scala.inline
    def apply(
      allowsExplicit: Boolean,
      maxMovieRank: Double,
      maxMovieRatingForCountry: String => String,
      maxTVShowRank: Double,
      maxTVShowRatingForCountry: String => String
    ): Restrictions = {
      val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit.asInstanceOf[js.Any], maxMovieRank = maxMovieRank.asInstanceOf[js.Any], maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank.asInstanceOf[js.Any], maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
      __obj.asInstanceOf[Restrictions]
    }
    
    @scala.inline
    implicit class RestrictionsMutableBuilder[Self <: Restrictions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowsExplicit(value: Boolean): Self = StObject.set(x, "allowsExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMovieRank(value: Double): Self = StObject.set(x, "maxMovieRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMovieRatingForCountry(value: String => String): Self = StObject.set(x, "maxMovieRatingForCountry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTVShowRank(value: Double): Self = StObject.set(x, "maxTVShowRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTVShowRatingForCountry(value: String => String): Self = StObject.set(x, "maxTVShowRatingForCountry", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /** Contains the language the device displays information in. */
    var language: String = js.native
    
    /**
      * Called when changes to a device’s restriction information changes.
      */
    def onRestrictionsChange(): Unit = js.native
    
    /** Contains the restriction information on the device. */
    var restrictions: Restrictions = js.native
    
    /** Contains the country code used by the store on this device. */
    var storefrontCountryCode: String = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(
      language: String,
      onRestrictionsChange: () => Unit,
      restrictions: Restrictions,
      storefrontCountryCode: String
    ): Settings = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], onRestrictionsChange = js.Any.fromFunction0(onRestrictionsChange), restrictions = restrictions.asInstanceOf[js.Any], storefrontCountryCode = storefrontCountryCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRestrictionsChange(value: () => Unit): Self = StObject.set(x, "onRestrictionsChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRestrictions(value: Restrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorefrontCountryCode(value: String): Self = StObject.set(x, "storefrontCountryCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TVError extends StObject {
    
    /** The error code. */
    var code: String = js.native
    
    /** A string containing the description of the error. */
    var description: String = js.native
    
    /**
      * A string containing the error domain.
      *
      * The predefined error domains:
      * NSPOSIXErrorDomain - POSIX/BSD errors
      * NSOSStatusErrorDomain - OS X/Carbon errors
      * NSMachErrorDomain - Mach errors
      * */
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
    var userInfo: js.Any = js.native
  }
  object TVError {
    
    @scala.inline
    def apply(code: String, description: String, domain: String, userInfo: js.Any): TVError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[TVError]
    }
    
    @scala.inline
    implicit class TVErrorMutableBuilder[Self <: TVError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
}
