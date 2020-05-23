package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIn")
@js.native
class AddIn protected ()
  extends typings.activexPowerpoint.PowerPoint.AddIn {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var AutoLoad: MsoTriState = js.native
  /* CompleteClass */
  override var DisplayAlerts: MsoTriState = js.native
  /* CompleteClass */
  override val FullName: String = js.native
  /* CompleteClass */
  override var Loaded: MsoTriState = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Path: String = js.native
  /* CompleteClass */
  @JSName("PowerPoint.AddIn_typekey")
  override var PowerPointDotAddIn_typekey: typings.activexPowerpoint.PowerPoint.AddIn = js.native
  /* CompleteClass */
  override var Registered: MsoTriState = js.native
  /* CompleteClass */
  override val RegisteredInHKLM: MsoTriState = js.native
}

