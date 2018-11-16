package typings
package atAngularHttpLib.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseContentType extends js.Object

@JSImport("@angular/http/src/enums", "ResponseContentType")
@js.native
object ResponseContentType extends js.Object {
  @js.native
  sealed trait ArrayBuffer
    extends atAngularHttpLib.srcEnumsMod.ResponseContentType
  
  @js.native
  sealed trait Blob
    extends atAngularHttpLib.srcEnumsMod.ResponseContentType
  
  @js.native
  sealed trait Json
    extends atAngularHttpLib.srcEnumsMod.ResponseContentType
  
  @js.native
  sealed trait Text
    extends atAngularHttpLib.srcEnumsMod.ResponseContentType
  
  /* 2 */ val ArrayBuffer: ArrayBuffer with scala.Double = js.native
  /* 3 */ val Blob: Blob with scala.Double = js.native
  /* 1 */ val Json: Json with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularHttpLib.srcEnumsMod.ResponseContentType with scala.Double] = js.native
}

