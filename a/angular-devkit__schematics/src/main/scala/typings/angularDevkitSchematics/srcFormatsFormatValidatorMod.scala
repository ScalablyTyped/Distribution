package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaFormat
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorResult
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFormatsFormatValidatorMod {
  
  @JSImport("@angular-devkit/schematics/src/formats/format-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatValidator(data: JsonValue, dataSchema: JsonObject, formats: js.Array[SchemaFormat]): js.Promise[SchemaValidatorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValidator")(data.asInstanceOf[js.Any], dataSchema.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SchemaValidatorResult]]
}
