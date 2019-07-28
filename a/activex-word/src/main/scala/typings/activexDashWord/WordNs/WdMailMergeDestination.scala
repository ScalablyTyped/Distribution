package typings.activexDashWord.WordNs

import typings.activexDashWord.activexDashWordNumbers.`0`
import typings.activexDashWord.activexDashWordNumbers.`1`
import typings.activexDashWord.activexDashWordNumbers.`2`
import typings.activexDashWord.activexDashWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashWord.activexDashWordNumbers.`2`
  - typings.activexDashWord.activexDashWordNumbers.`3`
  - typings.activexDashWord.activexDashWordNumbers.`0`
  - typings.activexDashWord.activexDashWordNumbers.`1`
*/
trait WdMailMergeDestination extends js.Object

object WdMailMergeDestination {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdSendToEmail: `2` = this.cast(2)
  @scala.inline
  def wdSendToFax: `3` = this.cast(3)
  @scala.inline
  def wdSendToNewDocument: `0` = this.cast(0)
  @scala.inline
  def wdSendToPrinter: `1` = this.cast(1)
}

