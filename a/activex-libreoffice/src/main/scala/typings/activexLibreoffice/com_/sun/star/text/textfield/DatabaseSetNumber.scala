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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a text field that displays the current set number of a database.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
@js.native
trait DatabaseSetNumber extends DependentTextField {
  
  /** specifies the database name. */
  var DataBaseName: String = js.native
  
  /**
    * indicates a connection {@link URL} , which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: String = js.native
  
  /**
    * indicates the {@link URL} of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: String = js.native
  
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var DataCommandType: Double = js.native
  
  /** contains the name of the database table, query or a statement depending on the DataCommandType property. */
  var DataTableName: String = js.native
  
  /** specifies the type of the numbering as {@link com.sun.star.style.NumberingType} */
  var NumberingType: Double = js.native
  
  /** contains the number of the database set. */
  var SetNumber: Double = js.native
}
object DatabaseSetNumber {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    DataBaseName: String,
    DataBaseResource: String,
    DataBaseURL: String,
    DataCommandType: Double,
    DataTableName: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    NumberingType: Double,
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
  ): DatabaseSetNumber = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataCommandType = DataCommandType.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SetNumber = SetNumber.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseSetNumber]
  }
  
  @scala.inline
  implicit class DatabaseSetNumberMutableBuilder[Self <: DatabaseSetNumber] (val x: Self) extends AnyVal {
    
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
    def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNumber(value: Double): Self = StObject.set(x, "SetNumber", value.asInstanceOf[js.Any])
  }
}
