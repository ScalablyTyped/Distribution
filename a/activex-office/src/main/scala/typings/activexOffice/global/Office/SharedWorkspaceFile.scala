package typings.activexOffice.global.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceFile")
@js.native
class SharedWorkspaceFile protected ()
  extends typings.activexOffice.Office.SharedWorkspaceFile {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val CreatedBy: String = js.native
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  /* CompleteClass */
  override val ModifiedDate: VarDate = js.native
  /* CompleteClass */
  @JSName("Office.SharedWorkspaceFile_typekey")
  override var OfficeDotSharedWorkspaceFile_typekey: typings.activexOffice.Office.SharedWorkspaceFile = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val URL: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

