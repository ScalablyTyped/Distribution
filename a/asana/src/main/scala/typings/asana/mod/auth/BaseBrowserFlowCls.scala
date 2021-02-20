package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.BaseBrowserFlow")
@js.native
class BaseBrowserFlowCls protected () extends BaseBrowserFlow {
  /**
    * A base class for any flow that runs in the browser. All subclasses use the
    * "implicit grant" flow to authenticate via the browser.
    * @param {Object} options
    * @option {App} app The app this flow is for
    * @option {String} [redirectUri] The URL that Asana should redirect to once
    *     user authorization is complete. Defaults to the URL configured in
    *     the app, and if none then the current page URL.
    * @constructor
    */
  def this(options: js.Any) = this()
}
