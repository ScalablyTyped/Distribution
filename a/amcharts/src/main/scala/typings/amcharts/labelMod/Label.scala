package typings.amcharts.labelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /**
    * @Default 'left'
    */
  var align: String
  /**
    * @Default 1
    */
  var alpha: Double
  /**
    * Specifies if label is bold or not.
    */
  var bold: Boolean
  /**
    * Color of a label
    */
  var color: String
  /**
    * Unique id of a Label. You don't need to set it, unless you want to.
    */
  var id: String
  /**
    * Rotation angle.
    */
  var rotation: Double
  /**
    * Text size
    */
  var size: Double
  /**
    * Text of a label
    */
  var text: String
  /**
    * URL which will be access if user clicks on a label.
    */
  var url: String
  /**
    * X position of a label.
    */
  var x: Double | String
  /**
    * y position of a label.
    */
  var y: Double | String
}

object Label {
  @scala.inline
  def apply(
    align: String,
    alpha: Double,
    bold: Boolean,
    color: String,
    id: String,
    rotation: Double,
    size: Double,
    text: String,
    url: String,
    x: Double | String,
    y: Double | String
  ): Label = {
    val __obj = js.Dynamic.literal(align = align, alpha = alpha, bold = bold, color = color, id = id, rotation = rotation, size = size, text = text, url = url, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Label]
  }
}

