package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends ActionBase {
  /**
    * The URL to an image that will be used to represent the action. This property will be used as a background image for the node. It may be used in conjunction with the `className` property or by itself. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: java.lang.String
}

object ActionButton {
  @scala.inline
  def apply(
    active: scala.Boolean,
    className: java.lang.String,
    clone: js.Function0[ActionButton],
    disabled: scala.Boolean,
    id: java.lang.String,
    image: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    visible: scala.Boolean
  ): ActionButton = {
    val __obj = js.Dynamic.literal(active = active, className = className, clone = clone, disabled = disabled, id = id, image = image, title = title, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionButton]
  }
}

