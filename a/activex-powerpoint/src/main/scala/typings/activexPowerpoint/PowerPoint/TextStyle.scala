package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Levels: TextStyleLevels = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyle_typekey")
  var PowerPointDotTextStyle_typekey: TextStyle = js.native
  
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler = js.native
  
  val TextFrame: typings.activexPowerpoint.PowerPoint.TextFrame = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(
    Application: Application,
    Levels: TextStyleLevels,
    Parent: js.Any,
    PowerPointDotTextStyle_typekey: TextStyle,
    Ruler: Ruler,
    TextFrame: TextFrame
  ): TextStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyle_typekey")(PowerPointDotTextStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    
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
    def setLevels(value: TextStyleLevels): Self = this.set("Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyle_typekey(value: TextStyle): Self = this.set("PowerPoint.TextStyle_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: Ruler): Self = this.set("Ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame(value: TextFrame): Self = this.set("TextFrame", value.asInstanceOf[js.Any])
  }
}
