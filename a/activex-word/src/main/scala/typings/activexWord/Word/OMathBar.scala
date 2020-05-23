package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathBar extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BarTop: Boolean
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  @JSName("Word.OMathBar_typekey")
  var WordDotOMathBar_typekey: OMathBar
}

object OMathBar {
  @scala.inline
  def apply(
    Application: Application,
    BarTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathBar_typekey: OMathBar
  ): OMathBar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BarTop = BarTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBar_typekey")(WordDotOMathBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBar]
  }
}

