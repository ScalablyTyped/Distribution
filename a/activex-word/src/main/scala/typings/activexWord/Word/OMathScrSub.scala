package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathScrSub extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  val Sub: OMath
  @JSName("Word.OMathScrSub_typekey")
  var WordDotOMathScrSub_typekey: OMathScrSub
}

object OMathScrSub {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    WordDotOMathScrSub_typekey: OMathScrSub
  ): OMathScrSub = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSub_typekey")(WordDotOMathScrSub_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSub]
  }
}

