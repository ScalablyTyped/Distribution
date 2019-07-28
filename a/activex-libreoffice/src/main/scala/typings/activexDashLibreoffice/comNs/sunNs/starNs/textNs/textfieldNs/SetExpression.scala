package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.textfieldNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.DependentTextField
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextContentAnchorType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.WrapTextMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an expression text field.
  * @see com.sun.star.text.TextField
  */
trait SetExpression extends DependentTextField {
  /** contains the textual content of the field. */
  var Content: String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: String
  /** contains an informational text that is displayed at the user interface if it's an input field. */
  var Hint: String
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    * @since OOo 1.1.2
    */
  var IsFixedLanguage: Boolean
  /** determines whether this field is an input field. */
  var IsInput: Boolean
  /** determines whether the content is displayed or evaluated. */
  var IsShowFormula: Boolean
  /** determines whether the field is visible. */
  var IsVisible: Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double
  /** specifies the type of the numbering as {@link com.sun.star.style.NumberingType} */
  var NumberingType: Double
  /** contains the sequence value when this field is used as sequence field. */
  var SequenceValue: Double
  /** determines the type of the variable as described in {@link com.sun.star.text.SetVariableType} */
  var SubType: Double
  /** contains the numerical value of the field. */
  var Value: Double
  /** contains the name of the set expression field master this field is connected to. */
  var VariableName: String
}

object SetExpression {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Content: String,
    CurrentPresentation: String,
    Hint: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    IsFixedLanguage: Boolean,
    IsInput: Boolean,
    IsShowFormula: Boolean,
    IsVisible: Boolean,
    NumberFormat: Double,
    NumberingType: Double,
    PropertySetInfo: XPropertySetInfo,
    SequenceValue: Double,
    SubType: Double,
    TextFieldMaster: XPropertySet,
    TextWrap: WrapTextMode,
    Value: Double,
    VariableName: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    attachTextFieldMaster: XPropertySet => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SetExpression = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Content = Content, CurrentPresentation = CurrentPresentation, Hint = Hint, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixedLanguage = IsFixedLanguage, IsInput = IsInput, IsShowFormula = IsShowFormula, IsVisible = IsVisible, NumberFormat = NumberFormat, NumberingType = NumberingType, PropertySetInfo = PropertySetInfo, SequenceValue = SequenceValue, SubType = SubType, TextFieldMaster = TextFieldMaster, TextWrap = TextWrap, Value = Value, VariableName = VariableName, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SetExpression]
  }
}

