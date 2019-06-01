package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoftphoneCallType extends js.Object

@JSGlobal("connect.SoftphoneCallType")
@js.native
object SoftphoneCallType extends js.Object {
  @js.native
  sealed trait AUDIO_ONLY
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneCallType
  
  @js.native
  sealed trait AUDIO_VIDEO
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneCallType
  
  @js.native
  sealed trait NONE
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneCallType
  
  @js.native
  sealed trait VIDEO_ONLY
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneCallType
  
  /* "audio_only" */ val AUDIO_ONLY: AUDIO_ONLY with java.lang.String = js.native
  /* "audio_video" */ val AUDIO_VIDEO: AUDIO_VIDEO with java.lang.String = js.native
  /* "none" */ val NONE: NONE with java.lang.String = js.native
  /* "video_only" */ val VIDEO_ONLY: VIDEO_ONLY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    amazonDashConnectDashStreamsLib.connectNs.SoftphoneCallType with java.lang.String
  ] = js.native
}

