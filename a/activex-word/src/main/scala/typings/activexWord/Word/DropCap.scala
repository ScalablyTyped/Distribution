package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropCap extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var DistanceFromText: Double
  var FontName: String
  var LinesToDrop: Double
  val Parent: js.Any
  var Position: WdDropPosition
  @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: DropCap
  def Clear(): Unit
  def Enable(): Unit
}

object DropCap {
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    DistanceFromText: Double,
    Enable: () => Unit,
    FontName: String,
    LinesToDrop: Double,
    Parent: js.Any,
    Position: WdDropPosition,
    WordDotDropCap_typekey: DropCap
  ): DropCap = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Enable = js.Any.fromFunction0(Enable), FontName = FontName.asInstanceOf[js.Any], LinesToDrop = LinesToDrop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropCap_typekey")(WordDotDropCap_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCap]
  }
}

