package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var Command: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CommandEffect_typekey")
  var PowerPointDotCommandEffect_typekey: CommandEffect = js.native
  var Type: MsoAnimCommandType = js.native
  var bookmark: String = js.native
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
  @scala.inline
  implicit class CommandEffectOps[Self <: CommandEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotCommandEffect_typekey(value: CommandEffect): Self = this.set("PowerPoint.CommandEffect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoAnimCommandType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
  }
  
}

