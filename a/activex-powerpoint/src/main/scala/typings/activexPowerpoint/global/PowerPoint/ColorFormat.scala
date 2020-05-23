package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import typings.activexPowerpoint.PowerPoint.PpColorSchemeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ColorFormat")
@js.native
class ColorFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.ColorFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var ObjectThemeColor: MsoThemeColorIndex = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ColorFormat_typekey")
  override var PowerPointDotColorFormat_typekey: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  /* CompleteClass */
  override var RGB: MsoRGBType = js.native
  /* CompleteClass */
  override var SchemeColor: PpColorSchemeIndex = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}

