package typings
package antdLib.libDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawer
  extends reactLib.reactMod.Component[DrawerProps, IDrawerState, js.Any] {
  var destoryClose: scala.Boolean = js.native
  var parentDrawer: Drawer = js.native
  @JSName("state")
  val state_Drawer: antdLib.Anon_Push = js.native
  def close(e: EventType): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDrawer(preProps: DrawerProps): scala.Unit = js.native
  def getDestoryOnClose(): js.UndefOr[scala.Boolean] = js.native
  def getPushTransform(): js.UndefOr[java.lang.String] = js.native
  @JSName("getPushTransform")
  def getPushTransform_bottom(placement: antdLib.antdLibStrings.bottom): js.UndefOr[java.lang.String] = js.native
  @JSName("getPushTransform")
  def getPushTransform_left(placement: antdLib.antdLibStrings.left): js.UndefOr[java.lang.String] = js.native
  @JSName("getPushTransform")
  def getPushTransform_right(placement: antdLib.antdLibStrings.right): js.UndefOr[java.lang.String] = js.native
  @JSName("getPushTransform")
  def getPushTransform_top(placement: antdLib.antdLibStrings.top): js.UndefOr[java.lang.String] = js.native
  def getRcDrawerStyle(): antdLib.Anon_Transform | antdLib.Anon_OffsetBlockEnd = js.native
  def onDestoryTransitionEnd(): scala.Unit = js.native
  def onMaskClick(e: EventType): scala.Unit = js.native
  def pull(): scala.Unit = js.native
  def push(): scala.Unit = js.native
  def renderBody(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderProvider(value: Drawer): reactLib.reactMod.Global.JSXNs.Element = js.native
}

