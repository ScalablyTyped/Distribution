package typings
package adoneLib.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Represetns a mark that is used in exceptions to define the error's location
             */
@JSGlobal("adone.data.yaml.Mark")
@js.native
class Mark protected () extends js.Object {
  def this(name: java.lang.String, buffer: java.lang.String, position: scala.Double, line: scala.Double, column: scala.Double) = this()
  var buffer: java.lang.String = js.native
  var column: scala.Double = js.native
  var line: scala.Double = js.native
  var name: java.lang.String = js.native
  var position: scala.Double = js.native
  def getSnippet(): java.lang.String = js.native
  def getSnippet(indent: scala.Double): java.lang.String = js.native
  def getSnippet(indent: scala.Double, maxLength: scala.Double): java.lang.String = js.native
  def toString(compact: scala.Boolean): java.lang.String = js.native
}

