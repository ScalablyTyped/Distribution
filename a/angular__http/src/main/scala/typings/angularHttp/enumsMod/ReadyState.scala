package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends js.Object
@JSImport("@angular/http/src/enums", "ReadyState")
@js.native
object ReadyState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  
  @js.native
  sealed trait Cancelled extends ReadyState
  /* 5 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  @js.native
  sealed trait Done extends ReadyState
  /* 4 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  @js.native
  sealed trait HeadersReceived extends ReadyState
  /* 2 */ @js.native
  object HeadersReceived extends TopLevel[HeadersReceived with Double]
  
  @js.native
  sealed trait Loading extends ReadyState
  /* 3 */ @js.native
  object Loading extends TopLevel[Loading with Double]
  
  @js.native
  sealed trait Open extends ReadyState
  /* 1 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  @js.native
  sealed trait Unsent extends ReadyState
  /* 0 */ @js.native
  object Unsent extends TopLevel[Unsent with Double]
}
