package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var dependencies: js.Array[_]
  var environment: js.Array[Environment]
  var name: java.lang.String
  var version: java.lang.String
}

object ClientInfo {
  @scala.inline
  def apply(
    dependencies: js.Array[_],
    environment: js.Array[Environment],
    name: java.lang.String,
    version: java.lang.String
  ): ClientInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, environment = environment, name = name, version = version)
  
    __obj.asInstanceOf[ClientInfo]
  }
}

