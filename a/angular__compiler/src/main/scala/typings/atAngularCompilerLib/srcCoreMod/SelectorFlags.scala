package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`1`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`2`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`4`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: atAngularCompilerLib.atAngularCompilerLibNumbers.`2` = this.cast(2)
  /** Mode for matching class names */
  @scala.inline
  def CLASS: atAngularCompilerLib.atAngularCompilerLibNumbers.`8` = this.cast(8)
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: atAngularCompilerLib.atAngularCompilerLibNumbers.`4` = this.cast(4)
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: atAngularCompilerLib.atAngularCompilerLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

