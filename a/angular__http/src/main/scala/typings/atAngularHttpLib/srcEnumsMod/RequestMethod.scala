package typings
package atAngularHttpLib.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequestMethod extends js.Object

@JSImport("@angular/http/src/enums", "RequestMethod")
@js.native
object RequestMethod extends js.Object {
  @js.native
  sealed trait Delete
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Get
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Head
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Options
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Patch
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Post
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  @js.native
  sealed trait Put
    extends atAngularHttpLib.srcEnumsMod.RequestMethod
  
  /* 3 */ val Delete: Delete with scala.Double = js.native
  /* 0 */ val Get: Get with scala.Double = js.native
  /* 5 */ val Head: Head with scala.Double = js.native
  /* 4 */ val Options: Options with scala.Double = js.native
  /* 6 */ val Patch: Patch with scala.Double = js.native
  /* 1 */ val Post: Post with scala.Double = js.native
  /* 2 */ val Put: Put with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularHttpLib.srcEnumsMod.RequestMethod with scala.Double] = js.native
}

