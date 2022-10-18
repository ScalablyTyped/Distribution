package typings.angularCli

import typings.angularCli.srcCommandsUpdateSchematicSchemaMod.Schema
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsUpdateSchematicMod {
  
  @JSImport("@angular/cli/src/commands/update/schematic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def angularMajorCompatGuarantee(range: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("angularMajorCompatGuarantee")(range.asInstanceOf[js.Any]).asInstanceOf[String]
}
