package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Projects.CreateParams & {  workspace :string | number} */
trait CreateParamsworkspacestri extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var due_date: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var team: js.UndefOr[String | Double] = js.undefined
  
  var workspace: String | Double
}
object CreateParamsworkspacestri {
  
  inline def apply(workspace: String | Double): CreateParamsworkspacestri = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacestri]
  }
  
  extension [Self <: CreateParamsworkspacestri](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
