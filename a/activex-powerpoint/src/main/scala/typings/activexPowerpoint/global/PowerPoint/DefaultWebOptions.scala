package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoCharacterSet
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.WebPageFont
import typings.activexOffice.Office.WebPageFonts
import typings.activexPowerpoint.PowerPoint.PpFrameColors
import typings.activexPowerpoint.PowerPoint.PpHTMLVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.DefaultWebOptions")
@js.native
/* private */ class DefaultWebOptions ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.DefaultWebOptions {
  
  /* CompleteClass */
  var AllowPNG: MsoTriState = js.native
  
  /* CompleteClass */
  var AlwaysSaveInDefaultEncoding: MsoTriState = js.native
  
  /* CompleteClass */
  var CheckIfOfficeIsHTMLEditor: MsoTriState = js.native
  
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
  var FrameColors: PpFrameColors = js.native
  
  /* CompleteClass */
  var HTMLVersion: PpHTMLVersion = js.native
  
  /* CompleteClass */
  var IncludeNavigation: MsoTriState = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.DefaultWebOptions_typekey")
  var PowerPointDotDefaultWebOptions_typekey: typings.activexPowerpoint.PowerPoint.DefaultWebOptions = js.native
  
  /* CompleteClass */
  var RelyOnVML: MsoTriState = js.native
  
  /* CompleteClass */
  var ResizeGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var SaveNewWebPagesAsWebArchives: MsoTriState = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var ShowSlideAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  var UpdateLinksOnSave: MsoTriState = js.native
  
  /* CompleteClass */
  var UseLongFileNames: MsoTriState = js.native
}
