package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CheckSessionOptions extends AuthorizeOptions {
  /**
  	 * optional parameter for auth0 to use postMessage to communicate between the silent callback and the SPA.
  	 */
  var usePostMessage: js.UndefOr[scala.Boolean] = js.undefined
}

