package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.FuncKeywordDefinition
import typings.ajvKeywords.anon.DEFAULTS
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsDynamicDefaultsMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/dynamicDefaults", JSImport.Default)
  @js.native
  val default: js.Function0[FuncKeywordDefinition] & DEFAULTS = js.native
  
  type DynamicDefaultFunc = js.Function1[/* args */ js.UndefOr[Record[String, Any]], js.Function0[Any]]
  
  type _To = js.Function0[FuncKeywordDefinition] & DEFAULTS
  
  /* This means you don't have to write `default`, but can instead just say `distDefinitionsDynamicDefaultsMod.foo` */
  override def _to: js.Function0[FuncKeywordDefinition] & DEFAULTS = default
}
