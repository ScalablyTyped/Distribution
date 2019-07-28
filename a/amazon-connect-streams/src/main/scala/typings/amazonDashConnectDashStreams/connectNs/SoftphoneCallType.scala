package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoftphoneCallType extends js.Object

@JSGlobal("connect.SoftphoneCallType")
@js.native
object SoftphoneCallType extends js.Object {
  @js.native
  sealed trait AUDIO_ONLY extends SoftphoneCallType
  
  @js.native
  sealed trait AUDIO_VIDEO extends SoftphoneCallType
  
  @js.native
  sealed trait NONE extends SoftphoneCallType
  
  @js.native
  sealed trait VIDEO_ONLY extends SoftphoneCallType
  
  /* "audio_only" */ val AUDIO_ONLY: typings.amazonDashConnectDashStreams.connectNs.SoftphoneCallType.AUDIO_ONLY with String = js.native
  /* "audio_video" */ val AUDIO_VIDEO: typings.amazonDashConnectDashStreams.connectNs.SoftphoneCallType.AUDIO_VIDEO with String = js.native
  /* "none" */ val NONE: typings.amazonDashConnectDashStreams.connectNs.SoftphoneCallType.NONE with String = js.native
  /* "video_only" */ val VIDEO_ONLY: typings.amazonDashConnectDashStreams.connectNs.SoftphoneCallType.VIDEO_ONLY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SoftphoneCallType with String] = js.native
}

