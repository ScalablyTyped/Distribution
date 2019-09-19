package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The values that define content padding within the map view frame.
  */
@JSGlobal("mapkit.Padding")
@js.native
/**
  * Creates a padding object, and initializes its inset margin properties.
  *
  * @param top The amount of padding, in CSS pixels, to inset the map from
  * the top edge.
  * @param right The amount of padding, in CSS pixels, to inset the map from
  * the right edge.
  * @param bottom The amount of padding, in CSS pixels, to inset the map from
  * the left edge.
  * @param left The amount of padding, in CSS pixels, to inset the map from
  * the left edge.
  */
class Padding () extends js.Object {
  def this(options: PaddingConstructorOptions) = this()
  def this(top: Double) = this()
  def this(top: Double, right: Double) = this()
  def this(top: Double, right: Double, bottom: Double) = this()
  def this(top: Double, right: Double, bottom: Double, left: Double) = this()
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  var bottom: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  var left: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  var right: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  var top: Double = js.native
}

