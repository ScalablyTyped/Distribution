package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.anon.PartialExecutionOptions
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesSchematicMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/schematic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def externalSchematic[OptionT /* <: js.Object */](collectionName: String, schematicName: String, options: OptionT): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("externalSchematic")(collectionName.asInstanceOf[js.Any], schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def externalSchematic[OptionT /* <: js.Object */](
    collectionName: String,
    schematicName: String,
    options: OptionT,
    executionOptions: PartialExecutionOptions
  ): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("externalSchematic")(collectionName.asInstanceOf[js.Any], schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], executionOptions.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def schematic[OptionT /* <: js.Object */](schematicName: String, options: OptionT): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("schematic")(schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def schematic[OptionT /* <: js.Object */](schematicName: String, options: OptionT, executionOptions: PartialExecutionOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("schematic")(schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], executionOptions.asInstanceOf[js.Any])).asInstanceOf[Rule]
}
