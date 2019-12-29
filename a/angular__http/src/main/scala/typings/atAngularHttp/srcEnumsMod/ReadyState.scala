package typings.atAngularHttp.srcEnumsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  /* 5 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /* 4 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  /* 2 */ @js.native
  object HeadersReceived extends TopLevel[HeadersReceived with Double]
  
  /* 3 */ @js.native
  object Loading extends TopLevel[Loading with Double]
  
  /* 1 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /* 0 */ @js.native
  object Unsent extends TopLevel[Unsent with Double]
  
}

