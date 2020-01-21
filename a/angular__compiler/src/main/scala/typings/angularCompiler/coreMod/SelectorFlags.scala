package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import typings.angularCompiler.angularCompilerNumbers.`4`
import typings.angularCompiler.angularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerNumbers.`1`
  - typings.angularCompiler.angularCompilerNumbers.`2`
  - typings.angularCompiler.angularCompilerNumbers.`4`
  - typings.angularCompiler.angularCompilerNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: `2` = this.cast(2)
  /** Mode for matching class names */
  @scala.inline
  def CLASS: `8` = this.cast(8)
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: `4` = this.cast(4)
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

