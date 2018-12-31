package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureEffects extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): PictureEffect = js.native
  /** @param Index [Index=-1] */
  def Delete(): scala.Unit = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  /** @param Position [Position=-1] */
  def Insert(EffectType: MsoPictureEffectType): PictureEffect = js.native
  def Insert(EffectType: MsoPictureEffectType, Position: scala.Double): PictureEffect = js.native
  def Item(Index: scala.Double): PictureEffect = js.native
}

