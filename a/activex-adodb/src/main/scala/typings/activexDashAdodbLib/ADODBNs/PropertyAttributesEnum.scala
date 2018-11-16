package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyAttributesEnum extends js.Object

@JSGlobal("ADODB.PropertyAttributesEnum")
@js.native
object PropertyAttributesEnum extends js.Object {
  @js.native
  sealed trait adPropNotSupported
    extends activexDashAdodbLib.ADODBNs.PropertyAttributesEnum
  
  @js.native
  sealed trait adPropOptional
    extends activexDashAdodbLib.ADODBNs.PropertyAttributesEnum
  
  @js.native
  sealed trait adPropRead
    extends activexDashAdodbLib.ADODBNs.PropertyAttributesEnum
  
  @js.native
  sealed trait adPropRequired
    extends activexDashAdodbLib.ADODBNs.PropertyAttributesEnum
  
  @js.native
  sealed trait adPropWrite
    extends activexDashAdodbLib.ADODBNs.PropertyAttributesEnum
  
  /* 0 */ val adPropNotSupported: adPropNotSupported with scala.Double = js.native
  /* 2 */ val adPropOptional: adPropOptional with scala.Double = js.native
  /* 512 */ val adPropRead: adPropRead with scala.Double = js.native
  /* 1 */ val adPropRequired: adPropRequired with scala.Double = js.native
  /* 1024 */ val adPropWrite: adPropWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.PropertyAttributesEnum with scala.Double] = js.native
}

