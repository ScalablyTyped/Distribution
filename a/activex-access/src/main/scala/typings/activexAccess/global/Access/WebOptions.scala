package typings.activexAccess.global.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.WebOptions")
@js.native
class WebOptions protected ()
  extends typings.activexAccess.Access.WebOptions {
  /* CompleteClass */
  @JSName("Access.WebOptions_typekey")
  override var AccessDotWebOptions_typekey: typings.activexAccess.Access.WebOptions = js.native
  /* CompleteClass */
  override val Application: typings.activexAccess.Access.Application = js.native
  /* CompleteClass */
  override var DownloadComponents: Boolean = js.native
  /* CompleteClass */
  override var Encoding: MsoEncoding = js.native
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  /* CompleteClass */
  override var LocationOfComponents: String = js.native
  /* CompleteClass */
  override var OrganizeInFolder: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var TargetBrowser: MsoTargetBrowser = js.native
  /* CompleteClass */
  override var UseLongFileNames: Boolean = js.native
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
}

