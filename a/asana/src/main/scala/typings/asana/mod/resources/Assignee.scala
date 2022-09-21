package typings.asana.mod.resources

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignee
  extends StObject
     with Resource {
  
  var email: js.UndefOr[String] = js.undefined
  
  var photo: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var workspaces: js.UndefOr[js.Array[Resource]] = js.undefined
}
object Assignee {
  
  inline def apply(gid: String, name: String, resource_type: String): Assignee = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignee]
  }
  
  extension [Self <: Assignee](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoto(value: StringDictionary[String]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setWorkspaces(value: js.Array[Resource]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesVarargs(value: Resource*): Self = StObject.set(x, "workspaces", js.Array(value*))
  }
}
