package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoDocProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentProperty")
@js.native
class DocumentProperty[TApplication] protected ()
  extends typings.activexOffice.Office.DocumentProperty[TApplication] {
  /* CompleteClass */
  override var Application: TApplication = js.native
  /* CompleteClass */
  override var Creator: Double = js.native
  /* CompleteClass */
  override var LinkSource: String = js.native
  /* CompleteClass */
  override var LinkToContent: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Office.DocumentProperty_typekey")
  override var OfficeDotDocumentProperty_typekey: typings.activexOffice.Office.DocumentProperty[TApplication] = js.native
  /* CompleteClass */
  override var Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoDocProperties = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

