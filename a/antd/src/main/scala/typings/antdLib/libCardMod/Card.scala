package typings
package antdLib.libCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card
  extends reactLib.reactMod.Component[CardProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MCard(): scala.Unit = js.native
  def getAction(actions: js.Array[reactLib.reactMod.ReactNs.ReactNode]): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def getCompatibleHoverable(): js.UndefOr[scala.Boolean] = js.native
  def isContainGrid(): js.UndefOr[scala.Nothing] = js.native
  def onTabChange(key: java.lang.String): scala.Unit = js.native
  def renderCard(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

