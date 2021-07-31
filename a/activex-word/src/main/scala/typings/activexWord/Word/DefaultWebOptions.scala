package typings.activexWord.Word

import typings.activexOffice.Office.MsoCharacterSet
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.WebPageFont
import typings.activexOffice.Office.WebPageFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultWebOptions extends StObject {
  
  var AllowPNG: Boolean
  
  var AlwaysSaveInDefaultEncoding: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  var BrowserLevel: WdBrowserLevel
  
  var CheckIfOfficeIsHTMLEditor: Boolean
  
  var CheckIfWordIsDefaultHTMLEditor: Boolean
  
  val Creator: Double
  
  var Encoding: MsoEncoding
  
  val FolderSuffix: String
  
  def Fonts(Index: MsoCharacterSet): WebPageFont
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts
  
  var OptimizeForBrowser: Boolean
  
  var OrganizeInFolder: Boolean
  
  val Parent: js.Any
  
  var PixelsPerInch: Double
  
  var RelyOnCSS: Boolean
  
  var RelyOnVML: Boolean
  
  var SaveNewWebPagesAsWebArchives: Boolean
  
  var ScreenSize: MsoScreenSize
  
  var TargetBrowser: MsoTargetBrowser
  
  var UpdateLinksOnSave: Boolean
  
  var UseLongFileNames: Boolean
  
  @JSName("Word.DefaultWebOptions_typekey")
  var WordDotDefaultWebOptions_typekey: DefaultWebOptions
}
object DefaultWebOptions {
  
  @scala.inline
  def apply(
    AllowPNG: Boolean,
    AlwaysSaveInDefaultEncoding: Boolean,
    Application: Application,
    BrowserLevel: WdBrowserLevel,
    CheckIfOfficeIsHTMLEditor: Boolean,
    CheckIfWordIsDefaultHTMLEditor: Boolean,
    Creator: Double,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    Fonts: WebPageFonts,
    OptimizeForBrowser: Boolean,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    SaveNewWebPagesAsWebArchives: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UpdateLinksOnSave: Boolean,
    UseLongFileNames: Boolean,
    WordDotDefaultWebOptions_typekey: DefaultWebOptions
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BrowserLevel = BrowserLevel.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], CheckIfWordIsDefaultHTMLEditor = CheckIfWordIsDefaultHTMLEditor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], Fonts = Fonts.asInstanceOf[js.Any], OptimizeForBrowser = OptimizeForBrowser.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], SaveNewWebPagesAsWebArchives = SaveNewWebPagesAsWebArchives.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UpdateLinksOnSave = UpdateLinksOnSave.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DefaultWebOptions_typekey")(WordDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
  
  @scala.inline
  implicit class DefaultWebOptionsMutableBuilder[Self <: DefaultWebOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPNG(value: Boolean): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSaveInDefaultEncoding(value: Boolean): Self = StObject.set(x, "AlwaysSaveInDefaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLevel(value: WdBrowserLevel): Self = StObject.set(x, "BrowserLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfOfficeIsHTMLEditor(value: Boolean): Self = StObject.set(x, "CheckIfOfficeIsHTMLEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfWordIsDefaultHTMLEditor(value: Boolean): Self = StObject.set(x, "CheckIfWordIsDefaultHTMLEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFonts(value: WebPageFonts): Self = StObject.set(x, "Fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForBrowser(value: Boolean): Self = StObject.set(x, "OptimizeForBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizeInFolder(value: Boolean): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsPerInch(value: Double): Self = StObject.set(x, "PixelsPerInch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelyOnCSS(value: Boolean): Self = StObject.set(x, "RelyOnCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelyOnVML(value: Boolean): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveNewWebPagesAsWebArchives(value: Boolean): Self = StObject.set(x, "SaveNewWebPagesAsWebArchives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLinksOnSave(value: Boolean): Self = StObject.set(x, "UpdateLinksOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = StObject.set(x, "Word.DefaultWebOptions_typekey", value.asInstanceOf[js.Any])
  }
}
