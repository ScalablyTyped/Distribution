package typings.ajv.distTypesMod

import typings.ajv.distCompileRulesMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordDef extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$dataError")
  var $dataError: js.UndefOr[KeywordErrorDefinition] = js.undefined
  
  var allowUndefined: js.UndefOr[Boolean] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var error: js.UndefOr[KeywordErrorDefinition] = js.undefined
  
  var implements: js.UndefOr[js.Array[String]] = js.undefined
  
  var keyword: String | js.Array[String]
  
  var metaSchema: js.UndefOr[AnySchemaObject] = js.undefined
  
  var post: js.UndefOr[Boolean] = js.undefined
  
  var schemaType: js.UndefOr[JSONType | js.Array[JSONType]] = js.undefined
  
  var `type`: js.UndefOr[JSONType | js.Array[JSONType]] = js.undefined
  
  var validateSchema: js.UndefOr[AnyValidateFunction[Any]] = js.undefined
}
object KeywordDef {
  
  inline def apply(keyword: String | js.Array[String]): KeywordDef = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordDef]
  }
  
  extension [Self <: KeywordDef](x: Self) {
    
    inline def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    inline def set$dataError(value: KeywordErrorDefinition): Self = StObject.set(x, "$dataError", value.asInstanceOf[js.Any])
    
    inline def set$dataErrorUndefined: Self = StObject.set(x, "$dataError", js.undefined)
    
    inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefinedUndefined: Self = StObject.set(x, "allowUndefined", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setError(value: KeywordErrorDefinition): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setImplements(value: js.Array[String]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    inline def setImplementsVarargs(value: String*): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setKeyword(value: String | js.Array[String]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordVarargs(value: String*): Self = StObject.set(x, "keyword", js.Array(value*))
    
    inline def setMetaSchema(value: AnySchemaObject): Self = StObject.set(x, "metaSchema", value.asInstanceOf[js.Any])
    
    inline def setMetaSchemaUndefined: Self = StObject.set(x, "metaSchema", js.undefined)
    
    inline def setPost(value: Boolean): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setSchemaType(value: JSONType | js.Array[JSONType]): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
    
    inline def setSchemaTypeVarargs(value: JSONType*): Self = StObject.set(x, "schemaType", js.Array(value*))
    
    inline def setType(value: JSONType | js.Array[JSONType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: JSONType*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValidateSchema(value: AnyValidateFunction[Any]): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
    
    inline def setValidateSchemaUndefined: Self = StObject.set(x, "validateSchema", js.undefined)
  }
}
