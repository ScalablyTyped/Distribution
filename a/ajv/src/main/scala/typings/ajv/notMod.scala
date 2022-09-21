package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.not
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorNoParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/not", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type NotKeywordError = ErrorNoParams[not, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `notMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
