package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeFolder extends StObject {
  
  def AddToSearchFolders(): Unit
  
  val Application: Any
  
  val Creator: Double
  
  val Name: String
  
  /* private */ @JSName("Office.ScopeFolder_typekey")
  var OfficeDotScopeFolder_typekey: ScopeFolder
  
  val Path: String
  
  def ScopeFolders(Index: Double): ScopeFolder
  @JSName("ScopeFolders")
  val ScopeFolders_Original: ScopeFolders
}
object ScopeFolder {
  
  inline def apply(
    AddToSearchFolders: () => Unit,
    Application: Any,
    Creator: Double,
    Name: String,
    OfficeDotScopeFolder_typekey: ScopeFolder,
    Path: String,
    ScopeFolders: ScopeFolders
  ): ScopeFolder = {
    val __obj = js.Dynamic.literal(AddToSearchFolders = js.Any.fromFunction0(AddToSearchFolders), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ScopeFolders = ScopeFolders.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ScopeFolder_typekey")(OfficeDotScopeFolder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeFolder]
  }
  
  extension [Self <: ScopeFolder](x: Self) {
    
    inline def setAddToSearchFolders(value: () => Unit): Self = StObject.set(x, "AddToSearchFolders", js.Any.fromFunction0(value))
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotScopeFolder_typekey(value: ScopeFolder): Self = StObject.set(x, "Office.ScopeFolder_typekey", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setScopeFolders(value: ScopeFolders): Self = StObject.set(x, "ScopeFolders", value.asInstanceOf[js.Any])
  }
}
