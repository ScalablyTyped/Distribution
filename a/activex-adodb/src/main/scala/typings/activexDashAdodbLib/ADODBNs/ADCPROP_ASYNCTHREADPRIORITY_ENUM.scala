package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ADCPROP_ASYNCTHREADPRIORITY_ENUM extends js.Object

@JSGlobal("ADODB.ADCPROP_ASYNCTHREADPRIORITY_ENUM")
@js.native
object ADCPROP_ASYNCTHREADPRIORITY_ENUM extends js.Object {
  @js.native
  sealed trait adPriorityAboveNormal
    extends activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM
  
  @js.native
  sealed trait adPriorityBelowNormal
    extends activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM
  
  @js.native
  sealed trait adPriorityHighest
    extends activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM
  
  @js.native
  sealed trait adPriorityLowest
    extends activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM
  
  @js.native
  sealed trait adPriorityNormal
    extends activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM
  
  /* 4 */ val adPriorityAboveNormal: adPriorityAboveNormal with scala.Double = js.native
  /* 2 */ val adPriorityBelowNormal: adPriorityBelowNormal with scala.Double = js.native
  /* 5 */ val adPriorityHighest: adPriorityHighest with scala.Double = js.native
  /* 1 */ val adPriorityLowest: adPriorityLowest with scala.Double = js.native
  /* 3 */ val adPriorityNormal: adPriorityNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ADCPROP_ASYNCTHREADPRIORITY_ENUM with scala.Double] = js.native
}

