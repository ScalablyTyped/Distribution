package typings.atAngularHttp.srcEnumsMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularHttp.srcEnumsMod.ContentType.ARRAY_BUFFER
import typings.atAngularHttp.srcEnumsMod.ContentType.BLOB
import typings.atAngularHttp.srcEnumsMod.ContentType.FORM
import typings.atAngularHttp.srcEnumsMod.ContentType.FORM_DATA
import typings.atAngularHttp.srcEnumsMod.ContentType.JSON
import typings.atAngularHttp.srcEnumsMod.ContentType.NONE
import typings.atAngularHttp.srcEnumsMod.ContentType.TEXT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  /* 6 */ @js.native
  object ARRAY_BUFFER extends TopLevel[ARRAY_BUFFER with Double]
  
  /* 5 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  /* 2 */ @js.native
  object FORM extends TopLevel[FORM with Double]
  
  /* 3 */ @js.native
  object FORM_DATA extends TopLevel[FORM_DATA with Double]
  
  /* 1 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 4 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
}

