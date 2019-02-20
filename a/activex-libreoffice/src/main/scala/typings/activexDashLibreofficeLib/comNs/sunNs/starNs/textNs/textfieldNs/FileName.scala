package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of text field that displays the file name ( {@link URL} ) of the document.
  * @see com.sun.star.text.TextField
  */
trait FileName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** determines the format the file name is displayed as specified in {@link com.sun.star.text.FilenameDisplayFormat} . */
  var FileFormat: scala.Double
  /** If this flag is set to `FALSE` the content is regularly updated. */
  var IsFixed: scala.Boolean
}

