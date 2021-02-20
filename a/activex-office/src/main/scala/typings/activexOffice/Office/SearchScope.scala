package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchScope extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.SearchScope_typekey")
  var OfficeDotSearchScope_typekey: SearchScope = js.native
  
  val ScopeFolder: typings.activexOffice.Office.ScopeFolder = js.native
  
  val Type: MsoSearchIn = js.native
}
object SearchScope {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSearchScope_typekey: SearchScope,
    ScopeFolder: ScopeFolder,
    Type: MsoSearchIn
  ): SearchScope = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ScopeFolder = ScopeFolder.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SearchScope_typekey")(OfficeDotSearchScope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchScope]
  }
  
  @scala.inline
  implicit class SearchScopeMutableBuilder[Self <: SearchScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSearchScope_typekey(value: SearchScope): Self = StObject.set(x, "Office.SearchScope_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeFolder(value: ScopeFolder): Self = StObject.set(x, "ScopeFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoSearchIn): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
