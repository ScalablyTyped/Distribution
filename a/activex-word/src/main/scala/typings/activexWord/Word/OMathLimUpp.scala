package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathLimUpp extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Lim: OMath
  
  val Parent: js.Any
  
  def ToLimLow(): OMathFunction
  
  @JSName("Word.OMathLimUpp_typekey")
  var WordDotOMathLimUpp_typekey: OMathLimUpp
}
object OMathLimUpp {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Lim: OMath,
    Parent: js.Any,
    ToLimLow: () => OMathFunction,
    WordDotOMathLimUpp_typekey: OMathLimUpp
  ): OMathLimUpp = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Lim = Lim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToLimLow = js.Any.fromFunction0(ToLimLow))
    __obj.updateDynamic("Word.OMathLimUpp_typekey")(WordDotOMathLimUpp_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathLimUpp]
  }
  
  @scala.inline
  implicit class OMathLimUppMutableBuilder[Self <: OMathLimUpp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLim(value: OMath): Self = StObject.set(x, "Lim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLimLow(value: () => OMathFunction): Self = StObject.set(x, "ToLimLow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotOMathLimUpp_typekey(value: OMathLimUpp): Self = StObject.set(x, "Word.OMathLimUpp_typekey", value.asInstanceOf[js.Any])
  }
}
