package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.interfaceMod.JsonPointer
import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/schema/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
  inline def addUndefinedDefaults(value: JsonValue, _pointer: JsonPointer, schema: JsonSchema): JsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndefinedDefaults")(value.asInstanceOf[js.Any], _pointer.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[JsonValue]
}
