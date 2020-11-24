package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathBorderBox extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  var HideBot: Boolean = js.native
  
  var HideLeft: Boolean = js.native
  
  var HideRight: Boolean = js.native
  
  var HideTop: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var StrikeBLTR: Boolean = js.native
  
  var StrikeH: Boolean = js.native
  
  var StrikeTLBR: Boolean = js.native
  
  var StrikeV: Boolean = js.native
  
  @JSName("Word.OMathBorderBox_typekey")
  var WordDotOMathBorderBox_typekey: OMathBorderBox = js.native
}
object OMathBorderBox {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    HideBot: Boolean,
    HideLeft: Boolean,
    HideRight: Boolean,
    HideTop: Boolean,
    Parent: js.Any,
    StrikeBLTR: Boolean,
    StrikeH: Boolean,
    StrikeTLBR: Boolean,
    StrikeV: Boolean,
    WordDotOMathBorderBox_typekey: OMathBorderBox
  ): OMathBorderBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideBot = HideBot.asInstanceOf[js.Any], HideLeft = HideLeft.asInstanceOf[js.Any], HideRight = HideRight.asInstanceOf[js.Any], HideTop = HideTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StrikeBLTR = StrikeBLTR.asInstanceOf[js.Any], StrikeH = StrikeH.asInstanceOf[js.Any], StrikeTLBR = StrikeTLBR.asInstanceOf[js.Any], StrikeV = StrikeV.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBorderBox_typekey")(WordDotOMathBorderBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBorderBox]
  }
  
  @scala.inline
  implicit class OMathBorderBoxOps[Self <: OMathBorderBox] (val x: Self) extends AnyVal {
    
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
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideBot(value: Boolean): Self = this.set("HideBot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLeft(value: Boolean): Self = this.set("HideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRight(value: Boolean): Self = this.set("HideRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTop(value: Boolean): Self = this.set("HideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeBLTR(value: Boolean): Self = this.set("StrikeBLTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeH(value: Boolean): Self = this.set("StrikeH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeTLBR(value: Boolean): Self = this.set("StrikeTLBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeV(value: Boolean): Self = this.set("StrikeV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathBorderBox_typekey(value: OMathBorderBox): Self = this.set("Word.OMathBorderBox_typekey", value.asInstanceOf[js.Any])
  }
}
