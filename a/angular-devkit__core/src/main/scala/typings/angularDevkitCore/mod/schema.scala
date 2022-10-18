package typings.angularDevkitCore.mod

import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonPointer
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonSchemaVisitor
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonVisitor
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaFormat
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorError
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonSchemaVisitorMod.ReferenceResolver
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schema {
  
  @JSImport("@angular-devkit/core", "schema")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core", "schema.CoreSchemaRegistry")
  @js.native
  open class CoreSchemaRegistry ()
    extends typings.angularDevkitCore.srcJsonMod.schema.CoreSchemaRegistry {
    def this(formats: js.Array[SchemaFormat]) = this()
  }
  /* static members */
  object CoreSchemaRegistry {
    
    @JSImport("@angular-devkit/core", "schema.CoreSchemaRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/core", "schema.CoreSchemaRegistry._set")
    @js.native
    def _set: Any = js.native
    inline def _set_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_set")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/core", "schema.SchemaValidationException")
  @js.native
  open class SchemaValidationException ()
    extends typings.angularDevkitCore.srcJsonMod.schema.SchemaValidationException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
    def this(errors: js.Array[SchemaValidatorError], baseMessage: String) = this()
    def this(errors: Unit, baseMessage: String) = this()
  }
  /* static members */
  object SchemaValidationException {
    
    @JSImport("@angular-devkit/core", "schema.SchemaValidationException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")().asInstanceOf[js.Array[String]]
    inline def createMessages(errors: js.Array[SchemaValidatorError]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  inline def buildJsonPointer(fragments: js.Array[String]): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsonPointer")(fragments.asInstanceOf[js.Any]).asInstanceOf[JsonPointer]
  
  inline def getTypesOfSchema(schema: JsonSchema): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypesOfSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  inline def isJsonSchema(value: Any): /* is @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonSchema")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema */ Boolean]
  
  inline def joinJsonPointer(root: JsonPointer, others: String*): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPointer")(scala.List(root.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[JsonPointer]
  
  inline def mergeSchemas(schemas: js.UndefOr[JsonSchema]*): JsonSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeSchemas")(schemas.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JsonSchema]
  
  inline def parseJsonPointer(pointer: JsonPointer): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonPointer")(pointer.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  object transforms {
    
    @JSImport("@angular-devkit/core", "schema.transforms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
    inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer, schema: JsonSchema): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
  }
  
  inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: Unit, context: ContextT): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: ReferenceResolver[ContextT]): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: Unit,
    refResolver: ReferenceResolver[ContextT],
    context: ContextT
  ): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema, refResolver: Unit, context: ContextT): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: JsonSchema,
    refResolver: ReferenceResolver[ContextT]
  ): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  inline def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: JsonSchema,
    refResolver: ReferenceResolver[ContextT],
    context: ContextT
  ): Observable_[JsonValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(json.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], refResolver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[JsonValue]]
  
  inline def visitJsonSchema(schema: JsonSchema, visitor: JsonSchemaVisitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJsonSchema")(schema.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
