package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errno extends js.Object {
  var UV_UDP_REUSEADDR: scala.Double
  var errno: nodeLib.Anon_E2BIG
  var priority: nodeLib.Anon_PRIORITYABOVENORMAL
  var signals: nodeLib.Anon_SIGABRT
}

object Anon_Errno {
  @scala.inline
  def apply(
    UV_UDP_REUSEADDR: scala.Double,
    errno: nodeLib.Anon_E2BIG,
    priority: nodeLib.Anon_PRIORITYABOVENORMAL,
    signals: nodeLib.Anon_SIGABRT
  ): Anon_Errno = {
    val __obj = js.Dynamic.literal(UV_UDP_REUSEADDR = UV_UDP_REUSEADDR, errno = errno, priority = priority, signals = signals)
  
    __obj.asInstanceOf[Anon_Errno]
  }
}

