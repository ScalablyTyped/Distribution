package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CopyRecordOptionsEnum extends js.Object

@JSGlobal("ADODB.CopyRecordOptionsEnum")
@js.native
object CopyRecordOptionsEnum extends js.Object {
  @js.native
  sealed trait adCopyAllowEmulation
    extends activexDashAdodbLib.ADODBNs.CopyRecordOptionsEnum
  
  @js.native
  sealed trait adCopyNonRecursive
    extends activexDashAdodbLib.ADODBNs.CopyRecordOptionsEnum
  
  @js.native
  sealed trait adCopyOverWrite
    extends activexDashAdodbLib.ADODBNs.CopyRecordOptionsEnum
  
  @js.native
  sealed trait adCopyUnspecified
    extends activexDashAdodbLib.ADODBNs.CopyRecordOptionsEnum
  
  /* 4 */ val adCopyAllowEmulation: adCopyAllowEmulation with scala.Double = js.native
  /* 2 */ val adCopyNonRecursive: adCopyNonRecursive with scala.Double = js.native
  /* 1 */ val adCopyOverWrite: adCopyOverWrite with scala.Double = js.native
  /* -1 */ val adCopyUnspecified: adCopyUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.CopyRecordOptionsEnum with scala.Double] = js.native
}

