package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a chapter text field.
  * @see com.sun.star.text.TextField
  */
trait Chapter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** determines how the chapter should be displayed as described in {@link com.sun.star.text.ChapterFormat} . */
  var ChapterFormat: scala.Double
  /** determines which chapter level should be used. The highest chapter level has the value 0. */
  var Level: scala.Double
}

