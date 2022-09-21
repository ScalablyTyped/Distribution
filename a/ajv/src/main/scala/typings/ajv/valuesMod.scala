package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.`object`
import typings.ajv.ajvStrings.values
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.SchemaObject
import typings.ajv.errorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/values", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDValuesError = JTDTypeError[values, `object`, SchemaObject]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `valuesMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
