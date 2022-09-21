package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.required
import typings.ajv.anon.Data
import typings.ajv.anon.MissingPropertyString
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requiredMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/required", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type RequiredError = ErrorObject[required, MissingPropertyString, js.Array[String] | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `requiredMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
