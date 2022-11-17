package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.anon.PropertyName
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorPropertyNamesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/propertyNames", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type PropertyNamesError = ErrorObject["propertyNames", PropertyName, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorPropertyNamesMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
