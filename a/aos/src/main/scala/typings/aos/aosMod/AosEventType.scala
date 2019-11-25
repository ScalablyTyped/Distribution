package typings.aos.aosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aos.aosStrings.`aos:in`
  - typings.aos.aosStrings.`aos:out`
*/
trait AosEventType extends js.Object

object AosEventType {
  @scala.inline
  def `aos:in`: typings.aos.aosStrings.`aos:in` = this.cast("aos:in")
  @scala.inline
  def `aos:out`: typings.aos.aosStrings.`aos:out` = this.cast("aos:out")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

