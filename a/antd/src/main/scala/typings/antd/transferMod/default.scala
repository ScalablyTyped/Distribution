package typings.antd.transferMod

import typings.antd.anon.SourceSelectedKeys
import typings.antd.anon.TypeofList
import typings.antd.anon.TypeofSearchInstantiable
import typings.antd.operationMod.TransferOperationProps
import typings.react.mod.global.JSX.Element
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
  var defaultProps: typings.antd.anon.ListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): SourceSelectedKeys | Null = js.native
}

