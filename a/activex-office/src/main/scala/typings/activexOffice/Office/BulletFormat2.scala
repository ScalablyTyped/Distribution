package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletFormat2 extends StObject {
  
  val Application: js.Any
  
  var Character: Double
  
  val Creator: Double
  
  val Font: Font2
  
  val Number: Double
  
  @JSName("Office.BulletFormat2_typekey")
  var OfficeDotBulletFormat2_typekey: BulletFormat2
  
  val Parent: js.Any
  
  def Picture(FileName: String): Unit
  
  var RelativeSize: Double
  
  var StartValue: Double
  
  var Style: MsoNumberedBulletStyle
  
  var Type: MsoBulletType
  
  var UseTextColor: MsoTriState
  
  var UseTextFont: MsoTriState
  
  var Visible: MsoTriState
}
object BulletFormat2 {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Character: Double,
    Creator: Double,
    Font: Font2,
    Number: Double,
    OfficeDotBulletFormat2_typekey: BulletFormat2,
    Parent: js.Any,
    Picture: String => Unit,
    RelativeSize: Double,
    StartValue: Double,
    Style: MsoNumberedBulletStyle,
    Type: MsoBulletType,
    UseTextColor: MsoTriState,
    UseTextFont: MsoTriState,
    Visible: MsoTriState
  ): BulletFormat2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Character = Character.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Picture = js.Any.fromFunction1(Picture), RelativeSize = RelativeSize.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseTextColor = UseTextColor.asInstanceOf[js.Any], UseTextFont = UseTextFont.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BulletFormat2_typekey")(OfficeDotBulletFormat2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletFormat2]
  }
  
  @scala.inline
  implicit class BulletFormat2MutableBuilder[Self <: BulletFormat2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "Character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font2): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotBulletFormat2_typekey(value: BulletFormat2): Self = StObject.set(x, "Office.BulletFormat2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String => Unit): Self = StObject.set(x, "Picture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativeSize(value: Double): Self = StObject.set(x, "RelativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: Double): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MsoNumberedBulletStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoBulletType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextColor(value: MsoTriState): Self = StObject.set(x, "UseTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextFont(value: MsoTriState): Self = StObject.set(x, "UseTextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
