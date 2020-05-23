package typings.amazonConnectStreams.connect

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
  
}

