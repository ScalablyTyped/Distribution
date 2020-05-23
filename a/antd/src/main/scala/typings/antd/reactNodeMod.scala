package typings.antd

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
@js.native
object reactNodeMod extends js.Object {
  def cloneElement(element: ReactNode): ReactElement = js.native
  def cloneElement(element: ReactNode, props: js.Any): ReactElement = js.native
  def replaceElement(element: ReactNode, replacement: ReactNode, props: js.Any): ReactNode = js.native
  @js.native
  object isValidElement extends js.Object {
    def apply[P](): /* is react.react.ReactElement */ Boolean = js.native
    def apply[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  }
  
}

