package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair of values in map units that define the width and height of a
  * projected coordinate span.
  */
trait MapSize extends js.Object {
  /**
    * The height value, in map point units.
    */
  var height: Double
  /**
    * The width value, in map point units.
    */
  var width: Double
  /**
    * Returns a copy of a map size.
    */
  def copy(): MapSize
  /**
    * Indicates whether two map sizes are equal.
    *
    * @param anotherSize The map size to equate to.
    */
  def equals(anotherSize: MapSize): Boolean
}

object MapSize {
  @scala.inline
  def apply(copy: () => MapSize, equals: MapSize => Boolean, height: Double, width: Double): MapSize = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapSize]
  }
}

