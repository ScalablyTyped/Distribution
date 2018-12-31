package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends stdLib.Error {
  var ajv: ajvLib.ajvLibNumbers.`true`
  var errors: js.Array[ajvLib.ajvMod.ajvNs.ErrorObject]
  var validation: ajvLib.ajvLibNumbers.`true`
}

