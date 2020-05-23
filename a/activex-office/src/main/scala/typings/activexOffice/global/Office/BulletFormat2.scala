package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoBulletType
import typings.activexOffice.Office.MsoNumberedBulletStyle
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.BulletFormat2")
@js.native
class BulletFormat2 protected ()
  extends typings.activexOffice.Office.BulletFormat2 {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Character: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Font: typings.activexOffice.Office.Font2 = js.native
  /* CompleteClass */
  override val Number: Double = js.native
  /* CompleteClass */
  @JSName("Office.BulletFormat2_typekey")
  override var OfficeDotBulletFormat2_typekey: typings.activexOffice.Office.BulletFormat2 = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RelativeSize: Double = js.native
  /* CompleteClass */
  override var StartValue: Double = js.native
  /* CompleteClass */
  override var Style: MsoNumberedBulletStyle = js.native
  /* CompleteClass */
  override var Type: MsoBulletType = js.native
  /* CompleteClass */
  override var UseTextColor: MsoTriState = js.native
  /* CompleteClass */
  override var UseTextFont: MsoTriState = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  override def Picture(FileName: String): Unit = js.native
}

