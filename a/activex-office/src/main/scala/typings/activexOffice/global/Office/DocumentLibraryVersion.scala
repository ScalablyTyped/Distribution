package typings.activexOffice.global.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentLibraryVersion")
@js.native
class DocumentLibraryVersion protected ()
  extends typings.activexOffice.Office.DocumentLibraryVersion {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Comments: String = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Modified: VarDate = js.native
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  /* CompleteClass */
  @JSName("Office.DocumentLibraryVersion_typekey")
  override var OfficeDotDocumentLibraryVersion_typekey: typings.activexOffice.Office.DocumentLibraryVersion = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): js.Any = js.native
  /* CompleteClass */
  override def Restore(): js.Any = js.native
}

