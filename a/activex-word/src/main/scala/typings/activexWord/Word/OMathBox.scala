package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBox extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var Diff: Boolean
  
  val E: OMath
  
  var NoBreak: Boolean
  
  var OpEmu: Boolean
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.OMathBox_typekey")
  var WordDotOMathBox_typekey: OMathBox
}
object OMathBox {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Diff: Boolean,
    E: OMath,
    NoBreak: Boolean,
    OpEmu: Boolean,
    Parent: js.Any,
    WordDotOMathBox_typekey: OMathBox
  ): OMathBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Diff = Diff.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], NoBreak = NoBreak.asInstanceOf[js.Any], OpEmu = OpEmu.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBox_typekey")(WordDotOMathBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBox]
  }
  
  extension [Self <: OMathBox](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDiff(value: Boolean): Self = StObject.set(x, "Diff", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setNoBreak(value: Boolean): Self = StObject.set(x, "NoBreak", value.asInstanceOf[js.Any])
    
    inline def setOpEmu(value: Boolean): Self = StObject.set(x, "OpEmu", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathBox_typekey(value: OMathBox): Self = StObject.set(x, "Word.OMathBox_typekey", value.asInstanceOf[js.Any])
  }
}
