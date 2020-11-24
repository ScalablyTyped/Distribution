package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathScrSubSup extends js.Object {
  
  var AlignScripts: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  def RemoveSub(): OMathFunction = js.native
  
  def RemoveSup(): OMathFunction = js.native
  
  val Sub: OMath = js.native
  
  val Sup: OMath = js.native
  
  def ToScrPre(): OMathFunction = js.native
  
  @JSName("Word.OMathScrSubSup_typekey")
  var WordDotOMathScrSubSup_typekey: OMathScrSubSup = js.native
}
object OMathScrSubSup {
  
  @scala.inline
  def apply(
    AlignScripts: Boolean,
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    RemoveSub: () => OMathFunction,
    RemoveSup: () => OMathFunction,
    Sub: OMath,
    Sup: OMath,
    ToScrPre: () => OMathFunction,
    WordDotOMathScrSubSup_typekey: OMathScrSubSup
  ): OMathScrSubSup = {
    val __obj = js.Dynamic.literal(AlignScripts = AlignScripts.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveSub = js.Any.fromFunction0(RemoveSub), RemoveSup = js.Any.fromFunction0(RemoveSup), Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrPre = js.Any.fromFunction0(ToScrPre))
    __obj.updateDynamic("Word.OMathScrSubSup_typekey")(WordDotOMathScrSubSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSubSup]
  }
  
  @scala.inline
  implicit class OMathScrSubSupOps[Self <: OMathScrSubSup] (val x: Self) extends AnyVal {
    
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
    def setAlignScripts(value: Boolean): Self = this.set("AlignScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSub(value: () => OMathFunction): Self = this.set("RemoveSub", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSup(value: () => OMathFunction): Self = this.set("RemoveSup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSub(value: OMath): Self = this.set("Sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSup(value: OMath): Self = this.set("Sup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToScrPre(value: () => OMathFunction): Self = this.set("ToScrPre", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotOMathScrSubSup_typekey(value: OMathScrSubSup): Self = this.set("Word.OMathScrSubSup_typekey", value.asInstanceOf[js.Any])
  }
}
