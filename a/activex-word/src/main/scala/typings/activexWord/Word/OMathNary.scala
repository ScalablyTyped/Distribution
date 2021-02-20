package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathNary extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Char: Double = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  var Grow: Boolean = js.native
  
  var HideSub: Boolean = js.native
  
  var HideSup: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val Sub: OMath = js.native
  
  var SubSupLim: Boolean = js.native
  
  val Sup: OMath = js.native
  
  @JSName("Word.OMathNary_typekey")
  var WordDotOMathNary_typekey: OMathNary = js.native
}
object OMathNary {
  
  @scala.inline
  def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Grow: Boolean,
    HideSub: Boolean,
    HideSup: Boolean,
    Parent: js.Any,
    Sub: OMath,
    SubSupLim: Boolean,
    Sup: OMath,
    WordDotOMathNary_typekey: OMathNary
  ): OMathNary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], HideSub = HideSub.asInstanceOf[js.Any], HideSup = HideSup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], SubSupLim = SubSupLim.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathNary_typekey")(WordDotOMathNary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathNary]
  }
  
  @scala.inline
  implicit class OMathNaryMutableBuilder[Self <: OMathNary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrow(value: Boolean): Self = StObject.set(x, "Grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSub(value: Boolean): Self = StObject.set(x, "HideSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSup(value: Boolean): Self = StObject.set(x, "HideSup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSupLim(value: Boolean): Self = StObject.set(x, "SubSupLim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathNary_typekey(value: OMathNary): Self = StObject.set(x, "Word.OMathNary_typekey", value.asInstanceOf[js.Any])
  }
}
