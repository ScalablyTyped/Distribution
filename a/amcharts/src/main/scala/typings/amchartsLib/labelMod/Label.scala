package typings
package amchartsLib.labelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /**
    * @Default 'left'
    */
  var align: java.lang.String
  /**
    * @Default 1
    */
  var alpha: scala.Double
  /**
    * Specifies if label is bold or not.
    */
  var bold: scala.Boolean
  /**
    * Color of a label
    */
  var color: java.lang.String
  /**
    * Unique id of a Label. You don't need to set it, unless you want to.
    */
  var id: java.lang.String
  /**
    * Rotation angle.
    */
  var rotation: scala.Double
  /**
    * Text size
    */
  var size: scala.Double
  /**
    * Text of a label
    */
  var text: java.lang.String
  /**
    * URL which will be access if user clicks on a label.
    */
  var url: java.lang.String
  /**
    * X position of a label.
    */
  var x: scala.Double | java.lang.String
  /**
    * y position of a label.
    */
  var y: scala.Double | java.lang.String
}

object Label {
  @scala.inline
  def apply(
    align: java.lang.String,
    alpha: scala.Double,
    bold: scala.Boolean,
    color: java.lang.String,
    id: java.lang.String,
    rotation: scala.Double,
    size: scala.Double,
    text: java.lang.String,
    url: java.lang.String,
    x: scala.Double | java.lang.String,
    y: scala.Double | java.lang.String
  ): Label = {
    val __obj = js.Dynamic.literal(align = align, alpha = alpha, bold = bold, color = color, id = id, rotation = rotation, size = size, text = text, url = url, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Label]
  }
}

