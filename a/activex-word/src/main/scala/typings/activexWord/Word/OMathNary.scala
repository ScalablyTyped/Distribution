package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathNary extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Char: Double
  val Creator: Double
  val E: OMath
  var Grow: Boolean
  var HideSub: Boolean
  var HideSup: Boolean
  val Parent: js.Any
  val Sub: OMath
  var SubSupLim: Boolean
  val Sup: OMath
  @JSName("Word.OMathNary_typekey")
  var WordDotOMathNary_typekey: OMathNary
}

object OMathNary {
  @scala.inline
  def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Grow: Boolean,
    HideSub: Boolean,
    HideSup: Boolean,
    Parent: js.Any,
    Sub: OMath,
    SubSupLim: Boolean,
    Sup: OMath,
    WordDotOMathNary_typekey: OMathNary
  ): OMathNary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], HideSub = HideSub.asInstanceOf[js.Any], HideSup = HideSup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], SubSupLim = SubSupLim.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathNary_typekey")(WordDotOMathNary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathNary]
  }
}

