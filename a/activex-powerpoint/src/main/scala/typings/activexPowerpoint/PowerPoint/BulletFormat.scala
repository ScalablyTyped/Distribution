package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Character: Double
  
  val Font: typings.activexPowerpoint.PowerPoint.Font
  
  val Number: Double
  
  val Parent: Any
  
  def Picture(Picture: String): Unit
  
  /* private */ @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: BulletFormat
  
  var RelativeSize: Double
  
  var StartValue: Double
  
  var Style: PpNumberedBulletStyle
  
  var Type: PpBulletType
  
  var UseTextColor: MsoTriState
  
  var UseTextFont: MsoTriState
  
  var Visible: MsoTriState
}
object BulletFormat {
  
  inline def apply(
    Application: Application,
    Character: Double,
    Font: Font,
    Number: Double,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: BulletFormat] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "Character", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String => Unit): Self = StObject.set(x, "Picture", js.Any.fromFunction1(value))
    
    inline def setPowerPointDotBulletFormat_typekey(value: BulletFormat): Self = StObject.set(x, "PowerPoint.BulletFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setRelativeSize(value: Double): Self = StObject.set(x, "RelativeSize", value.asInstanceOf[js.Any])
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: PpNumberedBulletStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpBulletType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUseTextColor(value: MsoTriState): Self = StObject.set(x, "UseTextColor", value.asInstanceOf[js.Any])
    
    inline def setUseTextFont(value: MsoTriState): Self = StObject.set(x, "UseTextFont", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
