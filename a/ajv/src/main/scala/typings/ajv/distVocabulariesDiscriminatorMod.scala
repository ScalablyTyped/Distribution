package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Mapping
import typings.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Tag
import typings.ajv.distVocabulariesDiscriminatorTypesMod.DiscrErrorObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesDiscriminatorMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/discriminator", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type DiscriminatorError = DiscrErrorObj[Mapping | Tag]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesDiscriminatorMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
