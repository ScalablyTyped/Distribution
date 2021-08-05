package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathAcc extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Char: Double
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.OMathAcc_typekey")
  var WordDotOMathAcc_typekey: OMathAcc
}
object OMathAcc {
  
  inline def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathAcc_typekey: OMathAcc
  ): OMathAcc = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAcc_typekey")(WordDotOMathAcc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAcc]
  }
  
  extension [Self <: OMathAcc](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathAcc_typekey(value: OMathAcc): Self = StObject.set(x, "Word.OMathAcc_typekey", value.asInstanceOf[js.Any])
  }
}
