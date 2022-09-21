package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.const
import typings.ajv.anon.AllowedValue
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/const", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type ConstError = ErrorObject[const, AllowedValue, Any]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `constMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
