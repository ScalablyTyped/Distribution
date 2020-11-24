package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asana", "auth.RedirectFlow")
@js.native
class RedirectFlowCls protected () extends BaseBrowserFlow {
  /**
    * An Oauth flow that runs in the browser and requests user authorization by
    * redirecting to an authorization page on Asana, and redirecting back with
    * the credentials.
    * @param {Object} options See `BaseBrowserFlow` for options.
    * @constructor
    */
  def this(options: js.Any) = this()
}
