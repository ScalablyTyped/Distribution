package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoCTPDockPosition
import typings.activexOffice.Office.MsoCTPDockPositionRestrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CustomTaskPane")
@js.native
class CustomTaskPane protected ()
  extends typings.activexOffice.Office.CustomTaskPane {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val ContentControl: js.Any = js.native
  /* CompleteClass */
  override var DockPosition: MsoCTPDockPosition = js.native
  /* CompleteClass */
  override var DockPositionRestrict: MsoCTPDockPositionRestrict = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  @JSName("Office.CustomTaskPane_typekey")
  override var OfficeDotCustomTaskPane_typekey: typings.activexOffice.Office.CustomTaskPane = js.native
  /* CompleteClass */
  override val Title: String = js.native
  /* CompleteClass */
  override var Visible: Boolean = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override val Window: js.Any = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

