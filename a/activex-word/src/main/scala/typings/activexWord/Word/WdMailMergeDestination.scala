package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`0`
import typings.activexWord.activexWordNumbers.`1`
import typings.activexWord.activexWordNumbers.`2`
import typings.activexWord.activexWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`2`
  - typings.activexWord.activexWordNumbers.`3`
  - typings.activexWord.activexWordNumbers.`0`
  - typings.activexWord.activexWordNumbers.`1`
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

