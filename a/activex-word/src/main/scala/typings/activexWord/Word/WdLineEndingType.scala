package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`0`
import typings.activexWord.activexWordNumbers.`1`
import typings.activexWord.activexWordNumbers.`2`
import typings.activexWord.activexWordNumbers.`3`
import typings.activexWord.activexWordNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`0`
  - typings.activexWord.activexWordNumbers.`1`
  - typings.activexWord.activexWordNumbers.`3`
  - typings.activexWord.activexWordNumbers.`2`
  - typings.activexWord.activexWordNumbers.`4`
*/
trait WdLineEndingType extends js.Object

object WdLineEndingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdCRLF: `0` = this.cast(0)
  @scala.inline
  def wdCROnly: `1` = this.cast(1)
  @scala.inline
  def wdLFCR: `3` = this.cast(3)
  @scala.inline
  def wdLFOnly: `2` = this.cast(2)
  @scala.inline
  def wdLSPS: `4` = this.cast(4)
}

