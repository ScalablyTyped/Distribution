package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathBar extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BarTop: Boolean = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathBar_typekey")
  var WordDotOMathBar_typekey: OMathBar = js.native
}
object OMathBar {
  
  @scala.inline
  def apply(
    Application: Application,
    BarTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathBar_typekey: OMathBar
  ): OMathBar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BarTop = BarTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBar_typekey")(WordDotOMathBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBar]
  }
  
  @scala.inline
  implicit class OMathBarMutableBuilder[Self <: OMathBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarTop(value: Boolean): Self = StObject.set(x, "BarTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathBar_typekey(value: OMathBar): Self = StObject.set(x, "Word.OMathBar_typekey", value.asInstanceOf[js.Any])
  }
}
