package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: java.lang.String
  var redirectUri: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, redirectUri: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, redirectUri = redirectUri)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

