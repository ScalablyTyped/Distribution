package typings
package amchartsLib.titleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /**
    * @default 1
    */
  var alpha: scala.Double
  /**
    * Specifies if the tile is bold or not.
    * @default false
    */
  var bold: scala.Boolean
  /**
    * Text color of a title.
    */
  var color: java.lang.String
  /**
    * Unique id of a Title. You don't need to set it, unless you want to.
    */
  var id: java.lang.String
  /**
    * Text size
    */
  var size: scala.Double
  /**
    * Text of a label
    */
  var text: java.lang.String
}

object Title {
  @scala.inline
  def apply(
    alpha: scala.Double,
    bold: scala.Boolean,
    color: java.lang.String,
    id: java.lang.String,
    size: scala.Double,
    text: java.lang.String
  ): Title = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Title]
  }
}

