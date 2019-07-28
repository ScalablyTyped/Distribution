package typings.atAngularHttp.srcEnumsMod

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
  
  /* 2 */ val ArrayBuffer: typings.atAngularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer with Double = js.native
  /* 3 */ val Blob: typings.atAngularHttp.srcEnumsMod.ResponseContentType.Blob with Double = js.native
  /* 1 */ val Json: typings.atAngularHttp.srcEnumsMod.ResponseContentType.Json with Double = js.native
  /* 0 */ val Text: typings.atAngularHttp.srcEnumsMod.ResponseContentType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseContentType with Double] = js.native
}

