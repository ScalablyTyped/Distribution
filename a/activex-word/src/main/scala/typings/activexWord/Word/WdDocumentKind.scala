package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`0`
import typings.activexWord.activexWordNumbers.`1`
import typings.activexWord.activexWordNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`2`
  - typings.activexWord.activexWordNumbers.`1`
  - typings.activexWord.activexWordNumbers.`0`
*/
trait WdDocumentKind extends js.Object

object WdDocumentKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdDocumentEmail: `2` = this.cast(2)
  @scala.inline
  def wdDocumentLetter: `1` = this.cast(1)
  @scala.inline
  def wdDocumentNotSpecified: `0` = this.cast(0)
}

