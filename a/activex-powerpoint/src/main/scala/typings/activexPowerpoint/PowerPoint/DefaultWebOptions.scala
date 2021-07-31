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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultWebOptions extends StObject {
  
  var AllowPNG: MsoTriState
  
  var AlwaysSaveInDefaultEncoding: MsoTriState
  
  var CheckIfOfficeIsHTMLEditor: MsoTriState
  
  var Encoding: MsoEncoding
  
  val FolderSuffix: String
  
  def Fonts(Index: MsoCharacterSet): WebPageFont
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts
  
  var FrameColors: PpFrameColors
  
  var HTMLVersion: PpHTMLVersion
  
  var IncludeNavigation: MsoTriState
  
  var OrganizeInFolder: MsoTriState
  
  @JSName("PowerPoint.DefaultWebOptions_typekey")
  var PowerPointDotDefaultWebOptions_typekey: DefaultWebOptions
  
  var RelyOnVML: MsoTriState
  
  var ResizeGraphics: MsoTriState
  
  var SaveNewWebPagesAsWebArchives: MsoTriState
  
  var ScreenSize: MsoScreenSize
  
  var ShowSlideAnimation: MsoTriState
  
  var TargetBrowser: MsoTargetBrowser
  
  var UpdateLinksOnSave: MsoTriState
  
  var UseLongFileNames: MsoTriState
}
object DefaultWebOptions {
  
  @scala.inline
  def apply(
    AllowPNG: MsoTriState,
    AlwaysSaveInDefaultEncoding: MsoTriState,
    CheckIfOfficeIsHTMLEditor: MsoTriState,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    Fonts: WebPageFonts,
    FrameColors: PpFrameColors,
    HTMLVersion: PpHTMLVersion,
    IncludeNavigation: MsoTriState,
    OrganizeInFolder: MsoTriState,
    PowerPointDotDefaultWebOptions_typekey: DefaultWebOptions,
    RelyOnVML: MsoTriState,
    ResizeGraphics: MsoTriState,
    SaveNewWebPagesAsWebArchives: MsoTriState,
    ScreenSize: MsoScreenSize,
    ShowSlideAnimation: MsoTriState,
    TargetBrowser: MsoTargetBrowser,
    UpdateLinksOnSave: MsoTriState,
    UseLongFileNames: MsoTriState
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], Fonts = Fonts.asInstanceOf[js.Any], FrameColors = FrameColors.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], IncludeNavigation = IncludeNavigation.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ResizeGraphics = ResizeGraphics.asInstanceOf[js.Any], SaveNewWebPagesAsWebArchives = SaveNewWebPagesAsWebArchives.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], ShowSlideAnimation = ShowSlideAnimation.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UpdateLinksOnSave = UpdateLinksOnSave.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.DefaultWebOptions_typekey")(PowerPointDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
  
  @scala.inline
  implicit class DefaultWebOptionsMutableBuilder[Self <: DefaultWebOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPNG(value: MsoTriState): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSaveInDefaultEncoding(value: MsoTriState): Self = StObject.set(x, "AlwaysSaveInDefaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfOfficeIsHTMLEditor(value: MsoTriState): Self = StObject.set(x, "CheckIfOfficeIsHTMLEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFonts(value: WebPageFonts): Self = StObject.set(x, "Fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameColors(value: PpFrameColors): Self = StObject.set(x, "FrameColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLVersion(value: PpHTMLVersion): Self = StObject.set(x, "HTMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNavigation(value: MsoTriState): Self = StObject.set(x, "IncludeNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizeInFolder(value: MsoTriState): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = StObject.set(x, "PowerPoint.DefaultWebOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelyOnVML(value: MsoTriState): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeGraphics(value: MsoTriState): Self = StObject.set(x, "ResizeGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveNewWebPagesAsWebArchives(value: MsoTriState): Self = StObject.set(x, "SaveNewWebPagesAsWebArchives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSlideAnimation(value: MsoTriState): Self = StObject.set(x, "ShowSlideAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLinksOnSave(value: MsoTriState): Self = StObject.set(x, "UpdateLinksOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongFileNames(value: MsoTriState): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
