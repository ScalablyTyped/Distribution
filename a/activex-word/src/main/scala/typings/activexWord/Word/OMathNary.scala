package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathNary extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Char: Double
  
  val Creator: Double
  
  val E: OMath
  
  var Grow: Boolean
  
  var HideSub: Boolean
  
  var HideSup: Boolean
  
  val Parent: Any
  
  val Sub: OMath
  
  var SubSupLim: Boolean
  
  val Sup: OMath
  
  /* private */ @JSName("Word.OMathNary_typekey")
  var WordDotOMathNary_typekey: OMathNary
}
object OMathNary {
  
  inline def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Grow: Boolean,
    HideSub: Boolean,
    HideSup: Boolean,
    Parent: Any,
    Sub: OMath,
    SubSupLim: Boolean,
    Sup: OMath,
    WordDotOMathNary_typekey: OMathNary
  ): OMathNary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], HideSub = HideSub.asInstanceOf[js.Any], HideSup = HideSup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], SubSupLim = SubSupLim.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathNary_typekey")(WordDotOMathNary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathNary]
  }
  
  extension [Self <: OMathNary](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChar(value: Double): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setGrow(value: Boolean): Self = StObject.set(x, "Grow", value.asInstanceOf[js.Any])
    
    inline def setHideSub(value: Boolean): Self = StObject.set(x, "HideSub", value.asInstanceOf[js.Any])
    
    inline def setHideSup(value: Boolean): Self = StObject.set(x, "HideSup", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    inline def setSubSupLim(value: Boolean): Self = StObject.set(x, "SubSupLim", value.asInstanceOf[js.Any])
    
    inline def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathNary_typekey(value: OMathNary): Self = StObject.set(x, "Word.OMathNary_typekey", value.asInstanceOf[js.Any])
  }
}
