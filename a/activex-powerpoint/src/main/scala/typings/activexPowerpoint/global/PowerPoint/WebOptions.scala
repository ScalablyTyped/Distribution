package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpFrameColors
import typings.activexPowerpoint.PowerPoint.PpHTMLVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.WebOptions")
@js.native
/* private */ class WebOptions ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.WebOptions {
  
  /* CompleteClass */
  var AllowPNG: MsoTriState = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  var FrameColors: PpFrameColors = js.native
  
  /* CompleteClass */
  var HTMLVersion: PpHTMLVersion = js.native
  
  /* CompleteClass */
  var IncludeNavigation: MsoTriState = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: typings.activexPowerpoint.PowerPoint.WebOptions = js.native
  
  /* CompleteClass */
  var RelyOnVML: MsoTriState = js.native
  
  /* CompleteClass */
  var ResizeGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var ShowSlideAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
  
  /* CompleteClass */
  var UseLongFileNames: MsoTriState = js.native
}
