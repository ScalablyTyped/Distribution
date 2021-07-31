package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathLimLow extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Lim: OMath
  
  val Parent: js.Any
  
  def ToLimUpp(): OMathFunction
  
  @JSName("Word.OMathLimLow_typekey")
  var WordDotOMathLimLow_typekey: OMathLimLow
}
object OMathLimLow {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Lim: OMath,
    Parent: js.Any,
    ToLimUpp: () => OMathFunction,
    WordDotOMathLimLow_typekey: OMathLimLow
  ): OMathLimLow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Lim = Lim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToLimUpp = js.Any.fromFunction0(ToLimUpp))
    __obj.updateDynamic("Word.OMathLimLow_typekey")(WordDotOMathLimLow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathLimLow]
  }
  
  @scala.inline
  implicit class OMathLimLowMutableBuilder[Self <: OMathLimLow] (val x: Self) extends AnyVal {
    
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
    def setToLimUpp(value: () => OMathFunction): Self = StObject.set(x, "ToLimUpp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotOMathLimLow_typekey(value: OMathLimLow): Self = StObject.set(x, "Word.OMathLimLow_typekey", value.asInstanceOf[js.Any])
  }
}
