package typings
package antdLib.libBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb
  extends reactLib.reactMod.Component[BreadcrumbProps, js.Any, js.Any] {
  def addChildPath(paths: js.Array[java.lang.String], childPath: js.UndefOr[scala.Nothing], params: js.Any): js.Array[java.lang.String] = js.native
  def addChildPath(paths: js.Array[java.lang.String], childPath: java.lang.String, params: js.Any): js.Array[java.lang.String] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBreadcrumb(): scala.Unit = js.native
  def genForRoutes(hasRoutesParamsSeparatorItemRender: BreadcrumbProps): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def getPath(path: java.lang.String, params: js.Any): java.lang.String = js.native
  def renderBreadcrumb(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

