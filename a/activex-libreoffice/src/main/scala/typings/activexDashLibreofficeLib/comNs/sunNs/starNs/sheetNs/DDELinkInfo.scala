package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes all items of a DDE connection used in formulas.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain results cached from the last update.
  *
  * The formula that would need this information for example would contain `=[1]!'R1C1'` or `=[2]!'Sheet1.A1'` where **[1]** is an external link with DDE
  * service name "excel" and the topic "X:\PATH\[FILE.XLSX]Sheet1", and **[2]** contains service "soffice" and topic "file:///X:/PATH/FILE.ODS". The
  * service name is stored in {@link DDELinkInfo.Service} , the topic is stored in {@link DDELinkInfo.Topic} . Note that if the DDE item contains single
  * quotes they are escaped by doubling them, as usual, for example `=[2]!'''Sheet name''.A1'` in a "soffice" service.
  * @since OOo 3.1
  */
trait DDELinkInfo extends js.Object {
  /** A list of DDE items. Each item may contain its results from the last update. */
  var Items: activexDashInteropLib.SafeArray[DDEItemInfo]
  /** The DDE service name. */
  var Service: java.lang.String
  /** The DDE topic. */
  var Topic: java.lang.String
}

