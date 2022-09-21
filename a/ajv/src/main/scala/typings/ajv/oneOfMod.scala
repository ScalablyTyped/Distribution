package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.oneOf
import typings.ajv.anon.PassingSchemas
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneOfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/oneOf", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type OneOfError = ErrorObject[oneOf, PassingSchemas, js.Array[AnySchema]]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `oneOfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
