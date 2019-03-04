package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var name: java.lang.String
  var version: java.lang.String
}

object Environment {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): Environment = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[Environment]
  }
}

