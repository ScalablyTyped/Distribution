package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathBorderBox extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  var HideBot: Boolean
  var HideLeft: Boolean
  var HideRight: Boolean
  var HideTop: Boolean
  val Parent: js.Any
  var StrikeBLTR: Boolean
  var StrikeH: Boolean
  var StrikeTLBR: Boolean
  var StrikeV: Boolean
  @JSName("Word.OMathBorderBox_typekey")
  var WordDotOMathBorderBox_typekey: OMathBorderBox
}

object OMathBorderBox {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    HideBot: Boolean,
    HideLeft: Boolean,
    HideRight: Boolean,
    HideTop: Boolean,
    Parent: js.Any,
    StrikeBLTR: Boolean,
    StrikeH: Boolean,
    StrikeTLBR: Boolean,
    StrikeV: Boolean,
    WordDotOMathBorderBox_typekey: OMathBorderBox
  ): OMathBorderBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideBot = HideBot.asInstanceOf[js.Any], HideLeft = HideLeft.asInstanceOf[js.Any], HideRight = HideRight.asInstanceOf[js.Any], HideTop = HideTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StrikeBLTR = StrikeBLTR.asInstanceOf[js.Any], StrikeH = StrikeH.asInstanceOf[js.Any], StrikeTLBR = StrikeTLBR.asInstanceOf[js.Any], StrikeV = StrikeV.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBorderBox_typekey")(WordDotOMathBorderBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBorderBox]
  }
}

