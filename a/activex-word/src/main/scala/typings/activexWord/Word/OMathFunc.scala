package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathFunc extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val FName: OMath
  
  val Parent: js.Any
  
  @JSName("Word.OMathFunc_typekey")
  var WordDotOMathFunc_typekey: OMathFunc
}
object OMathFunc {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    FName: OMath,
    Parent: js.Any,
    WordDotOMathFunc_typekey: OMathFunc
  ): OMathFunc = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], FName = FName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFunc_typekey")(WordDotOMathFunc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFunc]
  }
  
  @scala.inline
  implicit class OMathFuncMutableBuilder[Self <: OMathFunc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFName(value: OMath): Self = StObject.set(x, "FName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathFunc_typekey(value: OMathFunc): Self = StObject.set(x, "Word.OMathFunc_typekey", value.asInstanceOf[js.Any])
  }
}
