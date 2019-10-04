package typings.ajvDashPack.ajvDashPackMod

import typings.ajv.ajvMod.Ajv
import typings.ajv.ajvMod.KeywordDefinition
import typings.ajv.ajvMod.ValidateFunction
import typings.ajvDashPack.Fn_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjvPack extends js.Object {
  /**
    * add custom keyword to the instance
    * @return result from ajv instance
    */
  @JSName("addKeyword")
  var addKeyword_Original: js.Function2[/* keyword */ String, /* definition */ KeywordDefinition, Ajv] = js.native
  /**
    * add schema to the instance
    * @return result from ajv instance
    */
  @JSName("addSchema")
  var addSchema_Original: Fn_Key = js.native
  /**
    * add custom keyword to the instance
    * @return result from ajv instance
    */
  def addKeyword(keyword: String, definition: KeywordDefinition): Ajv = js.native
  /**
    * add schema to the instance
    * @return result from ajv instance
    */
  def addSchema(schema: js.Array[js.Object]): Ajv = js.native
  /**
    * add schema to the instance
    * @return result from ajv instance
    */
  def addSchema(schema: js.Array[js.Object], key: String): Ajv = js.native
  /**
    * add schema to the instance
    * @return result from ajv instance
    */
  def addSchema(schema: js.Object): Ajv = js.native
  /**
    * add schema to the instance
    * @return result from ajv instance
    */
  def addSchema(schema: js.Object, key: String): Ajv = js.native
  /**
    * compile the schema and require the module
    * @param  schema JSON-schema
    * @return validation function
    */
  def compile(`this`: Ajv, schema: js.Object): ValidateFunction = js.native
  /**
    * validate data against the schema
    * @param schema JSON-schema
    * @param data data to validate
    * @return validation result
    */
  def validate(`this`: Ajv, schema: js.Object, data: js.Any): Boolean = js.native
}

