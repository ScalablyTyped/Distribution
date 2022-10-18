package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.pattern
import typings.ajv.anon.Data
import typings.ajv.anon.Pattern
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationPatternMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/pattern", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type PatternError = ErrorObject[pattern, Pattern, String | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationPatternMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
