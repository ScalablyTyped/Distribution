package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.additionalProperties_
import typings.ajv.anon.AdditionalProperty
import typings.ajv.distTypesMod.AddedKeywordDefinition
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object additionalPropertiesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalProperties", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition & AddedKeywordDefinition = js.native
  
  type AdditionalPropertiesError = ErrorObject[additionalProperties_, AdditionalProperty, AnySchema]
  
  type _To = CodeKeywordDefinition & AddedKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `additionalPropertiesMod.foo` */
  override def _to: CodeKeywordDefinition & AddedKeywordDefinition = default
}
