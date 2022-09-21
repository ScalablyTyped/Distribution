package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoCharacterSet
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.WebPageFont
import typings.activexOffice.Office.WebPageFonts
import typings.activexWord.Word.WdBrowserLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.DefaultWebOptions")
@js.native
/* private */ open class DefaultWebOptions ()
  extends StObject
     with typings.activexWord.Word.DefaultWebOptions {
  
  /* CompleteClass */
  var AllowPNG: Boolean = js.native
  
  /* CompleteClass */
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var BrowserLevel: WdBrowserLevel = js.native
  
  /* CompleteClass */
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  /* CompleteClass */
  var CheckIfWordIsDefaultHTMLEditor: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  override def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
  /* CompleteClass */
  @JSName("Fonts")
  override val Fonts_Original: WebPageFonts = js.native
  
  /* CompleteClass */
  var OptimizeForBrowser: Boolean = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PixelsPerInch: Double = js.native
  
  /* CompleteClass */
  var RelyOnCSS: Boolean = js.native
  
  /* CompleteClass */
  var RelyOnVML: Boolean = js.native
  
  /* CompleteClass */
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  var UpdateLinksOnSave: Boolean = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.DefaultWebOptions_typekey")
  var WordDotDefaultWebOptions_typekey: typings.activexWord.Word.DefaultWebOptions = js.native
}
