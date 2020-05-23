package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The values that define content padding within the map view frame.
  */
trait Padding extends js.Object {
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  var bottom: Double
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  var left: Double
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  var right: Double
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  var top: Double
}

object Padding {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

