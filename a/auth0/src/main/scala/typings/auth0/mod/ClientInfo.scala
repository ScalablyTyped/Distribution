package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var dependencies: js.Array[_]
  var environment: js.Array[Environment]
  var name: String
  var version: String
}

object ClientInfo {
  @scala.inline
  def apply(dependencies: js.Array[_], environment: js.Array[Environment], name: String, version: String): ClientInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientInfo]
  }
}

