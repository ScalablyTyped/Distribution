package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcExportXMLObjectType extends js.Object

@JSGlobal("Access.AcExportXMLObjectType")
@js.native
object AcExportXMLObjectType extends js.Object {
  @js.native
  sealed trait acExportForm
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportFunction
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportQuery
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportReport
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportServerView
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportStoredProcedure
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  @js.native
  sealed trait acExportTable
    extends activexDashAccessLib.AccessNs.AcExportXMLObjectType
  
  /* 2 */ val acExportForm: acExportForm with scala.Double = js.native
  /* 10 */ val acExportFunction: acExportFunction with scala.Double = js.native
  /* 1 */ val acExportQuery: acExportQuery with scala.Double = js.native
  /* 3 */ val acExportReport: acExportReport with scala.Double = js.native
  /* 7 */ val acExportServerView: acExportServerView with scala.Double = js.native
  /* 9 */ val acExportStoredProcedure: acExportStoredProcedure with scala.Double = js.native
  /* 0 */ val acExportTable: acExportTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcExportXMLObjectType with scala.Double] = js.native
}

