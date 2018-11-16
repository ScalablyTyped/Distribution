package typings
package atAngularHttpLib.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("@angular/http/src/enums", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait Cancelled
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  @js.native
  sealed trait Done
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  @js.native
  sealed trait HeadersReceived
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  @js.native
  sealed trait Loading
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  @js.native
  sealed trait Open
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  @js.native
  sealed trait Unsent
    extends atAngularHttpLib.srcEnumsMod.ReadyState
  
  /* 5 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 4 */ val Done: Done with scala.Double = js.native
  /* 2 */ val HeadersReceived: HeadersReceived with scala.Double = js.native
  /* 3 */ val Loading: Loading with scala.Double = js.native
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 0 */ val Unsent: Unsent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularHttpLib.srcEnumsMod.ReadyState with scala.Double] = js.native
}

