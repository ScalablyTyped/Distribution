package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpEventType extends js.Object
@JSImport("@angular/common/http/http", "HttpEventType")
@js.native
object HttpEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpEventType with Double] = js.native
  
  /**
    * A download progress event was received.
    */
  @js.native
  sealed trait DownloadProgress extends HttpEventType
  /* 3 */ @js.native
  object DownloadProgress extends TopLevel[DownloadProgress with Double]
  
  /**
    * The full response including the body was received.
    */
  @js.native
  sealed trait Response extends HttpEventType
  /* 4 */ @js.native
  object Response extends TopLevel[Response with Double]
  
  /**
    * The response status code and headers were received.
    */
  @js.native
  sealed trait ResponseHeader extends HttpEventType
  /* 2 */ @js.native
  object ResponseHeader extends TopLevel[ResponseHeader with Double]
  
  /**
    * The request was sent out over the wire.
    */
  @js.native
  sealed trait Sent extends HttpEventType
  /* 0 */ @js.native
  object Sent extends TopLevel[Sent with Double]
  
  /**
    * An upload progress event was received.
    */
  @js.native
  sealed trait UploadProgress extends HttpEventType
  /* 1 */ @js.native
  object UploadProgress extends TopLevel[UploadProgress with Double]
  
  /**
    * A custom event from an interceptor or a backend.
    */
  @js.native
  sealed trait User extends HttpEventType
  /* 5 */ @js.native
  object User extends TopLevel[User with Double]
}
