package typings.ajv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatValidator = java.lang.String | typings.std.RegExp | (js.Function1[/* data */ java.lang.String, scala.Boolean | js.Thenable[js.Any]])
  type MissingRefError = typings.ajv.mod.AjvErrors.MissingRefError
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | js.Thenable[js.Any]]
  type ValidationError = typings.ajv.mod.AjvErrors.ValidationError
}
