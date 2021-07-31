package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBorderBox extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  var HideBot: Boolean
  
  var HideLeft: Boolean
  
  var HideRight: Boolean
  
  var HideTop: Boolean
  
  val Parent: js.Any
  
  var StrikeBLTR: Boolean
  
  var StrikeH: Boolean
  
  var StrikeTLBR: Boolean
  
  var StrikeV: Boolean
  
  @JSName("Word.OMathBorderBox_typekey")
  var WordDotOMathBorderBox_typekey: OMathBorderBox
}
object OMathBorderBox {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    HideBot: Boolean,
    HideLeft: Boolean,
    HideRight: Boolean,
    HideTop: Boolean,
    Parent: js.Any,
    StrikeBLTR: Boolean,
    StrikeH: Boolean,
    StrikeTLBR: Boolean,
    StrikeV: Boolean,
    WordDotOMathBorderBox_typekey: OMathBorderBox
  ): OMathBorderBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideBot = HideBot.asInstanceOf[js.Any], HideLeft = HideLeft.asInstanceOf[js.Any], HideRight = HideRight.asInstanceOf[js.Any], HideTop = HideTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StrikeBLTR = StrikeBLTR.asInstanceOf[js.Any], StrikeH = StrikeH.asInstanceOf[js.Any], StrikeTLBR = StrikeTLBR.asInstanceOf[js.Any], StrikeV = StrikeV.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBorderBox_typekey")(WordDotOMathBorderBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBorderBox]
  }
  
  @scala.inline
  implicit class OMathBorderBoxMutableBuilder[Self <: OMathBorderBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideBot(value: Boolean): Self = StObject.set(x, "HideBot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLeft(value: Boolean): Self = StObject.set(x, "HideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRight(value: Boolean): Self = StObject.set(x, "HideRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTop(value: Boolean): Self = StObject.set(x, "HideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeBLTR(value: Boolean): Self = StObject.set(x, "StrikeBLTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeH(value: Boolean): Self = StObject.set(x, "StrikeH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeTLBR(value: Boolean): Self = StObject.set(x, "StrikeTLBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeV(value: Boolean): Self = StObject.set(x, "StrikeV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathBorderBox_typekey(value: OMathBorderBox): Self = StObject.set(x, "Word.OMathBorderBox_typekey", value.asInstanceOf[js.Any])
  }
}
