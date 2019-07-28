package typings.angulartics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferFlushDelay extends js.Object {
  var bufferFlushDelay: Double
  var developerMode: Boolean
  var optOut: Boolean
  var pageTracking: Anon_AutoBasePath
  var trackExceptions: Boolean
}

object Anon_BufferFlushDelay {
  @scala.inline
  def apply(
    bufferFlushDelay: Double,
    developerMode: Boolean,
    optOut: Boolean,
    pageTracking: Anon_AutoBasePath,
    trackExceptions: Boolean
  ): Anon_BufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay, developerMode = developerMode, optOut = optOut, pageTracking = pageTracking, trackExceptions = trackExceptions)
  
    __obj.asInstanceOf[Anon_BufferFlushDelay]
  }
}

