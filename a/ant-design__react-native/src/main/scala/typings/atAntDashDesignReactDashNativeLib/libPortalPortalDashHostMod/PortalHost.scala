package typings
package atAntDashDesignReactDashNativeLib.libPortalPortalDashHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalHost
  extends reactLib.reactMod.Component[PortalHostProps, js.Object, js.Any] {
  var _manager: js.UndefOr[atAntDashDesignReactDashNativeLib.libPortalPortalDashManagerMod.default] = js.native
  var _nextKey: scala.Double = js.native
  var _queue: js.Array[Operation] = js.native
  def _mount(children: reactLib.reactMod.ReactNode): scala.Double = js.native
  def _mount(children: reactLib.reactMod.ReactNode, _key: scala.Double): scala.Double = js.native
  def _setManager(): scala.Unit = js.native
  def _setManager(manager: js.Any): scala.Unit = js.native
  def _unmount(key: scala.Double): scala.Unit = js.native
  def _update(key: scala.Double, children: reactLib.reactMod.ReactNode): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPortalHost(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortalHost(): scala.Unit = js.native
}

