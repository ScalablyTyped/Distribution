package typings.adone.adoneNs.dataNs.yamlNs.dumperNs

import typings.adone.adoneNs.dataNs.yamlNs.dumperNs.INs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.dumper")
@js.native
object ^ extends js.Object {
  /**
    * Same as safeDump() but without limits (uses DEFAULT_FULL by default)
    */
  def dump(input: js.Any): String = js.native
  def dump(input: js.Any, options: Options): String = js.native
  /**
    * Serializes object as a YAML document.
    * Uses DEFAULT_SAFE, so it will throw an exception if you try to dump regexps or functions
    */
  def safeDump(input: js.Any): String = js.native
  def safeDump(input: js.Any, options: Options): String = js.native
}

