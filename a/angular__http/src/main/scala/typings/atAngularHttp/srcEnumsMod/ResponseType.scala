package typings.atAngularHttp.srcEnumsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
  /* 0 */ @js.native
  object Basic extends TopLevel[Basic with Double]
  
  /* 1 */ @js.native
  object Cors extends TopLevel[Cors with Double]
  
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 4 */ @js.native
  object Opaque extends TopLevel[Opaque with Double]
  
}

