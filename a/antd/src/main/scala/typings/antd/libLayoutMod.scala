package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libLayoutLayoutMod.BasicProps
import typings.antd.libLayoutSiderMod.SiderProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout", JSImport.Default)
  @js.native
  val default: LayoutType = js.native
  
  type InternalLayoutType = ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]]
  
  @js.native
  trait LayoutType
    extends StObject
       with ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] {
    
    var Content: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
    
    var Footer: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
    
    var Header: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
    
    var Sider: ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]] = js.native
  }
  
  type _To = LayoutType
  
  /* This means you don't have to write `default`, but can instead just say `libLayoutMod.foo` */
  override def _to: LayoutType = default
}
