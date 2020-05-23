package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSchemes extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ColorSchemes_typekey")
  var PowerPointDotColorSchemes_typekey: ColorSchemes = js.native
  /** @param PowerPoint.ColorScheme [Scheme=0] */
  def Add(): ColorScheme = js.native
  def Add(Scheme: ColorScheme): ColorScheme = js.native
  def Item(Index: Double): ColorScheme = js.native
}

