package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleBarViewModel extends Accessor {
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar-ScaleBarViewModel.html#view)
    */
  var view: MapView = js.native
}

@JSGlobal("__esri.ScaleBarViewModel")
@js.native
object ScaleBarViewModel extends TopLevel[ScaleBarViewModelConstructor]

