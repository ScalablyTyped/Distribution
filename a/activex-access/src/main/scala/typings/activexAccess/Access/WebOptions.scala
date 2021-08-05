package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebOptions extends StObject {
  
  /* private */ @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: WebOptions
  
  val Application: typings.activexAccess.Access.Application
  
  var DownloadComponents: Boolean
  
  var Encoding: MsoEncoding
  
  val FolderSuffix: String
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var LocationOfComponents: String
  
  var OrganizeInFolder: Boolean
  
  val Parent: js.Any
  
  var TargetBrowser: MsoTargetBrowser
  
  def UseDefaultFolderSuffix(): Unit
  
  var UseLongFileNames: Boolean
}
object WebOptions {
  
  inline def apply(
    AccessDotWebOptions_typekey: WebOptions,
    Application: Application,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean
  ): WebOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WebOptions_typekey")(AccessDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  extension [Self <: WebOptions](x: Self) {
    
    inline def setAccessDotWebOptions_typekey(value: WebOptions): Self = StObject.set(x, "Access.WebOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setDownloadComponents(value: Boolean): Self = StObject.set(x, "DownloadComponents", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setLocationOfComponents(value: String): Self = StObject.set(x, "LocationOfComponents", value.asInstanceOf[js.Any])
    
    inline def setOrganizeInFolder(value: Boolean): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultFolderSuffix(value: () => Unit): Self = StObject.set(x, "UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    
    inline def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
