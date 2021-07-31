package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathScrSup extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: js.Any
  
  val Sup: OMath
  
  @JSName("Word.OMathScrSup_typekey")
  var WordDotOMathScrSup_typekey: OMathScrSup
}
object OMathScrSup {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sup: OMath,
    WordDotOMathScrSup_typekey: OMathScrSup
  ): OMathScrSup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSup_typekey")(WordDotOMathScrSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSup]
  }
  
  @scala.inline
  implicit class OMathScrSupMutableBuilder[Self <: OMathScrSup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathScrSup_typekey(value: OMathScrSup): Self = StObject.set(x, "Word.OMathScrSup_typekey", value.asInstanceOf[js.Any])
  }
}
