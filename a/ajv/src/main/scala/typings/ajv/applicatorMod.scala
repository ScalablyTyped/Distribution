package typings.ajv

import typings.ajv.additionalItemsMod.AdditionalItemsError
import typings.ajv.additionalPropertiesMod.AdditionalPropertiesError
import typings.ajv.ajvStrings.`false schema`
import typings.ajv.anyOfMod.AnyOfError
import typings.ajv.containsMod.ContainsError
import typings.ajv.dependenciesMod.DependenciesError
import typings.ajv.distTypesMod.ErrorNoParams
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.ifMod.IfKeywordError
import typings.ajv.items2020Mod.ItemsError
import typings.ajv.notMod.NotKeywordError
import typings.ajv.oneOfMod.OneOfError
import typings.ajv.propertyNamesMod.PropertyNamesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicatorMod {
  
  @JSImport("ajv/dist/vocabularies/applicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vocabulary]
  inline def default(draft2020: Boolean): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(draft2020.asInstanceOf[js.Any]).asInstanceOf[Vocabulary]
  
  type ApplicatorKeywordError = (ErrorNoParams[`false schema`, Any]) | AdditionalItemsError | ItemsError | ContainsError | AdditionalPropertiesError | DependenciesError | IfKeywordError | AnyOfError | OneOfError | NotKeywordError | PropertyNamesError
}
