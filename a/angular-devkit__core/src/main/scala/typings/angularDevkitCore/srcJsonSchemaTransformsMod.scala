package typings.angularDevkitCore

import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonPointer
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaTransformsMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
  inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer, schema: JsonSchema): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
}
