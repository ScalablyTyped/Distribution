package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.gridColMod.ColProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colMod extends Shortcut {
  
  @JSImport("antd/lib/col", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ColProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[ColProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `colMod.foo` */
  override def _to: ForwardRefExoticComponent[ColProps with RefAttributes[HTMLDivElement]] = default
}
