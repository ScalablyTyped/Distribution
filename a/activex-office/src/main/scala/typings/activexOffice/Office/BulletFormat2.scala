package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletFormat2 extends js.Object {
  
  val Application: js.Any = js.native
  
  var Character: Double = js.native
  
  val Creator: Double = js.native
  
  val Font: Font2 = js.native
  
  val Number: Double = js.native
  
  @JSName("Office.BulletFormat2_typekey")
  var OfficeDotBulletFormat2_typekey: BulletFormat2 = js.native
  
  val Parent: js.Any = js.native
  
  def Picture(FileName: String): Unit = js.native
  
  var RelativeSize: Double = js.native
  
  var StartValue: Double = js.native
  
  var Style: MsoNumberedBulletStyle = js.native
  
  var Type: MsoBulletType = js.native
  
  var UseTextColor: MsoTriState = js.native
  
  var UseTextFont: MsoTriState = js.native
  
  var Visible: MsoTriState = js.native
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
  implicit class BulletFormat2Ops[Self <: BulletFormat2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacter(value: Double): Self = this.set("Character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font2): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotBulletFormat2_typekey(value: BulletFormat2): Self = this.set("Office.BulletFormat2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String => Unit): Self = this.set("Picture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativeSize(value: Double): Self = this.set("RelativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("StartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MsoNumberedBulletStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoBulletType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextColor(value: MsoTriState): Self = this.set("UseTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextFont(value: MsoTriState): Self = this.set("UseTextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
