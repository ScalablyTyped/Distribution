package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathGroupChar extends StObject {
  
  var AlignTop: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  var Char: Double
  
  var CharTop: Boolean
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathGroupChar_typekey")
  var WordDotOMathGroupChar_typekey: OMathGroupChar
}
object OMathGroupChar {
  
  inline def apply(
    AlignTop: Boolean,
    Application: Application,
    Char: Double,
    CharTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: Any,
    WordDotOMathGroupChar_typekey: OMathGroupChar
  ): OMathGroupChar = {
    val __obj = js.Dynamic.literal(AlignTop = AlignTop.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharTop = CharTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathGroupChar_typekey")(WordDotOMathGroupChar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathGroupChar]
  }
  
  extension [Self <: OMathGroupChar](x: Self) {
    
    inline def setAlignTop(value: Boolean): Self = StObject.set(x, "AlignTop", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    inline def setCharTop(value: Boolean): Self = StObject.set(x, "CharTop", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathGroupChar_typekey(value: OMathGroupChar): Self = StObject.set(x, "Word.OMathGroupChar_typekey", value.asInstanceOf[js.Any])
  }
}
