package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.MacroKeywordDefinition
import typings.ajvKeywords.typesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/range", JSImport.Default)
  @js.native
  val default: GetDefinition[MacroKeywordDefinition] = js.native
  
  type _To = GetDefinition[MacroKeywordDefinition]
  
  /* This means you don't have to write `default`, but can instead just say `rangeMod.foo` */
  override def _to: GetDefinition[MacroKeywordDefinition] = default
}
