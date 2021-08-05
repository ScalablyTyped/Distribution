package typings.ajvPack

import typings.ajv.mod.Ajv
import typings.ajv.mod.KeywordDefinition
import typings.ajv.mod.ValidateFunction
import typings.ajvPack.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ajv: Ajv, validate: ValidateFunction): String = (^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ajv-pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instance(ajv: Ajv): AjvPack = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(ajv.asInstanceOf[js.Any]).asInstanceOf[AjvPack]
  
  trait AjvPack extends StObject {
    
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(keyword: String, definition: KeywordDefinition): Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    @JSName("addKeyword")
    var addKeyword_Original: js.Function2[/* keyword */ String, /* definition */ KeywordDefinition, Ajv]
    
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[js.Object]): Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[js.Object], key: String): Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Object): Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Object, key: String): Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    var addSchema_Original: FnCall
    
    /**
      * compile the schema and require the module
      * @param  schema JSON-schema
      * @return validation function
      */
    def compile(schema: js.Object): ValidateFunction
    
    /**
      * validate data against the schema
      * @param schema JSON-schema
      * @param data data to validate
      * @return validation result
      */
    def validate(schema: js.Object, data: js.Any): Boolean
  }
  object AjvPack {
    
    inline def apply(
      addKeyword: (/* keyword */ String, /* definition */ KeywordDefinition) => Ajv,
      addSchema: FnCall,
      compile: js.Object => ValidateFunction,
      validate: (js.Object, js.Any) => Boolean
    ): AjvPack = {
      val __obj = js.Dynamic.literal(addKeyword = js.Any.fromFunction2(addKeyword), addSchema = addSchema.asInstanceOf[js.Any], compile = js.Any.fromFunction1(compile), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[AjvPack]
    }
    
    extension [Self <: AjvPack](x: Self) {
      
      inline def setAddKeyword(value: (/* keyword */ String, /* definition */ KeywordDefinition) => Ajv): Self = StObject.set(x, "addKeyword", js.Any.fromFunction2(value))
      
      inline def setAddSchema(value: FnCall): Self = StObject.set(x, "addSchema", value.asInstanceOf[js.Any])
      
      inline def setCompile(value: js.Object => ValidateFunction): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (js.Object, js.Any) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
}
