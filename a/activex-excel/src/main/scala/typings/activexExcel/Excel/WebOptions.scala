package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebOptions extends StObject {
  
  var AllowPNG: Boolean
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var DownloadComponents: Boolean
  
  var Encoding: MsoEncoding
  
  /* private */ @JSName("Excel.WebOptions_typekey")
  var ExcelDotWebOptions_typekey: WebOptions
  
  val FolderSuffix: String
  
  var LocationOfComponents: String
  
  var OrganizeInFolder: Boolean
  
  val Parent: Any
  
  var PixelsPerInch: Double
  
  var RelyOnCSS: Boolean
  
  var RelyOnVML: Boolean
  
  var ScreenSize: MsoScreenSize
  
  var TargetBrowser: MsoTargetBrowser
  
  def UseDefaultFolderSuffix(): Unit
  
  var UseLongFileNames: Boolean
}
object WebOptions {
  
  inline def apply(
    AllowPNG: Boolean,
    Application: Application,
    Creator: XlCreator,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    ExcelDotWebOptions_typekey: WebOptions,
    FolderSuffix: String,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WebOptions_typekey")(ExcelDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowPNG(value: Boolean): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDownloadComponents(value: Boolean): Self = StObject.set(x, "DownloadComponents", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setExcelDotWebOptions_typekey(value: WebOptions): Self = StObject.set(x, "Excel.WebOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    inline def setLocationOfComponents(value: String): Self = StObject.set(x, "LocationOfComponents", value.asInstanceOf[js.Any])
    
    inline def setOrganizeInFolder(value: Boolean): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerInch(value: Double): Self = StObject.set(x, "PixelsPerInch", value.asInstanceOf[js.Any])
    
    inline def setRelyOnCSS(value: Boolean): Self = StObject.set(x, "RelyOnCSS", value.asInstanceOf[js.Any])
    
    inline def setRelyOnVML(value: Boolean): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    inline def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    inline def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultFolderSuffix(value: () => Unit): Self = StObject.set(x, "UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    
    inline def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
