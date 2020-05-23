package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpBulletType
import typings.activexPowerpoint.PowerPoint.PpNumberedBulletStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.BulletFormat")
@js.native
class BulletFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.BulletFormat {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Character: Double = js.native
  /* CompleteClass */
  override val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  /* CompleteClass */
  override val Number: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.BulletFormat_typekey")
  override var PowerPointDotBulletFormat_typekey: typings.activexPowerpoint.PowerPoint.BulletFormat = js.native
  /* CompleteClass */
  override var RelativeSize: Double = js.native
  /* CompleteClass */
  override var StartValue: Double = js.native
  /* CompleteClass */
  override var Style: PpNumberedBulletStyle = js.native
  /* CompleteClass */
  override var Type: PpBulletType = js.native
  /* CompleteClass */
  override var UseTextColor: MsoTriState = js.native
  /* CompleteClass */
  override var UseTextFont: MsoTriState = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  override def Picture(Picture: String): Unit = js.native
}

