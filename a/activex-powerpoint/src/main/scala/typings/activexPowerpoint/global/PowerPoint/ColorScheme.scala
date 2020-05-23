package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpColorSchemeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ColorScheme")
@js.native
class ColorScheme protected ()
  extends typings.activexPowerpoint.PowerPoint.ColorScheme {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ColorScheme_typekey")
  override var PowerPointDotColorScheme_typekey: typings.activexPowerpoint.PowerPoint.ColorScheme = js.native
  /* CompleteClass */
  override def Colors(SchemeColor: PpColorSchemeIndex): typings.activexPowerpoint.PowerPoint.RGBColor = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

