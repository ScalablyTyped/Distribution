package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.coreMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keywordsRegexpMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/keywords/regexp", JSImport.Default)
  @js.native
  val default: Plugin[Unit] = js.native
  
  type _To = Plugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `keywordsRegexpMod.foo` */
  override def _to: Plugin[Unit] = default
}
