package typings.antd

import typings.antd.layoutLayoutMod.BasicProps
import typings.antd.siderMod.SiderProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  
  val default: LayoutType = js.native
  
  @js.native
  trait LayoutType extends FunctionComponent[BasicProps] {
    
    var Content: FC[BasicProps] = js.native
    
    var Footer: FC[BasicProps] = js.native
    
    var Header: FC[BasicProps] = js.native
    
    var Sider: FC[SiderProps] = js.native
  }
}
