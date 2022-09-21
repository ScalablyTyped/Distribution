package typings.activexLibreoffice.com_.sun.star.text.textfield

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.DependentTextField
import typings.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typings.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of an expression text field.
  * @see com.sun.star.text.TextField
  */
trait SetExpression
  extends StObject
     with DependentTextField {
  
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
  
  inline def apply(
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
    getPropertyValue: String => Any,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): SetExpression = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], IsInput = IsInput.asInstanceOf[js.Any], IsShowFormula = IsShowFormula.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SequenceValue = SequenceValue.asInstanceOf[js.Any], SubType = SubType.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VariableName = VariableName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SetExpression]
  }
  
  extension [Self <: SetExpression](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
    
    inline def setHint(value: String): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
    
    inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
    
    inline def setIsInput(value: Boolean): Self = StObject.set(x, "IsInput", value.asInstanceOf[js.Any])
    
    inline def setIsShowFormula(value: Boolean): Self = StObject.set(x, "IsShowFormula", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
    
    inline def setSequenceValue(value: Double): Self = StObject.set(x, "SequenceValue", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: Double): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVariableName(value: String): Self = StObject.set(x, "VariableName", value.asInstanceOf[js.Any])
  }
}
