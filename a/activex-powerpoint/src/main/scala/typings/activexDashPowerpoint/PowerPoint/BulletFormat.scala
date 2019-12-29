package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.BulletFormat")
@js.native
class BulletFormat protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  var Character: Double = js.native
  val Font: typings.activexDashPowerpoint.PowerPoint.Font = js.native
  val Number: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: BulletFormat = js.native
  var RelativeSize: Double = js.native
  var StartValue: Double = js.native
  var Style: PpNumberedBulletStyle = js.native
  var Type: PpBulletType = js.native
  var UseTextColor: MsoTriState = js.native
  var UseTextFont: MsoTriState = js.native
  var Visible: MsoTriState = js.native
  def Picture(Picture: String): Unit = js.native
}

