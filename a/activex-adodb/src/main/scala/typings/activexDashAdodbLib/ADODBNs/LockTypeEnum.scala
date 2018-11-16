package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockTypeEnum extends js.Object

@JSGlobal("ADODB.LockTypeEnum")
@js.native
object LockTypeEnum extends js.Object {
  @js.native
  sealed trait adLockBatchOptimistic
    extends activexDashAdodbLib.ADODBNs.LockTypeEnum
  
  @js.native
  sealed trait adLockOptimistic
    extends activexDashAdodbLib.ADODBNs.LockTypeEnum
  
  @js.native
  sealed trait adLockPessimistic
    extends activexDashAdodbLib.ADODBNs.LockTypeEnum
  
  @js.native
  sealed trait adLockReadOnly
    extends activexDashAdodbLib.ADODBNs.LockTypeEnum
  
  @js.native
  sealed trait adLockUnspecified
    extends activexDashAdodbLib.ADODBNs.LockTypeEnum
  
  /* 4 */ val adLockBatchOptimistic: adLockBatchOptimistic with scala.Double = js.native
  /* 3 */ val adLockOptimistic: adLockOptimistic with scala.Double = js.native
  /* 2 */ val adLockPessimistic: adLockPessimistic with scala.Double = js.native
  /* 1 */ val adLockReadOnly: adLockReadOnly with scala.Double = js.native
  /* -1 */ val adLockUnspecified: adLockUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.LockTypeEnum with scala.Double] = js.native
}

