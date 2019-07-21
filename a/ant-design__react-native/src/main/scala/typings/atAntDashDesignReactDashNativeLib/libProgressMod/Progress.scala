package typings
package atAntDashDesignReactDashNativeLib.libProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends reactLib.reactMod.Component[ProgressProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MProgress(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MProgress(nextProps: ProgressProps): scala.Unit = js.native
  def getWidth(): scala.Double = js.native
  def getWidth(percent: scala.Double): scala.Double = js.native
  def normalPercent(): js.Any = js.native
  def normalPercent(percent: scala.Double): js.Any = js.native
  def onLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
}

