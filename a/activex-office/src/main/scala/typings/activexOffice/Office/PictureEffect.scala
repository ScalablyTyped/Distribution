package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PictureEffect")
@js.native
class PictureEffect protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("EffectParameters")
  val EffectParameters_Original: EffectParameters = js.native
  @JSName("Office.PictureEffect_typekey")
  var OfficeDotPictureEffect_typekey: PictureEffect = js.native
  var Position: Double = js.native
  val Type: MsoPictureEffectType = js.native
  var Visible: MsoTriState = js.native
  def Delete(): Unit = js.native
  def EffectParameters(Index: String): EffectParameter = js.native
  def EffectParameters(Index: Double): EffectParameter = js.native
}

