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
  * specifies service of a text field that increments a database selection.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait DatabaseNextSet
  extends StObject
     with DependentTextField {
  
  /** determines whether the database selection is set to the next position or not. */
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
}
object DatabaseNextSet {
  
  inline def apply(
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
    getPropertyValue: String => Any,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): DatabaseNextSet = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataCommandType = DataCommandType.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseNextSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseNextSet] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setDataBaseName(value: String): Self = StObject.set(x, "DataBaseName", value.asInstanceOf[js.Any])
    
    inline def setDataBaseResource(value: String): Self = StObject.set(x, "DataBaseResource", value.asInstanceOf[js.Any])
    
    inline def setDataBaseURL(value: String): Self = StObject.set(x, "DataBaseURL", value.asInstanceOf[js.Any])
    
    inline def setDataCommandType(value: Double): Self = StObject.set(x, "DataCommandType", value.asInstanceOf[js.Any])
    
    inline def setDataTableName(value: String): Self = StObject.set(x, "DataTableName", value.asInstanceOf[js.Any])
  }
}
