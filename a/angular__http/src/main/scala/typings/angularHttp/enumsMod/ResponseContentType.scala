package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseContentType extends js.Object
@JSImport("@angular/http/src/enums", "ResponseContentType")
@js.native
object ResponseContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseContentType with Double] = js.native
  
  @js.native
  sealed trait ArrayBuffer extends ResponseContentType
  /* 2 */ @js.native
  object ArrayBuffer extends TopLevel[ArrayBuffer with Double]
  
  @js.native
  sealed trait Blob extends ResponseContentType
  /* 3 */ @js.native
  object Blob extends TopLevel[Blob with Double]
  
  @js.native
  sealed trait Json extends ResponseContentType
  /* 1 */ @js.native
  object Json extends TopLevel[Json with Double]
  
  @js.native
  sealed trait Text extends ResponseContentType
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
}
