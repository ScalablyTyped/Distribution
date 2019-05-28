package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdumper extends js.Object {
  val INs: js.Any = js.native
  /**
    * Same as safeDump() but without limits (uses DEFAULT_FULL by default)
    */
  def dump(input: js.Any): java.lang.String = js.native
  def dump(input: js.Any, options: adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options): java.lang.String = js.native
  /**
    * Serializes object as a YAML document.
    * Uses DEFAULT_SAFE, so it will throw an exception if you try to dump regexps or functions
    */
  def safeDump(input: js.Any): java.lang.String = js.native
  def safeDump(input: js.Any, options: adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options): java.lang.String = js.native
}

