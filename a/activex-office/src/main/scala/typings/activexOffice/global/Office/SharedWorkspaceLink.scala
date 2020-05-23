package typings.activexOffice.global.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceLink")
@js.native
class SharedWorkspaceLink protected ()
  extends typings.activexOffice.Office.SharedWorkspaceLink {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val CreatedBy: String = js.native
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  /* CompleteClass */
  override val ModifiedDate: VarDate = js.native
  /* CompleteClass */
  override var Notes: String = js.native
  /* CompleteClass */
  @JSName("Office.SharedWorkspaceLink_typekey")
  override var OfficeDotSharedWorkspaceLink_typekey: typings.activexOffice.Office.SharedWorkspaceLink = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var URL: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

