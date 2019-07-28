package typings.atAngularHttp.srcEnumsMod

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
  
  /* 3 */ val Delete: typings.atAngularHttp.srcEnumsMod.RequestMethod.Delete with Double = js.native
  /* 0 */ val Get: typings.atAngularHttp.srcEnumsMod.RequestMethod.Get with Double = js.native
  /* 5 */ val Head: typings.atAngularHttp.srcEnumsMod.RequestMethod.Head with Double = js.native
  /* 4 */ val Options: typings.atAngularHttp.srcEnumsMod.RequestMethod.Options with Double = js.native
  /* 6 */ val Patch: typings.atAngularHttp.srcEnumsMod.RequestMethod.Patch with Double = js.native
  /* 1 */ val Post: typings.atAngularHttp.srcEnumsMod.RequestMethod.Post with Double = js.native
  /* 2 */ val Put: typings.atAngularHttp.srcEnumsMod.RequestMethod.Put with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestMethod with Double] = js.native
}

