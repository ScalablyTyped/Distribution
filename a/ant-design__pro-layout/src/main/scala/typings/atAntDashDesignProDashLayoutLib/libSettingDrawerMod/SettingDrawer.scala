package typings
package atAntDashDesignProDashLayoutLib.libSettingDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingDrawer
  extends reactLib.reactMod.Component[SettingDrawerProps, SettingDrawerState, js.Any] {
  def changeSetting(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def changeSetting(key: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSettingDrawer(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSettingDrawer(): scala.Unit = js.native
  def getFormatMessage(): js.Function1[/* data */ atAntDashDesignProDashLayoutLib.Anon_DefaultMessage, java.lang.String] = js.native
  def getLayoutSetting(): js.Array[SettingItemProps] = js.native
  def onLanguageChange(): scala.Unit = js.native
  def renderLayoutSettingItem(item: SettingItemProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def togglerContent(): scala.Unit = js.native
}

