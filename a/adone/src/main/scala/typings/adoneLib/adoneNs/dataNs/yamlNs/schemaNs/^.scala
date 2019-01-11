package typings
package adoneLib.adoneNs.dataNs.yamlNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.schema")
@js.native
object ^ extends js.Object {
  /**
    * same as JSON
    */
  val CORE: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  /**
    * all supported YAML types
    */
  val DEFAULT_FULL: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  /**
    * all supported YAML types, without unsafe ones: !!js/undefined, !!js/regexp and !!js/function
    */
  val DEFAULT_SAFE: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  /**
    * only strings, arrays and plain objects
    */
  val FAILSAFE: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  /**
    * all JSON-supported types
    */
  val JSON: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  def create(
    schemas: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema,
    types: adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]
  ): adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  def create(
    schemas: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema,
    types: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]
  ): adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  def create(
    schemas: js.Array[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema],
    types: adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]
  ): adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
  def create(
    schemas: js.Array[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema],
    types: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]
  ): adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = js.native
}

