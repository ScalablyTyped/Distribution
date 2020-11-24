package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.ImportUsersFromFileOptions
  - typings.auth0.mod.ImportUsersFromJsonOptions
*/
trait ImportUsersOptions extends js.Object
object ImportUsersOptions {
  
  @scala.inline
  def ImportUsersFromFileOptions(connection_id: String, users: String): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersOptions]
  }
  
  @scala.inline
  def ImportUsersFromJsonOptions(connection_id: String, users_json: String): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersOptions]
  }
}
