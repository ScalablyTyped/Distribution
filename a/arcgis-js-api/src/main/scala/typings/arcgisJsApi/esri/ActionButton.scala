package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends ActionBase {
  /**
    * The URL to an image that will be used to represent the action. This property will be used as a background image for the node. It may be used in conjunction with the `className` property or by itself. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: String
}

@JSGlobal("__esri.ActionButton")
@js.native
object ActionButton extends TopLevel[ActionButtonConstructor]

