package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathBar extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BarTop: Boolean = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathBar_typekey")
  var WordDotOMathBar_typekey: OMathBar = js.native
}
object OMathBar {
  
  @scala.inline
  def apply(
    Application: Application,
    BarTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathBar_typekey: OMathBar
  ): OMathBar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BarTop = BarTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBar_typekey")(WordDotOMathBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBar]
  }
  
  @scala.inline
  implicit class OMathBarOps[Self <: OMathBar] (val x: Self) extends AnyVal {
    
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
    def setBarTop(value: Boolean): Self = this.set("BarTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathBar_typekey(value: OMathBar): Self = this.set("Word.OMathBar_typekey", value.asInstanceOf[js.Any])
  }
}
