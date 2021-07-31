package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.layoutLayoutMod.BasicProps
import typings.antd.siderMod.SiderProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout", JSImport.Default)
  @js.native
  val default: LayoutType = js.native
  
  @js.native
  trait LayoutType
    extends StObject
       with FunctionComponent[BasicProps] {
    
    var Content: FC[BasicProps] = js.native
    
    var Footer: FC[BasicProps] = js.native
    
    var Header: FC[BasicProps] = js.native
    
    var Sider: FC[SiderProps] = js.native
  }
  
  type _To = LayoutType
  
  /* This means you don't have to write `default`, but can instead just say `layoutMod.foo` */
  override def _to: LayoutType = default
}
