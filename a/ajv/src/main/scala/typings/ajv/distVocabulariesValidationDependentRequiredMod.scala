package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distVocabulariesApplicatorDependenciesMod.DependenciesErrorParams
import typings.ajv.distVocabulariesApplicatorDependenciesMod.PropertyDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationDependentRequiredMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/dependentRequired", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type DependentRequiredError = ErrorObject["dependentRequired", DependenciesErrorParams, PropertyDependencies]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationDependentRequiredMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
