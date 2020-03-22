package typings.antd.errorBoundaryMod

import typings.antd.AnonError
import typings.antd.AnonInfo
import typings.react.mod.Component
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundary
  extends Component[ErrorBoundaryProps, AnonError, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: AnonInfo = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Error, info: js.Object): Unit = js.native
}

