package typings.angularHttp.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends js.Object
@JSImport("@angular/http/src/enums", "ContentType")
@js.native
object ContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  
  @js.native
  sealed trait ARRAY_BUFFER extends ContentType
  /* 6 */ @js.native
  object ARRAY_BUFFER extends TopLevel[ARRAY_BUFFER with Double]
  
  @js.native
  sealed trait BLOB extends ContentType
  /* 5 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  @js.native
  sealed trait FORM extends ContentType
  /* 2 */ @js.native
  object FORM extends TopLevel[FORM with Double]
  
  @js.native
  sealed trait FORM_DATA extends ContentType
  /* 3 */ @js.native
  object FORM_DATA extends TopLevel[FORM_DATA with Double]
  
  @js.native
  sealed trait JSON extends ContentType
  /* 1 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait NONE extends ContentType
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait TEXT extends ContentType
  /* 4 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
}
