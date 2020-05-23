package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathScrPre extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  val Sub: OMath
  val Sup: OMath
  @JSName("Word.OMathScrPre_typekey")
  var WordDotOMathScrPre_typekey: OMathScrPre
  def ToScrSubSup(): OMathFunction
}

object OMathScrPre {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    Sup: OMath,
    ToScrSubSup: () => OMathFunction,
    WordDotOMathScrPre_typekey: OMathScrPre
  ): OMathScrPre = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrSubSup = js.Any.fromFunction0(ToScrSubSup))
    __obj.updateDynamic("Word.OMathScrPre_typekey")(WordDotOMathScrPre_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrPre]
  }
}

