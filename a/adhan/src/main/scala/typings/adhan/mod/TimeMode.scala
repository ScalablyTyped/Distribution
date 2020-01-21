package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.adhan.adhanStrings.`12h`
  - typings.adhan.adhanStrings.`24h`
*/
trait TimeMode extends js.Object

object TimeMode {
  @scala.inline
  def `12h`: typings.adhan.adhanStrings.`12h` = this.cast("12h")
  @scala.inline
  def `24h`: typings.adhan.adhanStrings.`24h` = this.cast("24h")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

