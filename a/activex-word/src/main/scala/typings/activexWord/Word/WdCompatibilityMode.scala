package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`11`
import typings.activexWord.activexWordNumbers.`12`
import typings.activexWord.activexWordNumbers.`14`
import typings.activexWord.activexWordNumbers.`65535`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`65535`
  - typings.activexWord.activexWordNumbers.`11`
  - typings.activexWord.activexWordNumbers.`12`
  - typings.activexWord.activexWordNumbers.`14`
*/
trait WdCompatibilityMode extends js.Object

object WdCompatibilityMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdCurrent: `65535` = this.cast(65535)
  @scala.inline
  def wdWord2003: `11` = this.cast(11)
  @scala.inline
  def wdWord2007: `12` = this.cast(12)
  @scala.inline
  def wdWord2010: `14` = this.cast(14)
}

