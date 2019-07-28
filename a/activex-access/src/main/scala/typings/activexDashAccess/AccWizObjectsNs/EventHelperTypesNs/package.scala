package typings.activexDashAccess.AccWizObjectsNs

import typings.activexDashAccess.activexDashAccessStrings.SourceCtlName
import typings.activexDashAccess.activexDashAccessStrings.SourceFieldList
import typings.activexDashAccess.activexDashAccessStrings.SourceRow
import typings.activexDashAccess.activexDashAccessStrings.State
import typings.activexDashAccess.activexDashAccessStrings.TargetCtlName
import typings.activexDashAccess.activexDashAccessStrings.TargetFieldList
import typings.activexDashAccess.activexDashAccessStrings.TargetRow
import typings.activexDashAccess.activexDashAccessStrings.X
import typings.activexDashAccess.activexDashAccessStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  type FieldList_DragOver_ArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, State, X, Y]
  type FieldList_FldListDragDrop_ArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow]
  type FieldList_FldListDragOver_ArgNames = js.Tuple7[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow, State]
}
