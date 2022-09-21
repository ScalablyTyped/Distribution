package typings.ahooks

import org.scalablytyped.runtime.Shortcut
import typings.ahooks.srcTypesMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRetryPluginMod extends Shortcut {
  
  @JSImport("ahooks/lib/useRequest/src/plugins/useRetryPlugin", JSImport.Default)
  @js.native
  val default: Plugin[Any, js.Array[Any]] = js.native
  
  type _To = Plugin[Any, js.Array[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `useRetryPluginMod.foo` */
  override def _to: Plugin[Any, js.Array[Any]] = default
}
