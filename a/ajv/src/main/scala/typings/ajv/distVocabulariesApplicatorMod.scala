package typings.ajv

import typings.ajv.ajvStrings.`false schema`
import typings.ajv.distTypesMod.ErrorNoParams
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.distVocabulariesApplicatorAdditionalItemsMod.AdditionalItemsError
import typings.ajv.distVocabulariesApplicatorAdditionalPropertiesMod.AdditionalPropertiesError
import typings.ajv.distVocabulariesApplicatorAnyOfMod.AnyOfError
import typings.ajv.distVocabulariesApplicatorContainsMod.ContainsError
import typings.ajv.distVocabulariesApplicatorDependenciesMod.DependenciesError
import typings.ajv.distVocabulariesApplicatorIfMod.IfKeywordError
import typings.ajv.distVocabulariesApplicatorItems2020Mod.ItemsError
import typings.ajv.distVocabulariesApplicatorNotMod.NotKeywordError
import typings.ajv.distVocabulariesApplicatorOneOfMod.OneOfError
import typings.ajv.distVocabulariesApplicatorPropertyNamesMod.PropertyNamesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorMod {
  
  @JSImport("ajv/dist/vocabularies/applicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vocabulary]
  inline def default(draft2020: Boolean): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(draft2020.asInstanceOf[js.Any]).asInstanceOf[Vocabulary]
  
  type ApplicatorKeywordError = (ErrorNoParams[`false schema`, Any]) | AdditionalItemsError | ItemsError | ContainsError | AdditionalPropertiesError | DependenciesError | IfKeywordError | AnyOfError | OneOfError | NotKeywordError | PropertyNamesError
}
