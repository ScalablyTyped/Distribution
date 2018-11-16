package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PictureEffect")
@js.native
class PictureEffect protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  @JSName("EffectParameters")
  val EffectParameters_Original: EffectParameters = js.native
  var `Office.PictureEffect_typekey`: PictureEffect = js.native
  var Position: scala.Double = js.native
  val Type: MsoPictureEffectType = js.native
  var Visible: MsoTriState = js.native
  def Delete(): scala.Unit = js.native
  def EffectParameters(Index: java.lang.String): EffectParameter = js.native
  def EffectParameters(Index: scala.Double): EffectParameter = js.native
}

