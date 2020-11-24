package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathBox extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Diff: Boolean = js.native
  
  val E: OMath = js.native
  
  var NoBreak: Boolean = js.native
  
  var OpEmu: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathBox_typekey")
  var WordDotOMathBox_typekey: OMathBox = js.native
}
object OMathBox {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Diff: Boolean,
    E: OMath,
    NoBreak: Boolean,
    OpEmu: Boolean,
    Parent: js.Any,
    WordDotOMathBox_typekey: OMathBox
  ): OMathBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Diff = Diff.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], NoBreak = NoBreak.asInstanceOf[js.Any], OpEmu = OpEmu.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBox_typekey")(WordDotOMathBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBox]
  }
  
  @scala.inline
  implicit class OMathBoxOps[Self <: OMathBox] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiff(value: Boolean): Self = this.set("Diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBreak(value: Boolean): Self = this.set("NoBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpEmu(value: Boolean): Self = this.set("OpEmu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathBox_typekey(value: OMathBox): Self = this.set("Word.OMathBox_typekey", value.asInstanceOf[js.Any])
  }
}
