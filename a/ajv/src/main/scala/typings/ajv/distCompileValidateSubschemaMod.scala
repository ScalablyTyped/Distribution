package typings.ajv

import typings.ajv.ajvBooleans.`true`
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCompileRulesMod.JSONType
import typings.ajv.distCompileUtilMod.Type
import typings.ajv.distTypesMod.AnySchema
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateSubschemaMod {
  
  @JSImport("ajv/dist/compile/validate/subschema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendSubschemaData(subschema: SubschemaContext, it: SchemaObjCxt, param2: SubschemaArgs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSubschemaData")(subschema.asInstanceOf[js.Any], it.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extendSubschemaMode(subschema: SubschemaContext, param1: SubschemaArgs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSubschemaMode")(subschema.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSubschema(it: SchemaObjCxt, param1: SubschemaArgs): SubschemaContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubschema")(it.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SubschemaContext]
  
  /* Inlined std.Partial<{  keyword :string,   schemaProp :string | number,   schema :ajv.ajv/dist/types.AnySchema,   schemaPath :ajv.ajv/dist/compile/codegen.Code,   errSchemaPath :string,   topSchemaRef :ajv.ajv/dist/compile/codegen.Code,   data :ajv.ajv/dist/compile/codegen.Name | ajv.ajv/dist/compile/codegen.Code,   dataProp :ajv.ajv/dist/compile/codegen.Code | string | number,   dataTypes :std.Array<ajv.ajv/dist/compile/rules.JSONType>,   definedProperties :std.Set<string>,   propertyName :ajv.ajv/dist/compile/codegen.Name,   dataPropType :ajv.ajv/dist/compile/util.Type,   jtdDiscriminator :string,   jtdMetadata :boolean,   compositeRule :true,   createErrors :boolean,   allErrors :boolean}> */
  trait SubschemaArgs extends StObject {
    
    var allErrors: js.UndefOr[Boolean] = js.undefined
    
    var compositeRule: js.UndefOr[`true`] = js.undefined
    
    var createErrors: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Name | Code] = js.undefined
    
    var dataProp: js.UndefOr[Code | String | Double] = js.undefined
    
    var dataPropType: js.UndefOr[Type] = js.undefined
    
    var dataTypes: js.UndefOr[js.Array[JSONType]] = js.undefined
    
    var definedProperties: js.UndefOr[Set[String]] = js.undefined
    
    var errSchemaPath: js.UndefOr[String] = js.undefined
    
    var jtdDiscriminator: js.UndefOr[String] = js.undefined
    
    var jtdMetadata: js.UndefOr[Boolean] = js.undefined
    
    var keyword: js.UndefOr[String] = js.undefined
    
    var propertyName: js.UndefOr[Name] = js.undefined
    
    var schema: js.UndefOr[AnySchema] = js.undefined
    
    var schemaPath: js.UndefOr[Code] = js.undefined
    
    var schemaProp: js.UndefOr[String | Double] = js.undefined
    
    var topSchemaRef: js.UndefOr[Code] = js.undefined
  }
  object SubschemaArgs {
    
    inline def apply(): SubschemaArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubschemaArgs]
    }
    
    extension [Self <: SubschemaArgs](x: Self) {
      
      inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
      
      inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
      
      inline def setCompositeRule(value: `true`): Self = StObject.set(x, "compositeRule", value.asInstanceOf[js.Any])
      
      inline def setCompositeRuleUndefined: Self = StObject.set(x, "compositeRule", js.undefined)
      
      inline def setCreateErrors(value: Boolean): Self = StObject.set(x, "createErrors", value.asInstanceOf[js.Any])
      
      inline def setCreateErrorsUndefined: Self = StObject.set(x, "createErrors", js.undefined)
      
      inline def setData(value: Name | Code): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataProp(value: Code | String | Double): Self = StObject.set(x, "dataProp", value.asInstanceOf[js.Any])
      
      inline def setDataPropType(value: Type): Self = StObject.set(x, "dataPropType", value.asInstanceOf[js.Any])
      
      inline def setDataPropTypeUndefined: Self = StObject.set(x, "dataPropType", js.undefined)
      
      inline def setDataPropUndefined: Self = StObject.set(x, "dataProp", js.undefined)
      
      inline def setDataTypes(value: js.Array[JSONType]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
      
      inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
      
      inline def setDataTypesVarargs(value: JSONType*): Self = StObject.set(x, "dataTypes", js.Array(value*))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefinedProperties(value: Set[String]): Self = StObject.set(x, "definedProperties", value.asInstanceOf[js.Any])
      
      inline def setDefinedPropertiesUndefined: Self = StObject.set(x, "definedProperties", js.undefined)
      
      inline def setErrSchemaPath(value: String): Self = StObject.set(x, "errSchemaPath", value.asInstanceOf[js.Any])
      
      inline def setErrSchemaPathUndefined: Self = StObject.set(x, "errSchemaPath", js.undefined)
      
      inline def setJtdDiscriminator(value: String): Self = StObject.set(x, "jtdDiscriminator", value.asInstanceOf[js.Any])
      
      inline def setJtdDiscriminatorUndefined: Self = StObject.set(x, "jtdDiscriminator", js.undefined)
      
      inline def setJtdMetadata(value: Boolean): Self = StObject.set(x, "jtdMetadata", value.asInstanceOf[js.Any])
      
      inline def setJtdMetadataUndefined: Self = StObject.set(x, "jtdMetadata", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setPropertyName(value: Name): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setSchema(value: AnySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: Code): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
      
      inline def setSchemaProp(value: String | Double): Self = StObject.set(x, "schemaProp", value.asInstanceOf[js.Any])
      
      inline def setSchemaPropUndefined: Self = StObject.set(x, "schemaProp", js.undefined)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTopSchemaRef(value: Code): Self = StObject.set(x, "topSchemaRef", value.asInstanceOf[js.Any])
      
      inline def setTopSchemaRefUndefined: Self = StObject.set(x, "topSchemaRef", js.undefined)
    }
  }
  
  trait SubschemaContext extends StObject {
    
    var allErrors: js.UndefOr[Boolean] = js.undefined
    
    var compositeRule: js.UndefOr[`true`] = js.undefined
    
    var createErrors: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Name] = js.undefined
    
    var dataLevel: js.UndefOr[Double] = js.undefined
    
    var dataNames: js.UndefOr[js.Array[Name]] = js.undefined
    
    var dataPathArr: js.UndefOr[js.Array[Code | Double]] = js.undefined
    
    var dataTypes: js.UndefOr[js.Array[JSONType]] = js.undefined
    
    var errSchemaPath: String
    
    var errorPath: js.UndefOr[Code] = js.undefined
    
    var jtdDiscriminator: js.UndefOr[String] = js.undefined
    
    var jtdMetadata: js.UndefOr[Boolean] = js.undefined
    
    var parentData: js.UndefOr[Name] = js.undefined
    
    var parentDataProperty: js.UndefOr[Code | Double] = js.undefined
    
    var propertyName: js.UndefOr[Name] = js.undefined
    
    var schema: AnySchema
    
    var schemaPath: Code
    
    var topSchemaRef: js.UndefOr[Code] = js.undefined
  }
  object SubschemaContext {
    
    inline def apply(errSchemaPath: String, schema: AnySchema, schemaPath: Code): SubschemaContext = {
      val __obj = js.Dynamic.literal(errSchemaPath = errSchemaPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubschemaContext]
    }
    
    extension [Self <: SubschemaContext](x: Self) {
      
      inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
      
      inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
      
      inline def setCompositeRule(value: `true`): Self = StObject.set(x, "compositeRule", value.asInstanceOf[js.Any])
      
      inline def setCompositeRuleUndefined: Self = StObject.set(x, "compositeRule", js.undefined)
      
      inline def setCreateErrors(value: Boolean): Self = StObject.set(x, "createErrors", value.asInstanceOf[js.Any])
      
      inline def setCreateErrorsUndefined: Self = StObject.set(x, "createErrors", js.undefined)
      
      inline def setData(value: Name): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataLevel(value: Double): Self = StObject.set(x, "dataLevel", value.asInstanceOf[js.Any])
      
      inline def setDataLevelUndefined: Self = StObject.set(x, "dataLevel", js.undefined)
      
      inline def setDataNames(value: js.Array[Name]): Self = StObject.set(x, "dataNames", value.asInstanceOf[js.Any])
      
      inline def setDataNamesUndefined: Self = StObject.set(x, "dataNames", js.undefined)
      
      inline def setDataNamesVarargs(value: Name*): Self = StObject.set(x, "dataNames", js.Array(value*))
      
      inline def setDataPathArr(value: js.Array[Code | Double]): Self = StObject.set(x, "dataPathArr", value.asInstanceOf[js.Any])
      
      inline def setDataPathArrUndefined: Self = StObject.set(x, "dataPathArr", js.undefined)
      
      inline def setDataPathArrVarargs(value: (Code | Double)*): Self = StObject.set(x, "dataPathArr", js.Array(value*))
      
      inline def setDataTypes(value: js.Array[JSONType]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
      
      inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
      
      inline def setDataTypesVarargs(value: JSONType*): Self = StObject.set(x, "dataTypes", js.Array(value*))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErrSchemaPath(value: String): Self = StObject.set(x, "errSchemaPath", value.asInstanceOf[js.Any])
      
      inline def setErrorPath(value: Code): Self = StObject.set(x, "errorPath", value.asInstanceOf[js.Any])
      
      inline def setErrorPathUndefined: Self = StObject.set(x, "errorPath", js.undefined)
      
      inline def setJtdDiscriminator(value: String): Self = StObject.set(x, "jtdDiscriminator", value.asInstanceOf[js.Any])
      
      inline def setJtdDiscriminatorUndefined: Self = StObject.set(x, "jtdDiscriminator", js.undefined)
      
      inline def setJtdMetadata(value: Boolean): Self = StObject.set(x, "jtdMetadata", value.asInstanceOf[js.Any])
      
      inline def setJtdMetadataUndefined: Self = StObject.set(x, "jtdMetadata", js.undefined)
      
      inline def setParentData(value: Name): Self = StObject.set(x, "parentData", value.asInstanceOf[js.Any])
      
      inline def setParentDataProperty(value: Code | Double): Self = StObject.set(x, "parentDataProperty", value.asInstanceOf[js.Any])
      
      inline def setParentDataPropertyUndefined: Self = StObject.set(x, "parentDataProperty", js.undefined)
      
      inline def setParentDataUndefined: Self = StObject.set(x, "parentData", js.undefined)
      
      inline def setPropertyName(value: Name): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setSchema(value: AnySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: Code): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setTopSchemaRef(value: Code): Self = StObject.set(x, "topSchemaRef", value.asInstanceOf[js.Any])
      
      inline def setTopSchemaRefUndefined: Self = StObject.set(x, "topSchemaRef", js.undefined)
    }
  }
}
