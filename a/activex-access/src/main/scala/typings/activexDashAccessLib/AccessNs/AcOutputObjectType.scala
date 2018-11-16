package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcOutputObjectType extends js.Object

@JSGlobal("Access.AcOutputObjectType")
@js.native
object AcOutputObjectType extends js.Object {
  @js.native
  sealed trait acOutputDataAccessPage
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputForm
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputFunction
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputModule
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputQuery
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputReport
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputServerView
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputStoredProcedure
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  @js.native
  sealed trait acOutputTable
    extends activexDashAccessLib.AccessNs.AcOutputObjectType
  
  /* 6 */ val acOutputDataAccessPage: acOutputDataAccessPage with scala.Double = js.native
  /* 2 */ val acOutputForm: acOutputForm with scala.Double = js.native
  /* 10 */ val acOutputFunction: acOutputFunction with scala.Double = js.native
  /* 5 */ val acOutputModule: acOutputModule with scala.Double = js.native
  /* 1 */ val acOutputQuery: acOutputQuery with scala.Double = js.native
  /* 3 */ val acOutputReport: acOutputReport with scala.Double = js.native
  /* 7 */ val acOutputServerView: acOutputServerView with scala.Double = js.native
  /* 9 */ val acOutputStoredProcedure: acOutputStoredProcedure with scala.Double = js.native
  /* 0 */ val acOutputTable: acOutputTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcOutputObjectType with scala.Double] = js.native
}

