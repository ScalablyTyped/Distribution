package typings.adone.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a YAML exception
  */
@JSGlobal("adone.data.yaml.Exception")
@js.native
class Exception protected ()
  extends typings.adone.adoneNs.errorNs.Exception {
  def this(reason: String, mark: Mark) = this()
  var mark: Mark = js.native
  var reason: String = js.native
}

