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
  * specifies service of text field that conditionally set the selection of a database cursor.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait DatabaseNumberOfSet
  extends StObject
     with DependentTextField {
  
  /** contains the conditions that determines whether the SetNumber is applied or not. */
  var Condition: String
  
  /** specifies the database name. */
  var DataBaseName: String
  
  /**
    * indicates a connection {@link URL} , which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: String
  
  /**
    * indicates the {@link URL} of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: String
  
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var DataCommandType: Double
  
  /** contains the name of the database table, query or a statement depending on the DataCommandType property. */
  var DataTableName: String
  
  /** contains the set number that is to be applied. */
  var SetNumber: Double
}
object DatabaseNumberOfSet {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Condition: String,
    DataBaseName: String,
    DataBaseResource: String,
    DataBaseURL: String,
    DataCommandType: Double,
    DataTableName: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    SetNumber: Double,
    TextFieldMaster: XPropertySet,
    TextWrap: WrapTextMode,
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
  ): DatabaseNumberOfSet = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataCommandType = DataCommandType.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SetNumber = SetNumber.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseNumberOfSet]
  }
  
  @scala.inline
  implicit class DatabaseNumberOfSetMutableBuilder[Self <: DatabaseNumberOfSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseName(value: String): Self = StObject.set(x, "DataBaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseResource(value: String): Self = StObject.set(x, "DataBaseResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseURL(value: String): Self = StObject.set(x, "DataBaseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCommandType(value: Double): Self = StObject.set(x, "DataCommandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableName(value: String): Self = StObject.set(x, "DataTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNumber(value: Double): Self = StObject.set(x, "SetNumber", value.asInstanceOf[js.Any])
  }
}
