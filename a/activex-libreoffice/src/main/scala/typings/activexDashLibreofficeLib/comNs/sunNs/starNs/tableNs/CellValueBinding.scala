package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the binding to a single cell in a table document
  *
  * Read/Write access to the cell represented by this component is supported, as well as active broadcasting of value changes.
  *
  * The binding supports exchanging **double** values, **string** values.
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellValueBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** specifies the cell within a document whose value is reflected by the binding. */
  var BoundCell: CellAddress
}

object CellValueBinding {
  @scala.inline
  def apply(
    BoundCell: CellAddress,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    Relevant: scala.Boolean,
    SupportedValueTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
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
    dispose: js.Function0[scala.Unit],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSupportedValueTypes: js.Function0[activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]],
    getValue: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit],
    supportsType: js.Function1[activexDashLibreofficeLib.`type`, scala.Boolean]
  ): CellValueBinding = {
    val __obj = js.Dynamic.literal(BoundCell = BoundCell, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, Relevant = Relevant, SupportedValueTypes = SupportedValueTypes, acquire = acquire, addEventListener = addEventListener, addModifyListener = addModifyListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSupportedValueTypes = getSupportedValueTypes, getValue = getValue, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeModifyListener = removeModifyListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setValue = setValue, supportsType = supportsType)
  
    __obj.asInstanceOf[CellValueBinding]
  }
}

