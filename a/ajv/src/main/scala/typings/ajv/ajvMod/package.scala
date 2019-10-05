package typings.ajv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ajvMod {
  import typings.std.RegExp

  type FormatValidator = String | RegExp | (js.Function1[/* data */ String, Boolean | js.Thenable[js.Any]])
  type MissingRefError = typings.ajv.ajvMod.AjvErrors.MissingRefError
  type NumberFormatValidator = js.Function1[/* data */ Double, Boolean | js.Thenable[js.Any]]
  type ValidationError = typings.ajv.ajvMod.AjvErrors.ValidationError
}
