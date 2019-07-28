package typings.atAngularHttp.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSImport("@angular/http/src/enums", "ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER extends ContentType
  
  @js.native
  sealed trait BLOB extends ContentType
  
  @js.native
  sealed trait FORM extends ContentType
  
  @js.native
  sealed trait FORM_DATA extends ContentType
  
  @js.native
  sealed trait JSON extends ContentType
  
  @js.native
  sealed trait NONE extends ContentType
  
  @js.native
  sealed trait TEXT extends ContentType
  
  /* 6 */ val ARRAY_BUFFER: typings.atAngularHttp.srcEnumsMod.ContentType.ARRAY_BUFFER with Double = js.native
  /* 5 */ val BLOB: typings.atAngularHttp.srcEnumsMod.ContentType.BLOB with Double = js.native
  /* 2 */ val FORM: typings.atAngularHttp.srcEnumsMod.ContentType.FORM with Double = js.native
  /* 3 */ val FORM_DATA: typings.atAngularHttp.srcEnumsMod.ContentType.FORM_DATA with Double = js.native
  /* 1 */ val JSON: typings.atAngularHttp.srcEnumsMod.ContentType.JSON with Double = js.native
  /* 0 */ val NONE: typings.atAngularHttp.srcEnumsMod.ContentType.NONE with Double = js.native
  /* 4 */ val TEXT: typings.atAngularHttp.srcEnumsMod.ContentType.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}

