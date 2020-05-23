package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathScrSubSup extends js.Object {
  var AlignScripts: Boolean
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  val Sub: OMath
  val Sup: OMath
  @JSName("Word.OMathScrSubSup_typekey")
  var WordDotOMathScrSubSup_typekey: OMathScrSubSup
  def RemoveSub(): OMathFunction
  def RemoveSup(): OMathFunction
  def ToScrPre(): OMathFunction
}

object OMathScrSubSup {
  @scala.inline
  def apply(
    AlignScripts: Boolean,
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    RemoveSub: () => OMathFunction,
    RemoveSup: () => OMathFunction,
    Sub: OMath,
    Sup: OMath,
    ToScrPre: () => OMathFunction,
    WordDotOMathScrSubSup_typekey: OMathScrSubSup
  ): OMathScrSubSup = {
    val __obj = js.Dynamic.literal(AlignScripts = AlignScripts.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveSub = js.Any.fromFunction0(RemoveSub), RemoveSup = js.Any.fromFunction0(RemoveSup), Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrPre = js.Any.fromFunction0(ToScrPre))
    __obj.updateDynamic("Word.OMathScrSubSup_typekey")(WordDotOMathScrSubSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSubSup]
  }
}

