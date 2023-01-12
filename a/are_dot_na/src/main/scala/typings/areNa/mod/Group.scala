package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Groups allow multiple people to collaborate, access, and upload shared blocks and channels.
  * Groups have their own group profile pages and are public by default.
  */
trait Group extends StObject {
  
  var accessible_by_ids: js.Array[Double]
  
  /**
    * Will always be "Group"
    */
  var `class`: String
  
  /**
    * Timestamp when the group was created
    */
  var created_at: Timestamp
  
  /**
    * The description of the group
    */
  var description: String | Null
  
  /**
    * The internal ID of the group
    */
  var id: Double
  
  /**
    * UserIds of the group members
    */
  var member_ids: js.Array[Double]
  
  /**
    * The title of the group
    */
  var title: String | Null
  
  /**
    * Timestamp when the group was last updated
    */
  var updated_at: Timestamp
  
  /**
    * More information on the group admin
    */
  var user: User
  
  /**
    * More information on the group members
    */
  var users: js.Array[User]
}
object Group {
  
  inline def apply(
    accessible_by_ids: js.Array[Double],
    `class`: String,
    created_at: Timestamp,
    id: Double,
    member_ids: js.Array[Double],
    updated_at: Timestamp,
    user: User,
    users: js.Array[User]
  ): Group = {
    val __obj = js.Dynamic.literal(accessible_by_ids = accessible_by_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], member_ids = member_ids.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], description = null, title = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setAccessible_by_ids(value: js.Array[Double]): Self = StObject.set(x, "accessible_by_ids", value.asInstanceOf[js.Any])
    
    inline def setAccessible_by_idsVarargs(value: Double*): Self = StObject.set(x, "accessible_by_ids", js.Array(value*))
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMember_ids(value: js.Array[Double]): Self = StObject.set(x, "member_ids", value.asInstanceOf[js.Any])
    
    inline def setMember_idsVarargs(value: Double*): Self = StObject.set(x, "member_ids", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setUpdated_at(value: Timestamp): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
