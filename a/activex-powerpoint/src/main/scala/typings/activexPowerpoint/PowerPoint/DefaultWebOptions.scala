package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoCharacterSet
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.WebPageFont
import typings.activexOffice.Office.WebPageFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWebOptions extends StObject {
  
  var AllowPNG: MsoTriState = js.native
  
  var AlwaysSaveInDefaultEncoding: MsoTriState = js.native
  
  var CheckIfOfficeIsHTMLEditor: MsoTriState = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  
  var FrameColors: PpFrameColors = js.native
  
  var HTMLVersion: PpHTMLVersion = js.native
  
  var IncludeNavigation: MsoTriState = js.native
  
  var OrganizeInFolder: MsoTriState = js.native
  
  @JSName("PowerPoint.DefaultWebOptions_typekey")
  var PowerPointDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  
  var RelyOnVML: MsoTriState = js.native
  
  var ResizeGraphics: MsoTriState = js.native
  
  var SaveNewWebPagesAsWebArchives: MsoTriState = js.native
  
  var ScreenSize: MsoScreenSize = js.native
  
  var ShowSlideAnimation: MsoTriState = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  var UpdateLinksOnSave: MsoTriState = js.native
  
  var UseLongFileNames: MsoTriState = js.native
}
