package typings
package angularticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferFlushDelay extends js.Object {
  var bufferFlushDelay: scala.Double
  var developerMode: scala.Boolean
  var optOut: scala.Boolean
  var pageTracking: Anon_AutoBasePath
  var trackExceptions: scala.Boolean
}

object Anon_BufferFlushDelay {
  @scala.inline
  def apply(
    bufferFlushDelay: scala.Double,
    developerMode: scala.Boolean,
    optOut: scala.Boolean,
    pageTracking: Anon_AutoBasePath,
    trackExceptions: scala.Boolean
  ): Anon_BufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay, developerMode = developerMode, optOut = optOut, pageTracking = pageTracking, trackExceptions = trackExceptions)
  
    __obj.asInstanceOf[Anon_BufferFlushDelay]
  }
}

