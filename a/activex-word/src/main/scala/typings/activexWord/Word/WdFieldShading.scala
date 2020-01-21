package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`0`
import typings.activexWord.activexWordNumbers.`1`
import typings.activexWord.activexWordNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexWord.activexWordNumbers.`1`
  - typings.activexWord.activexWordNumbers.`0`
  - typings.activexWord.activexWordNumbers.`2`
*/
trait WdFieldShading extends js.Object

object WdFieldShading {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdFieldShadingAlways: `1` = this.cast(1)
  @scala.inline
  def wdFieldShadingNever: `0` = this.cast(0)
  @scala.inline
  def wdFieldShadingWhenSelected: `2` = this.cast(2)
}

