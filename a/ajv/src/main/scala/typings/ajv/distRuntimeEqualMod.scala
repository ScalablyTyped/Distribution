package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeEqualMod extends Shortcut {
  
  @JSImport("ajv/dist/runtime/equal", JSImport.Default)
  @js.native
  val default: Equal = js.native
  
  type Equal = (js.Function2[/* a */ Any, /* b */ Any, Boolean]) & Code
  
  type _To = Equal
  
  /* This means you don't have to write `default`, but can instead just say `distRuntimeEqualMod.foo` */
  override def _to: Equal = default
}
