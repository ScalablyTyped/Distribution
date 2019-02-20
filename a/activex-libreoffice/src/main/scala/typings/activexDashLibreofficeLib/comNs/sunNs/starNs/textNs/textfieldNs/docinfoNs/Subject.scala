package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that provides the subject that is contained in the document information.
  * @see com.sun.star.text.TextField
  */
trait Subject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains content information. */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
  var IsFixed: scala.Boolean
}

