package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SoftphoneCallType with String] = js.native
  /* "audio_only" */ @js.native
  object AUDIO_ONLY extends TopLevel[AUDIO_ONLY with String]
  
  /* "audio_video" */ @js.native
  object AUDIO_VIDEO extends TopLevel[AUDIO_VIDEO with String]
  
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "video_only" */ @js.native
  object VIDEO_ONLY extends TopLevel[VIDEO_ONLY with String]
  
}

