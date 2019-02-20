package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that provides information about the author of the last print operation.
  * @see com.sun.star.text.TextField
  */
trait PrintAuthor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the name of the author. */
  var Author: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
  var IsFixed: scala.Boolean
}

