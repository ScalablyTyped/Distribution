package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of text field that conditionally set the selection of a database cursor.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait DatabaseNumberOfSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField {
  /** contains the conditions that determines whether the SetNumber is applied or not. */
  var Condition: java.lang.String
  /** specifies the database name. */
  var DataBaseName: java.lang.String
  /**
    * indicates a connection {@link URL} , which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: java.lang.String
  /**
    * indicates the {@link URL} of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: java.lang.String
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var DataCommandType: scala.Double
  /** contains the name of the database table, query or a statement depending on the DataCommandType property. */
  var DataTableName: java.lang.String
  /** contains the set number that is to be applied. */
  var SetNumber: scala.Double
}

object DatabaseNumberOfSet {
  @scala.inline
  def apply(
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    AnchorType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
    Condition: java.lang.String,
    DataBaseName: java.lang.String,
    DataBaseResource: java.lang.String,
    DataBaseURL: java.lang.String,
    DataCommandType: scala.Double,
    DataTableName: java.lang.String,
    IsFieldDisplayed: scala.Boolean,
    IsFieldUsed: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SetNumber: scala.Double,
    TextFieldMaster: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    TextWrap: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode,
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
  ): DatabaseNumberOfSet = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Condition = Condition, DataBaseName = DataBaseName, DataBaseResource = DataBaseResource, DataBaseURL = DataBaseURL, DataCommandType = DataCommandType, DataTableName = DataTableName, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, PropertySetInfo = PropertySetInfo, SetNumber = SetNumber, TextFieldMaster = TextFieldMaster, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, attachTextFieldMaster = attachTextFieldMaster, dispose = dispose, getAnchor = getAnchor, getPresentation = getPresentation, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getTextFieldMaster = getTextFieldMaster, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DatabaseNumberOfSet]
  }
}

