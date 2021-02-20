package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathAcc extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Char: Double = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathAcc_typekey")
  var WordDotOMathAcc_typekey: OMathAcc = js.native
}
object OMathAcc {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OMathAccMutableBuilder[Self <: OMathAcc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathAcc_typekey(value: OMathAcc): Self = StObject.set(x, "Word.OMathAcc_typekey", value.asInstanceOf[js.Any])
  }
}
