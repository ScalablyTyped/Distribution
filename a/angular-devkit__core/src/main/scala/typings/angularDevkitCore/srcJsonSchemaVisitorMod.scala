package typings.angularDevkitCore

import typings.angularDevkitCore.anon.Schema
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonSchemaVisitor
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonVisitor
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaVisitorMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  type ReferenceResolver[ContextT] = js.Function2[/* ref */ String, /* context */ js.UndefOr[ContextT], Schema[ContextT]]
}
