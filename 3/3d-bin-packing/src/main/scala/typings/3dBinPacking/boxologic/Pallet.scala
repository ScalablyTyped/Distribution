package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pallet containing boxes.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
trait Pallet extends Instance {
  /**
    * Set placement orientation.
    */
  def set_orientation(orientation: Double): Unit
}

object Pallet {
  @scala.inline
  def apply(
    height: Double,
    layout_height: Double,
    layout_length: Double,
    layout_width: Double,
    length: Double,
    set_orientation: Double => Unit,
    volume: Double,
    width: Double
  ): Pallet = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], set_orientation = js.Any.fromFunction1(set_orientation), volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pallet]
  }
}

