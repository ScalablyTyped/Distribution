package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a method to add a DDE link to a spreadsheet.
  * @see com.sun.star.sheet.DDELinks
  * @since OOo 3.0
  */
trait XDDELinks
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * adds a DDE link to the spreadsheet without updating it.
    *
    * If a DDE link with the specified parameters already exists, the existing DDE link will be returned. Otherwise a new DDE link will be created.
    * @param aApplication the DDE server application from which data are requested.
    * @param aTopic the DDE topic from which data are requested.
    * @param aItem the DDE item from which data are requested.
    * @param nMode the DDE link mode.
    * @returns the DDE link.
    */
  def addDDELink(
    aApplication: java.lang.String,
    aTopic: java.lang.String,
    aItem: java.lang.String,
    nMode: DDELinkMode
  ): XDDELink
}

object XDDELinks {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addDDELink: js.Function4[java.lang.String, java.lang.String, java.lang.String, DDELinkMode, XDDELink],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDDELinks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDDELink")(addDDELink)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDDELinks]
  }
}

