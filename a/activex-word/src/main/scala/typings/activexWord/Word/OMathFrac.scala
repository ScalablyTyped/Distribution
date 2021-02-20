package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathFrac extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Den: OMath = js.native
  
  val Num: OMath = js.native
  
  val Parent: js.Any = js.native
  
  var Type: WdOMathFracType = js.native
  
  @JSName("Word.OMathFrac_typekey")
  var WordDotOMathFrac_typekey: OMathFrac = js.native
}
object OMathFrac {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Den: OMath,
    Num: OMath,
    Parent: js.Any,
    Type: WdOMathFracType,
    WordDotOMathFrac_typekey: OMathFrac
  ): OMathFrac = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Den = Den.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFrac_typekey")(WordDotOMathFrac_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFrac]
  }
  
  @scala.inline
  implicit class OMathFracMutableBuilder[Self <: OMathFrac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDen(value: OMath): Self = StObject.set(x, "Den", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum(value: OMath): Self = StObject.set(x, "Num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdOMathFracType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathFrac_typekey(value: OMathFrac): Self = StObject.set(x, "Word.OMathFrac_typekey", value.asInstanceOf[js.Any])
  }
}
