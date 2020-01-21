package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`-1`
import typings.activexWord.activexWordNumbers.`1`
import typings.activexWord.activexWordNumbers.`2`
import typings.activexWord.activexWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`1`
  - typings.activexWord.activexWordNumbers.`-1`
  - typings.activexWord.activexWordNumbers.`2`
  - typings.activexWord.activexWordNumbers.`3`
*/
trait WdGoToDirection extends js.Object

object WdGoToDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdGoToAbsolute: `1` = this.cast(1)
  @scala.inline
  def wdGoToFirst: `1` = this.cast(1)
  @scala.inline
  def wdGoToLast: `-1` = this.cast(-1)
  @scala.inline
  def wdGoToNext: `2` = this.cast(2)
  @scala.inline
  def wdGoToPrevious: `3` = this.cast(3)
  @scala.inline
  def wdGoToRelative: `2` = this.cast(2)
}

