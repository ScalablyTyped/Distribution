package typings.atAngularHttp.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("@angular/http/src/enums", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait Cancelled extends ReadyState
  
  @js.native
  sealed trait Done extends ReadyState
  
  @js.native
  sealed trait HeadersReceived extends ReadyState
  
  @js.native
  sealed trait Loading extends ReadyState
  
  @js.native
  sealed trait Open extends ReadyState
  
  @js.native
  sealed trait Unsent extends ReadyState
  
  /* 5 */ val Cancelled: typings.atAngularHttp.srcEnumsMod.ReadyState.Cancelled with Double = js.native
  /* 4 */ val Done: typings.atAngularHttp.srcEnumsMod.ReadyState.Done with Double = js.native
  /* 2 */ val HeadersReceived: typings.atAngularHttp.srcEnumsMod.ReadyState.HeadersReceived with Double = js.native
  /* 3 */ val Loading: typings.atAngularHttp.srcEnumsMod.ReadyState.Loading with Double = js.native
  /* 1 */ val Open: typings.atAngularHttp.srcEnumsMod.ReadyState.Open with Double = js.native
  /* 0 */ val Unsent: typings.atAngularHttp.srcEnumsMod.ReadyState.Unsent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
}

