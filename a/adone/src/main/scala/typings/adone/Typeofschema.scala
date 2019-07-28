package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.dataNs.yamlNs.schemaNs.Schema
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofschema extends js.Object {
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
  var Schema: Instantiable1[
    js.UndefOr[/* _ */ Anon_Explicit], 
    typings.adone.adoneNs.dataNs.yamlNs.schemaNs.Schema
  ] = js.native
  def create(schemas: js.Array[Schema], types: js.Array[Type[_]]): Schema = js.native
  def create(schemas: js.Array[Schema], types: Type[_]): Schema = js.native
  def create(schemas: Schema, types: js.Array[Type[_]]): Schema = js.native
  def create(schemas: Schema, types: Type[_]): Schema = js.native
}

