package typings.activexDashWord.Word

import typings.activexDashWord.activexDashWordNumbers.`-1`
import typings.activexDashWord.activexDashWordNumbers.`-2`
import typings.activexDashWord.activexDashWordNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashWord.activexDashWordNumbers.`0`
  - typings.activexDashWord.activexDashWordNumbers.`-2`
  - typings.activexDashWord.activexDashWordNumbers.`-1`
*/
trait WdSaveOptions extends js.Object

object WdSaveOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdDoNotSaveChanges: `0` = this.cast(0)
  @scala.inline
  def wdPromptToSaveChanges: `-2` = this.cast(-2)
  @scala.inline
  def wdSaveChanges: `-1` = this.cast(-1)
}

