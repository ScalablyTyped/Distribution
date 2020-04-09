package typings.antd.paginationPaginationMod

import typings.antd.AnonJumpNextIcon
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, js.Object, js.Any] {
  var inferredSmall: js.Any = js.native
  var token: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPagination(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPagination(): Unit = js.native
  def getIconsProps(prefixCls: String): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_ltr(prefixCls: String, direction: ltr): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_rtl(prefixCls: String, direction: rtl): AnonJumpNextIcon = js.native
  def renderPagination(contextLocale: js.Any): Element = js.native
}

