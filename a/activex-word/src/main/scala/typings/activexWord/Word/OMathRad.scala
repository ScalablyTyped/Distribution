package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathRad extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Deg: OMath
  val E: OMath
  var HideDeg: Boolean
  val Parent: js.Any
  @JSName("Word.OMathRad_typekey")
  var WordDotOMathRad_typekey: OMathRad
}

object OMathRad {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Deg: OMath,
    E: OMath,
    HideDeg: Boolean,
    Parent: js.Any,
    WordDotOMathRad_typekey: OMathRad
  ): OMathRad = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Deg = Deg.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideDeg = HideDeg.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRad_typekey")(WordDotOMathRad_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRad]
  }
}

