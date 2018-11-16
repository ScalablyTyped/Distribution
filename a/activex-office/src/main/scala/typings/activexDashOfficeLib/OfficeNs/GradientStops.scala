package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientStops extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): GradientStop = js.native
  /** @param Index [Index=-1] */
  def Delete(): scala.Unit = js.native
  /** @param Index [Index=-1] */
  def Delete(Index: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           */
  def Insert(RGB: scala.Double, Position: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           */
  def Insert(RGB: scala.Double, Position: scala.Double, Transparency: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           */
  def Insert(RGB: scala.Double, Position: scala.Double, Transparency: scala.Double, Index: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           * @param Brightness [Brightness=0]
           */
  def Insert2(RGB: scala.Double, Position: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           * @param Brightness [Brightness=0]
           */
  def Insert2(RGB: scala.Double, Position: scala.Double, Transparency: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           * @param Brightness [Brightness=0]
           */
  def Insert2(RGB: scala.Double, Position: scala.Double, Transparency: scala.Double, Index: scala.Double): scala.Unit = js.native
  /**
           * @param Transparency [Transparency=0]
           * @param Index [Index=-1]
           * @param Brightness [Brightness=0]
           */
  def Insert2(
    RGB: scala.Double,
    Position: scala.Double,
    Transparency: scala.Double,
    Index: scala.Double,
    Brightness: scala.Double
  ): scala.Unit = js.native
  def Item(Index: scala.Double): GradientStop = js.native
}

