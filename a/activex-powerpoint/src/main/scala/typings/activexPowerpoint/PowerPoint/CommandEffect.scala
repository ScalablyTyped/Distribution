package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandEffect extends StObject {
  
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
  
  @scala.inline
  implicit class CommandEffectMutableBuilder[Self <: CommandEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCommandEffect_typekey(value: CommandEffect): Self = StObject.set(x, "PowerPoint.CommandEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoAnimCommandType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
