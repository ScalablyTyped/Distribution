package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

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
  var Length: scala.Double
  /**
    * Start position within the string.
    *
    * The first character has index 0.
    */
  var StartPosition: scala.Double
  /** The complete text, from which a subset is selected by the parameters below. */
  var Text: java.lang.String
}

