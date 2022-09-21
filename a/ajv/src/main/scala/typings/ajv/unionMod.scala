package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/union", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `unionMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
