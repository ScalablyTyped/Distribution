package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.anon.Schema
import typings.angularDevkitBuildWebpack.interfaceMod.JsonSchemaVisitor
import typings.angularDevkitBuildWebpack.interfaceMod.JsonVisitor
import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/schema/visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  type ReferenceResolver[ContextT] = js.Function2[/* ref */ String, /* context */ js.UndefOr[ContextT], Schema[ContextT]]
}
