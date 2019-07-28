package typings.atAngularCompiler.srcCoreMod

import typings.atAngularCompiler.atAngularCompilerNumbers.`1`
import typings.atAngularCompiler.atAngularCompilerNumbers.`2`
import typings.atAngularCompiler.atAngularCompilerNumbers.`4`
import typings.atAngularCompiler.atAngularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAngularCompiler.atAngularCompilerNumbers.`1`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`2`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`4`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`8`
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

