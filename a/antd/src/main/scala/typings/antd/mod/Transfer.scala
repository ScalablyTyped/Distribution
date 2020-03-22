package typings.antd.mod

import typings.antd.AnonListStyle
import typings.antd.AnonSourceSelectedKeys
import typings.antd.TypeofList
import typings.antd.TypeofSearchInstantiable
import typings.antd.operationMod.TransferOperationProps
import typings.antd.transferMod.TransferProps
import typings.antd.transferMod.default
import typings.react.mod._Global_.JSX.Element
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
  var Search: TypeofSearchInstantiable = js.native
  var defaultProps: AnonListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

