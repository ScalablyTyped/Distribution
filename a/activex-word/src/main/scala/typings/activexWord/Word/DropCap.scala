package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropCap extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: Double = js.native
  
  var DistanceFromText: Double = js.native
  
  def Enable(): Unit = js.native
  
  var FontName: String = js.native
  
  var LinesToDrop: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Position: WdDropPosition = js.native
  
  @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: DropCap = js.native
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
  
  @scala.inline
  implicit class DropCapOps[Self <: DropCap] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromText(value: Double): Self = this.set("DistanceFromText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("Enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesToDrop(value: Double): Self = this.set("LinesToDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: WdDropPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDropCap_typekey(value: DropCap): Self = this.set("Word.DropCap_typekey", value.asInstanceOf[js.Any])
  }
}
