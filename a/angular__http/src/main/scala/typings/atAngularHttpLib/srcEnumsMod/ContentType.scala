package typings
package atAngularHttpLib.srcEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSImport("@angular/http/src/enums", "ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait BLOB
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait FORM
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait FORM_DATA
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait JSON
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait NONE
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  @js.native
  sealed trait TEXT
    extends atAngularHttpLib.srcEnumsMod.ContentType
  
  /* 6 */ val ARRAY_BUFFER: ARRAY_BUFFER with scala.Double = js.native
  /* 5 */ val BLOB: BLOB with scala.Double = js.native
  /* 2 */ val FORM: FORM with scala.Double = js.native
  /* 3 */ val FORM_DATA: FORM_DATA with scala.Double = js.native
  /* 1 */ val JSON: JSON with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularHttpLib.srcEnumsMod.ContentType with scala.Double] = js.native
}

