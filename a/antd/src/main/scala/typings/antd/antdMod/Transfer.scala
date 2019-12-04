package typings.antd.antdMod

import typings.antd.Anon_ArgsBody
import typings.antd.Anon_DataSourceListStyle
import typings.antd.Anon_SourceSelectedKeys
import typings.antd.TypeofClassList
import typings.antd.TypeofClassSearchDefaultProps
import typings.antd.libTransferMod.TransferProps
import typings.antd.libTransferMod.default
import typings.antd.libTransferOperationMod.TransferOperationProps
import typings.react.reactMod._Global_.JSX.Element
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
  var List: TypeofClassList = js.native
  var Search: TypeofClassSearchDefaultProps = js.native
  var defaultProps: Anon_DataSourceListStyle = js.native
  var propTypes: Anon_ArgsBody = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyle: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): Anon_SourceSelectedKeys | Null = js.native
}

