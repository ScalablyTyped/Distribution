package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathDelim extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BegChar: Double = js.native
  
  val Creator: Double = js.native
  
  val E: OMathArgs = js.native
  
  var EndChar: Double = js.native
  
  var Grow: Boolean = js.native
  
  var NoLeftChar: Boolean = js.native
  
  var NoRightChar: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var SepChar: Double = js.native
  
  var Shape: WdOMathShapeType = js.native
  
  @JSName("Word.OMathDelim_typekey")
  var WordDotOMathDelim_typekey: OMathDelim = js.native
}
object OMathDelim {
  
  @scala.inline
  def apply(
    Application: Application,
    BegChar: Double,
    Creator: Double,
    E: OMathArgs,
    EndChar: Double,
    Grow: Boolean,
    NoLeftChar: Boolean,
    NoRightChar: Boolean,
    Parent: js.Any,
    SepChar: Double,
    Shape: WdOMathShapeType,
    WordDotOMathDelim_typekey: OMathDelim
  ): OMathDelim = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BegChar = BegChar.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], EndChar = EndChar.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], NoLeftChar = NoLeftChar.asInstanceOf[js.Any], NoRightChar = NoRightChar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SepChar = SepChar.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathDelim_typekey")(WordDotOMathDelim_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathDelim]
  }
  
  @scala.inline
  implicit class OMathDelimMutableBuilder[Self <: OMathDelim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegChar(value: Double): Self = StObject.set(x, "BegChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMathArgs): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndChar(value: Double): Self = StObject.set(x, "EndChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrow(value: Boolean): Self = StObject.set(x, "Grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLeftChar(value: Boolean): Self = StObject.set(x, "NoLeftChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRightChar(value: Boolean): Self = StObject.set(x, "NoRightChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepChar(value: Double): Self = StObject.set(x, "SepChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: WdOMathShapeType): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathDelim_typekey(value: OMathDelim): Self = StObject.set(x, "Word.OMathDelim_typekey", value.asInstanceOf[js.Any])
  }
}
