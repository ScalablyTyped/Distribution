package typings.arcgisJsApi.esri.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.widget.vmEvent")
@js.native
object vmEvent extends js.Object {
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    *
    * @param eventNames The event names to re-dispatch.
    *
    */
  def apply(eventNames: String): js.Function = js.native
  def apply(eventNames: js.Array[String]): js.Function = js.native
}

