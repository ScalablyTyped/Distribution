package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDataObjectType extends js.Object

@JSGlobal("Access.AcDataObjectType")
@js.native
object AcDataObjectType extends js.Object {
  @js.native
  sealed trait acActiveDataObject
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataForm
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataFunction
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataQuery
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataReport
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataServerView
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataStoredProcedure
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  @js.native
  sealed trait acDataTable
    extends activexDashAccessLib.AccessNs.AcDataObjectType
  
  /* -1 */ val acActiveDataObject: acActiveDataObject with scala.Double = js.native
  /* 2 */ val acDataForm: acDataForm with scala.Double = js.native
  /* 10 */ val acDataFunction: acDataFunction with scala.Double = js.native
  /* 1 */ val acDataQuery: acDataQuery with scala.Double = js.native
  /* 3 */ val acDataReport: acDataReport with scala.Double = js.native
  /* 7 */ val acDataServerView: acDataServerView with scala.Double = js.native
  /* 9 */ val acDataStoredProcedure: acDataStoredProcedure with scala.Double = js.native
  /* 0 */ val acDataTable: acDataTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDataObjectType with scala.Double] = js.native
}

