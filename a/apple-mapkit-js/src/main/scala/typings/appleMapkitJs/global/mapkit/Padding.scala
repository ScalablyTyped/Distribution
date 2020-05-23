package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.PaddingConstructorOptions
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
class Padding ()
  extends typings.appleMapkitJs.mapkit.Padding {
  def this(options: PaddingConstructorOptions) = this()
  def this(top: Double) = this()
  def this(top: Double, right: Double) = this()
  def this(top: Double, right: Double, bottom: Double) = this()
  def this(top: Double, right: Double, bottom: Double, left: Double) = this()
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  /* CompleteClass */
  override var bottom: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  /* CompleteClass */
  override var left: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  /* CompleteClass */
  override var right: Double = js.native
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  /* CompleteClass */
  override var top: Double = js.native
}

