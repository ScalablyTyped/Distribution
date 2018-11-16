package typings
package atAngularHttpLib.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseType extends js.Object

@JSImport("@angular/http/src/enums", "ResponseType")
@js.native
object ResponseType extends js.Object {
  @js.native
  sealed trait Basic
    extends atAngularHttpLib.srcEnumsMod.ResponseType
  
  @js.native
  sealed trait Cors
    extends atAngularHttpLib.srcEnumsMod.ResponseType
  
  @js.native
  sealed trait Default
    extends atAngularHttpLib.srcEnumsMod.ResponseType
  
  @js.native
  sealed trait Error
    extends atAngularHttpLib.srcEnumsMod.ResponseType
  
  @js.native
  sealed trait Opaque
    extends atAngularHttpLib.srcEnumsMod.ResponseType
  
  /* 0 */ val Basic: Basic with scala.Double = js.native
  /* 1 */ val Cors: Cors with scala.Double = js.native
  /* 2 */ val Default: Default with scala.Double = js.native
  /* 3 */ val Error: Error with scala.Double = js.native
  /* 4 */ val Opaque: Opaque with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularHttpLib.srcEnumsMod.ResponseType with scala.Double] = js.native
}

