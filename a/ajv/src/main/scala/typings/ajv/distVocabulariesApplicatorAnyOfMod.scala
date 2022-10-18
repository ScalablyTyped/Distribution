package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.anyOf
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorNoParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorAnyOfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/anyOf", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type AnyOfError = ErrorNoParams[anyOf, js.Array[AnySchema]]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorAnyOfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
