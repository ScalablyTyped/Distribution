package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ShadowFormat")
@js.native
class ShadowFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.ShadowFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Blur: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var ForeColor: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  /* CompleteClass */
  override var Obscured: MsoTriState = js.native
  /* CompleteClass */
  override var OffsetX: Double = js.native
  /* CompleteClass */
  override var OffsetY: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ShadowFormat_typekey")
  override var PowerPointDotShadowFormat_typekey: typings.activexPowerpoint.PowerPoint.ShadowFormat = js.native
  /* CompleteClass */
  override var RotateWithShape: MsoTriState = js.native
  /* CompleteClass */
  override var Size: Double = js.native
  /* CompleteClass */
  override var Style: MsoShadowStyle = js.native
  /* CompleteClass */
  override var Transparency: Double = js.native
  /* CompleteClass */
  override var Type: MsoShadowType = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
}

