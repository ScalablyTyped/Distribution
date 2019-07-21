package typings
package atAntDashDesignReactDashNativeLib.esTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends reactLib.reactMod.Component[TagNativeProps, js.Any, js.Any] {
  var closeDom: reactDashNativeLib.reactDashNativeMod.View | scala.Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTag(nextProps: TagNativeProps): scala.Unit = js.native
  def handleLongPress(): scala.Unit = js.native
  def onPress(): scala.Unit = js.native
  def onPressIn(styles: atAntDashDesignReactDashNativeLib.Anon_ActiveText): js.Function0[scala.Unit] = js.native
  def onPressOut(styles: atAntDashDesignReactDashNativeLib.Anon_ActiveText): js.Function0[scala.Unit] = js.native
  def onTagClose(): scala.Unit = js.native
}

