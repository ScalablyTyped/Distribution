package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.utilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaSchemaMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/schema/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJsonSchema(value: Any): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/schema/schema.JsonSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonSchema")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/schema/schema.JsonSchema */ Boolean]
  
  inline def mergeSchemas(schemas: js.UndefOr[JsonSchema]*): JsonSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeSchemas")(schemas.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JsonSchema]
  
  type JsonSchema = JsonObject | Boolean
}
