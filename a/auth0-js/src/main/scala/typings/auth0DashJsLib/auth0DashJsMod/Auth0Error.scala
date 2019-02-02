package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Error extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var error: LibErrorCodes | SpecErrorCodes | java.lang.String
  var errorDescription: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var original: js.UndefOr[js.Any] = js.undefined
  var policy: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

