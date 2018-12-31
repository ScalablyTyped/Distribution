package typings
package adoneLib.adoneNs.dataNs.yamlNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.schema")
@js.native
object schemaNsMembers extends js.Object {
  /**
    * same as JSON
    */
  val CORE: Schema = js.native
  /**
    * all supported YAML types
    */
  val DEFAULT_FULL: Schema = js.native
  /**
    * all supported YAML types, without unsafe ones: !!js/undefined, !!js/regexp and !!js/function
    */
  val DEFAULT_SAFE: Schema = js.native
  /**
    * only strings, arrays and plain objects
    */
  val FAILSAFE: Schema = js.native
  /**
    * all JSON-supported types
    */
  val JSON: Schema = js.native
  def create(schemas: Schema, types: adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]): Schema = js.native
  def create(schemas: Schema, types: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]): Schema = js.native
  def create(schemas: js.Array[Schema], types: adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]): Schema = js.native
  def create(schemas: js.Array[Schema], types: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]): Schema = js.native
}

