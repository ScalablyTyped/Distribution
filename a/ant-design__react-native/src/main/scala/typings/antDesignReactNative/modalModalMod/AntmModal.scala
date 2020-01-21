package typings.antDesignReactNative.modalModalMod

import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntmModal
  extends Component[ModalProps, js.Any, js.Any] {
  var root: View | Null = js.native
  def onFooterLayout(e: LayoutChangeEvent): Unit = js.native
  def saveRoot(root: js.Any): Unit = js.native
}

