package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of groups in a data pilot field.
  *
  * The members of this collection are instances of {@link DataPilotFieldGroup} containing the names of all items in the group.
  * @see DataPilotField
  * @see DataPilotFieldGroup
  * @see DataPilotFieldGroupInfo
  */
trait DataPilotFieldGroups
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess

object DataPilotFieldGroups {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DataPilotFieldGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByName")(insertByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("replaceByName")(replaceByName)
    __obj.asInstanceOf[DataPilotFieldGroups]
  }
}

