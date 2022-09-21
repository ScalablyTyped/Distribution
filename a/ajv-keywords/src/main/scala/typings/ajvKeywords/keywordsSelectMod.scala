package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.coreMod.Plugin
import typings.ajvKeywords.typesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keywordsSelectMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/keywords/select", JSImport.Default)
  @js.native
  val default: Plugin[DefinitionOptions] = js.native
  
  type _To = Plugin[DefinitionOptions]
  
  /* This means you don't have to write `default`, but can instead just say `keywordsSelectMod.foo` */
  override def _to: Plugin[DefinitionOptions] = default
}
