package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseType extends js.Object
@JSImport("@angular/http/src/enums", "ResponseType")
@js.native
object ResponseType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
  
  @js.native
  sealed trait Basic extends ResponseType
  /* 0 */ @js.native
  object Basic extends TopLevel[Basic with Double]
  
  @js.native
  sealed trait Cors extends ResponseType
  /* 1 */ @js.native
  object Cors extends TopLevel[Cors with Double]
  
  @js.native
  sealed trait Default extends ResponseType
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  @js.native
  sealed trait Error extends ResponseType
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Opaque extends ResponseType
  /* 4 */ @js.native
  object Opaque extends TopLevel[Opaque with Double]
}
