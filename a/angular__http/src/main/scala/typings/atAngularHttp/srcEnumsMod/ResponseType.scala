package typings.atAngularHttp.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseType extends js.Object

@JSImport("@angular/http/src/enums", "ResponseType")
@js.native
object ResponseType extends js.Object {
  @js.native
  sealed trait Basic extends ResponseType
  
  @js.native
  sealed trait Cors extends ResponseType
  
  @js.native
  sealed trait Default extends ResponseType
  
  @js.native
  sealed trait Error extends ResponseType
  
  @js.native
  sealed trait Opaque extends ResponseType
  
  /* 0 */ val Basic: typings.atAngularHttp.srcEnumsMod.ResponseType.Basic with Double = js.native
  /* 1 */ val Cors: typings.atAngularHttp.srcEnumsMod.ResponseType.Cors with Double = js.native
  /* 2 */ val Default: typings.atAngularHttp.srcEnumsMod.ResponseType.Default with Double = js.native
  /* 3 */ val Error: typings.atAngularHttp.srcEnumsMod.ResponseType.Error with Double = js.native
  /* 4 */ val Opaque: typings.atAngularHttp.srcEnumsMod.ResponseType.Opaque with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
}

