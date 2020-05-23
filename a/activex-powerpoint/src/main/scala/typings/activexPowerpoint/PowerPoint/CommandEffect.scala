package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Command: String
  val Parent: js.Any
  @JSName("PowerPoint.CommandEffect_typekey")
  var PowerPointDotCommandEffect_typekey: CommandEffect
  var Type: MsoAnimCommandType
  var bookmark: String
}

object CommandEffect {
  @scala.inline
  def apply(
    Application: Application,
    Command: String,
    Parent: js.Any,
    PowerPointDotCommandEffect_typekey: CommandEffect,
    Type: MsoAnimCommandType,
    bookmark: String
  ): CommandEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CommandEffect_typekey")(PowerPointDotCommandEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandEffect]
  }
}

