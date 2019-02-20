package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field .
  * @see com.sun.star.text.TextField
  */
trait Script
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the script text or a {@link URL} that points to a script depending on the URLContent property. */
  var Content: java.lang.String
  /** contains the name of the script type (i.e. JavaScript) */
  var ScriptType: java.lang.String
  /** determines whether the property Content contains a {@link URL} or a script. */
  var URLContent: scala.Boolean
}

