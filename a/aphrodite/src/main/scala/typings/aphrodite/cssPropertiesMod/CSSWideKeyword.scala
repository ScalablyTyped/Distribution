package typings.aphrodite.cssPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See CSS 3 CSS-wide keywords https://www.w3.org/TR/css3-values/#common-keywords
// See CSS 3 Explicit Defaulting https://www.w3.org/TR/css-cascade-3/#defaulting-keywords
// "all CSS properties can accept these values"
/* Rewritten from type alias, can be one of: 
  - typings.aphrodite.aphroditeStrings.initial
  - typings.aphrodite.aphroditeStrings.inherit
  - typings.aphrodite.aphroditeStrings.unset
*/
trait CSSWideKeyword extends js.Object

object CSSWideKeyword {
  @scala.inline
  def inherit: typings.aphrodite.aphroditeStrings.inherit = "inherit".asInstanceOf[typings.aphrodite.aphroditeStrings.inherit]
  @scala.inline
  def initial: typings.aphrodite.aphroditeStrings.initial = "initial".asInstanceOf[typings.aphrodite.aphroditeStrings.initial]
  @scala.inline
  def unset: typings.aphrodite.aphroditeStrings.unset = "unset".asInstanceOf[typings.aphrodite.aphroditeStrings.unset]
}

