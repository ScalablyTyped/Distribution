package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags used to build up CssSelectors */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`2`
  - atAngularCoreLib.atAngularCoreLibNumbers.`4`
  - atAngularCoreLib.atAngularCoreLibNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: atAngularCoreLib.atAngularCoreLibNumbers.`2` = this.cast(2)
  /** Mode for matching class names */
  @scala.inline
  def CLASS: atAngularCoreLib.atAngularCoreLibNumbers.`8` = this.cast(8)
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: atAngularCoreLib.atAngularCoreLibNumbers.`4` = this.cast(4)
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

