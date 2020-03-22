package typings.antd.transferMod

import typings.antd.AnonListStyle
import typings.antd.AnonSourceSelectedKeys
import typings.antd.TypeofList
import typings.antd.TypeofSearchInstantiable
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
  var List: TypeofList = js.native
  var Search: TypeofSearchInstantiable = js.native
  var defaultProps: AnonListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

