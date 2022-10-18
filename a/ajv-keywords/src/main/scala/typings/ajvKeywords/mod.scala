package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distCoreMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ajv-keywords", JSImport.Default)
  @js.native
  val default: Plugin[String | js.Array[String]] = js.native
  
  type _To = Plugin[String | js.Array[String]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[String | js.Array[String]] = default
}
