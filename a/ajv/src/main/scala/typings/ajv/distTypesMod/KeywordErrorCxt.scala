package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`false`
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.CodeGen
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileMod.SchemaCxt
import typings.ajv.distCompileRulesMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordErrorCxt extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[String | `false`] = js.undefined
  
  var data: Name
  
  var errsCount: js.UndefOr[Name] = js.undefined
  
  var gen: CodeGen
  
  var it: SchemaCxt
  
  var keyword: String
  
  var params: KeywordCxtParams
  
  var parentSchema: js.UndefOr[AnySchemaObject] = js.undefined
  
  var schema: Any
  
  var schemaCode: Code | Double | Boolean
  
  var schemaType: js.UndefOr[js.Array[JSONType]] = js.undefined
  
  var schemaValue: Code | Double | Boolean
}
object KeywordErrorCxt {
  
  inline def apply(
    data: Name,
    gen: CodeGen,
    it: SchemaCxt,
    keyword: String,
    params: KeywordCxtParams,
    schema: Any,
    schemaCode: Code | Double | Boolean,
    schemaValue: Code | Double | Boolean
  ): KeywordErrorCxt = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], gen = gen.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaCode = schemaCode.asInstanceOf[js.Any], schemaValue = schemaValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordErrorCxt]
  }
  
  extension [Self <: KeywordErrorCxt](x: Self) {
    
    inline def set$data(value: String | `false`): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    inline def setData(value: Name): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrsCount(value: Name): Self = StObject.set(x, "errsCount", value.asInstanceOf[js.Any])
    
    inline def setErrsCountUndefined: Self = StObject.set(x, "errsCount", js.undefined)
    
    inline def setGen(value: CodeGen): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setIt(value: SchemaCxt): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setParams(value: KeywordCxtParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParentSchema(value: AnySchemaObject): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
    
    inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaCode(value: Code | Double | Boolean): Self = StObject.set(x, "schemaCode", value.asInstanceOf[js.Any])
    
    inline def setSchemaType(value: js.Array[JSONType]): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
    
    inline def setSchemaTypeVarargs(value: JSONType*): Self = StObject.set(x, "schemaType", js.Array(value*))
    
    inline def setSchemaValue(value: Code | Double | Boolean): Self = StObject.set(x, "schemaValue", value.asInstanceOf[js.Any])
  }
}
