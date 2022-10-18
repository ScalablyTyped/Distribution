package typings.angularDevkitCore

import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaSchemaMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJsonSchema(value: Any): /* is @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonSchema")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema */ Boolean]
  
  inline def mergeSchemas(schemas: js.UndefOr[JsonSchema]*): JsonSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeSchemas")(schemas.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JsonSchema]
  
  type JsonSchema = JsonObject | Boolean
}
