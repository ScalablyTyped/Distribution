package typings.antd.transferMod

import typings.antd.anon.SourceSelectedKeys
import typings.antd.anon.TypeofList
import typings.antd.anon.TypeofSearch
import typings.antd.operationMod.TransferOperationProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
class default[RecordType /* <: TransferItem */] protected () extends Transfer[RecordType] {
  def this(props: TransferProps[RecordType]) = this()
}
/* static members */
@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
object default extends js.Object {
  
  var List: TypeofList = js.native
  
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): Element = js.native
  
  var Search: TypeofSearch = js.native
  
  var defaultProps: typings.antd.anon.ListStyle = js.native
  
  def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = js.native
}
