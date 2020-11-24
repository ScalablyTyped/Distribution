package typings.antd.mod

import typings.antd.anon.ListStyle
import typings.antd.anon.SourceSelectedKeys
import typings.antd.anon.TypeofList
import typings.antd.anon.TypeofSearch
import typings.antd.operationMod.TransferOperationProps
import typings.antd.transferMod.TransferItem
import typings.antd.transferMod.TransferProps
import typings.antd.transferMod.default
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Transfer")
@js.native
class Transfer[RecordType /* <: TransferItem */] protected () extends default[RecordType] {
  def this(props: TransferProps[RecordType]) = this()
}
/* static members */
@JSImport("antd", "Transfer")
@js.native
object Transfer extends js.Object {
  
  var List: TypeofList = js.native
  
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): Element = js.native
  
  var Search: TypeofSearch = js.native
  
  var defaultProps: ListStyle = js.native
  
  def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = js.native
}
