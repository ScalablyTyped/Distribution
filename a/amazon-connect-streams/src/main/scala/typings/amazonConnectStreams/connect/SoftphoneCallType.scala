package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoftphoneCallType extends StObject
@JSGlobal("connect.SoftphoneCallType")
@js.native
object SoftphoneCallType extends StObject {
  
  @js.native
  sealed trait AUDIO_ONLY extends SoftphoneCallType
  
  @js.native
  sealed trait AUDIO_VIDEO extends SoftphoneCallType
  
  @js.native
  sealed trait NONE extends SoftphoneCallType
  
  @js.native
  sealed trait VIDEO_ONLY extends SoftphoneCallType
}
