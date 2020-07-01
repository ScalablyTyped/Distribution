package typings.antd.mod

import typings.antd.anon.ListStyle
import typings.antd.anon.SourceSelectedKeys
import typings.antd.anon.TypeofList
import typings.antd.anon.TypeofSearch
import typings.antd.operationMod.TransferOperationProps
import typings.antd.transferMod.TransferProps
import typings.antd.transferMod.default
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Transfer")
@js.native
class Transfer protected () extends default {
  def this(props: TransferProps) = this()
}

/* static members */
@JSImport("antd", "Transfer")
@js.native
object Transfer extends js.Object {
  var List: TypeofList = js.native
  var Search: TypeofSearch = js.native
  var defaultProps: ListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(hasSelectedKeysTargetKeysPaginationChildren: TransferProps): SourceSelectedKeys | Null = js.native
}

