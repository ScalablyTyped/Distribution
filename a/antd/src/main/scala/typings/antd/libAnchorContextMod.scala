package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libAnchorAnchorMod.AntAnchor
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorContextMod extends Shortcut {
  
  @JSImport("antd/lib/anchor/context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[AntAnchor]] = js.native
  
  type _To = Context[js.UndefOr[AntAnchor]]
  
  /* This means you don't have to write `default`, but can instead just say `libAnchorContextMod.foo` */
  override def _to: Context[js.UndefOr[AntAnchor]] = default
}
