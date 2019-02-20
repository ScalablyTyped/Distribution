package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an expression text field.
  * @see com.sun.star.text.TextField
  */
trait SetExpression
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField {
  /** contains the textual content of the field. */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** contains an informational text that is displayed at the user interface if it's an input field. */
  var Hint: java.lang.String
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    * @since OOo 1.1.2
    */
  var IsFixedLanguage: scala.Boolean
  /** determines whether this field is an input field. */
  var IsInput: scala.Boolean
  /** determines whether the content is displayed or evaluated. */
  var IsShowFormula: scala.Boolean
  /** determines whether the field is visible. */
  var IsVisible: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
  /** specifies the type of the numbering as {@link com.sun.star.style.NumberingType} */
  var NumberingType: scala.Double
  /** contains the sequence value when this field is used as sequence field. */
  var SequenceValue: scala.Double
  /** determines the type of the variable as described in {@link com.sun.star.text.SetVariableType} */
  var SubType: scala.Double
  /** contains the numerical value of the field. */
  var Value: scala.Double
  /** contains the name of the set expression field master this field is connected to. */
  var VariableName: java.lang.String
}

