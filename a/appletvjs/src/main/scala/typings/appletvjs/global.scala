package typings.appletvjs

import typings.appletvjs.AppleTVJS.NavigationDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var App: typings.appletvjs.AppleTVJS.App = js.native
  
  var Device: typings.appletvjs.AppleTVJS.Device = js.native
  
  var Settings: typings.appletvjs.AppleTVJS.Settings = js.native
  
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  var navigationDocument: NavigationDocument = js.native
  
  @js.native
  object AppleTVJS extends js.Object {
    
    @js.native
    class Highlight ()
      extends typings.appletvjs.AppleTVJS.Highlight
    
    @js.native
    class HighlightGroup ()
      extends typings.appletvjs.AppleTVJS.HighlightGroup
    
    @js.native
    class Interstitial ()
      extends typings.appletvjs.AppleTVJS.Interstitial
    
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
    
    @js.native
    class Player ()
      extends typings.appletvjs.AppleTVJS.Player
    
    @js.native
    class Playlist ()
      extends typings.appletvjs.AppleTVJS.Playlist
    
    @js.native
    class TVError ()
      extends typings.appletvjs.AppleTVJS.TVError
  }
}
