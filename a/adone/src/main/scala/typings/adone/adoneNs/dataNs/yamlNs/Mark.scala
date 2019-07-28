package typings.adone.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represetns a mark that is used in exceptions to define the error's location
  */
@JSGlobal("adone.data.yaml.Mark")
@js.native
class Mark protected () extends js.Object {
  def this(name: String, buffer: String, position: Double, line: Double, column: Double) = this()
  var buffer: String = js.native
  var column: Double = js.native
  var line: Double = js.native
  var name: String = js.native
  var position: Double = js.native
  def getSnippet(): String = js.native
  def getSnippet(indent: Double): String = js.native
  def getSnippet(indent: Double, maxLength: Double): String = js.native
  def toString(compact: Boolean): String = js.native
}

