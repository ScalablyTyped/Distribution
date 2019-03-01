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

object SetExpression {
  @scala.inline
  def apply(
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    AnchorType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
    Content: java.lang.String,
    CurrentPresentation: java.lang.String,
    Hint: java.lang.String,
    IsFieldDisplayed: scala.Boolean,
    IsFieldUsed: scala.Boolean,
    IsFixedLanguage: scala.Boolean,
    IsInput: scala.Boolean,
    IsShowFormula: scala.Boolean,
    IsVisible: scala.Boolean,
    NumberFormat: scala.Double,
    NumberingType: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SequenceValue: scala.Double,
    SubType: scala.Double,
    TextFieldMaster: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    TextWrap: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode,
    Value: scala.Double,
    VariableName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attach: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, scala.Unit],
    attachTextFieldMaster: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getTextFieldMaster: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("AnchorType")(AnchorType)
    __obj.updateDynamic("AnchorTypes")(AnchorTypes)
    __obj.updateDynamic("Content")(Content)
    __obj.updateDynamic("CurrentPresentation")(CurrentPresentation)
    __obj.updateDynamic("Hint")(Hint)
    __obj.updateDynamic("IsFieldDisplayed")(IsFieldDisplayed)
    __obj.updateDynamic("IsFieldUsed")(IsFieldUsed)
    __obj.updateDynamic("IsFixedLanguage")(IsFixedLanguage)
    __obj.updateDynamic("IsInput")(IsInput)
    __obj.updateDynamic("IsShowFormula")(IsShowFormula)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("NumberingType")(NumberingType)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SequenceValue")(SequenceValue)
    __obj.updateDynamic("SubType")(SubType)
    __obj.updateDynamic("TextFieldMaster")(TextFieldMaster)
    __obj.updateDynamic("TextWrap")(TextWrap)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("VariableName")(VariableName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("attachTextFieldMaster")(attachTextFieldMaster)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getPresentation")(getPresentation)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getTextFieldMaster")(getTextFieldMaster)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[SetExpression]
  }
}

