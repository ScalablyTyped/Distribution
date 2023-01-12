package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathDelim extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var BegChar: Double
  
  val Creator: Double
  
  val E: OMathArgs
  
  var EndChar: Double
  
  var Grow: Boolean
  
  var NoLeftChar: Boolean
  
  var NoRightChar: Boolean
  
  val Parent: Any
  
  var SepChar: Double
  
  var Shape: WdOMathShapeType
  
  /* private */ @JSName("Word.OMathDelim_typekey")
  var WordDotOMathDelim_typekey: OMathDelim
}
object OMathDelim {
  
  inline def apply(
    Application: Application,
    BegChar: Double,
    Creator: Double,
    E: OMathArgs,
    EndChar: Double,
    Grow: Boolean,
    NoLeftChar: Boolean,
    NoRightChar: Boolean,
    Parent: Any,
    SepChar: Double,
    Shape: WdOMathShapeType,
    WordDotOMathDelim_typekey: OMathDelim
  ): OMathDelim = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BegChar = BegChar.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], EndChar = EndChar.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], NoLeftChar = NoLeftChar.asInstanceOf[js.Any], NoRightChar = NoRightChar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SepChar = SepChar.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathDelim_typekey")(WordDotOMathDelim_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathDelim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathDelim] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBegChar(value: Double): Self = StObject.set(x, "BegChar", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMathArgs): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setEndChar(value: Double): Self = StObject.set(x, "EndChar", value.asInstanceOf[js.Any])
    
    inline def setGrow(value: Boolean): Self = StObject.set(x, "Grow", value.asInstanceOf[js.Any])
    
    inline def setNoLeftChar(value: Boolean): Self = StObject.set(x, "NoLeftChar", value.asInstanceOf[js.Any])
    
    inline def setNoRightChar(value: Boolean): Self = StObject.set(x, "NoRightChar", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSepChar(value: Double): Self = StObject.set(x, "SepChar", value.asInstanceOf[js.Any])
    
    inline def setShape(value: WdOMathShapeType): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathDelim_typekey(value: OMathDelim): Self = StObject.set(x, "Word.OMathDelim_typekey", value.asInstanceOf[js.Any])
  }
}
