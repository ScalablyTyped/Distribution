package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.format
import typings.ajv.anon.Data
import typings.ajv.anon.Format
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFormatMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/format/format", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type FormatError = ErrorObject[format, Format, String | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `formatFormatMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
