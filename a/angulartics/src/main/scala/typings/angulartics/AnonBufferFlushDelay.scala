package typings.angulartics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFlushDelay extends js.Object {
  var bufferFlushDelay: Double
  var developerMode: Boolean
  var optOut: Boolean
  var pageTracking: AnonAutoBasePath
  var trackExceptions: Boolean
}

object AnonBufferFlushDelay {
  @scala.inline
  def apply(
    bufferFlushDelay: Double,
    developerMode: Boolean,
    optOut: Boolean,
    pageTracking: AnonAutoBasePath,
    trackExceptions: Boolean
  ): AnonBufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferFlushDelay]
  }
}

