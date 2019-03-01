package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this type are used as elements of the enumeration returned by {@link XUpdateInformationProvider} .
  * @since OOo 2.3
  */
trait UpdateInformationEntry extends js.Object {
  /** the (optional) description for an update information entry extracted from the update feed container */
  var Description: java.lang.String
  /** the DOM representation of an update information entry */
  var UpdateDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XElement
}

object UpdateInformationEntry {
  @scala.inline
  def apply(
    Description: java.lang.String,
    UpdateDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XElement
  ): UpdateInformationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("UpdateDocument")(UpdateDocument)
    __obj.asInstanceOf[UpdateInformationEntry]
  }
}

