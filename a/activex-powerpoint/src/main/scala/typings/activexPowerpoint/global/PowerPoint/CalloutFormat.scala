package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CalloutFormat")
@js.native
class CalloutFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.CalloutFormat {
  /* CompleteClass */
  override var Accent: MsoTriState = js.native
  /* CompleteClass */
  override var Angle: MsoCalloutAngleType = js.native
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AutoAttach: MsoTriState = js.native
  /* CompleteClass */
  override val AutoLength: MsoTriState = js.native
  /* CompleteClass */
  override var Border: MsoTriState = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Drop: Double = js.native
  /* CompleteClass */
  override val DropType: MsoCalloutDropType = js.native
  /* CompleteClass */
  override var Gap: Double = js.native
  /* CompleteClass */
  override val Length: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.CalloutFormat_typekey")
  override var PowerPointDotCalloutFormat_typekey: typings.activexPowerpoint.PowerPoint.CalloutFormat = js.native
  /* CompleteClass */
  override var Type: MsoCalloutType = js.native
  /* CompleteClass */
  override def AutomaticLength(): Unit = js.native
  /* CompleteClass */
  override def CustomDrop(Drop: Double): Unit = js.native
  /* CompleteClass */
  override def CustomLength(Length: Double): Unit = js.native
  /* CompleteClass */
  override def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
}

