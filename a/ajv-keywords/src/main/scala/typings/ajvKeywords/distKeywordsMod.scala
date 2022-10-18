package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distCoreMod.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeywordsMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/keywords", JSImport.Default)
  @js.native
  val default: Record[String, js.UndefOr[Plugin[Any]]] = js.native
  
  type _To = Record[String, js.UndefOr[Plugin[Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `distKeywordsMod.foo` */
  override def _to: Record[String, js.UndefOr[Plugin[Any]]] = default
}
