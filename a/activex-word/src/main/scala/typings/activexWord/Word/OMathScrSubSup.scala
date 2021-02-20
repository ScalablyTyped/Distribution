package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathScrSubSup extends StObject {
  
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
  implicit class OMathScrSubSupMutableBuilder[Self <: OMathScrSubSup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignScripts(value: Boolean): Self = StObject.set(x, "AlignScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSub(value: () => OMathFunction): Self = StObject.set(x, "RemoveSub", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSup(value: () => OMathFunction): Self = StObject.set(x, "RemoveSup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToScrPre(value: () => OMathFunction): Self = StObject.set(x, "ToScrPre", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotOMathScrSubSup_typekey(value: OMathScrSubSup): Self = StObject.set(x, "Word.OMathScrSubSup_typekey", value.asInstanceOf[js.Any])
  }
}
