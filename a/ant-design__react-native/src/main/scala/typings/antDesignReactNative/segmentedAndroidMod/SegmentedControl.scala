package typings.antDesignReactNative.segmentedAndroidMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControl
  extends Component[SegmentControlProps, js.Any, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSegmentedControl(nextProps: SegmentControlProps): Unit = js.native
  
  def onPress(e: js.Any, index: Double, value: String): Unit = js.native
}
