package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.gridRowMod.RowProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRowMod extends Shortcut {
  
  @JSImport("antd/lib/row", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libRowMod.foo` */
  override def _to: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = default
}
