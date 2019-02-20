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

