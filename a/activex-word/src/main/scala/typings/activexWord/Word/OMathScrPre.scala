package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathScrPre extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: js.Any
  
  val Sub: OMath
  
  val Sup: OMath
  
  def ToScrSubSup(): OMathFunction
  
  /* private */ @JSName("Word.OMathScrPre_typekey")
  var WordDotOMathScrPre_typekey: OMathScrPre
}
object OMathScrPre {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    Sup: OMath,
    ToScrSubSup: () => OMathFunction,
    WordDotOMathScrPre_typekey: OMathScrPre
  ): OMathScrPre = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrSubSup = js.Any.fromFunction0(ToScrSubSup))
    __obj.updateDynamic("Word.OMathScrPre_typekey")(WordDotOMathScrPre_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrPre]
  }
  
  extension [Self <: OMathScrPre](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    inline def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    inline def setToScrSubSup(value: () => OMathFunction): Self = StObject.set(x, "ToScrSubSup", js.Any.fromFunction0(value))
    
    inline def setWordDotOMathScrPre_typekey(value: OMathScrPre): Self = StObject.set(x, "Word.OMathScrPre_typekey", value.asInstanceOf[js.Any])
  }
}
