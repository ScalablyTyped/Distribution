package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "auth.autoDetect")
@js.native
object autoDetect extends js.Object {
  /**
    * Auto-detects the type of Oauth flow to use that's appropriate to the
    * environment.
    *
    * @returns {Function|null} The type of Oauth flow to use, or null if no
    *     appropriate type could be determined.
    * @param env
    * @return
    */
  def apply(env: js.Any): js.Function = js.native
}

