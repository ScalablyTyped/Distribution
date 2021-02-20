package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathGroupChar extends StObject {
  
  var AlignTop: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Char: Double = js.native
  
  var CharTop: Boolean = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathGroupChar_typekey")
  var WordDotOMathGroupChar_typekey: OMathGroupChar = js.native
}
object OMathGroupChar {
  
  @scala.inline
  def apply(
    AlignTop: Boolean,
    Application: Application,
    Char: Double,
    CharTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathGroupChar_typekey: OMathGroupChar
  ): OMathGroupChar = {
    val __obj = js.Dynamic.literal(AlignTop = AlignTop.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharTop = CharTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathGroupChar_typekey")(WordDotOMathGroupChar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathGroupChar]
  }
  
  @scala.inline
  implicit class OMathGroupCharMutableBuilder[Self <: OMathGroupChar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignTop(value: Boolean): Self = StObject.set(x, "AlignTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharTop(value: Boolean): Self = StObject.set(x, "CharTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathGroupChar_typekey(value: OMathGroupChar): Self = StObject.set(x, "Word.OMathGroupChar_typekey", value.asInstanceOf[js.Any])
  }
}
