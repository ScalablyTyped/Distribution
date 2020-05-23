package typings.angulartics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferFlushDelay extends js.Object {
  var bufferFlushDelay: Double
  var developerMode: Boolean
  var optOut: Boolean
  var pageTracking: AutoBasePath
  var trackExceptions: Boolean
}

object BufferFlushDelay {
  @scala.inline
  def apply(
    bufferFlushDelay: Double,
    developerMode: Boolean,
    optOut: Boolean,
    pageTracking: AutoBasePath,
    trackExceptions: Boolean
  ): BufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFlushDelay]
  }
}

