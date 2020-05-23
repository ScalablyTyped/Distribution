package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulletFormat2 extends js.Object {
  val Application: js.Any
  var Character: Double
  val Creator: Double
  val Font: Font2
  val Number: Double
  @JSName("Office.BulletFormat2_typekey")
  var OfficeDotBulletFormat2_typekey: BulletFormat2
  val Parent: js.Any
  var RelativeSize: Double
  var StartValue: Double
  var Style: MsoNumberedBulletStyle
  var Type: MsoBulletType
  var UseTextColor: MsoTriState
  var UseTextFont: MsoTriState
  var Visible: MsoTriState
  def Picture(FileName: String): Unit
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
}

