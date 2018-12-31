package typings
package adoneLib.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a YAML exception
  */
@JSGlobal("adone.data.yaml.Exception")
@js.native
class Exception protected ()
  extends adoneLib.adoneNs.errorNs.Exception {
  def this(reason: java.lang.String, mark: Mark) = this()
  var mark: Mark = js.native
  var reason: java.lang.String = js.native
}

