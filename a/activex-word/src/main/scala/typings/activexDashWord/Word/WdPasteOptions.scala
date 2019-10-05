package typings.activexDashWord.Word

import typings.activexDashWord.activexDashWordNumbers.`0`
import typings.activexDashWord.activexDashWordNumbers.`1`
import typings.activexDashWord.activexDashWordNumbers.`2`
import typings.activexDashWord.activexDashWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashWord.activexDashWordNumbers.`0`
  - typings.activexDashWord.activexDashWordNumbers.`2`
  - typings.activexDashWord.activexDashWordNumbers.`1`
  - typings.activexDashWord.activexDashWordNumbers.`3`
*/
trait WdPasteOptions extends js.Object

object WdPasteOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdKeepSourceFormatting: `0` = this.cast(0)
  @scala.inline
  def wdKeepTextOnly: `2` = this.cast(2)
  @scala.inline
  def wdMatchDestinationFormatting: `1` = this.cast(1)
  @scala.inline
  def wdUseDestinationStyles: `3` = this.cast(3)
}

