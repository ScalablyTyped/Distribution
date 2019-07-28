package typings.amcharts.titleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /**
    * @default 1
    */
  var alpha: Double
  /**
    * Specifies if the tile is bold or not.
    * @default false
    */
  var bold: Boolean
  /**
    * Text color of a title.
    */
  var color: String
  /**
    * Unique id of a Title. You don't need to set it, unless you want to.
    */
  var id: String
  /**
    * Text size
    */
  var size: Double
  /**
    * Text of a label
    */
  var text: String
}

object Title {
  @scala.inline
  def apply(alpha: Double, bold: Boolean, color: String, id: String, size: Double, text: String): Title = {
    val __obj = js.Dynamic.literal(alpha = alpha, bold = bold, color = color, id = id, size = size, text = text)
  
    __obj.asInstanceOf[Title]
  }
}

