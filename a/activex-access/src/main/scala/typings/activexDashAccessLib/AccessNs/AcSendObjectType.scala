package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSendObjectType extends js.Object

@JSGlobal("Access.AcSendObjectType")
@js.native
object AcSendObjectType extends js.Object {
  @js.native
  sealed trait acSendDataAccessPage
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendForm
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendModule
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendNoObject
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendQuery
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendReport
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  @js.native
  sealed trait acSendTable
    extends activexDashAccessLib.AccessNs.AcSendObjectType
  
  /* 6 */ val acSendDataAccessPage: acSendDataAccessPage with scala.Double = js.native
  /* 2 */ val acSendForm: acSendForm with scala.Double = js.native
  /* 5 */ val acSendModule: acSendModule with scala.Double = js.native
  /* -1 */ val acSendNoObject: acSendNoObject with scala.Double = js.native
  /* 1 */ val acSendQuery: acSendQuery with scala.Double = js.native
  /* 3 */ val acSendReport: acSendReport with scala.Double = js.native
  /* 0 */ val acSendTable: acSendTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSendObjectType with scala.Double] = js.native
}

