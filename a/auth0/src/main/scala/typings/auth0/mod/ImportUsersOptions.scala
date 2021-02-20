package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.ImportUsersFromFileOptions
  - typings.auth0.mod.ImportUsersFromJsonOptions
*/
trait ImportUsersOptions extends StObject
object ImportUsersOptions {
  
  @scala.inline
  def ImportUsersFromFileOptions(connection_id: String, users: String): typings.auth0.mod.ImportUsersFromFileOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.auth0.mod.ImportUsersFromFileOptions]
  }
  
  @scala.inline
  def ImportUsersFromJsonOptions(connection_id: String, users_json: String): typings.auth0.mod.ImportUsersFromJsonOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.auth0.mod.ImportUsersFromJsonOptions]
  }
}
