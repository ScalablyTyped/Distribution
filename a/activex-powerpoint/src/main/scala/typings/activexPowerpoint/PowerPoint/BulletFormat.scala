package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletFormat extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var Character: Double = js.native
  
  val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  
  val Number: Double = js.native
  
  val Parent: js.Any = js.native
  
  def Picture(Picture: String): Unit = js.native
  
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: BulletFormat = js.native
  
  var RelativeSize: Double = js.native
  
  var StartValue: Double = js.native
  
  var Style: PpNumberedBulletStyle = js.native
  
  var Type: PpBulletType = js.native
  
  var UseTextColor: MsoTriState = js.native
  
  var UseTextFont: MsoTriState = js.native
  
  var Visible: MsoTriState = js.native
}
object BulletFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Character: Double,
    Font: Font,
    Number: Double,
    Parent: js.Any,
    Picture: String => Unit,
    PowerPointDotBulletFormat_typekey: BulletFormat,
    RelativeSize: Double,
    StartValue: Double,
    Style: PpNumberedBulletStyle,
    Type: PpBulletType,
    UseTextColor: MsoTriState,
    UseTextFont: MsoTriState,
    Visible: MsoTriState
  ): BulletFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Character = Character.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Picture = js.Any.fromFunction1(Picture), RelativeSize = RelativeSize.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseTextColor = UseTextColor.asInstanceOf[js.Any], UseTextFont = UseTextFont.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.BulletFormat_typekey")(PowerPointDotBulletFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletFormat]
  }
  
  @scala.inline
  implicit class BulletFormatOps[Self <: BulletFormat] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacter(value: Double): Self = this.set("Character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String => Unit): Self = this.set("Picture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerPointDotBulletFormat_typekey(value: BulletFormat): Self = this.set("PowerPoint.BulletFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeSize(value: Double): Self = this.set("RelativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("StartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: PpNumberedBulletStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpBulletType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextColor(value: MsoTriState): Self = this.set("UseTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextFont(value: MsoTriState): Self = this.set("UseTextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
