package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CORE extends js.Object {
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
  var Schema: org.scalablytyped.runtime.Instantiable1[
    /* _ */ js.UndefOr[/* _ */ Anon_Explicit], 
    adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema
  ] = js.native
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

trait Anon_Core extends js.Object {
  val coreNs: Anon_CreateI
}

