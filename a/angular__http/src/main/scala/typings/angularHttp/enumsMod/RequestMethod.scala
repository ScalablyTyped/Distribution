package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequestMethod extends js.Object

@JSImport("@angular/http/src/enums", "RequestMethod")
@js.native
object RequestMethod extends js.Object {
  @js.native
  sealed trait Delete extends RequestMethod
  
  @js.native
  sealed trait Get extends RequestMethod
  
  @js.native
  sealed trait Head extends RequestMethod
  
  @js.native
  sealed trait Options extends RequestMethod
  
  @js.native
  sealed trait Patch extends RequestMethod
  
  @js.native
  sealed trait Post extends RequestMethod
  
  @js.native
  sealed trait Put extends RequestMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestMethod with Double] = js.native
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 0 */ @js.native
  object Get extends TopLevel[Get with Double]
  
  /* 5 */ @js.native
  object Head extends TopLevel[Head with Double]
  
  /* 4 */ @js.native
  object Options extends TopLevel[Options with Double]
  
  /* 6 */ @js.native
  object Patch extends TopLevel[Patch with Double]
  
  /* 1 */ @js.native
  object Post extends TopLevel[Post with Double]
  
  /* 2 */ @js.native
  object Put extends TopLevel[Put with Double]
  
}

