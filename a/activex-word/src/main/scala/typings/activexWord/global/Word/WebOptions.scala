package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexWord.Word.WdBrowserLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.WebOptions")
@js.native
class WebOptions protected ()
  extends typings.activexWord.Word.WebOptions {
  /* CompleteClass */
  override var AllowPNG: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var BrowserLevel: WdBrowserLevel = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Encoding: MsoEncoding = js.native
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  /* CompleteClass */
  override var OptimizeForBrowser: Boolean = js.native
  /* CompleteClass */
  override var OrganizeInFolder: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PixelsPerInch: Double = js.native
  /* CompleteClass */
  override var RelyOnCSS: Boolean = js.native
  /* CompleteClass */
  override var RelyOnVML: Boolean = js.native
  /* CompleteClass */
  override var ScreenSize: MsoScreenSize = js.native
  /* CompleteClass */
  override var TargetBrowser: MsoTargetBrowser = js.native
  /* CompleteClass */
  override var UseLongFileNames: Boolean = js.native
  /* CompleteClass */
  @JSName("Word.WebOptions_typekey")
  override var WordDotWebOptions_typekey: typings.activexWord.Word.WebOptions = js.native
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
}

