package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathScrSup extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  val Sup: OMath
  @JSName("Word.OMathScrSup_typekey")
  var WordDotOMathScrSup_typekey: OMathScrSup
}

object OMathScrSup {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sup: OMath,
    WordDotOMathScrSup_typekey: OMathScrSup
  ): OMathScrSup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSup_typekey")(WordDotOMathScrSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSup]
  }
}

