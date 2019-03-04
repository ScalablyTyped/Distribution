package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an external link in a formula.
  * @since OOo 3.1
  */
trait ExternalLinkInfo extends js.Object {
  /**
    * Location of this link type.
    *
    * Modes used:
    *
    *  1. If {@link Type} is ExternalLinkType::EXTERNAL, this member shall contain a `string` with the **URI** of a document. The formula that would need
    * this information for example would contain `=[1]Sheet1!A1` or `='[1]Sheet name'!A1` where **[1]** does resolve to the URI contained in the member
    * {@link Data} . Note that the quotes cover both, the document name and the sheet name.
    *
    *  2. If {@link Type} is {@link ExternalLinkType.DDE} , this member shall contain a {@link DDELinkInfo} describing service name, topic, and all known
    * items of a DDE link.
    */
  var Data: js.Any
  /** Link type, one of {@link ExternalLinkType} constants. */
  var Type: scala.Double
}

object ExternalLinkInfo {
  @scala.inline
  def apply(Data: js.Any, Type: scala.Double): ExternalLinkInfo = {
    val __obj = js.Dynamic.literal(Data = Data, Type = Type)
  
    __obj.asInstanceOf[ExternalLinkInfo]
  }
}

