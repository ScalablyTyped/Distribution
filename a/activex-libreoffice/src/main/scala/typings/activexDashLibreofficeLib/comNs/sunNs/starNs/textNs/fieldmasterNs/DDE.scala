package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link DDE} field master.
  * @see com.sun.star.text.TextField
  */
trait DDE
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** contains the content. */
  var Content: java.lang.String
  /** contains the element string of the {@link DDE} command. */
  var DDECommandElement: java.lang.String
  /** contains the file string of the {@link DDE} command. */
  var DDECommandFile: java.lang.String
  /** contains the type string of the {@link DDE} command. */
  var DDECommandType: java.lang.String
  /** determines whether {@link DDE} link is updated automatically. */
  var IsAutomaticUpdate: scala.Boolean
}

object DDE {
  @scala.inline
  def apply(
    Content: java.lang.String,
    DDECommandElement: java.lang.String,
    DDECommandFile: java.lang.String,
    DDECommandType: java.lang.String,
    DependentTextFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XDependentTextField],
    InstanceName: java.lang.String,
    IsAutomaticUpdate: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
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
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
  ): DDE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content")(Content)
    __obj.updateDynamic("DDECommandElement")(DDECommandElement)
    __obj.updateDynamic("DDECommandFile")(DDECommandFile)
    __obj.updateDynamic("DDECommandType")(DDECommandType)
    __obj.updateDynamic("DependentTextFields")(DependentTextFields)
    __obj.updateDynamic("InstanceName")(InstanceName)
    __obj.updateDynamic("IsAutomaticUpdate")(IsAutomaticUpdate)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[DDE]
  }
}

