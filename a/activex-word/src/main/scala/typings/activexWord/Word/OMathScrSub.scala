package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathScrSub extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  val Sub: OMath = js.native
  
  @JSName("Word.OMathScrSub_typekey")
  var WordDotOMathScrSub_typekey: OMathScrSub = js.native
}
object OMathScrSub {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    WordDotOMathScrSub_typekey: OMathScrSub
  ): OMathScrSub = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSub_typekey")(WordDotOMathScrSub_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSub]
  }
  
  @scala.inline
  implicit class OMathScrSubMutableBuilder[Self <: OMathScrSub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathScrSub_typekey(value: OMathScrSub): Self = StObject.set(x, "Word.OMathScrSub_typekey", value.asInstanceOf[js.Any])
  }
}
