package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.`enum`
import typings.ajv.anon.AllowedValuesArray
import typings.ajv.anon.Data
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationEnumMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/enum", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type EnumError = ErrorObject[`enum`, AllowedValuesArray, js.Array[Any] | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationEnumMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
