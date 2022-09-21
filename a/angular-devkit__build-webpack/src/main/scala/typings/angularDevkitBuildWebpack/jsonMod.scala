package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.interfaceMod.JsonPointer
import typings.angularDevkitBuildWebpack.interfaceMod.JsonSchemaVisitor
import typings.angularDevkitBuildWebpack.interfaceMod.JsonVisitor
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaFormat
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaValidatorError
import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import typings.angularDevkitBuildWebpack.visitorMod.ReferenceResolver
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJsonArray(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean]
  
  inline def isJsonObject(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean]
  
  object schema {
    
    @JSImport("@angular-devkit/build-webpack/core/src/json", "schema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.CoreSchemaRegistry")
    @js.native
    open class CoreSchemaRegistry ()
      extends typings.angularDevkitBuildWebpack.schemaMod.CoreSchemaRegistry {
      def this(formats: js.Array[SchemaFormat]) = this()
    }
    /* static members */
    object CoreSchemaRegistry {
      
      @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.CoreSchemaRegistry")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.CoreSchemaRegistry._set")
      @js.native
      def _set: Any = js.native
      inline def _set_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_set")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.SchemaValidationException")
    @js.native
    open class SchemaValidationException ()
      extends typings.angularDevkitBuildWebpack.schemaMod.SchemaValidationException {
      def this(errors: js.Array[SchemaValidatorError]) = this()
      def this(errors: js.Array[SchemaValidatorError], baseMessage: String) = this()
      def this(errors: Unit, baseMessage: String) = this()
    }
    /* static members */
    object SchemaValidationException {
      
      @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.SchemaValidationException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createMessages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")().asInstanceOf[js.Array[String]]
      inline def createMessages(errors: js.Array[SchemaValidatorError]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    }
    
    inline def buildJsonPointer(fragments: js.Array[String]): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsonPointer")(fragments.asInstanceOf[js.Any]).asInstanceOf[JsonPointer]
    
    inline def getTypesOfSchema(schema: JsonSchema): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypesOfSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
    
    inline def isJsonSchema(value: Any): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/schema/schema.JsonSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonSchema")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/schema/schema.JsonSchema */ Boolean]
    
    inline def joinJsonPointer(root: JsonPointer, others: String*): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPointer")(List(root.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[JsonPointer]
    
    inline def mergeSchemas(schemas: js.UndefOr[JsonSchema]*): JsonSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeSchemas")(schemas.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JsonSchema]
    
    inline def parseJsonPointer(pointer: JsonPointer): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonPointer")(pointer.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    object transforms {
      
      @JSImport("@angular-devkit/build-webpack/core/src/json", "schema.transforms")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
      inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer, schema: JsonSchema): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
    }
    
    inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: Unit, context: ContextT): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: ReferenceResolver[ContextT]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](
      json: JsonValue,
      visitor: JsonVisitor,
      schema: Unit,
      refResolver: ReferenceResolver[ContextT],
      context: ContextT
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema, refResolver: Unit, context: ContextT): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](
      json: JsonValue,
      visitor: JsonVisitor,
      schema: JsonSchema,
      refResolver: ReferenceResolver[ContextT]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def visitJson[ContextT](
      json: JsonValue,
      visitor: JsonVisitor,
      schema: JsonSchema,
      refResolver: ReferenceResolver[ContextT],
      context: ContextT
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def visitJsonSchema(schema: JsonSchema, visitor: JsonSchemaVisitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJsonSchema")(schema.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
