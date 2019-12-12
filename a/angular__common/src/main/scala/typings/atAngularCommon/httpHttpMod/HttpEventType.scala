package typings.atAngularCommon.httpHttpMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCommon.httpHttpMod.HttpEventType.DownloadProgress
import typings.atAngularCommon.httpHttpMod.HttpEventType.Response
import typings.atAngularCommon.httpHttpMod.HttpEventType.ResponseHeader
import typings.atAngularCommon.httpHttpMod.HttpEventType.Sent
import typings.atAngularCommon.httpHttpMod.HttpEventType.UploadProgress
import typings.atAngularCommon.httpHttpMod.HttpEventType.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpEventType extends js.Object

@JSImport("@angular/common/http/http", "HttpEventType")
@js.native
object HttpEventType extends js.Object {
  /**
    * A download progress event was received.
    */
  @js.native
  sealed trait DownloadProgress extends HttpEventType
  
  /**
    * The full response including the body was received.
    */
  @js.native
  sealed trait Response extends HttpEventType
  
  /**
    * The response status code and headers were received.
    */
  @js.native
  sealed trait ResponseHeader extends HttpEventType
  
  /**
    * The request was sent out over the wire.
    */
  @js.native
  sealed trait Sent extends HttpEventType
  
  /**
    * An upload progress event was received.
    */
  @js.native
  sealed trait UploadProgress extends HttpEventType
  
  /**
    * A custom event from an interceptor or a backend.
    */
  @js.native
  sealed trait User extends HttpEventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpEventType with Double] = js.native
  /* 3 */ @js.native
  object DownloadProgress extends TopLevel[DownloadProgress with Double]
  
  /* 4 */ @js.native
  object Response extends TopLevel[Response with Double]
  
  /* 2 */ @js.native
  object ResponseHeader extends TopLevel[ResponseHeader with Double]
  
  /* 0 */ @js.native
  object Sent extends TopLevel[Sent with Double]
  
  /* 1 */ @js.native
  object UploadProgress extends TopLevel[UploadProgress with Double]
  
  /* 5 */ @js.native
  object User extends TopLevel[User with Double]
  
}

