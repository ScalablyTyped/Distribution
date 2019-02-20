package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that refers to the content of a user-defined field in the document information.
  * @see com.sun.star.text.TextField
  * @since OOo 3.0
  */
trait Custom
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * contains the current content of the text field.
    *
    * This property is useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** If this flag is set to `FALSE` , the content is updated when the document information changes. */
  var IsFixed: scala.Boolean
  /** the name of the user-defined property that this field refers to. */
  var Name: java.lang.String
}

