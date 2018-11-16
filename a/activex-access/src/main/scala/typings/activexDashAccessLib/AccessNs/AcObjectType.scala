package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcObjectType extends js.Object

@JSGlobal("Access.AcObjectType")
@js.native
object AcObjectType extends js.Object {
  @js.native
  sealed trait acDataAccessPage
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acDatabaseProperties
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acDefault
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acDiagram
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acForm
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acFunction
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acMacro
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acModule
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acQuery
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acReport
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acServerView
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acStoredProcedure
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acTable
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  @js.native
  sealed trait acTableDataMacro
    extends activexDashAccessLib.AccessNs.AcObjectType
  
  /* 6 */ val acDataAccessPage: acDataAccessPage with scala.Double = js.native
  /* 11 */ val acDatabaseProperties: acDatabaseProperties with scala.Double = js.native
  /* -1 */ val acDefault: acDefault with scala.Double = js.native
  /* 8 */ val acDiagram: acDiagram with scala.Double = js.native
  /* 2 */ val acForm: acForm with scala.Double = js.native
  /* 10 */ val acFunction: acFunction with scala.Double = js.native
  /* 4 */ val acMacro: acMacro with scala.Double = js.native
  /* 5 */ val acModule: acModule with scala.Double = js.native
  /* 1 */ val acQuery: acQuery with scala.Double = js.native
  /* 3 */ val acReport: acReport with scala.Double = js.native
  /* 7 */ val acServerView: acServerView with scala.Double = js.native
  /* 9 */ val acStoredProcedure: acStoredProcedure with scala.Double = js.native
  /* 0 */ val acTable: acTable with scala.Double = js.native
  /* 12 */ val acTableDataMacro: acTableDataMacro with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcObjectType with scala.Double] = js.native
}

