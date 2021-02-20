package typings.appletvjs

import typings.appletvjs.AppleTVJS.App
import typings.appletvjs.AppleTVJS.Device
import typings.appletvjs.AppleTVJS.NavigationDocument
import typings.appletvjs.AppleTVJS.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      extends typings.appletvjs.AppleTVJS.Highlight
    
    @JSGlobal("AppleTVJS.HighlightGroup")
    @js.native
    class HighlightGroup ()
      extends typings.appletvjs.AppleTVJS.HighlightGroup
    
    @JSGlobal("AppleTVJS.Interstitial")
    @js.native
    class Interstitial ()
      extends typings.appletvjs.AppleTVJS.Interstitial
    
    @JSGlobal("AppleTVJS.MediaItem")
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
    }
    
    @JSGlobal("AppleTVJS.Player")
    @js.native
    class Player ()
      extends typings.appletvjs.AppleTVJS.Player
    
    @JSGlobal("AppleTVJS.Playlist")
    @js.native
    class Playlist ()
      extends typings.appletvjs.AppleTVJS.Playlist
    
    @JSGlobal("AppleTVJS.TVError")
    @js.native
    class TVError ()
      extends typings.appletvjs.AppleTVJS.TVError
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
  
  @JSGlobal("evaluateScripts")
  @js.native
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("navigationDocument")
  @js.native
  def navigationDocument: NavigationDocument = js.native
  @scala.inline
  def navigationDocument_=(x: NavigationDocument): Unit = js.Dynamic.global.updateDynamic("navigationDocument")(x.asInstanceOf[js.Any])
}
