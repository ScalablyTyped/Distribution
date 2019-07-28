package typings.antdDashMobileDashRn.libModalModalDotNativeMod

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntmModal
  extends Component[IModalNativeProps, js.Any, js.Any] {
  var root: View | Null = js.native
  def onFooterLayout(e: LayoutChangeEvent): Unit = js.native
  def saveRoot(root: js.Any): Unit = js.native
}

