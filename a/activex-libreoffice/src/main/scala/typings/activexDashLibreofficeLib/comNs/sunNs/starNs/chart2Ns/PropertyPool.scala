package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPool
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.Style
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XDefaultsSupplier {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object PropertyPool {
  @scala.inline
  def apply(
    Defaults: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DisplayName: java.lang.String,
    FollowStyle: java.lang.String,
    Hidden: scala.Boolean,
    IsAutoUpdate: java.lang.String,
    IsPhysical: scala.Boolean,
    Name: java.lang.String,
    ParaStyleConditions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ParentStyle: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    StyleInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getDefaults: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getName: js.Function0[java.lang.String],
    getParentStyle: js.Function0[java.lang.String],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    isInUse: js.Function0[scala.Boolean],
    isUserDefined: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParentStyle: js.Function1[java.lang.String, scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): PropertyPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Defaults")(Defaults)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("FollowStyle")(FollowStyle)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IsAutoUpdate")(IsAutoUpdate)
    __obj.updateDynamic("IsPhysical")(IsPhysical)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ParaStyleConditions")(ParaStyleConditions)
    __obj.updateDynamic("ParentStyle")(ParentStyle)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("StyleInteropGrabBag")(StyleInteropGrabBag)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("firePropertiesChangeEvent")(firePropertiesChangeEvent)
    __obj.updateDynamic("getDefaults")(getDefaults)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParentStyle")(getParentStyle)
    __obj.updateDynamic("getPropertyDefaults")(getPropertyDefaults)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("isInUse")(isInUse)
    __obj.updateDynamic("isUserDefined")(isUserDefined)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setAllPropertiesToDefault")(setAllPropertiesToDefault)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParentStyle")(setParentStyle)
    __obj.updateDynamic("setPropertiesToDefault")(setPropertiesToDefault)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.asInstanceOf[PropertyPool]
  }
}

