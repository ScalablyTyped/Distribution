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
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferFlushDelay]
  }
}

