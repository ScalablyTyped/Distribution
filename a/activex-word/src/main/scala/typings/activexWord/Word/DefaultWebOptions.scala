package typings.activexWord.Word

import typings.activexOffice.Office.MsoCharacterSet
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.WebPageFont
import typings.activexOffice.Office.WebPageFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWebOptions extends StObject {
  
  var AllowPNG: Boolean = js.native
  
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BrowserLevel: WdBrowserLevel = js.native
  
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  var CheckIfWordIsDefaultHTMLEditor: Boolean = js.native
  
  val Creator: Double = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  
  var OptimizeForBrowser: Boolean = js.native
  
  var OrganizeInFolder: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var PixelsPerInch: Double = js.native
  
  var RelyOnCSS: Boolean = js.native
  
  var RelyOnVML: Boolean = js.native
  
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  
  var ScreenSize: MsoScreenSize = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  var UpdateLinksOnSave: Boolean = js.native
  
  var UseLongFileNames: Boolean = js.native
  
  @JSName("Word.DefaultWebOptions_typekey")
  var WordDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
}
