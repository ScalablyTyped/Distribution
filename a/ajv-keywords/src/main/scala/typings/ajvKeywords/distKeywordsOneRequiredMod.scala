package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distCoreMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeywordsOneRequiredMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/keywords/oneRequired", JSImport.Default)
  @js.native
  val default: Plugin[Unit] = js.native
  
  type _To = Plugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `distKeywordsOneRequiredMod.foo` */
  override def _to: Plugin[Unit] = default
}
