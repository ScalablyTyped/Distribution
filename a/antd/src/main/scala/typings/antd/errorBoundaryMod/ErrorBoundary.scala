package typings.antd.errorBoundaryMod

import typings.antd.anon.Error
import typings.antd.anon.Info
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorBoundary
  extends Component[ErrorBoundaryProps, Error, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: Info = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: typings.std.Error, info: js.Object): Unit = js.native
}

