package typings.atAngularHttp.srcEnumsMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer
import typings.atAngularHttp.srcEnumsMod.ResponseContentType.Blob
import typings.atAngularHttp.srcEnumsMod.ResponseContentType.Json
import typings.atAngularHttp.srcEnumsMod.ResponseContentType.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseContentType extends js.Object

@JSImport("@angular/http/src/enums", "ResponseContentType")
@js.native
object ResponseContentType extends js.Object {
  @js.native
  sealed trait ArrayBuffer extends ResponseContentType
  
  @js.native
  sealed trait Blob extends ResponseContentType
  
  @js.native
  sealed trait Json extends ResponseContentType
  
  @js.native
  sealed trait Text extends ResponseContentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseContentType with Double] = js.native
  /* 2 */ @js.native
  object ArrayBuffer extends TopLevel[ArrayBuffer with Double]
  
  /* 3 */ @js.native
  object Blob extends TopLevel[Blob with Double]
  
  /* 1 */ @js.native
  object Json extends TopLevel[Json with Double]
  
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

