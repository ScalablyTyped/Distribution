package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Track
import typings.arcgisJsApi.esri.TrackConstructor
import typings.arcgisJsApi.esri.TrackProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackMod extends Shortcut {
  
  @JSImport("esri/widgets/Track", JSImport.Namespace)
  @js.native
  val ^ : TrackConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Track", JSImport.Namespace)
  @js.native
  /**
    * Provides a simple button that animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's location when clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html)
    */
  class Class () extends Track {
    def this(properties: TrackProperties) = this()
  }
  
  type _To = TrackConstructor
  
  /* This means you don't have to write `^`, but can instead just say `trackMod.foo` */
  override def _to: TrackConstructor = ^
}
