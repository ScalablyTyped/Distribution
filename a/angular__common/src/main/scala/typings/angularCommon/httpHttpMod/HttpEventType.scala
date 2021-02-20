package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpEventType extends StObject
@JSImport("@angular/common/http/http", "HttpEventType")
@js.native
object HttpEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpEventType with Double] = js.native
  
  /**
    * A download progress event was received.
    */
  @js.native
  sealed trait DownloadProgress extends HttpEventType
  /* 3 */ val DownloadProgress: typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress with Double = js.native
  
  /**
    * The full response including the body was received.
    */
  @js.native
  sealed trait Response extends HttpEventType
  /* 4 */ val Response: typings.angularCommon.httpHttpMod.HttpEventType.Response with Double = js.native
  
  /**
    * The response status code and headers were received.
    */
  @js.native
  sealed trait ResponseHeader extends HttpEventType
  /* 2 */ val ResponseHeader: typings.angularCommon.httpHttpMod.HttpEventType.ResponseHeader with Double = js.native
  
  /**
    * The request was sent out over the wire.
    */
  @js.native
  sealed trait Sent extends HttpEventType
  /* 0 */ val Sent: typings.angularCommon.httpHttpMod.HttpEventType.Sent with Double = js.native
  
  /**
    * An upload progress event was received.
    */
  @js.native
  sealed trait UploadProgress extends HttpEventType
  /* 1 */ val UploadProgress: typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress with Double = js.native
  
  /**
    * A custom event from an interceptor or a backend.
    */
  @js.native
  sealed trait User extends HttpEventType
  /* 5 */ val User: typings.angularCommon.httpHttpMod.HttpEventType.User with Double = js.native
}
