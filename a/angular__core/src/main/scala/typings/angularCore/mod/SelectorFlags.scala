package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`4`
import typings.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags used to build up CssSelectors */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`4`
  - typings.angularCore.angularCoreNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: `2` = 2.asInstanceOf[`2`]
  /** Mode for matching class names */
  @scala.inline
  def CLASS: `8` = 8.asInstanceOf[`8`]
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: `4` = 4.asInstanceOf[`4`]
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: `1` = 1.asInstanceOf[`1`]
}

