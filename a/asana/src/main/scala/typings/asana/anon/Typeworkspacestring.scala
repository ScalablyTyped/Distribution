package typings.asana.anon

import typings.asana.mod.resources.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Tags.Type & {  workspace :string} */
trait Typeworkspacestring extends StObject {
  
  var color: String
  
  var created_at: String
  
  var followers: js.Array[Resource]
  
  var gid: String
  
  var name: String
  
  var notes: String
  
  var resource_subtype: js.UndefOr[String] = js.undefined
  
  var resource_type: String
  
  var workspace: Resource
}
object Typeworkspacestring {
  
  inline def apply(
    color: String,
    created_at: String,
    followers: js.Array[Resource],
    gid: String,
    name: String,
    notes: String,
    resource_type: String,
    workspace: Resource
  ): Typeworkspacestring = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeworkspacestring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeworkspacestring] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setFollowers(value: js.Array[Resource]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowersVarargs(value: Resource*): Self = StObject.set(x, "followers", js.Array(value*))
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
    
    inline def setResource_subtypeUndefined: Self = StObject.set(x, "resource_subtype", js.undefined)
    
    inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
    
    inline def setWorkspace(value: Resource): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
