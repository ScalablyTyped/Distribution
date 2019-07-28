package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an item of a DDE connection.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain cached result sets.
  * @since OOo 3.1
  */
trait DDEItemInfo extends js.Object {
  /** The name of the DDE item. */
  var Item: String
  /** The results of the item cached from the last update of the DDE link if available. This sequence may be empty. */
  var Results: SafeArray[SafeArray[_]]
}

object DDEItemInfo {
  @scala.inline
  def apply(Item: String, Results: SafeArray[SafeArray[_]]): DDEItemInfo = {
    val __obj = js.Dynamic.literal(Item = Item, Results = Results)
  
    __obj.asInstanceOf[DDEItemInfo]
  }
}

