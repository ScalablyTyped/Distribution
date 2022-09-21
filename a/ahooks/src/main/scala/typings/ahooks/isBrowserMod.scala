package typings.ahooks

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBrowserMod extends Shortcut {
  
  @JSImport("ahooks/lib/utils/isBrowser", JSImport.Default)
  @js.native
  val default: Boolean = js.native
  
  type _To = Boolean
  
  /* This means you don't have to write `default`, but can instead just say `isBrowserMod.foo` */
  override def _to: Boolean = default
}
