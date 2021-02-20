package typings.activexWord.Word

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebOptions extends StObject {
  
  var AllowPNG: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BrowserLevel: WdBrowserLevel = js.native
  
  val Creator: Double = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  var OptimizeForBrowser: Boolean = js.native
  
  var OrganizeInFolder: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var PixelsPerInch: Double = js.native
  
  var RelyOnCSS: Boolean = js.native
  
  var RelyOnVML: Boolean = js.native
  
  var ScreenSize: MsoScreenSize = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  def UseDefaultFolderSuffix(): Unit = js.native
  
  var UseLongFileNames: Boolean = js.native
  
  @JSName("Word.WebOptions_typekey")
  var WordDotWebOptions_typekey: WebOptions = js.native
}
object WebOptions {
  
  @scala.inline
  def apply(
    AllowPNG: Boolean,
    Application: Application,
    BrowserLevel: WdBrowserLevel,
    Creator: Double,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    OptimizeForBrowser: Boolean,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean,
    WordDotWebOptions_typekey: WebOptions
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BrowserLevel = BrowserLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], OptimizeForBrowser = OptimizeForBrowser.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WebOptions_typekey")(WordDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  @scala.inline
  implicit class WebOptionsMutableBuilder[Self <: WebOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPNG(value: Boolean): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLevel(value: WdBrowserLevel): Self = StObject.set(x, "BrowserLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
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
    def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultFolderSuffix(value: () => Unit): Self = StObject.set(x, "UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotWebOptions_typekey(value: WebOptions): Self = StObject.set(x, "Word.WebOptions_typekey", value.asInstanceOf[js.Any])
  }
}
