package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingRefError
  extends stdLib.Error {
  var missingRef: java.lang.String
  var missingSchema: java.lang.String
}

