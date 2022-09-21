package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchScope extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  /* private */ @JSName("Office.SearchScope_typekey")
  var OfficeDotSearchScope_typekey: SearchScope
  
  val ScopeFolder: typings.activexOffice.Office.ScopeFolder
  
  val Type: MsoSearchIn
}
object SearchScope {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    OfficeDotSearchScope_typekey: SearchScope,
    ScopeFolder: ScopeFolder,
    Type: MsoSearchIn
  ): SearchScope = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ScopeFolder = ScopeFolder.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SearchScope_typekey")(OfficeDotSearchScope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchScope]
  }
  
  extension [Self <: SearchScope](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSearchScope_typekey(value: SearchScope): Self = StObject.set(x, "Office.SearchScope_typekey", value.asInstanceOf[js.Any])
    
    inline def setScopeFolder(value: ScopeFolder): Self = StObject.set(x, "ScopeFolder", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoSearchIn): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
