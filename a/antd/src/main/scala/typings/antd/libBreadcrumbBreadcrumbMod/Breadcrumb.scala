package typings.antd.libBreadcrumbBreadcrumbMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb
  extends Component[BreadcrumbProps, js.Any, js.Any] {
  def addChildPath(paths: js.Array[String], childPath: js.UndefOr[scala.Nothing], params: js.Any): js.Array[String] = js.native
  def addChildPath(paths: js.Array[String], childPath: String, params: js.Any): js.Array[String] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBreadcrumb(): Unit = js.native
  def genForRoutes(hasRoutesParamsSeparatorItemRender: BreadcrumbProps): js.Array[Element] = js.native
  def getPath(path: String, params: js.Any): String = js.native
  def renderBreadcrumb(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

