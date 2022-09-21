package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.`object`
import typings.ajv.ajvStrings.discriminator
import typings.ajv.discriminatorTypesMod.DiscrError.Mapping
import typings.ajv.discriminatorTypesMod.DiscrError.Tag
import typings.ajv.discriminatorTypesMod.DiscrErrorObj
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.errorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jtdDiscriminatorMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/discriminator", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDDiscriminatorError = (JTDTypeError[discriminator, `object`, String]) | (DiscrErrorObj[Mapping | Tag])
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `jtdDiscriminatorMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
