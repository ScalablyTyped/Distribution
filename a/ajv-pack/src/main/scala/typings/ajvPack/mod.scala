package typings.ajvPack

import typings.ajv.mod.Ajv
import typings.ajv.mod.KeywordDefinition
import typings.ajv.mod.ValidateFunction
import typings.ajvPack.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv-pack", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    var addSchema_Original: FnCall = js.native
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
    def compile(schema: js.Object): ValidateFunction = js.native
    /**
      * validate data against the schema
      * @param schema JSON-schema
      * @param data data to validate
      * @return validation result
      */
    def validate(schema: js.Object, data: js.Any): Boolean = js.native
  }
  
  def apply(ajv: Ajv, validate: ValidateFunction): String = js.native
  def instance(ajv: Ajv): AjvPack = js.native
}

