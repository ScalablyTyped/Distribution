package typings.angularDevkitSchematics

import typings.angularDevkitCore.interfaceMod.SchemaFormat
import typings.angularDevkitCore.utilsMod.JsonObject
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatValidatorMod {
  
  @JSImport("@angular-devkit/schematics/src/formats/format-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatValidator(data: JsonValue, dataSchema: JsonObject, formats: js.Array[SchemaFormat]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValidator")(data.asInstanceOf[js.Any], dataSchema.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Any]
}
