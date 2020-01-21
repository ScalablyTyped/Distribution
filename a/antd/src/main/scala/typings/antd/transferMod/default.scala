package typings.antd.transferMod

import typings.antd.AnonArgsBody
import typings.antd.AnonDataSourceListStyle
import typings.antd.AnonSourceSelectedKeys
import typings.antd.TypeofClassList
import typings.antd.TypeofClassSearchDefaultProps
import typings.antd.operationMod.TransferOperationProps
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
class default protected () extends Transfer {
  def this(props: TransferProps) = this()
}

/* static members */
@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
object default extends js.Object {
  var List: TypeofClassList = js.native
  var Search: TypeofClassSearchDefaultProps = js.native
  var defaultProps: AnonDataSourceListStyle = js.native
  var propTypes: AnonArgsBody = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyle: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

