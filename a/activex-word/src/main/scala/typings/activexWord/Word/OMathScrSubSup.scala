package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathScrSubSup extends StObject {
  
  var AlignScripts: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: Any
  
  def RemoveSub(): OMathFunction
  
  def RemoveSup(): OMathFunction
  
  val Sub: OMath
  
  val Sup: OMath
  
  def ToScrPre(): OMathFunction
  
  /* private */ @JSName("Word.OMathScrSubSup_typekey")
  var WordDotOMathScrSubSup_typekey: OMathScrSubSup
}
object OMathScrSubSup {
  
  inline def apply(
    AlignScripts: Boolean,
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: OMathScrSubSup] (val x: Self) extends AnyVal {
    
    inline def setAlignScripts(value: Boolean): Self = StObject.set(x, "AlignScripts", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveSub(value: () => OMathFunction): Self = StObject.set(x, "RemoveSub", js.Any.fromFunction0(value))
    
    inline def setRemoveSup(value: () => OMathFunction): Self = StObject.set(x, "RemoveSup", js.Any.fromFunction0(value))
    
    inline def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    inline def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    inline def setToScrPre(value: () => OMathFunction): Self = StObject.set(x, "ToScrPre", js.Any.fromFunction0(value))
    
    inline def setWordDotOMathScrSubSup_typekey(value: OMathScrSubSup): Self = StObject.set(x, "Word.OMathScrSubSup_typekey", value.asInstanceOf[js.Any])
  }
}
