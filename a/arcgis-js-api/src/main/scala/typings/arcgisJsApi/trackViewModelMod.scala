package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TrackViewModel
import typings.arcgisJsApi.esri.TrackViewModelConstructor
import typings.arcgisJsApi.esri.TrackViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Track/TrackViewModel", JSImport.Namespace)
  @js.native
  val ^ : TrackViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Track/TrackViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's location when clicked and tracks it as the location is updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html)
    */
  class Class () extends TrackViewModel {
    def this(properties: TrackViewModelProperties) = this()
  }
  
  type _To = TrackViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `trackViewModelMod.foo` */
  override def _to: TrackViewModelConstructor = ^
}
