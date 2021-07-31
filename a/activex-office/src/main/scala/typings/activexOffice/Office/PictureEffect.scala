package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureEffect extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  def EffectParameters(Index: String): EffectParameter
  def EffectParameters(Index: Double): EffectParameter
  @JSName("EffectParameters")
  val EffectParameters_Original: EffectParameters
  
  @JSName("Office.PictureEffect_typekey")
  var OfficeDotPictureEffect_typekey: PictureEffect
  
  var Position: Double
  
  val Type: MsoPictureEffectType
  
  var Visible: MsoTriState
}
object PictureEffect {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    EffectParameters: EffectParameters,
    OfficeDotPictureEffect_typekey: PictureEffect,
    Position: Double,
    Type: MsoPictureEffectType,
    Visible: MsoTriState
  ): PictureEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EffectParameters = EffectParameters.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PictureEffect_typekey")(OfficeDotPictureEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureEffect]
  }
  
  @scala.inline
  implicit class PictureEffectMutableBuilder[Self <: PictureEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEffectParameters(value: EffectParameters): Self = StObject.set(x, "EffectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPictureEffect_typekey(value: PictureEffect): Self = StObject.set(x, "Office.PictureEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoPictureEffectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
