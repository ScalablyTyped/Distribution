package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestMethod extends js.Object
@JSImport("@angular/http/src/enums", "RequestMethod")
@js.native
object RequestMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestMethod with Double] = js.native
  
  @js.native
  sealed trait Delete extends RequestMethod
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Get extends RequestMethod
  /* 0 */ @js.native
  object Get extends TopLevel[Get with Double]
  
  @js.native
  sealed trait Head extends RequestMethod
  /* 5 */ @js.native
  object Head extends TopLevel[Head with Double]
  
  @js.native
  sealed trait Options extends RequestMethod
  /* 4 */ @js.native
  object Options extends TopLevel[Options with Double]
  
  @js.native
  sealed trait Patch extends RequestMethod
  /* 6 */ @js.native
  object Patch extends TopLevel[Patch with Double]
  
  @js.native
  sealed trait Post extends RequestMethod
  /* 1 */ @js.native
  object Post extends TopLevel[Post with Double]
  
  @js.native
  sealed trait Put extends RequestMethod
  /* 2 */ @js.native
  object Put extends TopLevel[Put with Double]
}
