package typings.ajv

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ajvMod {
  type FormatValidator = String | RegExp | (js.Function1[/* data */ String, Boolean | js.Thenable[js.Any]])
  type MissingRefError = typings.ajv.ajvMod.AjvErrorsNs.MissingRefError
  type NumberFormatValidator = js.Function1[/* data */ Double, Boolean | js.Thenable[js.Any]]
  type ValidationError = typings.ajv.ajvMod.AjvErrorsNs.ValidationError
}
