package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementation of this service can keep any properties and is useful when an {@link XPropertySet} is to be used, for example, as parameters for a
  * method call.
  *
  * Scripting engines might not be able to use such objects as normal property sets, giving direct access to the properties. In this case, use the methods
  * like {@link XPropertySet.getPropertyValue()} .
  */
trait PropertyBag extends XPropertyBag {
  def createDefault(): scala.Unit
  def createWithTypes(
    AllowedTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`],
    AllowEmptyPropertyName: scala.Boolean,
    AutomaticAddition: scala.Boolean
  ): scala.Unit
}

object PropertyBag {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: activexDashInteropLib.SafeArray[PropertyValue],
    acquire: js.Function0[scala.Unit],
    addProperty: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    addPropertyChangeListener: js.Function2[java.lang.String, XPropertyChangeListener, scala.Unit],
    addVetoableChangeListener: js.Function2[java.lang.String, XVetoableChangeListener, scala.Unit],
    createDefault: js.Function0[scala.Unit],
    createWithTypes: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`], 
      scala.Boolean, 
      scala.Boolean, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function0[activexDashInteropLib.SafeArray[PropertyValue]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeProperty: js.Function1[java.lang.String, scala.Unit],
    removePropertyChangeListener: js.Function2[java.lang.String, XPropertyChangeListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[java.lang.String, XVetoableChangeListener, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue], scala.Unit]
  ): PropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("PropertyValues")(PropertyValues)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addProperty")(addProperty)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDefault")(createDefault)
    __obj.updateDynamic("createWithTypes")(createWithTypes)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeProperty")(removeProperty)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.asInstanceOf[PropertyBag]
  }
}

