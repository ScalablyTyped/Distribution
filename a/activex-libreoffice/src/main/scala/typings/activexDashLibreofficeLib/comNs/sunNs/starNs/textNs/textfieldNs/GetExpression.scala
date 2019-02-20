package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a get expression text field.
  * @see com.sun.star.text.TextField
  */
trait GetExpression
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the textual content of the field. */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    * @since OOo 1.1.2
    */
  var IsFixedLanguage: scala.Boolean
  /** determines whether the content is displayed or evaluated. */
  var IsShowFormula: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
  /** determines the type of the variable as described in {@link com.sun.star.text.SetVariableType} */
  var SubType: scala.Double
  /** contains the numerical value of the field. */
  var Value: scala.Double
  /** deprecated */
  var VariableSubtype: scala.Double
}

