package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.XElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this type are used as elements of the enumeration returned by {@link XUpdateInformationProvider} .
  * @since OOo 2.3
  */
trait UpdateInformationEntry extends js.Object {
  /** the (optional) description for an update information entry extracted from the update feed container */
  var Description: String
  /** the DOM representation of an update information entry */
  var UpdateDocument: XElement
}

object UpdateInformationEntry {
  @scala.inline
  def apply(Description: String, UpdateDocument: XElement): UpdateInformationEntry = {
    val __obj = js.Dynamic.literal(Description = Description, UpdateDocument = UpdateDocument)
  
    __obj.asInstanceOf[UpdateInformationEntry]
  }
}

