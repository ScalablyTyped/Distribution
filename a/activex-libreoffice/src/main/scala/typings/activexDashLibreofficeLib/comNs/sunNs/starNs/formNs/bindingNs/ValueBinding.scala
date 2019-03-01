package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a component which allows access to a single value
  *
  * Read/Write access to the value represented by this component is supported, as well as (optionally) active broadcasting of value changes
  */
trait ValueBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * determines whether the value is currently readonly
    *
    * For instance, you could imagine a {@link ValueBinding} which represents a cell in a spreadsheet document, and whose value is readonly as long as the
    * spreadsheet is locked.
    *
    * As long as this property is `TRUE` , the value binding should throw a {@link InvalidBindingStateException} when its {@link XValueBinding.setValue()}
    * method is invoked.
    */
  var ReadOnly: scala.Boolean
  /**
    * determines the relevance of the value represented by the binding
    *
    * In a more complex scenario, where different form controls are bound to different values, which all are part of a larger data structure, some of the
    * items in this data structure may not be relevant currently. This is indicated by the {@link Relevant} property being `FALSE` .
    *
    * XBindableValues which are bound to this binding may or may not react in certain ways on the (ir)relevance of their bound value.
    *
    * One possible reaction could be that user interface elements which are associated with the {@link XBindableValue} are disabled as long as {@link
    * Relevant} is `FALSE` .
    */
  var Relevant: scala.Boolean
}

object ValueBinding {
  @scala.inline
  def apply(
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
  ): ValueBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ReadOnly")(ReadOnly)
    __obj.updateDynamic("Relevant")(Relevant)
    __obj.updateDynamic("SupportedValueTypes")(SupportedValueTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSupportedValueTypes")(getSupportedValueTypes)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("supportsType")(supportsType)
    __obj.asInstanceOf[ValueBinding]
  }
}

