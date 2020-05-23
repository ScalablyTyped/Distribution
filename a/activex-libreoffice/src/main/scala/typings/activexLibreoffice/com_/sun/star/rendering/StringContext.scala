package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection of string-related arguments used on all canvas text interfaces.
  *
  * A possibly much larger string than later rendered is necessary here, because in several languages, glyph selection is context dependent.
  * @since OOo 2.0
  */
trait StringContext extends js.Object {
  /**
    * Length of the substring to actually use.
    *
    * Must be within the range [0,INTMAX].
    */
  var Length: Double
  /**
    * Start position within the string.
    *
    * The first character has index 0.
    */
  var StartPosition: Double
  /** The complete text, from which a subset is selected by the parameters below. */
  var Text: String
}

object StringContext {
  @scala.inline
  def apply(Length: Double, StartPosition: Double, Text: String): StringContext = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringContext]
  }
}

