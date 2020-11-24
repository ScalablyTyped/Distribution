package typings.antd

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
@js.native
object reactNodeMod extends js.Object {
  
  def cloneElement(element: ReactNode): ReactElement = js.native
  def cloneElement(element: ReactNode, props: RenderProps): ReactElement = js.native
  
  def replaceElement(element: ReactNode, replacement: ReactNode, props: RenderProps): ReactNode = js.native
  
  @js.native
  object isValidElement extends js.Object {
    
    def apply[P](): /* is react.react.ReactElement */ Boolean = js.native
    def apply[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  }
  
  type AnyObject = Record[js.Any, js.Any]
  
  type RenderProps = js.UndefOr[AnyObject | (js.Function1[/* originProps */ AnyObject, js.UndefOr[AnyObject]])]
}
