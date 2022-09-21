package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.`enum`
import typings.ajv.anon.AllowedValues
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/enum", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDEnumError = ErrorObject[`enum`, AllowedValues, js.Array[String]]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `enumMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
