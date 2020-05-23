package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulletFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Character: Double
  val Font: typings.activexPowerpoint.PowerPoint.Font
  val Number: Double
  val Parent: js.Any
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: BulletFormat
  var RelativeSize: Double
  var StartValue: Double
  var Style: PpNumberedBulletStyle
  var Type: PpBulletType
  var UseTextColor: MsoTriState
  var UseTextFont: MsoTriState
  var Visible: MsoTriState
  def Picture(Picture: String): Unit
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
}

